package com.planitassessment.steps;

import com.planitassessment.pages.HomeloanPages;
import net.thucydides.core.annotations.Step;

public class HomeLoanSteps {


    HomeloanPages homeloanPages;

    @Step
    public void checkingLogin()
    {
        homeloanPages.VerifyNavigation();

        System.out.println("in STeps");

    }

    @Step
    public void enteringdetails(String string, String string2, String string3, String string4, String string5, String string6, String string7){
        homeloanPages.EnterDetails(string,string2,string3,string4,string5,string6,string7);
    }

    @Step
    public void clickonCalcbutton()
    {
        homeloanPages.clickonCalcbutton();
    }

    @Step
    public void displayEstimation(String string) throws InterruptedException {
        homeloanPages.displayEstimation(string);
    }
    @Step
    public void startOverAgain()
    {
        homeloanPages.startOveragain();
    }

    @Step
    public void verifyAfterStartOver()
    {
        homeloanPages.verifyFieldsAfterStartOver();
    }

    @Step
    public void enterLivingExpenseOnly(String livingexpense)
    {
        homeloanPages.justLivingExpense(livingexpense);
    }

    @Step
    public void dispayMessgae()
    {
        homeloanPages.dispayMessgae();
    }

}
