package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class TypeOfAlerts {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chromedriver = new ChromeDriver();
        chromedriver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
        chromedriver.manage().window().maximize();
        chromedriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        // Simple Alert
        WebElement simpleAlertButton = chromedriver.findElement(By.xpath("//*[text()='Simple Alert']"));
        simpleAlertButton.click();
        Alert simpleAlert = chromedriver.switchTo().alert();
        String simpleAlertText = simpleAlert.getText();
        System.out.println("Alert text is: " + simpleAlertText);
        simpleAlert.accept();

        //Confirmation Alert
        WebElement confirmAlertButton = chromedriver.findElement(By.xpath("//*[text()='Confirm Pop up']"));
        ((JavascriptExecutor) chromedriver).executeScript("arguments[0].click()", confirmAlertButton);
        Alert confirmAlert = chromedriver.switchTo().alert();
        String confirmAlertText = confirmAlert.getText();
        System.out.println("Confirmation Alert text is: " + confirmAlertText);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        confirmAlert.dismiss();

        //Prompt Alert
        WebElement promptAlertButton = chromedriver.findElement(By.xpath("//*[text()='Prompt Pop up']"));
        ((JavascriptExecutor) chromedriver).executeScript("arguments[0].click()", promptAlertButton);
        Alert promptAlert = chromedriver.switchTo().alert();
        String promptAlertText = promptAlert.getText();
        System.out.println("Prompt alert text is: " + promptAlertText);
        promptAlert.sendKeys("Ammie does not like it");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        promptAlert.accept();

        chromedriver.close();

    }
}
