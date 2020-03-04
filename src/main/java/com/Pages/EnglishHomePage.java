package com.Pages;

public class EnglishHomePage  extends BasePage {

    public void openPage(){
        driver.get(EnglishHomePageUrl);
    }

    public boolean atEnglishHomePage(String title) {

        return (driver.getTitle().equals(title));
    }

//    public void waitUntilTitleIsDisplayed(String title){
//        waiter.until(ExpectedConditions.titleIs(title));
//        Log.info("Title of EnglishHomePage is present");
//    }

}
