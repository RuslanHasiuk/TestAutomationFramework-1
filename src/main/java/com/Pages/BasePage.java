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





//
}
