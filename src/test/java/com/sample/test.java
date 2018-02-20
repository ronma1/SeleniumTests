package com.sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test {

    private Logger logger = LogManager.getLogger("Test Logger");

    @Test
    public test() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        logger.info("Maximize Window");
        driver.manage().window().maximize();
        logger.info("Navigate to Google");
        driver.get("https://www.google.com");
        TimeUnit.SECONDS.sleep(2);

        driver.close();
        driver.quit();
    }
}
