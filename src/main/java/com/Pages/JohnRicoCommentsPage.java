package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class JohnRicoCommentsPage extends BasePage {


    public boolean atPage(String title) {
        return (driver.getTitle().equals(title));
    }

    public void waitUntilJohnRicoCommentsPageisDisplayed(String title) {
        waiter.until(ExpectedConditions.titleIs(title));

    }

    public boolean isListOfCommentsDisplayed() {
        List<WebElement> listOfComments = driver.findElements(By.xpath("//li[@class=\"content-list__item content-list__item_comment content-list__item_comment-plain\"]"));
        int number = listOfComments.size();
        return (number > 30);
    }
}
