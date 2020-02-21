package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserProfile {
    private WebDriver driver;
    private WebDriverWait waiter;


    public UserProfile (WebDriver driver, WebDriverWait waiter){
        this.driver = driver;
        this.waiter = waiter;
            }

            By PostsTab = By.xpath("//h3[contains(text(),'Публикации')]");
            By CommentsTab = By.xpath("//h3[contains(text(),'Комментарии')]");
            By BookmarksTab = By.xpath("//h3[contains(text(),'Закладки')]");
                    By SideBarInfo = By.xpath("//div[@class='default-block default-block_sidebar']//div/h3[contains(text(),'Инфо')]");
                By SideBarContributionToHubs = By.xpath("//div[@class='default-block default-block_sidebar']//div/h3[contains(text(),'Вклад')]");




        public void findPostsTab(){

           driver.findElement(PostsTab).click();
        }

        public void findCommentsTab(){

            driver.findElement(CommentsTab).click();
        }

        public void findBookmarksTab(){

            driver.findElement(BookmarksTab).click();
       }

//       public AuthorsComments authorsComments (){
//
//            return  new AuthorsComments(driver,waiter);
//       }







      public boolean isUserProfile (){
        if (driver.getTitle().equals("JohnRico из компании Southbridge - Пользователь на Хабр")){
            return true;
          } else {
            return false;
          }
      }

      public boolean isPostsTabDisplaedAtPage (){
            if (driver.findElement(PostsTab).isDisplayed()){
                return true;
            } else {
                return false;
            }
      }


    public boolean isCommentsTabDisplaedAtPage (){
        if (driver.findElement(CommentsTab).isDisplayed()){
            return true;
        } else {
            return false;
        }
    }

    public boolean isBookmarksTabDisplaedAtPage (){
        if (driver.findElement(BookmarksTab).isDisplayed()){
            return true;
        } else {
            return false;
        }
    }






}
