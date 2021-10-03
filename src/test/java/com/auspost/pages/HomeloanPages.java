package com.auspost.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

import org.junit.Assert;
import org.mockito.internal.matchers.Null;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class HomeloanPages extends PageObject
{

    EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
    WebDriver driver;
    String Current_URL;
    WebElement livingexpenses;
    WebElement borrowButton;


    public void VerifyNavigation()
    {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = getDriver();

        driver.get(variables.getProperty("ANZ_URL"));
        driver.manage().window().maximize();

        System.out.println(getDriver().getCurrentUrl());
    }

    public void EnterDetails(String string, String string2, String string3, String string4, String string5, String string6, String string7)  {
        //Selecting single
        $(By.cssSelector("input#application_type_single")).click();
        //no.of dependents
        $(By.cssSelector("select[title='Number of dependants']")).selectByIndex(0);
        //home type
        $(By.cssSelector("input[id='borrow_type_home']")).click();
        //Inome
        $(By.xpath("//label[text()='Your income (before tax)']/ancestor::div[@class='borrow__question'] //input[@type='text']")).type(string);
        //other income
        $(By.xpath("//label[text()='Your other income']/ancestor::div[@class='borrow__question'] //input[@type='text']")).type(string2);
        //living expense
        $(By.xpath("//label[text()='Living expenses']/ancestor::div[@class='borrow__question'] //input[@type='text']")).type(string3);
       //home loan repay
        $(By.xpath("//label[text()='Current home loan repayments']/ancestor::div[@class='borrow__question'] //input[@type='text']")).type(string4);
        //other loan repay
        $(By.xpath("//label[text()='Other loan repayments']/ancestor::div[@class='borrow__question'] //input[@type='text']")).type(string5);
        //other comms
        $(By.xpath("//label[text()='Other commitments']/ancestor::div[@class='borrow__question'] //input[@type='text']")).type(string6);
        //cc limit
        $(By.xpath("//label[text()='Total credit card limits']/ancestor::div[@class='borrow__question'] //input[@type='text']")).type(string7);



    }

    public void clickonCalcbutton()
    {
        borrowButton=$(By.xpath("//button[contains(text(),'Work out how much I could borrow')]"));
        borrowButton.click();

    }

    public void displayEstimation(String string) throws InterruptedException {

        String amount = null;

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement textvalue = $(By.xpath("//span[contains(text(),'We estimate you could borrow:')]"));
        boolean status=wait.until(ExpectedConditions.attributeToBe(textvalue,"aria-live","assertive"));
        if(status)
        {
                  amount = $(By.xpath("//span[contains(text(), 'We estimate you could borrow:')]/ancestor::div[@class='borrow__result text--white clearfix'] //span[@id='borrowResultTextAmount']")).getText();
                   amount = amount.substring(1);
            System.out.println(amount);

        }
        Assert.assertEquals(amount, string);



    }

    public void startOveragain()
    {
        $(By.xpath("//span[@id='borrowResultTextAmount']/ancestor::div[@class='box--left ']/following-sibling::div[@class='box--right'] //button")).click();



    }

    public void verifyFieldsAfterStartOver()
    {
        livingexpenses= $(By.xpath("//label[text()='Living expenses']/ancestor::div[@class='borrow__question'] //input[@type='text']"));
        String vsalue=livingexpenses.getAttribute("value");
        Assert.assertEquals(vsalue,"0");



    }

    public void justLivingExpense(String livingexpense)
    {
        livingexpenses.sendKeys(livingexpense);
    }



    public void dispayMessgae()
    {

        borrowButton.click();
        String text =$(By.xpath("//span[contains(text(),'Based on the details')]")).getText();
        Assert.assertEquals(text,variables.getProperty("texttobematched"));

    }
}
