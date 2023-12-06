package com.delta.mansi.Assingments.Project1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BaseClass {
    WebDriver driver;
    @BeforeMethod
    public void initBrowser()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");// to maximise the window
        String []st= {"enable-automation"};
        options.setExperimentalOption("excludeSwitches", st); // to disbale chromo controlled by automated s/w.
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.get("https://magento.softwaretestingboard.com/");

    }
    public void  captureScreenshot(WebDriver driver,String tName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tName+".png");
        FileUtils.copyFile(source,target);
    }
}
