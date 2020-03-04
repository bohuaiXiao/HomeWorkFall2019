package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

/**
 * @author:
 * @create:
 * @date:
 */
public class NavigationTests {
    public static void main(String[] args) throws InterruptedException {
    browserTest("chrome");

}

public static void browserTest(String browserName) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver(browserName);

        driver.get("http://www.google.com");

        String step3 = driver.getTitle();
        Thread.sleep(3000);

        driver.get(" https://www.etsy.com");
        Thread.sleep(3000);

        String title2 = driver.getTitle();

        driver.navigate().back();
        String actual = driver.getTitle();
        String expect = step3;

        StringUtility.verifyEquals(expect,actual);

        driver.navigate().forward();
        String actual2 = driver.getTitle();
        String expect2 = title2;
        StringUtility.verifyEquals(expect2,actual2);

        driver.close();







}



 }