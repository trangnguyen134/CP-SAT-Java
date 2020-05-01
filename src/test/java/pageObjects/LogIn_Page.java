package pageObjects;

import Utilities.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {

    private static WebElement element = null;

    public static WebElement txtbx_UserName(WebDriver driver){

        element = driver.findElement(By.id("username"));
        Log4j.info("Username text box found");
        return element;

    }

    public static WebElement txtbx_Password(WebDriver driver){

        element = driver.findElement(By.id("password"));
        Log4j.info("Password text box found");

        return element;

    }

    public static WebElement btn_LogIn(WebDriver driver){

        element = driver.findElement(By.name("login"));
        Log4j.info("Submit button found");

        return element;

    }
}
