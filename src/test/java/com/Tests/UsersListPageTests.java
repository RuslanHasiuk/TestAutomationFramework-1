package com.Tests;

import com.Pages.HomePage;
import com.Pages.UserProfile;
import com.Pages.UsersListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersListPageTests extends BaseTest {

    @Test
    public void CheckRedirectionToUsersListPage(){
        HomePage homePage = new HomePage();
        UsersListPage usersListPage = new UsersListPage();

        homePage.openHomePage();

        homePage.waitUntilHomePageTitleIsDisplayed(HomePageTitle);

        Assert.assertTrue(homePage.atHomePage(HomePageTitle));


        homePage.goToUsersPage();

        usersListPage.waitUntilUsersListPageIsDisplayed(UsesrsListPageTitle);
        usersListPage.atPage(UsesrsListPageTitle);

        Assert.assertTrue(usersListPage.isUsersListPresented());

    }


       @Test
    public void CheckIfUserFound(){

           UsersListPage usersListPage = new UsersListPage();

           usersListPage.openUsersListPage();
           usersListPage.waitUntilUsersListPageIsDisplayed(UsesrsListPageTitle);
           Assert.assertTrue(usersListPage.atPage(UsesrsListPageTitle));

           usersListPage.findAuthorName("JohnRico");

           usersListPage.waitUntilUserJohnRicoIsVisible();

          Assert.assertTrue(usersListPage.isAuthorRaitingDisplayed());

    }

    @Test(dependsOnMethods = { "CheckIfUserFound" })

    public void CheckIfUserProfileOpens(){

           UsersListPage usersListPage = new UsersListPage();
            UserProfile userProfile = new UserProfile();


        usersListPage.openUserProfile();

        userProfile.waitUntilUserJohnRicoPageisDisplayed(UserJohnRicoPageTitle);
        Assert.assertTrue(userProfile.atPage(UserJohnRicoPageTitle));

        Assert.assertTrue(userProfile.isUserNameDisplayed());

    }
}

