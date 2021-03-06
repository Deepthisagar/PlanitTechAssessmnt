package com.planitassessment.pages;

import Utilities.ParameterProvider;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;


public class HomePage extends PageObject
{



    private final HashMap<String, WebElementFacade> elementMap = new HashMap<>();

    @FindBy(xpath = "//a[text()='Contact']")
    private WebElementFacade contactlink;

    @FindBy(xpath = "//a[text()='Shop']")
    private WebElementFacade shoplink;



    public void pageIsLoaded() {
        elementMap.put("contact page", contactlink);
        elementMap.put("shop page", shoplink);
    }

    public void launchHomePage( ) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        String url= ParameterProvider.getParameter(ParameterProvider.ParameterName.URL, ParameterProvider.AppName.JupiterToys);
        getDriver().get(url);
        if (contactlink.isVisible()) {
            System.out.println("Launched the home page");
        } else {
            Assert.fail("Unable to launch home page");
        }

    }

    public void navigateTo(String optionType) {
        try {
            if(optionType.equalsIgnoreCase("contact page")) {
                WebDriverWait wait = new WebDriverWait(getDriver(), 10);
                wait.until(ExpectedConditions.visibilityOf(contactlink));
            }
            else if(optionType.equalsIgnoreCase("shop page")) {
                WebDriverWait wait = new WebDriverWait(getDriver(), 10);
                wait.until(ExpectedConditions.visibilityOf(shoplink));
            }
            elementMap.get(optionType.toLowerCase()).click();
        } catch (Exception e) {
            Assert.fail("Exception during navigating to other pages from home page " + e);
        }

    }



}
