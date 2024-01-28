package org.example.HerokuAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;

public class FileDownload {
    public static void main(String[] args) throws InterruptedException {


        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

        String downloadFilePath = "Z:\\projects\\SeleniumBasics";
        chromePrefs.put("download.default_directory", downloadFilePath);

        options.setExperimentalOption("prefs", chromePrefs);

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='File Download']")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("icon.png")).click();
        Thread.sleep(5000);

        File file = new File(downloadFilePath + "\\icon.png");
        if(file.exists()){
            System.out.println("file got successfully downloaded");
        }
        else {
            System.out.println("file not found");
        }
        Thread.sleep(3000);
        //driver.quit();



    }
}
