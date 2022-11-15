package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import static org.example.BasePage.driver;

public class DriverManager extends Utils
{

 public void openBrowser(){
  // set the system property for Chrome driver
  System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
  // Create driver object for CHROME browser
  driver = new ChromeDriver();
  //opens and mange and maximize the window
  driver.manage().window().maximize();
  // get the current URL of the page
  driver.get("https://demo.nopcommerce.com/");

 }
 //method to close Browser
 public void closeBrowser()
  {
   driver.quit();
  }

}
