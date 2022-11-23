package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendResultPage extends Utils {
    //finding a location of sent email message by class name
    private By _emailSentMsg = By.className("result");

    //taking expected result to compare with actual result by assert equals

    static String expectedEmailMsg = "Your message has been sent.";

    //method to verify register user has sent email successfully
    public void verifyRegisteredUserHasSentEmailSuccessfully()

    {
        waitForUrlToBe("https://demo.nopcommerce.com/productemailafriend/4", 15);
        String regMsg = getTextFromElement(_emailSentMsg);
        //suing assert to print out the registration message in console to verify the test is passed
        Assert.assertEquals(regMsg,expectedEmailMsg);
    }


}