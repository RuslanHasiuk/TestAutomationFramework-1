package com.habr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class UserProfile extends BasePage {


    By PostsTab = By.xpath("//h3[contains(text(),'Публикации')]");
    By CommentsTab = By.xpath("//h3[contains(text(),'Комментарии')]");
    By BookmarksTab = By.xpath("//h3[contains(text(),'Закладки')]");
    By SideBarInfo = By.xpath("//div[@class='default-block default-block_sidebar']//div/h3[contains(text(),'Инфо')]");
    By SideBarContributionToHubs = By.xpath("//div[@class='default-block default-block_sidebar']//div/h3[contains(text(),'Вклад')]");
    By Username = By.xpath("//div/h1//a[@href=\"/users/JohnRico/\"]");

    public void openUserProfilePage() {
        driver.get(UserJohnRicoPageUrl);
    }


    public void waitUntilUserJohnRicoPageisDisplayed(String title) {
        waiter.until(ExpectedConditions.titleIs(title));
    }

    public boolean atPage(String title) {
        return driver.getTitle().equals(title);
    }


    public JohnRicoPostsPage findPostsTab() {
        driver.findElement(PostsTab).click();
        return new JohnRicoPostsPage();
    }

    public JohnRicoCommentsPage findCommentsTab() {
        driver.findElement(CommentsTab).click();
        return new JohnRicoCommentsPage();
    }

    public JohnRicoBookmarksPage findBookmarksTab() {
        driver.findElement(BookmarksTab).click();
        return new JohnRicoBookmarksPage();
    }


    public boolean islistOfContributionItemsDisplayed() {
        List<WebElement> listOfContributionItems = driver.findElements(By.xpath("//div[@class='default-block__content']//li"));
        return (listOfContributionItems.size() == 10);
    }

    public boolean islistItemsFromSideInfoBarDisplayed() {
        List<WebElement> listItemsFromSideInfoBar = driver.findElements(By.xpath("//div[@class='default-block__content default-block__content_profile-summary']//li"));
        return (listItemsFromSideInfoBar.size() == 6);
    }


//       public AuthorsComments authorsComments (){
//
//            return  new AuthorsComments(driver,waiter);
//       }


    public boolean isUserNameDisplayed() {
        return (driver.findElement(Username).isDisplayed());

    }

    public boolean isPostsTabDisplaedAtPage() {
        return driver.findElement(PostsTab).isDisplayed();
    }


    public boolean isCommentsTabDisplaedAtPage() {
        return driver.findElement(CommentsTab).isDisplayed();
    }

    public boolean isBookmarksTabDisplaedAtPage() {
        return driver.findElement(BookmarksTab).isDisplayed();
    }


}
