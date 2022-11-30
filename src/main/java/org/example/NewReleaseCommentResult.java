package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewReleaseCommentResult extends Utils{
    //finding a location of news comment result text by class name
    private By _newsCommentResult = By.className("result");
    //expected result to compare with actual result by using assert equals
    static String newsCommentMsg = "News comment is successfully added.";
    //method to verify news comment message is displayed
    public void verifyNewsCommentMessageIsDisplayed() {


        waitForUrlToBe("https://demo.nopcommerce.com/nopcommerce-new-release", 15);
        String regMsg = getTextFromElement(_newsCommentResult);
        //suing assert to print out the registration message in console to verify the test is passed
        Assert.assertEquals(regMsg,newsCommentMsg);
    }
    public void verifyUserCommentIsDislayedAtBottomOfTheComments(){

    }
}
