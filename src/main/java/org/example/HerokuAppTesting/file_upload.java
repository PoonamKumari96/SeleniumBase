package org.example.HerokuAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement fileUpload = driver.findElement(By.xpath("//a[normalize-space()='File Upload']"));
        fileUpload.click();
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("/Users/saharsh.s/Desktop/Selenium/SeleniumBase/AccessDemo_Screenshot.png");
        driver.findElement(By.id("file-submit")).click();
    }
}
