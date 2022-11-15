package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;
//public register class which extends utils to call methods we created in utils class
public class RegisterPage extends Utils{
   //finding a location of select a gender by xpath
    private By genderFemale = By.xpath("//label[@for=\"gender-female\"]");
   //finding a location of  first name text box by id
    private By firstNameField = By.id("FirstName");
    //finding a location of last name text box by id
    private  By lastNameField = By.id("LastName");
    //finding a location of date for date of birth by classname
    private By dateOFBirthDaySelect = By.name("DateOfBirthDay");
    //finding a location of month for month of birth by xpath
    private By dateOFBirthMonthSelect = By.name("DateOfBirthMonth");
    //finding a location of year for year of birth by xpath
    private By dateOFBirthYearSelect = By.name("DateOfBirthYear");

    // finding a location of email text box  by id
    private By emailField = By.id("Email");
    //finding a location of company name by id
    private By companynNameField = By.id("Company");
    //finding a location of Newsletter: checkbox by id
    private By newsLetterField = By.id("Newsletter");
    // finding a location of password text box by id
    private By passwordField = By.id("Password");
    //finding a location of confirmPassword text box by id
    private By confirmPasswordField = By.id("ConfirmPassword");
    //finding a location of register submit button by id
    private By registerSubmitButton = By.id("register-button");

    public void verifyUserIsOnRegisterPage()
    {
    //using assertion to confirm the register page is open ang url is changed
    Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }


    public  void enterRegistrationDetails(){
     //using click on element method to select gender
     clickOnElement(genderFemale);
     //using typeText method to send value to first name filed
     typeText(firstNameField,"Dipika");
     //using typeText method to send value to last name filed
     typeText(lastNameField,"Patel");
     //using method select from dropdown by value for birthday
     selectFromDropDownByValue(dateOFBirthDaySelect, "7");
     //using method select from dropdown by visible text for birthMonth
     selectFromDropDownByVisibleText(dateOFBirthMonthSelect,"January");
     //using method select from dropdown by value for birthYear
     selectFromDropDownByValue(dateOFBirthYearSelect,"1990");
     //using method type text to send value of  email and using timestamp method to reuse the same email
     typeText(emailField,"pdipika0713" + addtime() +"@gmail.com");
     //using typeText method to fend value to company field
     typeText(companynNameField,"abc.ltd");
     //using method click on element to unTick newsletter check box
     clickOnElement(newsLetterField);
     //using method type text to send value to password field
     typeText(passwordField,"abc123");
     //using method type text to send value to confirm password field
     typeText(confirmPasswordField,"abc123");
     //using method click on element to register submit button
     clickOnElement(registerSubmitButton);


    }
}




