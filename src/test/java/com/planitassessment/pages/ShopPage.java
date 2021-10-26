package com.planitassessment.pages;

import Utilities.PageHelper;
import Utilities.ParameterProvider;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.List;


public class ContactPage extends PageObject
{


    private static PageHelper pageHelper;
    private final HashMap<String, WebElementFacade> elementMap = new HashMap<>();

    @FindBy(xpath = "//input[contains(@name, 'forename' )]")
    private WebElementFacade forename;

    @FindBy(xpath = "//input[contains(@name, 'email' )]")
    private WebElementFacade email;

    @FindBy(xpath = "//*[contains(@name, 'message' )]")
    private WebElementFacade messagebox;

    @FindBy(xpath = "//*[contains(text(), 'Submit' )]")
    private WebElementFacade Submitbutton;



    @FindBy(xpath = "//span[contains(text(),'is required')]")
    private List<WebElementFacade> errormessages;


    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElementFacade successmessage;



    public void pageIsLoaded() {
        elementMap.put("submitbutton", Submitbutton);
    }


    public void clickOnSubmit() {
        Submitbutton.click();
    }

    public void verifyErrorMessages()
    {
        int errnum= errormessages.size();
            if(errnum>0)
            {

            for (int i = 0; i < errnum; i++) {
                try {
                    String errormessage = errormessages.get(i).getText();
                    if (errormessage.contains("is required")) {
                        System.out.println(errormessage);
                    }
                } catch (Exception e) {
                    Assert.fail("Exception upon clicking on submit button without entering mandatory fields " + e);
                }

            }
        }
            else if (errnum==0)
            {
                System.out.println("No Error messages displayed");
            }


    }

    public void enterValue(String string1, String value)
    {
        if(string1.contains("Forename")) {
            forename.type(value);
        }
        else if(string1.contains("email")) {
            email.type(value);
        }
        else if(string1.contains("message")) {
            messagebox.type(value);
        }
    }

public void verifySuccessMessage(String message)
{
    WebDriverWait wait = new WebDriverWait(getDriver(), 10);
    wait.until(ExpectedConditions.visibilityOf(successmessage));

    Assert.assertEquals(message,successmessage.getText());
}



}
