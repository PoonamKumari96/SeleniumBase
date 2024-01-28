package org.example.HerokuAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FloatingMenu {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Z:\\Projects\\SeleniumBasics\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Floating Menu']")).click();
        Thread.sleep(2000);

        WebElement home = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
        WebElement news = driver.findElement(By.xpath("//a[normalize-space()='News']"));
        WebElement contact = driver.findElement(By.xpath("//a[normalize-space()='Contact']"));
        WebElement about = driver.findElement(By.xpath("//a[normalize-space()='About']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(home);
        Thread.sleep(2000);
        actions.click();
        actions.build().perform();

        Thread.sleep(2000);

        actions.moveToElement(news);
        Thread.sleep(2000);
        actions.click();
        actions.build().perform();

        Thread.sleep(2000);

        actions.moveToElement(contact);
        Thread.sleep(2000);
        actions.click();
        actions.build().perform();

        Thread.sleep(2000);

        actions.moveToElement(about);
        Thread.sleep(2000);
        actions.click();
        actions.build().perform();

        Thread.sleep(2000);

        driver.quit();

    }
}
