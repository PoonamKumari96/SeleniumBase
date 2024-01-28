package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class Selenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");
        WebElement text = driver.findElement(By.xpath("/html/body/article/section/div[3]/form/div/span[1]/input"));
        text.sendKeys("Poonam Kumarii");
        Thread.sleep(2000);
        text.sendKeys(Keys.BACK_SPACE);
        text.sendKeys(Keys.CONTROL+"a");
        text.sendKeys(Keys.CONTROL+"c");
        WebElement email_text=driver.findElement(By.xpath("/html/body/article/section/div[3]/form/div/span[3]/input"));
        email_text.sendKeys(Keys.CONTROL+"v");
    }
}