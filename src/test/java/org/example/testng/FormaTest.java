package org.example.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FormaTest {

    public static WebDriver driver;

     @BeforeClass
    public void beforeClass() {
         System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
         ChromeOptions options = new ChromeOptions();
         options.addArguments("--remote-allow--origins=*");
         WebDriver driver = new ChromeDriver(options);
         driver.manage().window().maximize();

     }

     @Test
     public void FormaTest(){
         driver.get("https://demoqa.com/automation-practice-form");
         WebElement firstName = driver.findElement(By.xpath("//*[@id='firstName']"));
         firstName.sendKeys("Cebotarescu");
     }

     @AfterClass
     public void teardown(){
         driver.quit();
     }
}
