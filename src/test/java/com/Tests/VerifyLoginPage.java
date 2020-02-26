package com.Tests;

public class VerifyLoginPage  extends BaseTest {


//
//@Test
//    public void VerifyLoginPageWithCorrectCredentionals(){
//
//        WebDriverWait wait = new WebDriverWait();
//        LoginPage loginForm = new LoginPage();
//
//     //   loginForm.openLoginPage();
//      // assertTrue();
//        loginForm.enterEmail("ruslanhasiuk@gmail.com");
//        loginForm.enterPassword("2408Hekz");
//        HomePage homePage = loginForm.submitLoginForm();
//
//        waiter = new WebDriverWait();
//        waiter.until(ExpectedConditions.titleIs("Лучшие публикации за сутки / Хабр"));
//
//        Assert.assertTrue(homePage.atHomePage());
//}
//
//  @Test
//
//    public void VerifyLoginPageWithInvalidEmail() {
//        LoginPage loginForm = new LoginPage(driver,waiter);
//
//      waiter = new WebDriverWait(driver,15);
//      waiter.until(ExpectedConditions.titleIs(LoginPageTitle));
//
//        loginForm.enterEmail("ruslanhasiukgmail.com");
//        loginForm.enterPassword("2408Hekz");
//        loginForm.submitLoginForm();
//
//      waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form__field s-field s-with-error']")));
//
//      Assert.assertTrue(loginForm.isEmailErrorDisplayed());
//
//    }
//
//
//
//    @Test
//    public void VerifyLoginPageWithInvalilPassword() {
//        LoginPage loginForm = new LoginPage(driver,waiter);
//
//        waiter = new WebDriverWait(driver,15);
//        waiter.until(ExpectedConditions.titleIs("Вход — Habr Account"));
//
//        loginForm.enterEmail("ruslanhasiuk@gmail.com");
//        loginForm.enterPassword("2408gekz");
//
//
//        loginForm.submitLoginForm();
//
//
//        waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'notice error')]")));
//
//                Assert.assertTrue(loginForm.isPasswordErrorDisplayed());
//      }

}







