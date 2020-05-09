package A2SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownFieldText extends BaseTest {

    @BeforeTest
    public void SetUp() {
    }

    @Test
    public void Registration() {
        String url = "http://demo.guru99.com/test/newtours/register.php";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement firstName = driver.findElement(By.xpath("//*[@name='firstName']"));
        firstName.sendKeys("Trang");

        WebElement lastName = driver.findElement(By.xpath("//*[@name='lastName']"));
        lastName.sendKeys("Nguyen");

        WebElement phone = driver.findElement(By.xpath("//*[@name='phone']"));
        phone.sendKeys("7205924127");

        WebElement email = driver.findElement(By.xpath("//*[@name='userName']"));
        email.sendKeys("nguyennhu.trang@gmail.com");

        WebElement address = driver.findElement(By.xpath("//*[@name='address1']"));
        address.sendKeys("18249 E Mainstreet");

        WebElement city = driver.findElement(By.xpath("//*[@name='city']"));
        city.sendKeys("Parker");

        WebElement stateProvince = driver.findElement(By.xpath("//*[@name='state']"));
        stateProvince.sendKeys("Colorado");

        WebElement postalCode = driver.findElement(By.xpath("//*[@name='postalCode']"));
        postalCode.sendKeys("80134");

        Select country = new Select(driver.findElement(By.xpath("//*[@name='country']")));
        country.selectByValue("UNITED STATES");

        WebElement userName = driver.findElement(By.xpath("//*[@name='email']"));
        userName.sendKeys("nguyennhu.trang@gmail.com");

        WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
        password.sendKeys("G@me0ver");

        WebElement confirmPassword = driver.findElement(By.xpath("//*[@name='confirmPassword']"));
        confirmPassword.sendKeys("G@me0ver");

        WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));
        submit.click();

        String registerSuccessUrl = "http://demo.guru99.com/test/newtours/register_sucess.php";
        driver.navigate().to(registerSuccessUrl);
        WebElement successMessage = driver.findElement(By.xpath("//*[contains(text(),'Note: Your user name is nguyennhu.trang@gmail.com.')]"));
        String messageText = successMessage.getText();
        String expectedMessage = "Note: Your user name is nguyennhu.trang@gmail.com.";
        softAssert.assertEquals(successMessage.isDisplayed(), true, "PASSED: " + successMessage.getText() + " is displayed");
        System.out.println("VerifyRegistration: PASSED: " + successMessage.getText() + " is displayed");
    }

    @AfterTest

    public void cleanUp() {

    }

}
