package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_BeforeAfterMethods {

/*
  Create a class: BeforeAfterMethods
Then create 3 different test methods using the following names. And Go to google.
    titleTest =>Verify if google title = “Google”
    imageTest => Verify if google image displays or not
    gmailLinkTest => Verify if the Gmail link is displayed or not
Close the browser after each test

 */
    WebDriver driver;

    //I need 3 different test case so i will use 3 @Test annotation
    @Before
    public void setup(){
        //Setting up chrome driver
        WebDriverManager.chromedriver().setup();
        //Creating driver
        driver = new ChromeDriver();
        //Maximizing the window
        driver.manage().window().maximize();
        //putting 5 seconds wait on the driverThis will wait up to 5 seconds WHEN NEEDED
        //This will NOT wait IF NOT NEEDED
        //For example, if the page is slow,the driver will wait 5 seconds


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");
    }

     @Test
    public void titleTest()  {


         String expectedTitle = "Google";
         String actualTitle = driver.getTitle();
         Assert.assertEquals(expectedTitle,actualTitle);
         driver.quit();

     }

     @Test
    public void imageTest(){

         WebElement googleImage =driver.findElement(By.xpath("//img[@class='lnXdpd']"));
         Assert.assertTrue(googleImage.isDisplayed());
         driver.quit();
     }

     @Test
    public void gmailLink(){

         WebElement gmailLink = driver.findElement(By.xpath("(//a[@class='gb_f'])[1]"));
         Assert.assertTrue( gmailLink.isDisplayed());
         driver.quit();

     }
     @After
    public void tearDown(){
        driver.quit();
     }






}
