package com.demo.day1;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.IOException;

public class IframeTest {
    WebDriver driver;
    @Before
    public void openIe(){
        System.setProperty("webdriver.ie.driver","C:\\Users\\Administrator.DESKTOP-2PIQE62\\IdeaProjects\\selenium123" +
                "\\drivers\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
    }


    @Test
    public void IframeTest() {
        driver.get("file:///D:/html/Iframe.html");
//        driver.switchTo().frame("iframe");
//        driver.findElement(By.linkText("baidu")).click();
//        Thread.sleep(3000);
        driver.switchTo().frame("");
//        Thread.sleep(3000);
//        driver.findElement(By.linkText("baidu")).click();

//        Thread.sleep(3000);
//        Alert alert = driver.switchTo().alert();
//        alert.sendKeys("这个是prompt");

    }
    @After
    public void closedBrowser() throws InterruptedException {

        driver.quit();

    }
}
