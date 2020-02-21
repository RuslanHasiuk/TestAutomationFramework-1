package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DesignPage {
    private WebDriver driver;
    private WebDriverWait waiter;

    public DesignPage (WebDriver driver, WebDriverWait waiter) {
        this.driver = driver;
        this.waiter = waiter;
         }

         private String Url = "https://habr.com/ru/flows/design/"; //there iframe at this page!

   //      By pageLogo = By.xpath("//div[contains(@class,'page-header page-header_110')]");

         public boolean hasPageLogo () {
             WebElement logo = driver.findElement(By.xpath("//div[contains(@class,'page-header page-header_110')]"));
             String pageLogo = logo.getText();
             if (pageLogo.equalsIgnoreCase("дизайн")) {
                 return true;
             } else {
                 return false;
             }
         }


}
