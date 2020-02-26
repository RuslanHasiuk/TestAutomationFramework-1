package com.Tests;

import com.Pages.BasePage;

public class VerifyHomePage extends BasePage {

//    private WebDriver driver;
//    private  String HomePageurl ="https://habr.com/ru/top/";
//
//        @BeforeClass
//        public void openHomePage (){
//            String HomePageurl ="https://habr.com/ru/top/";
//            driver.get(HomePageurl);

    public static final String NAVIGATION_DESIGN_BUTTON = "//a[@class='nav-links__item-link nav-links__item-link_current']";
//        }

//    @Test
//    public void CheckSortingByLabels() {
//
//
//        LoginPage loginPage = new LoginPage(driver, waiter);
//        HomePage homePage = new HomePage(driver, waiter);
//
//   //     loginPage.getHomePageWithloggedInUser();
//
//        driver.get("https://habr.com/ru/top/");
//
//        waiter = new WebDriverWait(driver, 35, 1000);
//        waiter.until(ExpectedConditions.titleIs(HomePageTitle));
//
//        homePage.filterByAllposts();
//        waiter.until(ExpectedConditions.titleIs(HomePageTitleWithSortedLabelAllPosts));
//
//        homePage.filterByMoreThanHundred();
//
//        waiter.until(ExpectedConditions.titleIs(HomePageTitleWithSortedLabelMoreThanHundred));
//
//        List<WebElement> listOfArticles = driver.findElements(By.xpath(("//li[contains(@id,'post')]")));
//
//
//        Assert.assertTrue(listOfArticles.size() == 20);
//
//
//    }
//
//    @Test
//
//    public void checkRedirectToCarrierPortal() {
//        LoginPage login = new LoginPage(driver, waiter);
//        HomePage homePage = new HomePage(driver, waiter);
//        CareerPortal careerPortal = new CareerPortal(driver,waiter);
//
//               //      login.getHomePageWithloggedInUser();
//        driver.get("https://habr.com/ru/top/");
//
//       waiter = new WebDriverWait(driver,30,1000);
//        waiter.until(ExpectedConditions.titleIs(HomePageTitle));
////
//            homePage.openCareerpage();
////
//        waiter = new WebDriverWait(driver,15);
//        waiter.until(ExpectedConditions.titleIs(CareerPageTitle));
//
//        Assert.assertTrue(careerPortal.isLogoOfCareerPortalDisplayed());
//
//    }
//
//    @Test
//    public void VerifySwitchToAnotherLanquage (){
//        HomePage homePage = new HomePage(driver, waiter);
//
//        driver.get("https://habr.com/ru/top/");
//        homePage.openLanguageBarSettings();
//
//        waiter = new WebDriverWait(driver,10);
//        waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='popup']//div[@class='popup__body']")));
//
//        homePage.switchtoEnglishLanguage();
//
//        waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'All streams')]")));
//
//        Assert.assertEquals(driver.getTitle(), HomePageTitleEnglish);
//    }
//
//    @Test
//    public void VerifyRedirectionToDesignPage (){
//        HomePage homePage = new HomePage(driver, waiter);
//        DesignPage designPage = new DesignPage(driver,waiter);
//
//        driver.get("https://habr.com/ru/top/");
//
//        waiter = new WebDriverWait(driver,20);
//        waiter.until(ExpectedConditions.titleIs(HomePageTitle));
//
//        homePage.goToDesignPage();
//
//       waiter.until(ExpectedConditions.titleIs(DesignPageTitle));
//
//        Assert.assertTrue(designPage.hasPageLogo());
//
//    }


}






