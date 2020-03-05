package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

/**
 * @author:
 * @create:
 * @date:
 */
public class TitleVerification2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        List<String> urls = Arrays.asList
                ( "https://www.wayfair.com/",
                        "https://www.walmart.com ","https://www.westelm.com/");
        //String expectTitle = "";

        for (int i = 0; i <urls.size() ; i++) {

        driver.get(urls.get(i));
        String currentUrl = driver.getCurrentUrl();
        String currentTitle = driver.getTitle();
        //Wayfair.com - Online Home Store for Furniture, Decor, Outdoors & More
            String[] split = currentTitle.split(" ");
            String First_title = split[0].toLowerCase();
            Thread.sleep(2000);
        if (currentUrl.contains(First_title)){
            System.out.println("pass");

        }else {
            System.out.println("not pass");
            System.out.println(First_title + "--->" + currentUrl);
        }
       // driver.close();
    }
    }
}
