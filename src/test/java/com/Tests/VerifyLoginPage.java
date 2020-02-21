package com.Tests;

import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLoginPage  extends BasePage {



@Test
    public void VerifyLoginPageWithCorrectCredentionals(){

        WebDriverWait wait = new WebDriverWait(driver,30);
        LoginPage loginForm = new LoginPage(driver,waiter);

     //   loginForm.openLoginPage();
      // assertTrue();
        loginForm.enterEmail("ruslanhasiuk@gmail.com");
        loginForm.enterPassword("2408Hekz");
        HomePage homePage = loginForm.submitLoginForm();

        waiter = new WebDriverWait(driver,10);
        waiter.until(ExpectedConditions.titleIs("Лучшие публикации за сутки / Хабр"));

        Assert.assertTrue(homePage.atHomePage());
}

  @Test

    public void VerifyLoginPageWithInvalidEmail() {
        LoginPage loginForm = new LoginPage(driver,waiter);

      waiter = new WebDriverWait(driver,15);
      waiter.until(ExpectedConditions.titleIs(LoginPageTitle));

        loginForm.enterEmail("ruslanhasiukgmail.com");
        loginForm.enterPassword("2408Hekz");
        loginForm.submitLoginForm();

      waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form__field s-field s-with-error']")));

      Assert.assertTrue(loginForm.isEmailErrorDisplayed());

    }



    @Test
    public void VerifyLoginPageWithInvalilPassword() {
        LoginPage loginForm = new LoginPage(driver,waiter);

        waiter = new WebDriverWait(driver,15);
        waiter.until(ExpectedConditions.titleIs("Вход — Habr Account"));

        loginForm.enterEmail("ruslanhasiuk@gmail.com");
        loginForm.enterPassword("2408gekz");


        loginForm.submitLoginForm();


        waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'notice error')]")));

                Assert.assertTrue(loginForm.isPasswordErrorDisplayed());
      }

}







