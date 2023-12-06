package com.delta.mansi.Assingments.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class BagsPage {
    WebDriver driver;
    By itemName = By.xpath("//strong[@class=\"product name product-item-name\"]");
    public BagsPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void selectBag() throws IOException {
        List<WebElement> productItemName = driver.findElements(itemName);
        productItemName.get(10).click();

    }
}
