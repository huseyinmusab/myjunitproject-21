package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_CheckBox {

    /*
    Create a class : CheckBox
    Create test method and complete the following task.
    Go to https://the-internet.herokuapp.com/checkboxes
    Locate the elements of checkboxes
    Then click on checkbox1 if box is not selected
   Then click on checkbox2 if box is not selected
   Homework: Then verify that checkbox1 is checked.
     */

    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/checkboxes");


    }

    @Test
    public void checkBox(){
        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        if (!checkBox1.isSelected()){//if checkBox1 is NOT selected
            checkBox1.click();
        }


        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        if (!checkBox2.isSelected()){//if checkBox2 is NOT selected
            checkBox2.click();
        }


    }
    @After
    public void tearDown(){
        driver.quit();
    }





}
