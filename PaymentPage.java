package com.delta.mansi.Assingments.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {
    WebDriver driver;
    By cartAmount = By.xpath("//tr[@class=\"totals sub\"]/td/span");
    By placeOrder = By.xpath("//button[@class=\"action primary checkout\"]/span");
    public PaymentPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void paymentCheckout() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(cartAmount);
        String actualPrice= element.getText();
        String expectedPrice = "$90";
        if (actualPrice.compareTo(expectedPrice)>=0)
        {
            System.out.println("Actual & Expected prices are same");
        }
        else
        {
            System.out.println("Actual & Expected prices are not same");
        }
        Thread.sleep(2000);
        WebElement btnPlaceOrder = driver.findElement(placeOrder);
        btnPlaceOrder.click();
    }
}
