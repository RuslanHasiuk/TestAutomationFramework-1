package com.Tests;

import com.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    protected String HomePageTitle = "Лучшие публикации за сутки / Хабр";
    protected String HomePageTitleEnglish = "Top of the last 24 hours / Habr";
    protected String HomePageTitleWithSortedLabelMoreThanHundred = "Публикации с рейтингом ≥100 / Хабр";
    protected String HomePageTitleWithSortedLabelAllPosts = "Все публикации подряд / Хабр";
    protected String CareerPageTitle = "Работа в IT-индустрии — Хабр Карьера";
    protected String UsesrsListPageTitle = "Пользователи - Топ 100 / Хабр";
    protected String UserJohnRicoPageTitle = "JohnRico из компании Southbridge - Пользователь на Хабр";

    protected String JohnRicoCommentsPageTitle = "Комментарии / Профиль johnrico / Хабр";
    protected String JohnRicoBookmarksPageTitle = "Публикации / Закладки / Профиль johnrico / Хабр";
    protected String JohnRicoPostsPageTitle = "Публикации / Профиль JohnRico / Хабр";


    protected String DesignPageTitle = "Все публикации в потоке Дизайн / Хабр";
    protected String LoginPageTitle = "Вход — Habr Account";
   protected String CareerPortalTitle = "Работа в IT-индустрии — Хабр Карьера";
   protected String VacanciesPageTitle = "Вакансии — Хабр Карьера";


@BeforeMethod
public void setUp (){
    DriverManager.getInstance();
}



    @AfterMethod
    public void tearDown() {
    DriverManager.close();
    }

}

