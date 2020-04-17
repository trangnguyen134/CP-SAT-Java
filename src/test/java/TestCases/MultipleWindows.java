package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindows {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

        String MainWindow = driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.name("emailid"))
                        .sendKeys("ammienguyen@gmail.com");

                driver.findElement(By.name("btnLogin")).click();

                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
        driver.quit();
    }
}
