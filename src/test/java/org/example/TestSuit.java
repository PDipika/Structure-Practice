package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    //creating and object for home page
    HomePage homePage = new HomePage();
    //creating an object for register page
    RegisterPage registerPage = new RegisterPage();
    //creating an object for register result page
    RegisterResultPage registerResultPage = new RegisterResultPage();
    @Test
    public void VerifyUserShouldBeAbleToRegisterSuccessfully() {
        //method to click on register button on home page class
        homePage.clickOnRegisterButton();
        //method to verify user on registerPage on register page class
        registerPage.verifyUserIsOnRegisterPage();
        //method to enter registration detail on register page class
        registerPage.enterRegistrationDetails();
        //method to verify user has been register successfully on register result class
        registerResultPage.verifyUserHasBeenRegisteredSuccessfully();
        registerResultPage.verifyRegisteredMessageIsDisplayed();
    }
}