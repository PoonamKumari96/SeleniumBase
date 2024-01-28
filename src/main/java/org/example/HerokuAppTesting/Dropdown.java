package org.example.HerokuAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[11]/a")).click();
        Thread.sleep(2000);
        WebElement ddown = driver.findElement(By.id("dropdown"));
        Select select = new Select((ddown));
        Thread.sleep(2000);
        select.selectByIndex(1);
        Thread.sleep(2000);
        driver.quit();

    }
}
