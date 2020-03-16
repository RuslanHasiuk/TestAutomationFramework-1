package com.habr.pages;

import com.habr.utils.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class VacanciesPage extends BasePage {


    By LabelBackEnd = By.xpath("//label[@title=\"Бэкенд\"][ancestor::div[@class=\"checkbox_list two_column\"]]");


    By textOfJobsList = By.xpath("//div[@id='jobs_list_title']");
    By vacancySubscriptionLink = By.xpath("//a[@class=\"button btn-blue small js-vacancy_subscription_link\"]");
    By FilterTagBackEnd = By.xpath("//div[@class=\"filter_tags\"]//div[contains(text(),\"Бэкенд\")]");


    public void openPage() {
        driver.get(VacanciesPageUrl);
    }


    public boolean isJobsListFound() {
        return driver.getPageSource().contains("Найден");
    }


    public void waitUntilPageisLoaded(String title) {

        waiter.until(ExpectedConditions.titleIs(title));
    }

    public void waitUntilSubscriptionPopupIsDisplayed() {
        waiter.until(alertIsPresent());
    }

    public void waitUntilfilterByBackEndLabelIsDisplayed() {

        waiter.until(ExpectedConditions.visibilityOfElementLocated(FilterTagBackEnd));
    }


    public void waitUntilSubscriptionSuccessScreenIsDisplayed() {
        waiter.until(alertIsPresent());
    }


    public boolean atPage(String title) {
        String currentPageTitle = driver.getTitle();
        return (currentPageTitle.equals(title));
    }


    public void openVacancySubscriptionLink() {
        driver.findElement(vacancySubscriptionLink).click();
    }

    // When receive JOBSlist result - apply additional filter by "BackEnd" label"
    public void filterByBackEndLabel() {
        driver.findElement(LabelBackEnd).click();
        Log.info("Label \"BackEnd\" is chosen");
    }

    public boolean filterTagBackEndIsDisplayed() {
        WebElement FilterTag = driver.findElement(FilterTagBackEnd);
        return (FilterTag.isDisplayed());
    }


}
