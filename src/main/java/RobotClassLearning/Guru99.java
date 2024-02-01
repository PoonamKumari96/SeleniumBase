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
        Thread.sleep(6000);
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

        //Open Agile Project
        agileProjectPage(driver);

        //Open Bank Project
        bankProjectPage(driver);


        //Open Security Project
        securityProjectPage(driver);


    }

    public static void agileProjectPage(WebDriver driver) throws InterruptedException {
        Actions action = new Actions(driver);

        WebElement agileProject = driver.findElement(By.xpath("//a[normalize-space()='Agile Project']"));
        action.moveToElement(agileProject).perform();
        Thread.sleep(1000);
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

        WebElement miniStatement = driver.findElement(By.xpath("//a[normalize-space()='Mini Statement']"));
        miniStatement.click();
        Thread.sleep(1000);
        WebElement accountNo = driver.findElement(By.name("accountno"));
        Select select = new Select((accountNo));
        select.selectByIndex(1);
        WebElement submit = driver.findElement(By.name("AccSubmit"));
        submit.click();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(1000);

        WebElement logout = driver.findElement(By.xpath("//a[normalize-space()='Log out']"));
        logout.click();
        Thread.sleep(1000);

        driver.switchTo().alert().accept();

    }
    public static void bankProjectPage(WebDriver driver) throws InterruptedException {
        Actions action = new Actions(driver);
        WebElement bankProject = driver.findElement(By.xpath("//a[normalize-space()='Bank Project']"));
        action.moveToElement(bankProject).perform();
        Thread.sleep(1000);
        bankProject.click();

        WebElement bankUserId = driver.findElement(By.name("uid"));
        bankUserId.sendKeys("1303");
        Thread.sleep(1000);
        WebElement bankPassword = driver.findElement(By.name("password"));
        bankPassword.sendKeys("Guru99");
        Thread.sleep(1000);
        bankPassword.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(1000);
    }
    public static void securityProjectPage(WebDriver driver) throws InterruptedException {
        Actions action = new Actions(driver);
        WebElement securityProject = driver.findElement(By.xpath("//a[normalize-space()='Security Project']"));
        action.moveToElement(securityProject).perform();
        Thread.sleep(1000);
        securityProject.click();

        WebElement securityProjectUserId = driver.findElement(By.name("uid"));
        securityProjectUserId.sendKeys("1303");
        Thread.sleep(1000);
        WebElement securityProjectPassword = driver.findElement(By.name("password"));
        securityProjectPassword.sendKeys("Guru99");
        Thread.sleep(1000);
        securityProjectPassword.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        WebElement balanceEnquiry = driver.findElement(By.xpath("//a[normalize-space()='Balance Enquiry']"));
        balanceEnquiry.click();

        WebElement BalanceEnquiryPageAccountNo = driver.findElement(By.name("accountno"));
        Select select = new Select(BalanceEnquiryPageAccountNo);
        Thread.sleep(2000);
        select.selectByIndex(1);
        BalanceEnquiryPageAccountNo.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

        WebElement SecurityPageMiniStatement = driver.findElement(By.xpath("//a[normalize-space()='Mini Statement']"));
        SecurityPageMiniStatement.click();
        Thread.sleep(2000);
        Select select = new Select(SecurityPageMiniStatement);
        Thread.sleep(2000);
        select.selectByIndex(1);
        SecurityPageMiniStatement.sendKeys(Keys.ENTER);



    }
}
