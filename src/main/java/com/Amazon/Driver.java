package com.Amazon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    private static WebDriver driver;
    private static Driver myObje;

    private Driver(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = WebDriverManager.chromedriver().avoidShutdownHook().capabilities(options).create();
    }

    public static WebDriver getDriver(){

        if(driver==null)
            myObje = new Driver();
        return driver;
    }
}
