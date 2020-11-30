package com.demo.day1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaiTest {
    WebDriver driver;
    @Before
    public void openIe(){
        System.setProperty("webdriver.ie.driver","C:\\Users\\Administrator.DESKTOP-2PIQE62\\IdeaProjects\\selenium123" +
                "\\drivers\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
    }


    @Test
    public void IframeTest() {
        driver.get("C:\\Users\\Administrator.DESKTOP-2PIQE62\\IdeaProjects\\selenium123\\src\\main\\resources\\" +
                "display.html");
        driver.findElement(By.id("wait")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String text = driver.findElement(By.id("111")).getText();
        Assert.assertEquals("wait for display",text);

    }

    @Test
    public void IframeTest2() {
        driver.get("C:\\Users\\Administrator.DESKTOP-2PIQE62\\IdeaProjects\\selenium123\\src\\main\\resources\\" +
                "display.html");
        driver.findElement(By.className("confirm")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("111")));

        String text = driver.findElement(By.id("111")).getText();
        Assert.assertEquals("wait for display",text);

    }
    @After
    public void closedBrowser() throws InterruptedException {

        driver.quit();

    }
}
