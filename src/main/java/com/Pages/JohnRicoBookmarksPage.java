package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class JohnRicoBookmarksPage extends BasePage {


    public boolean atPage (String title){
        return (driver.getTitle().equals(title));
    }

    public void waitUntilJohnRicoBookmarksPageisDisplayed(String title){
        waiter.until(ExpectedConditions.titleIs(title));
    }




    public  boolean isListOfBookmarksDisplayed(){
    List<WebElement> listOfBookmarks = driver.findElements(By.xpath("//li[contains(@id,'post')]"));
    int number = listOfBookmarks.size();
            return  (number >= 20);
}
}
