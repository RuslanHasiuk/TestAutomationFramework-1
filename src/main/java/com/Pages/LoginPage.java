package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

       public  static final  String Url = "\"https://account.habr.com/login/?state=3a276216c5686ad1c52be2a9895cd8b2&consumer=habr&hl=ru_RU\"";

    @FindBy (xpath = "//input[@type='email']")
    WebElement emailField;

    @FindBy (xpath = "//input[@type='password']")
            WebElement passsword;

    @FindBy (xpath = "//button[@type='submit']")
            WebElement submitButton;


    By reCaptchaCheckbox = By.xpath("//div[@class=\"rc-anchor-center-item rc-anchor-checkbox-holder\"]/*");
    By resetButton = By.xpath("//a[@class=\"form__remind-password-link\"]");
    By registerButton = By.xpath("//a[contains(text(),'Зарегистрируйтесь')]");
    By loginByFaceBookButton = By.xpath("//a[@title=\"Зарегистрироваться с помощью Facebook\"]");
    By errorField = By.xpath("//div[@class='s-error']");




     public boolean atLoginPage (){
      if(driver.getTitle().equals("Вход — Habr Account")){
          return true;
      } else {
          return false;
      }
  }




  String expectedEmailError= "Введите корректный e-mail";

    public boolean isEmailErrorDisplayed(){
        WebElement actualEmailError = driver.findElement(By.xpath("//div[@class='s-error']"));
        String text = actualEmailError.getText();
        if(text.equalsIgnoreCase(expectedEmailError)){
            return true;
        } else {
            return false;
        }
    }

    String expectedPasswordError= "Пользователь с такой электронной почтой или паролем не найден";

    public boolean isPasswordErrorDisplayed(){
        WebElement actualPasswordError = driver.findElement(By.xpath("//div[@class=\"notice__text\"]"));
        String text = actualPasswordError.getText();
        if(text.equalsIgnoreCase(expectedPasswordError)){
            return true;
        } else {
            return false;
        }
    }




    public void enterEmail (String mailbox){

        emailField.sendKeys(mailbox);
    }

    public void enterPassword (String pass){

        passsword.sendKeys(pass);
            }


    public HomePage submitLoginForm (){
        submitButton.click();
        return new HomePage();
    }


    public HomePage getHomePageWithloggedInUser() {
        enterEmail("ruslanhasiuk@gmail.com");
        enterPassword("2408Hekz");
        submitLoginForm();
        return new HomePage();
    }



    public void resetPassword ()
    {

        driver.findElement(resetButton).click();
    }

    public void redirectToRegisterForm (){
        driver.findElement(registerButton).click();
    }

    public  void CheckFacebookQuickLinkButton (){
        driver.findElement(loginByFaceBookButton).click();
    }

//
//    boolean atPage(){
//        if (driver.getTitle().equals("Вход — Habr Account")) {
//            return true;
//        }   else {
//            return false;
//        }
//    }


}
