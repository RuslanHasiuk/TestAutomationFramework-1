package com.Pages;

import org.openqa.selenium.By;

public class VacanciesPage extends BasePage {
//    private WebDriver driver;
//    private WebDriverWait waiter;
//
//    public VacanciesPage (WebDriver driver, WebDriverWait waiter){
//        this.driver=driver;
//        this.waiter=waiter;
//    }




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
