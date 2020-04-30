package automationFramework;

import Utilities.Constant;
import appModules.SignIn_Action;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import pageObjects.Home_Page;

import java.util.concurrent.TimeUnit;

public class Global_Var_TC {
    private static WebDriver driver = null;

    @Test
    public void FinalLogInVerification() {
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

        driver.get(Constant.URL);
    //    SignIn_Action.Execute(driver, Constant.Username, Constant.Password);

        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

        Home_Page.lnk_LogOut(driver).click();

        driver.quit();
    }

}
