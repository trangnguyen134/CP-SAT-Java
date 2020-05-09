package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class Utils {

    public static WebDriver driver = null;

    /* This method to get browser row from Excel file, instantiate browser and launch the application */
    public static WebDriver openBrowser(int iTestCaseRow) throws Exception {
        String sBrowserName;
        try {
            sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Browser);
            if (sBrowserName.equals("Chrome")) {
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
                Log4j.info("Web application launched successfully");

            }

        } catch (Exception e) {
            Log4j.error("Class Utils | Method OpenBrowser | Exception desc: " + e.getMessage());
        }
        return driver;
    }

    /* This method to get test case name row from TestData spreadsheet */

    public static String getTestCaseName(String sTestCase) throws Exception {
        String value = sTestCase;
        try {
            int posi = value.indexOf("@");

            value = value.substring(0, posi);

            posi = value.lastIndexOf(".");

            value = value.substring(posi + 1);

            return value;

        } catch (Exception e) {

            Log4j.error("Class Utils | Method getTestCaseName | Exception desc : " + e.getMessage());

            throw (e);
        }

    }


}
