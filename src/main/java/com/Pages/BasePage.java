package com.Pages;

import com.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
   protected WebDriver driver;
   protected WebDriverWait waiter;

    public BasePage(){
      driver = DriverManager.getInstance();
      waiter = new WebDriverWait(driver, 20);
      PageFactory.initElements(driver, this);
   }

   protected String CareerPortalUrl = "https://career.habr.com/?_ga=2.148120062.854997712.1581930826-228731092.1581346042";




}
