package SeleniumBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class HeadlessPhantom {
    public static void main (String[] args) {
        WebDriverManager.phantomjs().setup();
        WebDriver phantomDriver = new PhantomJSDriver();
        phantomDriver.get("https://google.com");
        WebElement searchBox = phantomDriver.findElement(By.name("q"));
        searchBox.sendKeys("Ammie");
        searchBox.submit();
        System.out.println("Page title is " + phantomDriver.getTitle());
        phantomDriver.quit();
    }
}
