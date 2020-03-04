package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class JohnRicoPostsPage extends BasePage {


    public boolean atPage (String title){
        return (driver.getTitle().equals(title));
    }

    public void waitUntilJohnRicoPostsPageisDisplayed(String title){
        waiter.until(ExpectedConditions.titleIs(title));
    }

    public boolean isListOfPostsDisplayed() {
        List<WebElement> listOfPosts = driver.findElements(By.xpath("//li[contains(@id,'post')]"));
        int number = listOfPosts.size();
        return (number == 20);
   }

}
