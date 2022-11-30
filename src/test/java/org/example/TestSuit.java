

package org.example;


import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
   //test case to verify user should be able to register successfully
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
    //test case to verify alert is present when you press vote button on home page and click on alert
    @Test
    public void verifyVoteButtonToClickOnAlert()
    {
        homePage.clickOnVoteButtonAndAcceptIfAlertPresent();
    }
    //test case to verify only registered user can refer a product to friend by email
    @Test
    public void OnlyRegisteredUserCanReferProductByEmail(){
     homePage.clickOnRegisterButton();
     registerPage.enterRegistrationDetails();
     registerResultPage.verifyUserHasBeenRegisteredSuccessfully();
     registerPage.verifyUserTOClickOnContinueButton();
     homePage.clickOnAppleMacBookProPic();
     emailAFriend.clickOnEmailAFriendButton();
     emailAFriendResultPage.verifyRegisteredUserHasSentEmailSuccessfully();

    }
    @Test
    public void verifyFaceBookUrlOpenInNextTab(){
        homePage.clickOnFaceBookLogo();

    }//test case to verify News comments has been added successfully
    @Test
    public void verifyNewsCommentsHasBeenAddedSuccessfully(){
        homePage.clickOnNewsReleaseDetailsButton();
        newReleaseComment.clickOnNewCommentButton();
        newReleaseCommentResult.verifyNewsCommentMessageIsDisplayed();
    }
    //test case to verify correct currency value is displayed on home page products as per selection of currency from drop down
    @Test

    public void verifyCorrectCurrencyValueIsDisplayedAsPerDropDownCurrencySelection(){
        homePage.verifyUsDollarCurrencySymbol();
        homePage.verifyEuroCurrencySymbol();
    }
    @Test
    public void verifyAllProductPricesAreDisplayedOnHomePage(){
        homePage.clickOnElectronics();
        electronicsPage.navigateToCameraPhoto();
        cameraAndPhotoPage.printProductsNameWithList();
    }
    @Test
    public void verifyAllProductsHaveAddToCartButton(){
        cameraAndPhotoPage.addTocartButtoncheck();
    }
    @Test
    public void verifyUserShouldBeAbleToUseHoverMouseOverCategories(){
        homePage.hoverActionOverCategory("Computers");
    }
    @Test
    public void verifySearchFunctionalityIsWorking(){
        homePage.searchBarBox();
        nikePage.verifySearchFunctionality();
    }
}