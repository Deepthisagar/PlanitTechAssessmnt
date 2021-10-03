package com.auspost.definitions;


import com.auspost.steps.HomeLoanSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Definitions {

    @Steps
    HomeLoanSteps steps;



    @Given("^user navigates to ANZ Home Loan Calculator$")
    public void user_navigates_to_anz_home_loan_calculator()  {
        steps.checkingLogin();
    }

    @And("user enters the required Details {string},{string},{string},{string},{string},{string},{string}")
    public void user_enters_the_required_details (String income, String otherincome, String livingexpense, String currenthomeloan, String otherloanrepay, String othercomms, String cclimit) {
        steps.enteringdetails(income,otherincome,livingexpense,currenthomeloan,otherloanrepay,othercomms,cclimit);
    }

    @And("at calculator page - user clicks on calculate button$")
    public void at_calculator_page_user_clicks_on_calculate_button()  {
        steps.clickonCalcbutton();
    }

    @And("at calculator page - user verifies the  Estiamted amount {string}")
    public void at_calculator_page_user_verifies_the_estiamted_amount_something(String estimate) throws InterruptedException {
        steps.displayEstimation(estimate);
    }

    @And("at calculator page - clicks on start over button$")
    public void at_calculator_page_clicks_on_start_over_button() {
        steps.startOverAgain();
    }

    @And("at calculator page - user verifies fields$")
    public void at_calculator_page_user_verifies_fields() {
        steps.verifyAfterStartOver();
    }

    @And("at calculator page - user enters livining expense as {string}")
    public void at_calculator_page_user_enters_livining_expense_as_something(String strArg1)  {

        steps.enterLivingExpenseOnly(strArg1);
    }

    @And("at calculator page - a message should be displayed$")
    public void at_calculator_page_a_message_should_be_displayed()  {

        steps.dispayMessgae();

    }

}
