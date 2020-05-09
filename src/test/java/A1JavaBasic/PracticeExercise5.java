package A1JavaBasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PracticeExercise5 {
    public static void main (String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "http://demo.guru99.com/test/facebook.html";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println("Enter email: ");
        driver.findElement(By.ByXPath.id("email")).sendKeys("nguyennhu.trang@gmail.com");
        System.out.println("Enter password: ");
        driver.findElement(By.ByXPath.id("pass")).sendKeys("G@me0ver");
        System.out.println("Click Login: ");
        driver.findElement(By.ByXPath.id("u_0_b")).click();
        System.out.println("Closing browser...");
        driver.quit();
    }
}
