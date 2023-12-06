package com.delta.mansi.Assingments.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CatalogSearchPage {
    WebDriver driver;
    public CatalogSearchPage(WebDriver driver)
    {
        this.driver = driver;
    }
    By menuItem = By.xpath("//span[text()='Gear']");
    By subMenuItem = By.xpath("//span[text()='Bags']");
    public void searchProduct()
    {
        WebElement menuElement = driver.findElement(menuItem);
        Actions actions = new Actions(driver);
        actions.moveToElement(menuElement);
        actions.perform();
        WebElement subMenuElement = driver.findElement(subMenuItem);
        subMenuElement.click();
    }
}
