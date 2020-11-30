package com.demo.day1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FameStudy {
    WebDriver driver;
    @Before
    public void openIe(){
        System.setProperty("webdriver.ie.driver","C:\\Users\\Administrator.DESKTOP-2PIQE62\\IdeaProjects\\selenium123" +
                "\\drivers\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
    }


    @Test
    public void selenium() throws InterruptedException {
        driver.get("C:\\Users\\Administrator.DESKTOP-2PIQE62\\IdeaProjects\\selenium123\\src\\main\\resources\\" +
                "Iframe.html");
        WebElement iframe = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);

        Thread.sleep(3000);
    }


    @After
    public void closedBrowser() throws InterruptedException {

        driver.quit();

    }}
