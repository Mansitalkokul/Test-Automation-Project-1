package com.delta.mansi.Assingments.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void loginToApplication() throws IOException {
        By login = By.xpath("//div[@class=\"panel header\"]/ul/li[2]/a");
        WebElement clickOnElement = driver.findElement(login);
        clickOnElement.click();
        BaseClass sc = new BaseClass();
        sc.captureScreenshot(driver,"loginPage");


    }
}
