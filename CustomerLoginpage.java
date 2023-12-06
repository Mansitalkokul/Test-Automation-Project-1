package com.delta.mansi.Assingments.Project1;

import com.delta.shriniwas.testngconcepts.pageobjectmodel3.pages.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerLoginpage {
    WebDriver driver;
    PageActions pageActions = new PageActions();
    By email = By.id("email");
    By pass = By.id("pass");
    By btnLogin = By.xpath("//button[@class=\"action login primary\"]/span");
    public CustomerLoginpage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void enterLoginInfo(String txtEmail, String txtPass)
    {
        pageActions.enterValue(driver, email, txtEmail);
        pageActions.enterValue(driver,pass, txtPass);
        pageActions.clickOnSignIn(driver,btnLogin);
    }
}
