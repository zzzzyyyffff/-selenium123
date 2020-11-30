package com.demo.day1;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class AlertTest {
    WebDriver driver;
    @Before
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver","Z:\\HTY\\workspace\\Selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void shotTest() {
        driver.get("file:///C:/Users/xunhe/Desktop/Ceshi.html");
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("C:\\Users\\xunhe\\Desktop\\test.jpg"));
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    @Test
    public void AlertTest() throws InterruptedException {
        driver.get("file:///C:/Users/xunhe/Desktop/Ceshi.html");
        driver.findElement(By.className("alert")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    @Test
    public void ComfirmTest() throws InterruptedException {
        driver.get("file:///C:/Users/xunhe/Desktop/Ceshi.html");
        driver.findElement(By.className("confirm")).click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(3000);

        alert.accept();
    }

    @Test
    public void PromptTest() throws InterruptedException {
        driver.get("file:///C:/Users/xunhe/Desktop/Ceshi.html");
        driver.findElement(By.className("prompt")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();

        alert.sendKeys("30");
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);
        alert.accept();

    }
    @After
    public void closedBrowser() throws InterruptedException {

        driver.quit();

    }
}
