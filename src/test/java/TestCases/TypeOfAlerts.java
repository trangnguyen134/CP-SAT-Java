package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TypeOfAlerts extends BaseTest {

    @BeforeTest
    public void setUp() {

    }

    @Test
    public void AlertVerification() {
        String url = "https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        // Simple Alert
        WebElement simpleAlertButton = driver.findElement(By.xpath("//*[text()='Simple Alert']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", simpleAlertButton);
        Alert simpleAlert = driver.switchTo().alert();
        String simpleAlertText = simpleAlert.getText();
        Assert.assertTrue(simpleAlertText.contains("simple Alert"));
        System.out.println("Alert text is: " + simpleAlertText);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        simpleAlert.accept();


        //Confirmation Alert
        WebElement confirmAlertButton = driver.findElement(By.xpath("//*[text()='Confirm Pop up']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", confirmAlertButton);
        Alert confirmAlert = driver.switchTo().alert();
        String confirmAlertText = confirmAlert.getText();
        System.out.println("Confirmation Alert text is: " + confirmAlertText);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        confirmAlert.dismiss();

        //Prompt Alert
        WebElement promptAlertButton = driver.findElement(By.xpath("//*[text()='Prompt Pop up']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", promptAlertButton);
        Alert promptAlert = driver.switchTo().alert();
        String promptAlertText = promptAlert.getText();
        System.out.println("Prompt alert text is: " + promptAlertText);
        promptAlert.sendKeys("Ammie does not like it");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        promptAlert.accept();
    }

    @AfterTest
    public void cleanUp() {

    }
}
