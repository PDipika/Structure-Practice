package org.example;

import org.openqa.selenium.By;

public class NewReleaseComment extends Utils {
    //finding a location of leave your comment title box by id
    private By _leaveYourCommentTitleBox = By.id("AddNewComment_CommentTitle");
    //finding a location of leave your comment, comment box by id
    private By _leaveYourCommentCommentBox = By.id("AddNewComment_CommentText");
    //finding a location of new comment button by classname
    private By _clickOnNewCommentButton = By.className("buttons");
   public void clickOnNewCommentButton(){
       //using type text method to send value tp comment title box
       typeText(_leaveYourCommentTitleBox,LoadProp.getProperty("commenttitle"));
       //using type text method to send value to leave your comment,comment box
       typeText(_leaveYourCommentCommentBox,"commentbox");
       //using click on element method to click on new comment button
       clickOnElement(_clickOnNewCommentButton);
   }
}
