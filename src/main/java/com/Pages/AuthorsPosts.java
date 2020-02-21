package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthorsPosts {
    private WebDriverWait waiter;
    private WebDriver driver;

    public AuthorsPosts (WebDriver driver, WebDriverWait waiter){
        this.driver=driver;
        this.waiter = waiter;
        PageFactory.initElements(driver,this);
    }

    By AuthorsPosts = By.xpath("//li[contains(@id,'post')]");

    }
