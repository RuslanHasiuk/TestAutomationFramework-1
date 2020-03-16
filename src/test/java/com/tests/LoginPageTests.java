package com.tests;

import com.habr.pages.HomePage;
import com.habr.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {


    //
    @Test
    public void VerifyLoginPageWithCorrectCredentionals() {


        LoginPage loginForm = new LoginPage();

        loginForm.openPage();
        loginForm.waitUntilLoginPageTitleIsLoaded(LoginPageTitle);
        loginForm.atLoginPage(LoginPageTitle);

        loginForm.enterEmail("ruslanhasiuk@gmail.com");
        loginForm.enterPassword("2408Hekz");
        HomePage homePage = loginForm.submitLoginForm();

        homePage.waitUntilHomePageTitleIsDisplayed(HomePageTitle);

        Assert.assertTrue(homePage.atHomePage(HomePageTitle));
    }

    //
    @Test
    public void VerifyLoginPageWithInvalidEmail() {
        LoginPage loginForm = new LoginPage();

        loginForm.openPage();
        loginForm.waitUntilLoginPageTitleIsLoaded(LoginPageTitle);
        loginForm.atLoginPage(LoginPageTitle);

        loginForm.enterEmail("ruslanhasiukgmail.com");
        loginForm.enterPassword("2408Hekz");
        loginForm.submitLoginForm();

        loginForm.waitUntilEmailErrorDisplayed();

        Assert.assertTrue(loginForm.isEmailErrorDisplayed());
    }

    @Test
    public void VerifyLoginPageWithInvalilPassword() {
        LoginPage loginForm = new LoginPage();

        loginForm.openPage();
        loginForm.waitUntilLoginPageTitleIsLoaded(LoginPageTitle);
        loginForm.atLoginPage(LoginPageTitle);

        loginForm.enterEmail("ruslanhasiukg@mail.com");
        loginForm.enterPassword("2408hekz");
        loginForm.submitLoginForm();

        loginForm.waitUntilPasswordErrorDisplayed();

        Assert.assertTrue(loginForm.isPasswordErrorDisplayed());
    }

}







