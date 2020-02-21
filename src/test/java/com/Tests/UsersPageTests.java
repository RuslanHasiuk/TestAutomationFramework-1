package com.Tests;

import com.Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersPageTests extends BasePage {


       @Test
    public void CheckIfUserFound(){

           HomePage homePage = new HomePage();
           LoginPage loginPage = new LoginPage(driver,waiter);
           UsersPage usersPage = new UsersPage(driver,waiter);
           UserProfile userProfile = new UserProfile(driver,waiter);

      //   loginPage.getHomePageWithloggedInUser();
       //    driver.get("https://habr.com/ru/top/");
           homePage.openHomePage();

     //      waiter = new WebDriverWait(driver,30);
           waiter.until(ExpectedConditions.titleIs(HomePageTitle));

               Assert.assertTrue(homePage.atHomePage());

        homePage.goToUsersPage();

           waiter.until(ExpectedConditions.titleIs(UsesrspageTitle));

        usersPage.findAuthorName("JohnRico");

           waiter = new WebDriverWait(driver,30);
           waiter.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("JohnRico")));

           Assert.assertTrue(usersPage.isAuthorRaitingDisplayed());
    }

    @Test
    public void VerifyAuthorProfileOpening(){
        LoginPage loginPage = new LoginPage(driver,waiter);
           UsersPage usersPage = new UsersPage(driver, waiter);
           HomePage homePage = new HomePage(driver, waiter);
        UserProfile userProfile = new UserProfile(driver, waiter);

     //   loginPage.getHomePageWithloggedInUser();
        driver.get("https://habr.com/ru/top/");

        waiter = new WebDriverWait(driver,20);
        waiter.until(ExpectedConditions.titleIs(HomePageTitle));

        homePage.goToUsersPage();

        waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='people_suggest']")));

        usersPage.findAuthorName("JohnRico");

        usersPage.openAuthorProfile();

        waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1/a[contains(text(),\"JohnRico\")]")));

        Assert.assertTrue(userProfile.isUserProfile());

    }
}

