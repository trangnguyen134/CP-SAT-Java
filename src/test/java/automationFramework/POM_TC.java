package automationFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import pageObjects.Home_Page;
import pageObjects.LogIn_Page;

import java.util.concurrent.TimeUnit;

public class POM_TC {
    private static WebDriver driver = null;

    @Test
    public void VerifyLogInSuccess () {
        String url = "http://www.store.demoqa.com";
        WebDriverManager.chromedriver().setup();
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--no-sandbox");
        chrome_options.addArguments("--disable-infobars");
        chrome_options.addArguments("--disable-extensions");
        chrome_options.addArguments("--disable-web-security");
        chrome_options.addArguments("--no-proxy-server");
        chrome_options.addArguments("--enable-automation");
        chrome_options.addArguments("--ignore-certificate-errors");
        chrome_options.setPageLoadStrategy(PageLoadStrategy.NONE);
        driver = new ChromeDriver(chrome_options);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(url);

        //Start using pageObjects
        Home_Page.lnk_MyAccount(driver).click();

        LogIn_Page.txtbx_UserName(driver).sendKeys("ammie");

        LogIn_Page.txtbx_Password(driver).sendKeys("Ammie130483");

        LogIn_Page.btn_LogIn(driver).click();

        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

        Home_Page.lnk_LogOut(driver).click();

        driver.quit();

    }
}
