package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class CameraAndPhotoPage extends Utils {
    public void printProductsNameWithList() {
       List<WebElement> productTitle = driver.findElements(By.xpath("//h2[@class=\"product-title\"]"));
       // List<WebElement> productTitle = driver.findElements(By.xpath("//div[@class=\"product-item\"]"));
        System.out.println(productTitle.size());
        for (WebElement element:productTitle){
            System.out.println(element.getText());
        }
    }

    public void addTocartButtoncheck() {
        By itemBoxesfield=By.className("product-item");
        By productnamefield=By.className("product-title");
        List<String> noAddToCartButtonProducts = new ArrayList<String>();

        List<WebElement> webElementList=driver.findElements(itemBoxesfield);
        System.out.println(webElementList.size());
        int count=0;
        for (WebElement element : webElementList)
        {
            if (element.getText().contains("ADD TO CART"))
            {
                count++;
            }else
            {
                noAddToCartButtonProducts.add("NO add to cart Button:"+element.findElement(productnamefield).getText());
            }
        }
        Assert.assertEquals(count,webElementList.size(),"One or more products missing add to card button\n"+noAddToCartButtonProducts);

    }

}
