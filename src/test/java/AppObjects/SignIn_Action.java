package AppObjects;

import Utilities.ExcelUtils;
import Utilities.Log4j;
import org.openqa.selenium.WebDriver;
import PageObjects.Page_Home;
import PageObjects.Page_LogIn;

public class SignIn_Action {
    // Pass Arguments (Username and Password) as string
    public static void Execute(WebDriver driver) throws Exception {

        //This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method
        String sUsername = ExcelUtils.getCellData(1,1);
        Log4j.info("Username picked from Excel is "+ sUsername );

        String sPassword = ExcelUtils.getCellData(1,2);
        Log4j.info("Password picked from Excel is "+ sPassword );

        Page_Home.lnk_MyAccount(driver).click();
        Log4j.info("Click action performed on My Account link");

        Page_LogIn.txtbx_UserName(driver).sendKeys(sUsername);
        Log4j.info("Username entered in the Username text box");

        Page_LogIn.txtbx_Password(driver).sendKeys(sPassword);
        Log4j.info("Password entered in the Password text box");

        Page_LogIn.btn_LogIn(driver).click();
        Log4j.info("Click action performed on Submit button");
    }
}
