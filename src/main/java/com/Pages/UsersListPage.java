package com.Pages;

import com.utils.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.Keys.ENTER;

public class UsersListPage extends BasePage{


    By searchField = By.xpath("//input[@id='people_suggest']");
    By RaitingLabel = By.xpath("//span[@class='sort-panel__item-toggler active']");
    By UsersListBlock = By.xpath("//div[@class='page__body page__body_users-list']");


    public void openUsersListPage (){
        driver.get(UsersListPageUrl);
    }

    public boolean waitUntilUsersListPageIsDisplayed (String title){

        return (driver.getTitle().equals(title));

}

    public boolean isUsersListPresented (){
        boolean isPresented = driver.findElement(UsersListBlock).isDisplayed();
        Log.info("UsersList should be Presented");
        return isPresented;
    }

    public void waitUntilUserJohnRicoIsVisible () {

    waiter.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("JohnRico")));
}

    public boolean atPage (String title){
        return (driver.getTitle().equals(title));
    }

    public void findAuthorName (String authorName){
        driver.findElement(searchField).clear();
        driver.findElement(searchField).sendKeys(authorName+ENTER);
                   }


           public UserProfile openUserProfile(){
               driver.findElement(By.linkText("JohnRico")).click();
               return new UserProfile();
          }


    public boolean isAuthorRaitingDisplayed(){
        return (driver.findElement(RaitingLabel).isDisplayed());
        }




}
