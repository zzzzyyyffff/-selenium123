package com.demo.day1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class WindowSelectTest {
    WebDriver driver;
    @Before
    public void openIe(){
        System.setProperty("webdriver.ie.driver","C:\\Users\\Administrator.DESKTOP-2PIQE62\\IdeaProjects\\selenium123" +
                "\\drivers\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
    }


    @Test
    public void IframeTest() throws InterruptedException {
        driver.get("C:\\Users\\Administrator.DESKTOP-2PIQE62\\IdeaProjects\\selenium123\\src\\main\\resources\\" +
                "demo_iframe.html");
        driver.findElement(By.className("open"));
        Thread.sleep(3000);
        String handle1 = driver.getWindowHandle();
        //For 获取到的handles是否等于handle1
        for (String handles : driver.getWindowHandles()){
            if (handles.equals(handle1))
                continue;
            driver.switchTo().window(handles);

        }
        driver.findElement(By.linkText("baidu")).click();

    }
    @Test
    public void IfraTest() throws InterruptedException {
        driver.get("https://mail.qq.com/");
        driver.switchTo().frame("login_frame");
        driver.findElement(By.linkText("QQ登录")).click();
        driver.findElement(By.id("u")).sendKeys("");
        driver.findElement(By.id("p")).sendKeys("");
        driver.findElement(By.id("login_button")).click();
        Thread.sleep(3000);


    }
    @After
    public void closedBrowser() throws InterruptedException {

        driver.quit();

    }
}