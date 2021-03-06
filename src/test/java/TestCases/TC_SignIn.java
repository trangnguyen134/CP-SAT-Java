package TestCases;

import Utilities.Constant;
import Utilities.ExcelUtils;
import Utilities.Log4j;
import AppObjects.SignIn_Action;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageObjects.Page_Home;

import java.util.concurrent.TimeUnit;

public class TC_SignIn {
    private static WebDriver driver = null;

    @BeforeMethod

    public void beforeMethod() throws Exception{

        DOMConfigurator.configure("log4j.xml");

        Log4j.startTestCase("Selenium_Test_001");

        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");

        Log4j.info(" Excel sheet opened");

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
        Log4j.info("New driver instantiated");

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Log4j.info("Implicit wait applied on the driver for 60 seconds");

        driver.get(Constant.URL);
        Log4j.info("Web application is launched");

    }


    @Test

    public void SignInVerification() throws Exception {

        SignIn_Action.Execute(driver);

        System.out.println("Login Successfully, now it is the time to Log Off buddy.");

        Page_Home.lnk_LogOut(driver).click();

        Log4j.info("Click action is performed on Log Out link");

    }

    @AfterMethod

    public void afterMethod() throws Exception{
        driver.quit();

        Log4j.info("Browser closed");

        ExcelUtils.setCellData("Pass", 1, 3);

        Log4j.endTestCase("Selenium_Test_001");
    }

}
