package A1JavaBasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String expectedUrl = "http://www.shop.demoqa.com";
        //Launch website
        driver.get(expectedUrl);
        // Get title
        String title = driver.getTitle();
        //Get title length
        int titleLength = driver.getTitle().length();
        System.out.println("Title of the page is: " + title);
        System.out.println("Length of page title is: " + titleLength);
        //Get url
        String actualUrl = driver.getCurrentUrl();
        //Get Page Source

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Verification successful: The correct url " + expectedUrl + " is opened");
        } else {
            System.out.println("Verification failed: An incorrect url is opened");
            System.out.println("Expected url is: " + expectedUrl);
            System.out.println("Actual url is: " + actualUrl);
        }
        String pageSource = driver.getPageSource();
        System.out.println("Page source is: " + pageSource);
        //Get page source length
        int pageSourceLength = driver.getPageSource().length();
        System.out.println("Length of page source is: " + pageSourceLength);
        driver.quit();
    }
}
