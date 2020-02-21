package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait waiter;
    private String f = "https://habr.com/ru/top/\"";


    public HomePage(WebDriver driver, WebDriverWait waiter) {
        this.driver = driver;
        this.waiter = waiter;
        PageFactory.initElements(driver, this);
    }


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



    public void waitUntilOageTitleIs (String expectedTitle){
        waiter.until(ExpectedConditions.titleIs(HomePageTitle));
    }

    public void openHomePage() {
        driver.get(f);
    }


    public boolean atHomePage() {
        if (driver.getTitle().equals("Лучшие публикации за сутки / Хабр")) {
            return true;
        } else {
            return false;
        }

    }

//    public boolean isEnglisVersion (){
//        if (driver.getTitle().equals(Home)){
//
//        } else {
//
//        }
//    }




    public void filterByAllposts() {

        filterBylabelAllPosts.click();
     }


    public void filterByMoreThanHundred() {
            filterBylabelMoreThanHundred.click();
    }


    public UsersPage goToUsersPage() {
        driver.findElement(tabAuthors).click();
        return new UsersPage(driver, waiter);
    }


    public com.Pages.CareerPortal openCareerpage() {
        driver.findElement(projectsDropdown).click();
        driver.findElement(careerPortal).click();
        return new CareerPortal(driver, waiter);

    }


    public void openLanguageBarSettings (){
        driver.findElement(languageBarSettings).click();
            }

     public void switchtoEnglishLanguage(){

        driver.findElement(englishLanguageRaddioButton).click();
        driver.findElement(saveButton).click();
     }

     public  DesignPage goToDesignPage (){
         driver.findElement(designNavigationButton).click();
         return new DesignPage(driver,waiter);
           }


    public UserProfile openAuthorProfile (){
        driver.findElement(By.linkText("JohnRico")).click();
        return new UserProfile(driver, waiter);
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



