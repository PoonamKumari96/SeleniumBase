package org.example.HerokuAppTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAuthentication {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        String usernameTextField = "tomsmithaaaa";
        String passwordTextField = "SuperSecretPassword!";

        driver.findElement(By.xpath("//a[normalize-space()='Form Authentication']")).click();
        Thread.sleep(3000);
        WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
        userName.sendKeys(usernameTextField);
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(passwordTextField);
        Thread.sleep(2000);

        WebElement login = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        login.click();
        Thread.sleep(3000);

        String alertText = driver.findElement(By.id("flash")).getText();
        System.out.println(alertText);





    }
}
