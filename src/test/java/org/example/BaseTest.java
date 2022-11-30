package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {
    //creating a method through object name for driver manager
    DriverManager driverManager = new DriverManager();
    //creating and object for home page
    HomePage homePage = new HomePage();
    //creating an object for register page
    RegisterPage registerPage = new RegisterPage();
    //creating an object for register result page
    RegisterResultPage registerResultPage = new RegisterResultPage();
    //creating an object for email a friend page
    EmailAFriend emailAFriend = new EmailAFriend();
    //creating an object for email a friend result page
    EmailAFriendResultPage emailAFriendResultPage = new EmailAFriendResultPage();
    //creating an object for new release comment page
    NewReleaseComment newReleaseComment = new NewReleaseComment();
    //creating an object for new release comment result page
    NewReleaseCommentResult newReleaseCommentResult = new NewReleaseCommentResult();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    NikePage nikePage = new NikePage();

    //importing annotations before method to open browser
    @BeforeMethod
    public void setUp() {
        driverManager.openBrowser();
    }

    //importing annotations after method to close browser
    @AfterMethod
    //method to capture screenshot for testcase
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            captureScreenshot(result.getName());
        }
        driverManager.closeBrowser();
    }
}
