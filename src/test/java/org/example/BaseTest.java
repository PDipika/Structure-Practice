package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {
    //creating a method through object name for driver manager
    DriverManager driverManager = new DriverManager();
    //importing annotations before method to open browser
    @BeforeMethod
    public void setUp(){
    driverManager.openBrowser();
    }
    //importing annotations after method to close browser
    @AfterMethod
    public void tearDown(){
    driverManager.closeBrowser();
    }
}
