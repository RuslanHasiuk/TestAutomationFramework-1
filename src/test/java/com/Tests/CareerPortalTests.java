package com.Tests;

import com.Pages.CareerPortal;
import com.Pages.VacanciesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CareerPortalTests extends BaseTest   {





    @Test(description = "Verify searching of users by proffesion filter" )
    public void CheckSearchByProffession()  {

        CareerPortal careerPortal = new CareerPortal();
        VacanciesPage vacanciesPage = new VacanciesPage();

        careerPortal.openCareerPortal();

        careerPortal.waitUntilTitleIsDisplayed(CareerPortalTitle);

       Assert.assertTrue(careerPortal.atPage());

        careerPortal.enterProfessionyWord("Python developer");

        Assert.assertTrue(vacanciesPage.isJobsListFound());


    }

    @Test(description = "Verify searching of users by location filter")
    public void CheckSearchByLocation() throws InterruptedException {
        CareerPortal careerPortal = new CareerPortal();
        VacanciesPage vacanciesPage = new VacanciesPage();

        careerPortal.openCareerPortal();

        careerPortal.waitUntilTitleIsDisplayed(CareerPortalTitle);

        Assert.assertTrue(careerPortal.atPage());


        careerPortal.enterLocationyWord("Saint Petersburg");
   //     waiter.until(ExpectedConditions.titleIs(VacanciesPageTitle));
        Assert.assertTrue(vacanciesPage.isJobsListFound());

    }
//
    @Test
    public void CheckChatBotWindowOpening() {
           CareerPortal careerPortal = new CareerPortal();
        VacanciesPage vacanciesPage = new VacanciesPage();

        careerPortal.openCareerPortal();
        careerPortal.waitUntilTitleIsDisplayed(CareerPortalTitle);
        Assert.assertTrue(careerPortal.atPage());



        careerPortal.openChatBotWindow();
        careerPortal.waitUntilChatBOtWindowIsDisplayed();
        Assert.assertTrue(careerPortal.isChatBotWindowOpened());

    }



    @Test(description = "apply additional filter by \"BackEnd\" label")
    public void checkAddingFilterTag() throws InterruptedException {
        CareerPortal careerPortal = new CareerPortal();
        VacanciesPage vacanciesPage = new VacanciesPage();

        careerPortal.openCareerPortal();
        careerPortal.waitUntilTitleIsDisplayed(CareerPortalTitle);
        Assert.assertTrue(careerPortal.atPage());

        careerPortal.enterLocationyWord("Saint Petersburg");
        //     waiter.until(ExpectedConditions.titleIs(VacanciesPageTitle));
        Assert.assertTrue(vacanciesPage.isJobsListFound());

        vacanciesPage.filterByBackEndLabel();
        vacanciesPage.waitUntilfilterByBackEndLabelIsDisplayed();
        Assert.assertTrue(vacanciesPage.filterTagBackEndIsDisplayed());
    }


//
//    @Test
//    public void checkHoverOverCompanyTab (){
//        CareerPortal careerPortal = new CareerPortal(driver,waiter);
//        careerPortal

    }







