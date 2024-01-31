package RobotClassLearning;

import org.apache.commons.io.FileUtils;
import org.example.Chrome;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Guru99 {
    public static void main(String[] args) throws InterruptedException, IOException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addExtensions(new File("adblock.crx"));
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.demo.guru99.com/");
        WebElement email = driver.findElement(By.name("emailid"));
        email.sendKeys("erpunu96@gmail.com");
        Thread.sleep(1000);

        WebElement submitButton = driver.findElement(By.name("btnLogin"));
        submitButton.click();

        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("./AccessDemo_Screenshot.png");
        FileUtils.copyFile(SrcFile, DestFile);

        Actions action = new Actions(driver);
        WebElement agileProject = driver.findElement(By.xpath("//a[normalize-space()='Agile Project']"));
        action.moveToElement(agileProject).perform();
        agileProject.click();

        WebElement userId = driver.findElement(By.name("uid"));
        userId.sendKeys("1303");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Guru99");
        Thread.sleep(1000);
        WebElement loginButton =driver.findElement(By.name("btnLogin"));
        loginButton.click();
        Thread.sleep(1000);
//
//        WebElement miniStatement = driver.findElement(By.xpath("//a[normalize-space()='Mini Statement']"));
//        miniStatement.click();
//        Thread.sleep(1000);
//        WebElement accountNo = driver.findElement(By.name("accountno"));
//        Select select = new Select((accountNo));
//        select.selectByIndex(1);

    }
}
