package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ResetPassPage {
    private WebDriver driver;
    public ResetPassPage (WebDriver driver){
        this.driver = driver;
    }
    static String resetPageUrl =  "https://account.habr.com/login/reminder/?consumer=habr&state=74b252622cdab2493054755c61030492";

    By emailFieldForResetPass = By.xpath("//input[@type=\"email\"][parent::div[@class='form__field s-field']]");
    By submitResetPassButton = By.xpath(("//button[@type='submit']"));

    boolean atResetPassPage (){
        if (driver.getCurrentUrl().equals(resetPageUrl)){
            return true;
        } else {
            return  false;
        }
    }

    public void enterEmail (String email){
                driver.findElement(emailFieldForResetPass).sendKeys(email);
    }

    public void submitResetPassForm(){
        driver.findElement(submitResetPassButton).submit();
    }


}
