package RobotClassLearning;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class RobotClassDemo {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(1000);
        jse.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(1000);

        WebElement item1 = driver.findElement(By.className("inventory_item_name"));
        item1.click();
        Thread.sleep(1000);
        WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart.click();
        Thread.sleep(1000);
        WebElement backButton = driver.findElement(By.id("back-to-products"));
        backButton.click();
        Thread.sleep(1000);

        WebElement item2 = driver.findElement(By.id("item_5_title_link"));
        item2.click();
        Thread.sleep(1000);
        WebElement addToCartitem2 = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        addToCartitem2.click();
        Thread.sleep(1000);
        WebElement backButton2 = driver.findElement(By.id("back-to-products"));
        backButton2.click();
        Thread.sleep(1000);
        WebElement goToCart = driver.findElement(By.className("shopping_cart_link"));
        goToCart.click();
        Thread.sleep(1000);
        WebElement removeItem1 = driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
        removeItem1.click();
        Thread.sleep(1000);
        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Poonam");
        Thread.sleep(1000);

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("singh");
        Thread.sleep(1000);

        WebElement postalCode = driver.findElement(By.id("postal-code"));
        postalCode.sendKeys("400076");
        Thread.sleep(1000);

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
        Thread.sleep(1000);

        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("./sample_screenshot.png");
        FileUtils.copyFile(SrcFile, DestFile);

        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();
        Thread.sleep(1000);

        TakesScreenshot conformOrderScrShot = ((TakesScreenshot) driver);
        File SrcFile2 = conformOrderScrShot.getScreenshotAs(OutputType.FILE);
        File DestFile2 = new File("./conformorder_screenshot.png");
        FileUtils.copyFile(SrcFile2, DestFile2);

        WebElement backToHome = driver.findElement(By.id("back-to-products"));
        backToHome.click();
        Thread.sleep(1000);

        driver.quit();


    }



}
