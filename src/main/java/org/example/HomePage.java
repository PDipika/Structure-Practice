package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class HomePage extends  Utils {
    //finding a location of vote button on home page by id
    private By _voteButton = By.id("vote-poll-1");
    //finding a location of register button on homepage
    private By _registerButton = By.linkText("Register");
    //finding a location of appleMacBook pro pic on home page by xpath
    private By _appleMacBookProPic = By.xpath("//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"]");
    //finding a location of facebook logo on home page by xpath
    private By _faceBookLogo = By.xpath("//li[@class=\"facebook\"]/a");
    //finding a location of news detail button by xpath
    private By _newsDetailsButton = By.xpath("//div[@class=\"news-items\"]/div[2]/div[3]/a");
    //finding a location of currency dropdown selection by id
    private By _currencyDropdownSelection = By.id("customerCurrency");
    private By _electronics = By.xpath("//div[@class=\"item-grid\"]/div[1]/div/h2/a");
    public void clickOnVoteButtonAndAcceptIfAlertPresent() {
        clickOnElement(_voteButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try
        {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept();
        }
        catch (Exception e)
        {
            System.out.println("No alert");
        }

        // driver.switchTo().alert().accept();

    }


    public void clickOnRegisterButton()
    //calling a method to click on register button to click and verifiy the register button on home page
    {
        clickOnElement(_registerButton);
        //using assertion to verify the presence of register button by its class name
        Assert.assertEquals(getTextFromElement(By.className("ico-register")), "Register", "verifyRegisterButtonIsPresent");
    }

    public void clickOnAppleMacBookProPic() {
        //using click on element method to click on apple Mac Book pro pic
        clickOnElement(_appleMacBookProPic);
    }

    public void clickOnFaceBookLogo() {
        //using click on element method to click on facebook logo
        clickOnElement(_faceBookLogo);
    }

    public void clickOnNewsReleaseDetailsButton() {
        //using a click on element method to click on news details button
        clickOnElement(_newsDetailsButton);
    }

    public void verifyUsDollarCurrencySymbol() {
        //using list to verify and display us dollar price for all products on home page
        selectFromDropDownByVisibleText(_currencyDropdownSelection, "US Dollar");
        List<WebElement> currency = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        for (WebElement element : currency) {
            Assert.assertTrue(element.getText().contains("$"), element.getText());
            System.out.println(element.getText());
        }
    }

    public void verifyEuroCurrencySymbol() {
        //using list to verify and display euro currency  for all products on home page
        selectFromDropDownByVisibleText(_currencyDropdownSelection, "Euro");
        List<WebElement> currency = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        for (WebElement element : currency) {
            Assert.assertTrue(element.getText().contains("€"), element.getText());
            System.out.println(element.getText());
        }
    }
    public void clickOnElectronics(){
        clickOnElement(_electronics);
    }
}