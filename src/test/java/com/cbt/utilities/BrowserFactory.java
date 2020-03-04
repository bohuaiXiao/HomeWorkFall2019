package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * @author:
 * @create:
 * @date:
 */
public class BrowserFactory {
    public static WebDriver getDriver (String BrowserName){
        System.getProperty("os.name");
        if (BrowserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }else if (BrowserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else if (BrowserName.equalsIgnoreCase("safari")){
            return new SafariDriver();
        }else{
            return null;
        }
    }
}
