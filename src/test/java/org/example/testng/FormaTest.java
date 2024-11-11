package org.example.testng;

import demoqa.FormaPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;

import static org.example.basic.SeleniumDriver.getRemoteDriver;

public class FormaTest {

    public static WebDriver driver;

     @BeforeClass
    public void beforeClass() {
//         System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
//         ChromeOptions options = new ChromeOptions();
//         options.addArguments("--remote-allow--origins=*");
//         WebDriver driver = new ChromeDriver(options);
//         driver.manage().window().maximize();
            driver = getRemoteDriver();
     }


    @Test
    public void FormaTest() {
        driver.get("https://demoqa.com/automation-practice-form");
        FormaPage form = new FormaPage(driver);
        form.setFirstNameElement(Basic.FIRST_NAME);
        form.setLastNameElement(Basic.LAST_NAME);
        form.setEmailElement(Basic.EMAIL);
    }
     @AfterClass
     public void teardown(){
         driver.quit();
     }
}
