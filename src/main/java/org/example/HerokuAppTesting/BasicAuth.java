package org.example.HerokuAppTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class BasicAuth {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a")).click();
        Thread.sleep(2000);
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Thread.sleep(2000);

        String popupMsg = driver.findElement(By.xpath("/html/body/div[2]/div/div/p")).getText();
        System.out.println(popupMsg);

        driver.quit();

    }
}
