package Utilities;

import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageHelper extends PageObject {



    public void sendStringAsCharArray(WebElement element, String str) {
        try {
            char[] chars = str.toCharArray();
            for (char ch : chars) {
                element.sendKeys(String.valueOf(ch));
            }
        } catch (Exception e) {
            Assert.fail("Exception while sending keys : " + e);
        }
    }

    public void selectDropDown(WebElement element,String text){
        Select objSelect = new Select(element);
        objSelect.selectByVisibleText(text);
    }

    public void maximizeWindow() {
        getDriver().manage().window().maximize();
    }
}
