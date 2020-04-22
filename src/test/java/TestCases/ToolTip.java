package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class ToolTip extends BaseTest {
    @BeforeTest
    public void setUp() {

    }

    @Test
    public void VerifyTooltip() {

        //Get Tooltip by getting attribute - Simple HTML
        String baseUrl = "http://demo.guru99.com/test/social-icon.html";
        String expectedTooltip = "Github";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //Find element and get attribute
        WebElement gitHub = driver.findElement(By.xpath("//*[@title='Github']"));
        String actualTooltip = gitHub.getAttribute("title");

        System.out.println("======= TEST CASE 1: Github tooltip verification =======");
        //Github tooltip verification point
        if (actualTooltip.equals(expectedTooltip)) {
            System.out.println("Actual Tooltip is: " + actualTooltip);
            System.out.println("Expected Tooltip is: " + expectedTooltip);
            System.out.println("Github tooltip verification is PASSED");
        } else {
            softAssert.assertEquals(expectedTooltip, actualTooltip, "Github tooltip validation is FAILED");
        }


        //Get Tooltip by Actions Class - JQuery or CSS
        String secondUrl = "http://demo.guru99.com/test/tooltip.html";
        String expectedSecondTooltip = "What's new in 3.2";
        driver.navigate().to(secondUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        //Find element
        WebElement downloadNow = driver.findElement(By.xpath("//*[@id='download_now']"));

        //Get tooltip by actions class
        Actions builder = new Actions(driver);
        builder.moveToElement(downloadNow).clickAndHold().build().perform();
        WebElement secondTooltip = driver.findElement(By.xpath("//*[@class='box']/div/a"));
        String secondTooltipText = secondTooltip.getText();

        System.out.println("======= TEST CASE 2: What's new in 3.2 tooltip verification =======");

        //Verification of the second tooltip
        if (secondTooltipText.equals(expectedSecondTooltip)) {
            System.out.println("Expected second tooltip is: " + expectedSecondTooltip);
            System.out.println("Actual second tooltip is: " + secondTooltipText);
            System.out.println("Test case 2 is PASSED");
        } else {
            softAssert.assertEquals(secondTooltipText, expectedSecondTooltip, "What's new in 3.2 tooltip verification is FAILED.");
        }

    }

    @AfterTest

    public void cleanUp() {

    }
}
