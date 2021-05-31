package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMavenClass {
    public static void main(String[] args) {
        //NOTE: We no longer use System.setProperties for calling the driver
        //STEP 1:
        WebDriverManager.chromedriver().setup();
        //initially, we see WebDriverManager is red, because we need dependency
        // We use mvnrepository.com to get maven dependencies

        //STEP2:
        WebDriver driver= new ChromeDriver();
        //import selenium-java to import libraries

       //DONE WITH REQUIRED STEPS
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.quit();




    }


}
