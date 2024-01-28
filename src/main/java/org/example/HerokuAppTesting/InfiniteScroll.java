package org.example.HerokuAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfiniteScroll {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[normalize-space()='Infinite Scroll']")).click();
        Thread.sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,1000)");

    }
}
