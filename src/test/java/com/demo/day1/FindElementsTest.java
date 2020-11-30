package com.demo.day1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.attribute.standard.Chromaticity;
import java.util.List;

public class FindElementsTest {
    WebDriver driver;
    @Before
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver","Z:\\HTY\\workspace\\Selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void getTId() {

        driver.get("https://www.baidu.com");
        WebElement keyField = driver.findElement(By.id("kw"));

    }

    @Test
    public void byNameTest() {

        driver.get("https://www.baidu.com");
        WebElement element = driver.findElement(By.name("wd"));

    }

    @Test
    public void byClassTest() {

        driver.get("https://www.baidu.com");
        WebElement element = driver.findElement(By.className("quickdelete"));

    }
    @Test
    public void byLinkTest() {

        driver.get("https://www.baidu.com");
        WebElement element = driver.findElement(By.linkText("新闻"));

    }

    @Test
    public void byTagName() {

        driver.get("https://www.baidu.com");
        List<WebElement> list = driver.findElements(By.tagName("input"));
        System.out.println(list.size());

    }

    @Test
    public void byCSS() {

        driver.get("https://www.baidu.com");
        WebElement el = driver.findElement(By.cssSelector("#lg>img"));

    }

    @Test
    public void byXpath() {

        driver.get("https://www.baidu.com");
        WebElement el = driver.findElement(By.xpath("//*[@id='su']"));

    }

    @Test
    public void byXpath02() {

        driver.get("https://www.baidu.com");
        List<WebElement> list = driver.findElements(By.xpath("/a"));
        for (int i=0;i < list.size();i++){
            String text = list.get(i).getText();
            System.out.println(text);
        }

    }
    @After
    public void closedBrowser(){
        driver.quit();

    }


}
