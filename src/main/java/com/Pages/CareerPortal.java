package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CareerPortal {

    private WebDriver driver;
    private WebDriverWait waiter;


        public CareerPortal(WebDriver driver, WebDriverWait waiter){
         this.driver=driver;
         this.waiter=waiter;
              }

     By inputProfessionField = By.xpath("//input[@id='q']");
    By inputLocationnField = By.xpath("//input[@id='location']");
    By chatBotClosedWindow = By.xpath("//jdiv[@class='hoverl_6R']");
    By chatBotCloseIcon = By.xpath("//jdiv[@class='closeIcon_1U']");
    By chatBotOpenedWindow = By.xpath("//jdiv[@class='contentWrapper_Vr']//jdiv[3]");
    By submitSearchButton = By.xpath("//input[@type=\"submit\"]");
  //  WebElement chatBotOpenedWindow = driver.findElement(By.xpath("//jdiv[@class='contentWrapper_Vr']//jdiv[3]"));





            public void openChatBotWindow(){

                driver.findElement(chatBotClosedWindow).click();
            }

            public boolean isChatBotWindowOpened (){
                if (driver.findElement(chatBotCloseIcon).isDisplayed()){
                    return  true;
                } else {
                    return false;
                }
            }

        public void enterProfessionyWord (String profession){
                driver.findElement(inputProfessionField).clear();
                driver.findElement(inputProfessionField).sendKeys(profession);
                driver.findElement(submitSearchButton).click();
        }

    public void enterLocationyWord (String location){
        driver.findElement(inputLocationnField).clear();
        driver.findElement(inputLocationnField).sendKeys(location);
        driver.findElement(submitSearchButton).click();
    }



    public boolean isLogoOfCareerPortalDisplayed() {
        WebElement logoOfCareerPortal = driver.findElement(By.xpath("//div[@class='inner']/div[@class='logo']/*[1]"));
        if (logoOfCareerPortal.isDisplayed()) {
            return true;
        } else {
            return false;
        }
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

