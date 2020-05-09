package TestCases;

import AppObjects.SignIn_Action;
import PageObjects.Page_Home;
import Utilities.Constant;
import Utilities.ExcelUtils;
import Utilities.Log4j;
import Utilities.Utils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_UDF {
    public WebDriver driver;
    private String sTestCaseName;
    private int iTestCaseRow;

    @BeforeMethod
    public void beforeMethod() throws Exception {
        DOMConfigurator.configure("log4j.xml");
        sTestCaseName = this.toString();
        sTestCaseName = Utils.getTestCaseName(this.toString());
        Log4j.startTestCase(sTestCaseName);

        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
        iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, Constant.Col_TestCaseName);
        driver = Utils.openBrowser(iTestCaseRow);
    }

    @Test
    public void main() throws Exception {
        SignIn_Action.Execute(driver);

        System.out.println("Login Successfully, now it is the time to Log Off buddy.");

        Page_Home.lnk_LogOut(driver).click();

        Log4j.info("Click action is performed on Log Out link");

    }

    @AfterMethod

    public void afterMethod() {

        driver.quit();

    }

}