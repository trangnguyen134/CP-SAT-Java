package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadlessBrowser {
    @Test
    public void HeadlessGoogleSearch() {
        // Creating a new instance of the HTML unit driver
        WebDriver driver = new HtmlUnitDriver();

        // Navigate to Google
        driver.get("http://www.google.com");

        // Locate the searchbox using its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter a search query
        element.sendKeys("Guru99");

        // Submit the query. Webdriver searches for the form using the text input element automatically
        // No need to locate/find the submit button
        element.submit();

        // This code will print the page title
        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }

}
