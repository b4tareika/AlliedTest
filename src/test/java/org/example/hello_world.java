package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hello_world {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
       ChromeOptions options = new ChromeOptions();
       options.addArguments("--remote-allow--origins=*");
       WebDriver driver = new ChromeDriver(options);
       driver.manage().window().maximize();

       driver.get("https://www.google.com");
       driver.quit();

    }

}
