package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
     HomePage homePage = new HomePage();
     RegisterPage registerPage = new RegisterPage();
     RegisterResultPage registerResultPage = new RegisterResultPage();
    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        homePage.clickOnRegisterButton();
    }
    @When("user click on the register button,user should be on register page")
    public void user_click_on_the_register_button_user_should_be_on_register_page() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        registerPage.verifyUserIsOnRegisterPage();
    }
    @When("user enters all required registration details")
    public void user_enters_all_required_registration_details() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        registerPage.enterRegistrationDetails();
    }
    @Then("user should be able to click on Register button")
    public void user_should_be_able_to_click_on_register_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        registerResultPage.verifyUserHasBeenRegisteredSuccessfully();
    }
    @Then("user should be able to see, Your registration completed message")
    public void user_should_be_able_to_see_your_registration_completed_message() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        registerResultPage.verifyRegisteredMessageIsDisplayed();
    }
}
