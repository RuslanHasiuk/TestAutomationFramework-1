package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthorsBookmarks {
    private WebDriver driver;
    private WebDriverWait waiter;



    public AuthorsBookmarks (WebDriver driver, WebDriverWait waiter){
        this.driver = driver;
        this.waiter = waiter;
        PageFactory.initElements(driver, this);
    }

    By AuthorsBookmarks = By.xpath("//li[contains(@id,'post')]");

}
