package AmmiePractice.AmmiePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise7 {
    public static void main (String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "http://demo.guru99.com/test/newtours/register.php";
        WebElement firstName = driver.findElement(By.xpath("//*[@name='firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//*[@name='lastName']"));
        WebElement phone = driver.findElement(By.xpath("//*[@name='phone']"));
        WebElement email = driver.findElement(By.xpath("//*[@name='userName']"));
        WebElement address = driver.findElement(By.xpath("//*[@name='address1']"));
        WebElement city = driver.findElement(By.xpath("//*[@name='city']"));
        WebElement stateProvince = driver.findElement(By.xpath("//*[@name='state']"));
        WebElement postalCode = driver.findElement(By.xpath("//*[@name='postalCode']"));





    }
}
