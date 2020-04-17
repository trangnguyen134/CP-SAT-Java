package AmmiePractice.JavaPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise2 {
    public static void main() {
        WebDriverManager.chromedriver().setup();
        String url = "https://www.toolsqa.com/automation-practice-switch-windows/";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        
    }
}
