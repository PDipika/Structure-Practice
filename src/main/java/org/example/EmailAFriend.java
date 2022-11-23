package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriend extends Utils{
     //finding a location of email a friend button by classname
    private By _EmailAFriend = By.className("email-a-friend");
    //finding a location of email a friend  field by id
    private By _friendEmailField = By.id("FriendEmail");
    //finding a location of personal message field by id
    private By _personamMessageField = By.id("PersonalMessage");
    //finding a location of send email button by class name
    private  By _sendEmailButton = By.className("buttons");
    public void clickOnEmailAFriendButton(){
        //using click on element method to click on email a friend button
        clickOnElement(_EmailAFriend);
        //using type text method to send value to email a friend field
        typeText(_friendEmailField,"dipika123@gmail.com");

        // finding a location of  personal message Text box by id to Click on the personal message Text box and send value
        typeText(_personamMessageField,"Please can you check this Product");
        // finding a location of send email button by class name to Clicks on the send email button
        clickOnElement(_sendEmailButton);

    }

}
