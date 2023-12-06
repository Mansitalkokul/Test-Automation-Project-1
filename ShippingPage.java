package com.delta.mansi.Assingments.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage {
    WebDriver driver;
    PageActions pageActions = new PageActions();
    By newAdd = By.xpath("//div[@class=\"new-address-popup\"]/button/span");
    By streetAdd = By.xpath("//input[@name=\"street[0]\"]");
    By city = By.xpath("//input[@name=\"city\"]");
    By state = By.xpath("//select[@name=\"region_id\"]");
    By postalCode = By.xpath("//input[@name=\"postcode\"]");
    By country = By.xpath("//select[@name=\"country_id\"]");
    By telephone = By.xpath("//input[@name=\"telephone\"]");
    By shipHere = By.xpath("//footer[@class=\"modal-footer\"]/button[1]/span");
    By next = By.xpath("//button[@class=\"button action continue primary\"]/span");
    public ShippingPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void enterShippingInformations(String streetAddress, String City, long zipCode, long mobileNo,String cntry, String region) throws InterruptedException {
        Thread.sleep(3000);
        pageActions.clickOnElements(driver, newAdd);
        pageActions.enterShippingValueDetails(driver, streetAdd,streetAddress);
        pageActions.enterShippingValueDetails(driver, city, City);
        pageActions.selectCountryAndState(driver, country, cntry);
        pageActions.selectCountryAndState(driver, state, region);
        pageActions.enterShippingValueDetails(driver, postalCode, String.valueOf(zipCode));
        pageActions.enterShippingValueDetails(driver, telephone, String.valueOf(mobileNo));
        Thread.sleep(2000);
        pageActions.clickOnElements(driver, shipHere);
        Thread.sleep(2000);
        pageActions.clickOnElements(driver, next);


    }
}
