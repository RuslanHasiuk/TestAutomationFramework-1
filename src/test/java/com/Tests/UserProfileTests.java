package com.Tests;

import com.Pages.BasePage;
import com.Pages.UserProfile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UserProfileTests extends BasePage {


   @Test
    public void checkIfAuthorTabsAreDisplayed() {
        UserProfile userProfile = new UserProfile(driver, waiter);

        driver.get("https://habr.com/ru/users/JohnRico/");

        waiter = new WebDriverWait(driver,20);
        waiter.until(ExpectedConditions.titleIs(AuthorJohnRicoPageTitle));

        Assert.assertTrue(userProfile.isPostsTabDisplaedAtPage());
        Assert.assertTrue(userProfile.isCommentsTabDisplaedAtPage());
        Assert.assertTrue(userProfile.isBookmarksTabDisplaedAtPage());
    }


   @Test
    public void checkListOfAuthorsComments(){
        UserProfile userProfile = new UserProfile(driver, waiter);
        driver.get("https://habr.com/ru/users/JohnRico/");


        waiter = new WebDriverWait(driver,20);
        waiter.until(ExpectedConditions.titleIs(AuthorJohnRicoPageTitle));

        userProfile.findCommentsTab();

        waiter = new WebDriverWait(driver,10);
        waiter.until(ExpectedConditions.titleIs("Комментарии / Профиль johnrico / Хабр"));

        List <WebElement> listOfComments = driver.findElements(By.xpath("//li[@class=\"content-list__item content-list__item_comment content-list__item_comment-plain\"]"));

        Assert.assertTrue(listOfComments.size() > 30);
    }




   @Test
    public void checkListOfAuthorsPosts(){
        UserProfile userProfile = new UserProfile(driver, waiter);
        driver.get("https://habr.com/ru/users/JohnRico/");


        waiter = new WebDriverWait(driver,20);
        waiter.until(ExpectedConditions.titleIs(AuthorJohnRicoPageTitle));

        userProfile.findPostsTab();

        waiter = new WebDriverWait(driver,10);
        waiter.until(ExpectedConditions.titleIs("Публикации / Профиль JohnRico / Хабр"));

        List <WebElement> listOfPosts = driver.findElements(By.xpath("//li[contains(@id,'post')]"));

        Assert.assertTrue(listOfPosts.size()  == 20);

    }



    @Test
    public void checkListOfAuthorsBookmarks(){
        UserProfile userProfile = new UserProfile(driver, waiter);
        driver.get("https://habr.com/ru/users/JohnRico/");


        waiter = new WebDriverWait(driver,20);
        waiter.until(ExpectedConditions.titleIs(AuthorJohnRicoPageTitle));

        userProfile.findBookmarksTab();

        waiter = new WebDriverWait(driver,10);
        waiter.until(ExpectedConditions.titleIs("Публикации / Закладки / Профиль johnrico / Хабр"));

        List <WebElement> listOfBookmarks = driver.findElements(By.xpath("//li[contains(@id,'post')]"));

        Assert.assertTrue(listOfBookmarks.size() >= 20);

    }


    @Test
    public void checkSideBarInfo(){
        UserProfile userProfile = new UserProfile(driver, waiter);
        driver.get("https://habr.com/ru/users/JohnRico/");

        waiter = new WebDriverWait(driver,20);
        waiter.until(ExpectedConditions.titleIs(AuthorJohnRicoPageTitle));

      List <WebElement> listItemsFromSideInfoBar = driver.findElements(By.xpath("//div[@class='default-block__content default-block__content_profile-summary']//li"));

   Assert.assertTrue(listItemsFromSideInfoBar.size() == 6);
    }




    @Test
    public void checkSideBarContributionToHubs(){
        UserProfile userProfile = new UserProfile(driver, waiter);
        driver.get("https://habr.com/ru/users/JohnRico/");


        waiter = new WebDriverWait(driver,20);
        waiter.until(ExpectedConditions.titleIs(AuthorJohnRicoPageTitle));


        List <WebElement> listOfContributionItems =driver.findElements(By.xpath("//div[@class='default-block__content']//li"));

        Assert.assertTrue(listOfContributionItems.size() == 10);

    }




}
