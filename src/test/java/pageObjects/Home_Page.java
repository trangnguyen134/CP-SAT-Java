package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Log_In {

    //Creating a Static Method for each Element (Object) in the Home Page. Each method will have an Argument (driver) and a Return value (element).

    private static WebElement element = null;

    public static WebElement lnk_MyAccount(WebDriver driver){

        element = driver.findElement(By.id("account"));

        return element;

    }

    public static WebElement lnk_LogOut(WebDriver driver){

        element = driver.findElement(By.id("account_logout"));

        return element;

    }
}
