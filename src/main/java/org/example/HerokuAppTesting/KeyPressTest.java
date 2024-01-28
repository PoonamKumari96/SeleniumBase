package org.example.HerokuAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPressTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[normalize-space()='Key Presses']")).click();
        WebElement typeText = driver.findElement(By.id("target"));
        typeText.sendKeys(" ");
        System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());

        Thread.sleep(3000);
        driver.quit();
    }
}
