package com.delta.mansi.Assingments.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {
    WebDriver driver;
    By btnProceedToCheckOut = By.xpath("//ul/li/button/span");
    public ShoppingCartPage(WebDriver driver)
    {
        this.driver =driver;
    }
    public void productCheckout()
    {
        WebElement btnCheckout =driver.findElement(btnProceedToCheckOut);
        btnCheckout.click();
    }
}
