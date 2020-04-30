package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Log_In {

    private static WebElement element = null;

    public static WebElement txtbx_UserName(WebDriver driver){

        element = driver.findElement(By.id("username"));

        return element;

    }

    public static WebElement txtbx_Password(WebDriver driver){

        element = driver.findElement(By.id("password"));

        return element;

    }

    public static WebElement btn_LogIn(WebDriver driver){

        element = driver.findElement(By.name("login"));

        return element;

    }
}
