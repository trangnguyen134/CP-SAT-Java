package JavaBasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PracticeExercise4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://demoqa.com/";
        System.out.println("Opening Demo QA page...");
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Interactions")).click();
        System.out.println("Navigating to Interactions page ...");
        driver.findElement(By.linkText("Home")).click();
        System.out.println("Navigating to Home page ...");
        driver.quit();
        System.out.println("Closing Demo QA page...");
    }
}
