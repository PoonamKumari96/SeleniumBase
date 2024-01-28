package org.example.HerokuAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalSliderTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='Horizontal Slider']")).click();

        WebElement slider = driver.findElement(By.xpath("//input[@value='0']"));
        Thread.sleep(2000);

        for (int i = 0; i<4; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
            Thread.sleep(500);
        }
        Thread.sleep(2000);
        for (int i = 0; i<3; i++) {
            slider.sendKeys(Keys.ARROW_LEFT);
            Thread.sleep(500);
        }
        Thread.sleep(2000);
        driver.quit();

    }
}
