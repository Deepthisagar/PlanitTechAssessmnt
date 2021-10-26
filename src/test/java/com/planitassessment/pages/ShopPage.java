package com.planitassessment.pages;

import Utilities.PageHelper;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.List;


public class ShopPage extends PageObject
{


    private static PageHelper pageHelper;
    private final HashMap<String, WebElementFacade> elementMap = new HashMap<>();

    @FindBy(xpath = "//h4[text()='Funny Cow']/ancestor::li[@id='product-6'] //a")
    private WebElementFacade funnycow;

    @FindBy(xpath = "//h4[text()='Fluffy Bunny']/ancestor::li[@id='product-4'] //a")
    private WebElementFacade fluffybunny;

    @FindBy(xpath = "//a[contains(text(), 'Cart')]")
    private WebElementFacade cart;

    @FindBy(xpath = "//*[contains(text(), 'Funny Cow')]/following-sibling::td/input[@name='quantity']")
    private WebElementFacade funnycow_quantity;

    @FindBy(xpath = "//*[contains(text(), 'Fluffy Bunny')]/following-sibling::td/input[@name='quantity']")
    private WebElementFacade fluffybunny_quantity;




    public void pageIsLoaded() {
        elementMap.put("Funny Cow", funnycow);
        elementMap.put("Fluffy bunny", fluffybunny);
    }


    public void selectanItem(int numberoftimes,String selectOption) {

        for(int i=0;i<numberoftimes;i++)
        {
            elementMap.get(selectOption).click();
        }

    }
    public void clickOnCart()
    {
        cart.click();
    }

    public void verifyItemsInCart(int int1,int int2)
    {
        int funnycow_quantity_value=Integer.parseInt(funnycow_quantity.getAttribute("value"));
        int fluffybunny_quantity_value=Integer.parseInt(fluffybunny_quantity.getAttribute("value"));

        Assert.assertEquals(funnycow_quantity_value,int1);
        Assert.assertEquals(fluffybunny_quantity_value,int2);


    }




}
