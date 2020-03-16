package com.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {

    @Test
    public void searchForPostsByPostTitleTest() {
        open("https://sit.habr.com/ru/");

        String searchQuery = "Почему мы испортили светодиоды статуса и что нужно менять";

        element("#search-form-btn").click();
        $("#search-form-field")
                .val(searchQuery)
                .pressEnter();

        $("#inner_search_form select#flow").shouldBe(visible);
        $("#inner_search_form [name=q]").shouldHave(value(searchQuery), visible);
        $$(".content-list li[class*=item_post]").first().shouldHave(text(searchQuery));
    }

}
