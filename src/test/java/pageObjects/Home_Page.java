package pageObjects;


import Utilities.Log4j;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class Home_Page {

    private static WebElement element = null;

    public static WebElement lnk_MyAccount(WebDriver driver){

        //element = driver.findElement(By.id("account"));
        element = driver.findElement(By.xpath("//*[contains(text(),'My Account')]"));
        Log4j.info("My Account link element found");
        return element;

    }

    public static WebElement lnk_LogOut(WebDriver driver){

       // element = driver.findElement(By.id("account_logout"));
        element = driver.findElement(By.xpath("//*[contains(text(),'Logout')]"));
        Log4j.info("Log Out link element found");
        return element;

    }

}