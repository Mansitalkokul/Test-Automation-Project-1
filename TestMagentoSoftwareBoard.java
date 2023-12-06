package com.delta.mansi.Assingments.Project1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestMagentoSoftwareBoard extends BaseClass{
    @Test
    public void placeOrder() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication();

        CustomerLoginpage customerLoginpage = new CustomerLoginpage(driver);
        customerLoginpage.enterLoginInfo("stalkokul007@gmail.com", "Mansi@007");

        CatalogSearchPage catalogSearchPage = new CatalogSearchPage(driver);
        catalogSearchPage.searchProduct();

        BagsPage bagsPage = new BagsPage(driver);
        bagsPage.selectBag();

        ProductCatalogPage productCatalogPage = new ProductCatalogPage(driver);
        productCatalogPage.productItemView(2);

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.productCheckout();

        ShippingPage shippingPage = new ShippingPage(driver);
        shippingPage.enterShippingInformations("76 Ganesh Peth ", "Solapur", 413005, 988101013, "India", "Maharashtra");

        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.paymentCheckout();

        ThankYouPage thankYouPage = new ThankYouPage(driver);
        boolean pageHeading = thankYouPage.isDisplayed();

        Assert.assertTrue(pageHeading);
        thankYouPage.clickOnDropDown();
    }
}
