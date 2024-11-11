package org.example.testng;

import demoqa.FormaPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

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
    public void FormaTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        FormaPage form = new FormaPage(driver);
        Thread.sleep(2000);
        form.setFirstNameElement(Basic.FIRST_NAME);
        Thread.sleep(2000);
        form.setLastNameElement(Basic.LAST_NAME);
        Thread.sleep(2000);
        form.setEmailElement(Basic.EMAIL);
        Thread.sleep(2000);
        form.setMailGender();
        Thread.sleep(2000);
        form.setNumberElement(Basic.MOBILE);
        Thread.sleep(2000);
        form.setSportHobbie();
        Thread.sleep(2000);
//        form.setSubjectElement(Basic.SUBJECT);


    }
    public void selectDate(String month, String year, String day) throws InterruptedException {
        // Откроем календарь
        WebElement dateInput = driver.findElement(By.className("react-datepicker__input-container"));
        dateInput.click();

        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker")));

        // Выберем месяц
        WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
        monthDropdown.sendKeys(month);

        // Выберем год
        WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
        yearDropdown.sendKeys(year);

        // Кликнем на нужный день
        WebElement dateElement = driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='" + day + "']"));
        dateElement.click();
        selectDate("April", "2004", "15");
        Thread.sleep(2000);
    }
     @AfterClass
     public void teardown(){
         driver.quit();
     }
}
