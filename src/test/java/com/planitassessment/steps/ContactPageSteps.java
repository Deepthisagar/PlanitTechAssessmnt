package com.planitassessment.steps;

import com.planitassessment.pages.HomePage;
import com.planitassessment.pages.HomeloanPages;
import net.thucydides.core.annotations.Step;

public class HomePageSteps {


    HomePage homePage;

    @Step
    public void launchHomepage()
    {
        homePage.launchHomePage();

    }
    @Step
    public void pageIsLoaded()
    {
        homePage.pageIsLoaded();

    }

    @Step
    public void navigatefromHomepage(String navigateTo)
    {
        homePage.navigateTo(navigateTo);

    }


}
