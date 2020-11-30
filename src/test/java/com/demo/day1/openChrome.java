package com.demo.day1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openChrome {
    @Test
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver","Z:\\HTY\\workspace\\Selenium\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");
    }




    @Test
    public void backTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Z:\\HTY\\workspace\\Selenium\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");

        Thread.sleep(3000);
        webDriver.navigate().back();
        Thread.sleep(3000);
        webDriver.navigate().forward();
        Thread.sleep(3000);
        webDriver.quit();

    }
    @Test
    public void winTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Z:\\HTY\\workspace\\Selenium\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
//        Dimension dimension = new Dimension(500,300);
//        webDriver.manage().window().setSize(dimension);
        webDriver.getCurrentUrl();

        Thread.sleep(3000);
//        webDriver.manage().window().maximize();
//        Thread.sleep(3000);
        webDriver.quit();

    }
    @Test
    public void getTitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Z:\\HTY\\workspace\\Selenium\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.getTitle();

    }
    @Test
    public void getTId() {
        System.setProperty("webdriver.chrome.driver","Z:\\HTY\\workspace\\Selenium\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");
        WebElement keyField = webDriver.findElement(By.id("kw"));
        webDriver.quit();
    }
}
