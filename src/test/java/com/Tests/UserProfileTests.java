package com.Tests;

import com.Pages.JohnRicoBookmarksPage;
import com.Pages.JohnRicoCommentsPage;
import com.Pages.JohnRicoPostsPage;
import com.Pages.UserProfile;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserProfileTests extends BaseTest {


    @Test
    public void checkIfAuthorTabsAreDisplayed() {
        UserProfile userProfile = new UserProfile();

        userProfile.openUserProfilePage();

        userProfile.waitUntilUserJohnRicoPageisDisplayed(UserJohnRicoPageTitle);

        Assert.assertTrue(userProfile.atPage(UserJohnRicoPageTitle));

        Assert.assertTrue(userProfile.isPostsTabDisplaedAtPage());
        Assert.assertTrue(userProfile.isCommentsTabDisplaedAtPage());
        Assert.assertTrue(userProfile.isBookmarksTabDisplaedAtPage());
    }

    //
    @Test
    public void checkListOfAuthorsComments() {
        UserProfile userProfile = new UserProfile();
        JohnRicoCommentsPage johnRicoCommentsPage = new JohnRicoCommentsPage();

        userProfile.openUserProfilePage();
        userProfile.waitUntilUserJohnRicoPageisDisplayed(UserJohnRicoPageTitle);
        Assert.assertTrue(userProfile.atPage(UserJohnRicoPageTitle));

        userProfile.findCommentsTab();
        johnRicoCommentsPage.waitUntilJohnRicoCommentsPageisDisplayed(JohnRicoCommentsPageTitle);
        Assert.assertTrue(johnRicoCommentsPage.atPage(JohnRicoCommentsPageTitle));

        Assert.assertTrue(johnRicoCommentsPage.isListOfCommentsDisplayed());

   }



    @Test
    public void checkListOfAuthorsPosts() {

        UserProfile userProfile = new UserProfile();
        JohnRicoPostsPage johnRicoPostsPage = new JohnRicoPostsPage();

        userProfile.openUserProfilePage();
        userProfile.waitUntilUserJohnRicoPageisDisplayed(UserJohnRicoPageTitle);
        Assert.assertTrue(userProfile.atPage(UserJohnRicoPageTitle));

        userProfile.findPostsTab();
        johnRicoPostsPage.waitUntilJohnRicoPostsPageisDisplayed(JohnRicoPostsPageTitle);
        Assert.assertTrue(johnRicoPostsPage.atPage(JohnRicoPostsPageTitle));

        Assert.assertTrue(johnRicoPostsPage.isListOfPostsDisplayed());
   }


        @Test
        public void checkListOfAuthorsBookmarks () {

            UserProfile userProfile = new UserProfile();
            JohnRicoBookmarksPage johnRicoBookmarksPage = new JohnRicoBookmarksPage();

            userProfile.openUserProfilePage();
            userProfile.waitUntilUserJohnRicoPageisDisplayed(UserJohnRicoPageTitle);
            Assert.assertTrue(userProfile.atPage(UserJohnRicoPageTitle));

            userProfile.findBookmarksTab();
            johnRicoBookmarksPage.waitUntilJohnRicoBookmarksPageisDisplayed(JohnRicoBookmarksPageTitle);
            Assert.assertTrue(johnRicoBookmarksPage.atPage(JohnRicoBookmarksPageTitle));

            Assert.assertTrue(johnRicoBookmarksPage.isListOfBookmarksDisplayed());

        }
//
//
    @Test
    public void checkSideBarInfo(){
        UserProfile userProfile = new UserProfile();

        userProfile.openUserProfilePage();
        userProfile.waitUntilUserJohnRicoPageisDisplayed(UserJohnRicoPageTitle);
        Assert.assertTrue(userProfile.atPage(UserJohnRicoPageTitle));

        Assert.assertTrue(userProfile.islistItemsFromSideInfoBarDisplayed());
       }


    @Test
    public void checkSideBarContributionToHubs(){
        UserProfile userProfile = new UserProfile();

        userProfile.openUserProfilePage();
        userProfile.waitUntilUserJohnRicoPageisDisplayed(UserJohnRicoPageTitle);
        Assert.assertTrue(userProfile.atPage(UserJohnRicoPageTitle));

        Assert.assertTrue(userProfile.islistOfContributionItemsDisplayed());

    }
 }

