package com.delta.mansi.Assingments.Project1;

import com.delta.mansi.Assingments.Project2.InitBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThankYouPage {
    WebDriver driver;
    By title = By.xpath("//h1/span[text()='Thank you for your purchase!']");
    By actionSwitch = By.xpath("//ul/li[2]/span/button");
    By logout = By.xpath("//a[text()[normalize-space()='Sign Out']]");
    public ThankYouPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public boolean isDisplayed() throws InterruptedException {
        PageActions pageActions = new PageActions();
        Thread.sleep(2000);
        return pageActions.orderSuccess(driver, title);
    }

    public void clickOnDropDown()
    {
        driver.findElement(actionSwitch).click();
        driver.findElement(logout).click();
    }
}
