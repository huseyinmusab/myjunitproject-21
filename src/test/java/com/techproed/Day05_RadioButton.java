package com.techproed;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.net.PortUnreachableException;
import java.util.concurrent.TimeUnit;

public class Day05_RadioButton {
    /*
    Create a class : RadioButton
    Complete the following task.
    Go to https://www.facebook.com/
    Click on Create an Account button
    Locate the elements of radio buttons
    Then click on the radio buttons for your gender if they are not selected
     */
    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");

    }


    @Test
    public void accountCreate() throws InterruptedException {

        Thread.sleep(3000);

        Faker faker = new Faker();

        driver.findElement(By.partialLinkText("Neues Konto erstellen")).click();


        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(faker.name().firstName());
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(faker.name().lastName());

        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("1234");

        //SELECT BIRTHDAY
        //Selecting months
        WebElement monthElement = driver.findElement(By.id("month"));
        Select month = new Select(monthElement);
        month.selectByVisibleText("Jan.");

        //Selecting day
        WebElement dayElement = driver.findElement(By.id("day"));
        Select day = new Select(dayElement);
        day.selectByValue("1");

        //Selecting year
        WebElement yearElement = driver.findElement(By.id("year"));
        Select year = new Select(yearElement);
        year.selectByVisibleText("1990");

         Thread.sleep(3000);
         driver.findElement(By.name("websubmit")).click();
         Thread.sleep(3000);


        //        SELECT GENDER
        //        This is radio button
        //        Identify the button element and click on it
        //        Then click on the radio buttons for your gender if they are not selected
        WebElement maleGender=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        if(!maleGender.isSelected()){
            maleGender.click();
        }



    }
    @After
    public void tearDown(){
        //driver.quit();
    }








}
