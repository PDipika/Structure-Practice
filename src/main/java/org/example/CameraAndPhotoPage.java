package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CameraAndPhotoPage extends Utils {
    public void printProductsNameWithList() {
       List<WebElement> productTitle = driver.findElements(By.xpath("//h2[@class=\"product-title\"]"));
       // List<WebElement> productTitle = driver.findElements(By.xpath("//div[@class=\"product-item\"]"));
        System.out.println(productTitle.size());
        for (WebElement element:productTitle){
            System.out.println(element.getText());
        }
    }
}
