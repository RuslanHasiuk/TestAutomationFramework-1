package com.habr.pages;

import com.habr.utils.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {

//    private WebDriver driver;
//    private WebDriverWait waiter;
    //   private String HomePageUrl = "https://habr.com/ru/top/\"";


//    public HomePage(WebDriver driver, WebDriverWait waiter) {
//        this.driver = driver;
//        this.waiter = waiter;
//        PageFactory.initElements(driver, this);
//    }


//    @FindBy (xpath = "//div[@class=\"page-header page-header_110\"]");
//    WebElement TitleOfHomePage;

    @FindBy(xpath = "//a[@href='https://habr.com/ru/all/']")
    WebElement filterBylabelAllPosts;

    @FindBy(xpath = "//a[contains(text(),'100')]")
    WebElement filterBylabelMoreThanHundred;

    By tabAuthors = By.xpath("//a[@href=\"https://habr.com/ru/users/\"][ancestor::div[@class='tabs']]");

    By articleLabel = By.xpath("//li[contains(@id,'post')]");

    By projectsDropdown = By.xpath("//span[@class=\"projects-dropdown\"]");
    By careerPortal = By.xpath("//a[@class=\"service\" and contains(@href,\"https://career.habr.com\")]");
    By languageBarSettings = By.xpath("//button[@class='btn btn_medium btn_navbar_lang js-show_lang_settings']");
    By englishLanguageRaddioButton = By.xpath("//fieldset[1]//div[2]");
    By saveButton = By.xpath("//button[@class='btn btn_blue btn_huge btn_full-width js-popup_save_btn']");
    By designNavigationButton = By.xpath("//div[@class='layout__row layout__row_navbar']//li[5]//a[1]");

    public void waitUntilHomePageTitleIsDisplayed(String title) {
        waiter.until(ExpectedConditions.titleIs(title));
    }

    public void waitUntilHomePageTitleWithSortedLabelAllPosts(String title) {
        waiter.until(ExpectedConditions.titleIs(title));

    }

    public void waitUntilSettingsPOpupIsOpened() {
        waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='popup']//div[@class='popup__body']")));
    }


    public boolean islistOfArticlesDisplayed() {
        List<WebElement> listOfArticles = driver.findElements(By.xpath(("//li[contains(@id,'post')]")));
        return (listOfArticles.size()) >= 20;
    }


    public void waitUntilUserJohnRicoIsVisible(String title) {

        waiter.until(ExpectedConditions.titleIs(title));
    }


    public void openHomePage() {

        driver.get(HomePageUrl);
    }


    public boolean atHomePage(String title) {

        return (driver.getTitle().equals(title));
    }


//    public boolean isEnglisVersionSelected (){
//        if (driver.getTitle().equals(Home)){
//
//        } else {
//
//        }
//    }


    public void filterByAllposts() {
        filterBylabelAllPosts.click();
        Log.info("Label AllPOsts is selected");
    }


    public void filterByMoreThanHundred() {
        filterBylabelMoreThanHundred.click();
    }


    public UsersListPage goToUsersPage() {
        driver.findElement(tabAuthors).click();
        return new UsersListPage();
    }


    public CareerPortal openCareerpage() {
        driver.findElement(projectsDropdown).click();
        driver.findElement(careerPortal).click();
        return new CareerPortal();

    }

    public void waitUntilTitleIsDisplayed(String title) {
        waiter.until(ExpectedConditions.titleIs(title));
        Log.info("Title of EnglishHomePage is present");
    }

    public void openLanguageBarSettings() {
        driver.findElement(languageBarSettings).click();
    }

    public EnglishHomePage switchtoEnglishLanguage() {

        driver.findElement(englishLanguageRaddioButton).click();
        driver.findElement(saveButton).click();

        return new EnglishHomePage();
    }

    public DesignPage goToDesignPage() {
        driver.findElement(designNavigationButton).click();
        return new DesignPage();
    }


    public UserProfile openAuthorProfile() {
        driver.findElement(By.linkText("JohnRico")).click();
        return new UserProfile();
    }


//    public CarieePage getCarierPage (){
//        driver.findElement()
//
//        return new  CarierPage;
//    }
//
//
//    public check MosrReadAerticlesDropdown
//
//
//    public re3ceiveNew CoomentALert
//
//
//    public void openWHoleArticle


}



