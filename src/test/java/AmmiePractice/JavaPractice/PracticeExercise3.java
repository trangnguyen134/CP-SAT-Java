package AmmiePractice.JavaPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PracticeExercise3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "http://www.DemoQA.com";
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println("Open the page");
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println("Refresh the page");
        driver.navigate().forward();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println("Forward the page");
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println("Back the page");
        driver.quit();


    }
}
