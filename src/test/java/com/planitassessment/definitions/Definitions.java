package com.planitassessment.definitions;


import Utilities.PageHelper;
import com.planitassessment.steps.ContactPageSteps;
import com.planitassessment.steps.HomePageSteps;
import com.planitassessment.steps.ShopPageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class Definitions {



    @Steps
    HomePageSteps homepagestep;
    @Steps
    ContactPageSteps contactpagestep;
    @Steps
    ShopPageSteps shoppagestep;

    private static PageHelper pageHelper;


    @Given("user launches the jupiter toys website")
    public void user_launches_the_jupiter_toys_website() {
        homepagestep.launchHomepage();

    }

    @And("user verifies home page is displayed")
    public void user_verifies_home_page_is_displayed() {
        homepagestep.pageIsLoaded();
    }

    @And("user maximizes the window")
    public void user_maximizes_the_window() {
        pageHelper.maximizeWindow();

    }

    @And("user navigates to {string}")
    public void user_navigates_to(String string) {
        homepagestep.navigatefromHomepage(string);

    }


    @And("user verifies contact page is loaded")
    public void user_verifies_contact_page_is_loaded() {
        contactpagestep.pageIsLoaded();

    }

    @And("at contact page - user clicks on submit button without entering the mandatory fields")
    public void at_contact_page_user_clicks_on_submit_button_without_entering_the_mandatory_fields() {
        contactpagestep.clickOnSubmit();
    }

    @And("at contact page - user validates the errors")
    public void at_contact_page_user_validates_the_errors() {
        contactpagestep.verifyErrorMessages();

    }

    @And("at contact page - user enters {string} as {string}")
    public void at_contact_page_user_enters_as(String string1, String string2) {
        contactpagestep.enterValueinTextField(string1, string2);
    }

    @And("at contact page - user validates if errors are gone")
    public void at_contact_page_user_validates_if_errors_are_gone() {
        contactpagestep.verifyErrorMessages();
    }


    @And("at contact page - user clicks on submit button")
    public void at_contact_page_user_clicks_on_submit_button() {
        contactpagestep.clickOnSubmit();
    }

    @And("at contact page - user validates successful submission message as {string}")
    public void at_contact_page_user_validates_successful_submnission_message(String string1) {
        contactpagestep.verifySuccessMessage(string1);
    }


    @And("user verifies shop page is loaded")
    public void user_verifies_shop_page_is_loaded() {
        shoppagestep.pageIsLoaded();
    }

    @And("at shop page - user clicks on buy button {int} times on {string} item")
    public void at_shop_page_user_clicks_on_buy_button_times_on_item(Integer int1, String string) {
        shoppagestep.selectanItem(int1,string);
    }

    @And("at shop page - user clicks on buy button {int} time on {string} item")
    public void at_shop_page_user_clicks_on_buy_button_time_on_item(Integer int1, String string) {
        shoppagestep.selectanItem(int1,string);

    }

    @And("at shop page - user clicks on cart menu")
    public void at_shop_page_user_clicks_on_cart_menu() {
        shoppagestep.clickOnCart();
    }

    @And("in the cart menu - user verifies if {int} FunnyCow and {int} FluffyBunny items are displayed")
    public void in_the_cart_menu_user_verifies_if_FunnyCow_and_FluffyBunny_items_are_displayed(Integer int1, Integer int2) {
        shoppagestep.verifyItemsInCart(int1,int2);
    }


}
