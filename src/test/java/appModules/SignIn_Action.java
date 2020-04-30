package appModules;

import Utilities.ExcelUtils;
import org.openqa.selenium.WebDriver;
import pageObjects.Home_Page;
import pageObjects.LogIn_Page;

public class SignIn_Action {
    // Pass Arguments (Username and Password) as string
    public static void Execute(WebDriver driver) throws Exception {

        //This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method
        String sUsername = ExcelUtils.getCellData(2,2);
        String sPassword = ExcelUtils.getCellData(2,3);

        Home_Page.lnk_MyAccount(driver).click();

        LogIn_Page.txtbx_UserName(driver).sendKeys(sUsername);

        LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);

        LogIn_Page.btn_LogIn(driver).click();
    }
}
