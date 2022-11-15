package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends  Utils{
    //finding a location of registered result by class name
    private By registeredMsg = By.className("result");
    //using string value for assertion

    static String expectedRegMsg = "Your registration completed";
    public void verifyUserHasBeenRegisteredSuccessfully()
    //getting url to confirm the user has been registered successfully by calling a method
    {
        waitForUrlToBe("https://demo.nopcommerce.com/registerresult/1?returnUrl=/",15);

    }
    public  void verifyRegisteredMessageIsDisplayed()
    {
     //using a get text from element method to print registration message
        String regMsg = getTextFromElement(registeredMsg);
        //suing assert to print out the registration message in console to verify the test is passed
        Assert.assertEquals(regMsg,expectedRegMsg);
    }
}
