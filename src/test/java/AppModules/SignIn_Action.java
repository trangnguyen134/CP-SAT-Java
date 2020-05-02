package AppModules;

import Utilities.ExcelUtils;
import Utilities.Log4j;
import org.openqa.selenium.WebDriver;
import PageObjects.Home_Page;
import PageObjects.LogIn_Page;

public class SignIn_Action {
    // Pass Arguments (Username and Password) as string
    public static void Execute(WebDriver driver) throws Exception {

        //This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method
        String sUsername = ExcelUtils.getCellData(1,1);
        Log4j.info("Username picked from Excel is "+ sUsername );

        String sPassword = ExcelUtils.getCellData(1,2);
        Log4j.info("Password picked from Excel is "+ sPassword );

        Home_Page.lnk_MyAccount(driver).click();
        Log4j.info("Click action performed on My Account link");

        LogIn_Page.txtbx_UserName(driver).sendKeys(sUsername);
        Log4j.info("Username entered in the Username text box");

        LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);
        Log4j.info("Password entered in the Password text box");

        LogIn_Page.btn_LogIn(driver).click();
        Log4j.info("Click action performed on Submit button");
    }
}
