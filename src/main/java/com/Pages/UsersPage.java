package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.Keys.ENTER;

public class UsersPage {
    private WebDriver driver;
    private WebDriverWait waiter;

   public UsersPage (WebDriver driver, WebDriverWait waiter){
        this.driver=driver;
        this.waiter=waiter;
           }

    By searchField = By.xpath("//input[@id='people_suggest']");
    By RaitingLabel = By.xpath("//span[@class='sort-panel__item-toggler active']");


    public void findAuthorName (String authorName){
        driver.findElement(searchField).clear();
        driver.findElement(searchField).sendKeys(authorName+ENTER);
                   }


           public UserProfile openAuthorProfile (){
               driver.findElement(By.linkText("JohnRico")).click();
               return new UserProfile(driver, waiter);
          }


    public boolean isAuthorRaitingDisplayed(){
        if (driver.findElement(RaitingLabel).isDisplayed()){
            return true;
        }else {
            return false;
        }
    }




}