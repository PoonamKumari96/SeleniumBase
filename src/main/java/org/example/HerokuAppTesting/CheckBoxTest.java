package org.example.HerokuAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);

        WebElement checkBox = driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[6]/a"));
        checkBox.click();
        Thread.sleep(2000);

        List<WebElement> l= driver.findElements(By.xpath("/html/body/div[2]/div/div/form"));
        for (WebElement i:l){
            System.out.println(i.getText());
        }
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
