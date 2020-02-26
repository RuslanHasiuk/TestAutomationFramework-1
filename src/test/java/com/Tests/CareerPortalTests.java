package com.Tests;

import com.Pages.CareerPortal;
import com.Pages.VacanciesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CareerPortalTests extends BaseTest   {


    @Test
    public void CheckSearchByProffession()  {

        CareerPortal careerPortal = new CareerPortal();
        VacanciesPage vacanciesPage = new VacanciesPage();

        careerPortal.openCareerPortal();

      //  waiter = new WebDriverWait(driver, 20);
       // waiter.until(ExpectedConditions.titleIs(CareerPortalTitle));
        careerPortal.waitUntilTitleIsDisplayed(CareerPortalTitle);
        Assert.assertTrue(careerPortal.atPage());


        careerPortal.enterProfessionyWord("Python developer");

   //     waiter.until(ExpectedConditions.titleIs(VacanciesPageTitle));

        Assert.assertTrue(vacanciesPage.isJobsListFound());


    }

//    @Test
//    public void CheckSearchByLocation() throws InterruptedException {
//        CareerPortal careerPortal = new CareerPortal(driver, waiter);
//        VacanciesPage vacanciesPage = new VacanciesPage(driver, waiter);
//
//        driver.get("https://career.habr.com/?_ga=2.155167418.388676112.1581019437-1753413896.1565853554");
//
//        waiter = new WebDriverWait(driver, 20);
//        waiter.until(ExpectedConditions.titleIs(CareerPortalTitle));
//        Assert.assertTrue(careerPortal.atPage());
//
//
//        careerPortal.enterLocationyWord("Moscow");
//
//        waiter.until(ExpectedConditions.titleIs(VacanciesPageTitle));
//
//        Assert.assertTrue(vacanciesPage.isJobsListFound());
//
//    }
//
//    @Test
//    public void CheckChatBotWindowOpening() {
//        CareerPortal careerPortal = new CareerPortal(driver, waiter);
//
//        driver.get("https://career.habr.com/?_ga=2.155167418.388676112.1581019437-1753413896.1565853554");
//
//
//        waiter = new WebDriverWait(driver, 20);
//        waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//jdiv[@class='hoverl_6R']")));
//
//        Assert.assertTrue(careerPortal.atPage());
//
//
//        careerPortal.openChatBotWindow();
//
//        waiter.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//jdiv[@class='closeIcon_1U']"))));
//
//        Assert.assertTrue(careerPortal.isChatBotWindowOpened());
//
//    }




//                CheckRedirectToClientsPage

//            CheckMessegeCOantactBox

//
//                    ChatBot = By.xpath("//jdiv[@class='drag_22']");

//
//    @Test
//    public void verifyIfChatBotOpens (){
//        careerPOrtal.openChatBotWindow();
//
//        AssertionError
//    }
//
//
//
//    @Test
//    public void checkHoverOverCompanyTab (){
//        CareerPortal careerPortal = new CareerPortal(driver,waiter);
//        careerPortal

    }







