package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthorsComments {

    private WebDriver driver;
    private WebDriverWait waiter;



    public AuthorsComments (WebDriver driver, WebDriverWait waiter){
        this.driver = driver;
        this.waiter = waiter;
        PageFactory.initElements(driver, this);
    }

    By AuthorsComments = By.xpath("//li[@class=\"content-list__item content-list__item_comment content-list__item_comment-plain\"]");





}
