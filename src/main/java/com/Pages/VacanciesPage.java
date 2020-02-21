package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VacanciesPage {
    private WebDriver driver;
    private WebDriverWait waiter;

    public VacanciesPage (WebDriver driver, WebDriverWait waiter){
        this.driver=driver;
        this.waiter=waiter;
    }




    By textOfJobsList = By.xpath("//div[@id='jobs_list_title']");

    public boolean isJobsListFound (){


        if(driver.getPageSource().contains("Найден")){
            return true;
        } else {
            return false;
        }
    }

    
    public boolean atPage(){
        String currentPageTitle = driver.getTitle();
        if (currentPageTitle.equals("Вакансии — Хабр Карьера")) {
            return true;
        }   else {
            return false;
        }
    }



}
