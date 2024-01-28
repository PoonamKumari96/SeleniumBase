package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class Chrome {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        driver.findElement(By.name("field-keywords")).sendKeys("phone " + Keys.ENTER);
        List<WebElement> a=driver.findElements(By.id("twotabsearchtextbox"));
        int sizeOfa=a.size();
        System.out.println("size of a= "+sizeOfa);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
        Thread.sleep(5000);
        driver.quit();
    }

}