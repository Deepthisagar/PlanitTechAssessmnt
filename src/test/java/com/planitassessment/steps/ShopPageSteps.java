package com.planitassessment.steps;

import com.planitassessment.pages.ContactPage;
import com.planitassessment.pages.ShopPage;
import net.thucydides.core.annotations.Step;

public class ShopPageSteps {


    ShopPage shopPage;



    @Step
    public void pageIsLoaded()
    {
        shopPage.pageIsLoaded();

    }

    @Step
    public void selectanItem( int numberoftimes,String selectOption)
    {
        shopPage.selectanItem(numberoftimes,selectOption);

    }

    @Step
    public void clickOnCart()
    {
        shopPage.clickOnCart();
    }

    @Step
    public void verifyItemsInCart(Integer int1, Integer int2)
    {
        shopPage.verifyItemsInCart(int1,  int2);
    }


}
