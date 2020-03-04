package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DesignPage extends BasePage{


         private String Url = "https://habr.com/ru/flows/design/"; //there iframe at this page!

   //      By pageLogo = By.xpath("//div[contains(@class,'page-header page-header_110')]");

         public boolean hasPageLogo () {
             WebElement logo = driver.findElement(By.xpath("//div[contains(@class,'page-header page-header_110')]"));
             String pageLogo = logo.getText();
             return (pageLogo.equalsIgnoreCase("дизайн"));
             }


        public void waitUntilDesignPageTitleIsDisplayed (String title){
        waiter.until(ExpectedConditions.titleIs(title));
    }

}
