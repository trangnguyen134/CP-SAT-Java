package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class ToolTip {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        String baseUrl = "http://demo.guru99.com/test/social-icon.html";
        String expectedTooltip = "Facebook";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement gitHub = driver.findElement(By.xpath("//*[@title='Github']"));

        String actualTooltip = gitHub.getAttribute("title");

        if (actualTooltip.equals(expectedTooltip)) {
            System.out.println("Actual Tooltip is: " + actualTooltip);
            System.out.println("Expected Tooltip is: " + expectedTooltip);
            System.out.println("Test cases 1 is PASSED");

        } else {
            System.out.println("Actual Tooltip is: " + actualTooltip);
            System.out.println("Expected Tooltip is: " + expectedTooltip);
            System.out.println("Test cases 1 is FAILED");
        }

        String secondUrl = "http://demo.guru99.com/test/tooltip.html";
        String expectedSecondTooltip = "What's new in 3.2";
        driver.navigate().to(secondUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement downloadNow = driver.findElement(By.xpath("//*[@id='download_now']"));

        Actions builder = new Actions(driver);
        builder.moveToElement(downloadNow).clickAndHold().build().perform();
        WebElement secondTooltip = driver.findElement(By.xpath("//*[@class='box']/div/a"));
        String secondTooltipText = secondTooltip.getText();

        if (secondTooltipText.equals(secondTooltipText)) {
            System.out.println("Expected second tooltip is: " + expectedSecondTooltip);
            System.out.println("Actual second tooltip is: " + secondTooltipText);
            System.out.println("Test case 2 is PASSED");
        } else {
            System.out.println("Expected second tooltip is: " + expectedSecondTooltip);
            System.out.println("Actual second tooltip is: " + secondTooltipText);
            System.out.println("Test case 2 is FAILED");
        }


        driver.close();

    }
}
