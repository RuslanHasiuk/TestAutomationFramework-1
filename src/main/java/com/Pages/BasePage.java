package com.Pages;

import com.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
   protected WebDriver driver;
   protected WebDriverWait waiter;

    public BasePage(){
      driver = DriverManager.getInstance();
      waiter = new WebDriverWait(driver, 20);
      PageFactory.initElements(driver, this);
   }

    protected String CareerPortalUrl = "https://career.habr.com/?_ga=2.148120062.854997712.1581930826-228731092.1581346042";
    protected String UserJohnRicoPageUrl = "https://habr.com/ru/users/JohnRico/";
    protected String  HomePageUrl = "https://habr.com/ru/top/";
    protected String  EnglishHomePageUrl = "https://habr.com/en/top/";
  //  private String

    protected String  UsersListPageUrl = "https://habr.com/ru/users/";
    protected String  UserJohnRicoUrl = "https://habr.com/ru/users/JohnRico/";

    protected String JohnRicoCommentsPageUrl = "https://habr.com/ru/users/johnrico/comments/";
    protected String JohnRicoBookmarksPageUrl = "https://habr.com/ru/users/johnrico/favorites/";
    protected String JohnRicoPostsPageUrl = "https://habr.com/ru/users/johnrico/posts/";
    protected String  VacanciesPageUrl = "https://career.habr.com/vacancies?utf8=%E2%9C%93&q=&location=test&city_id=&type=all";
    protected String LoginPageUrl = "https://account.habr.com/login/?state=3a276216c5686ad1c52be2a9895cd8b2&consumer=habr&hl=ru_RU";
//    protected String
//    protected String
//    protected String
//    protected String
//    protected String
//    protected String




}
