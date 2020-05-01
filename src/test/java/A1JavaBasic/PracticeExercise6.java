package A1JavaBasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PracticeExercise6 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "http://demo.guru99.com/test/newtours/";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println("Enter username: ");
        driver.findElement(By.name("userName")).sendKeys("ammienguyen");
        System.out.println("Closing browser...");
        driver.quit();
    }
}
