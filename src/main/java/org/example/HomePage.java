package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends  Utils {
    //finding a location of register button on homepage
    private By _registerButton = By.linkText("Register");

    public  void clickOnRegisterButton()
    //calling a method click on register button to click and veryfiy the register button on home page
    {
        clickOnElement(_registerButton);
    //using assertion to verify the presence of register button by its class name
        Assert.assertEquals(getTextFromElement(By.className("ico-register")),"Register","verifyRegisterButtonIsPresent");
    }
}
