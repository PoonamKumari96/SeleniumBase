package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Auto_Suggestion {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("software testing");
        Thread.sleep(2000);
        List<WebElement> auto = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
        int a = auto.size();
        System.out.println("size = " + a);

        Actions action = new Actions(driver);
        action.moveToElement(auto.get(a-4)).perform();
        Thread.sleep(2000);
        auto.get(a-4).click();
    }
}
