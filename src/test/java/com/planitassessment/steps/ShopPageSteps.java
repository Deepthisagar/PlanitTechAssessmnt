package com.planitassessment.steps;

import com.planitassessment.pages.ContactPage;
import com.planitassessment.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class ContactPageSteps {


    ContactPage contactPage;



    @Step
    public void pageIsLoaded()
    {
        contactPage.pageIsLoaded();

    }

    @Step
    public void clickOnSubmit()
    {
        contactPage.clickOnSubmit();

    }

    @Step
    public void verifyErrorMessages()
    {
        contactPage.verifyErrorMessages();
    }

    @Step
    public void enterValueinTextField(String string1, String string2)
    {
        contactPage.enterValue(string1,  string2);
    }

    @Step
    public void verifySuccessMessage(String string2)
    {
        contactPage.verifySuccessMessage(string2);
    }

}
