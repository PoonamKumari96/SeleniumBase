package org.example.HerokuAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindow {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='Multiple Windows']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();

        Set<String> handle = driver.getWindowHandles();

        Iterator it = handle.iterator();
        String newWindow = (String) it.next();
        driver.switchTo().window(newWindow);


    }

}
