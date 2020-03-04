package com.Pages;

//import com.sun.tools.sjavac.Log;

import com.utils.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CareerPortal extends BasePage {


    By inputProfessionField = By.xpath("//input[@id='q']");
    By inputLocationnField = By.xpath("//input[@id='location']");
    By chatBotClosedWindow = By.xpath("//jdiv[@class='hoverl_6R']");
    By chatBotCloseIcon = By.xpath("//jdiv[@class='closeIcon_1U']");
    By chatBotOpenedWindow = By.xpath("//jdiv[@class='contentWrapper_Vr']//jdiv[3]");
    By submitSearchButton = By.xpath("//input[@type=\"submit\"]");
  //  WebElement chatBotOpenedWindow = driver.findElement(By.xpath("//jdiv[@class='contentWrapper_Vr']//jdiv[3]"));


// open Career page
            public void openCareerPortal (){
                driver.get(CareerPortalUrl);
                Log.info("CareerPortal is opened");
            }


            public void waitUntilTitleIsDisplayed(String title){
                waiter.until(ExpectedConditions.titleIs(title));
                Log.info("Title of CareerPage is present");
            }

    public void waitUntilChatBOtWindowIsDisplayed(){
        waiter.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//jdiv[@class='closeIcon_1U']"))));
        Log.info("ChatBOtWindowIsDisplayed");
    }


            public void openChatBotWindow(){

                driver.findElement(chatBotClosedWindow).click();
                Log.info("ChatBot Window is opened");
            }

            public boolean isChatBotWindowOpened (){
                boolean display = driver.findElement(chatBotCloseIcon).isDisplayed();
                Log.info("ChatBotWindow is Opened");
                return display;
            }

        public void enterProfessionyWord (String profession){
                driver.findElement(inputProfessionField).clear();
                driver.findElement(inputProfessionField).sendKeys(profession);
                driver.findElement(submitSearchButton).click();
            Log.info("dfdf");
        }

    public void enterLocationyWord (String location){
        driver.findElement(inputLocationnField).clear();
        driver.findElement(inputLocationnField).sendKeys(location);
        driver.findElement(submitSearchButton).click();
    }



    public boolean isLogoOfCareerPortalDisplayed() {
        WebElement logoOfCareerPortal = driver.findElement(By.xpath("//div[@class='inner']/div[@class='logo']/*[1]"));
        return  (logoOfCareerPortal.isDisplayed());
    }


//    public  void HoverCopmanyTab (){
//        WebElement CompanyTab = driver.findElement(By.xpath("//div[@class='header']//a[3]"));
//        Actions action = new Action(driver);
//        action.moveToElement(CompanyTab).perform();
//    }

//
//    boolean isCompanyTabHovered() {
//        if (...) {
//            return true;
//        } else {
//            return false;
//        }
//    }



        public boolean atPage(){
            String currentPageTitle = driver.getTitle();
        if (currentPageTitle.equals("Работа в IT-индустрии — Хабр Карьера")) {
            return true;
        }   else {
            return false;
        }
    }



}

