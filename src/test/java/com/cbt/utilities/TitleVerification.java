package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.*;

/**
 * @author:
 * @create:
 * @date:
 */
public class TitleVerification {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/", "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");
    //Open chrome browser
        WebDriver driver =
        BrowserFactory.getDriver("chrome");
    // visit all the website
        Iterator<String> iterator = urls.iterator();
        while(iterator.hasNext()){
            String eachUtl = iterator.next();
           driver.get(eachUtl);
           String title = driver.getTitle();
           StringUtility.verifyEquals(title,title);
            System.out.println(title+eachUtl);
            if (eachUtl.startsWith("http://practice.cybertekschool.com")){
                System.out.println("Yes");
            }

        }


    }


}
