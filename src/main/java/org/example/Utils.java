package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;

public class Utils extends BasePage {
    //creating method to click on the element
    public  static void clickOnElement(By by)
    {

        driver.findElement(by).click();
    }
    //creating method for sendKeys to write the string value
    public static void typeText(By by, String text)
    {
        by.findElement(driver).sendKeys(text);
    }
    //creating method for get text to get text from an element and return the value
    public String  getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }
    //creating method for time stamp
    public static  String addtime()
    {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
    }
    //creating method for wait for the element to be clickable to wait for selected seconds to perform
    public static void waitForElementToBeClickable(By by, int timeInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
   // creating method for wait for the element to be visibleble by to wait for selected seconds to perform
    public static void waitForElementToBeVisibleby(By by, int timeInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    //creating method for the url to wait for the url to wait for selected seconds to perform
    public static void waitForUrlToBe(String url, int timeInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.urlToBe(url));

    }
    //creating method  to  select dropDownMenu to select the visible text by text value
    public static void selectFromDropDownByVisibleText(By by,String txt)
    {
        Select text = new Select(driver.findElement(by));
        text.selectByVisibleText(txt);

    }
    //creating method  to select dropDownMenu to select the visible text by string value
    public static void selectFromDropDownByValue(By by,String value)
    {
        Select selectValue = new Select(driver.findElement(by));
        selectValue.selectByValue(value);
    }
    //creating method  to select dropDownMenu to select the index value
    public static void SelectDropDownByIndex(By by, int i){
        Select selectIndex  = new Select(driver.findElement(by));
        selectIndex.selectByIndex(i);
    }
}
