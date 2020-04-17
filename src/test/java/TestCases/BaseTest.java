package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;
    public static SoftAssert softAssert;

    @BeforeClass
    public static void init() {
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
        softAssert = new SoftAssert();
    }

    @AfterClass
    public static void CleanUp() {
        softAssert.assertAll();
        driver.quit();
    }
}
