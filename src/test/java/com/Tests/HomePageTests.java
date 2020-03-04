package com.Tests;

import com.Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest {

 //   public static final String NAVIGATION_DESIGN_BUTTON = "//a[@class='nav-links__item-link nav-links__item-link_current']";
//        }

    @Test
    public void CheckSortingByLabels() {


        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();

   //     loginPage.getHomePageWithloggedInUser();

     homePage.openHomePage();
     homePage.waitUntilHomePageTitleIsDisplayed(HomePageTitle);
     Assert.assertTrue(homePage.atHomePage(HomePageTitle));


        homePage.filterByAllposts();

        homePage.filterByMoreThanHundred();
        homePage.waitUntilHomePageTitleWithSortedLabelAllPosts(HomePageTitleWithSortedLabelMoreThanHundred);

        Assert.assertTrue(homePage.islistOfArticlesDisplayed());

    }

    @Test
    public void checkRedirectToCarrierPortal() {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        CareerPortal careerPortal = new CareerPortal();

        //     loginPage.getHomePageWithloggedInUser();

        homePage.openHomePage();
        homePage.waitUntilHomePageTitleIsDisplayed(HomePageTitle);
        Assert.assertTrue(homePage.atHomePage(HomePageTitle));


            homePage.openCareerpage();
            careerPortal.waitUntilTitleIsDisplayed(CareerPortalTitle);

        Assert.assertTrue(careerPortal.isLogoOfCareerPortalDisplayed());
    }

    @Test
    public void VerifySwitchToAnotherLanquage () {

           HomePage homePage = new HomePage();
        EnglishHomePage englishHomePage = new EnglishHomePage();

      //       loginPage.getHomePageWithloggedInUser();

        homePage.openHomePage();
        homePage.waitUntilHomePageTitleIsDisplayed(HomePageTitle);
        Assert.assertTrue(homePage.atHomePage(HomePageTitle));


        homePage.openLanguageBarSettings();

        homePage.waitUntilSettingsPOpupIsOpened();
        homePage.switchtoEnglishLanguage();

        homePage.waitUntilTitleIsDisplayed(HomePageTitleEnglish);

        Assert.assertTrue(englishHomePage.atEnglishHomePage(HomePageTitleEnglish));

    }
//
    @Test
    public void VerifyRedirectionToDesignPage (){
        HomePage homePage = new HomePage();
        DesignPage designPage = new DesignPage();

        homePage.openHomePage();
        homePage.waitUntilHomePageTitleIsDisplayed(HomePageTitle);
        Assert.assertTrue(homePage.atHomePage(HomePageTitle));

        homePage.goToDesignPage();

        designPage.waitUntilDesignPageTitleIsDisplayed(DesignPageTitle);

        Assert.assertTrue(designPage.hasPageLogo());

    }


}






