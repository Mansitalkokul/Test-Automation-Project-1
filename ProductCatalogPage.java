package com.delta.mansi.Assingments.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductCatalogPage {
    WebDriver driver;
    PageActions pageActions = new PageActions();
    By quantity = By.id("qty");
    By btnAddToCart = By.xpath("//button[@id=\"product-addtocart-button\"]/span");
    By btnShoppingCart = By.xpath("//a[text()=\"shopping cart\"]");
    public ProductCatalogPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void productItemView(int quantityValue) throws InterruptedException {

        pageActions.enterQuantity(driver,quantity, quantityValue);
        pageActions.clickOnShoppingCart(driver, btnAddToCart);
        Thread.sleep(3000);
        pageActions.clickOnShoppingCart(driver, btnShoppingCart);
    }
}
