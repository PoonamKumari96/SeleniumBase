package org.example.HerokuAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);

        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[25]/a")).click();

        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/img"))).perform();
        Thread.sleep(2000);
        action.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/img"))).perform();
        Thread.sleep(2000);
        action.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/img"))).perform();
        Thread.sleep(2000);
        driver.quit();
    }
}
