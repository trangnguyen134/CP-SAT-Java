package A2SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionBuilderGoogle extends BaseTest {
    @BeforeTest
    public void setUp() {

    }

    //Create google account using actions class builder

    @Test
    public void actionBuilderPractice() {

        String url = "https://accounts.google.com/signup";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement firstName = driver.findElement(By.xpath("//*[@id='firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//*[@id='lastName']"));
        WebElement userName = driver.findElement(By.xpath("//*[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//*[@name='Passwd']"));
        WebElement confirmPassword = driver.findElement(By.xpath("//*[@name='ConfirmPasswd']"));
        WebElement nextButton = driver.findElement(By.xpath("//*[contains(text(),'Next')]"));

        Actions builder = new Actions(driver);
        Action createAccount = builder
                .moveToElement(firstName).click().keyDown(firstName, Keys.SHIFT).sendKeys(firstName, "ammie").keyUp(firstName, Keys.SHIFT)
                .moveToElement(lastName).click().keyDown(lastName, Keys.SHIFT).sendKeys(lastName, "nguyen").keyUp(lastName, Keys.SHIFT)
                .moveToElement(userName).click().sendKeys(userName, "ammienguyen1304")
                .moveToElement(password).click().sendKeys(password, "ammie13579")
                .moveToElement(confirmPassword).click().sendKeys(confirmPassword, "ammie13579")
                .moveToElement(nextButton).click(nextButton)
                .build();


        createAccount.perform();
    }

    @AfterTest
    public void cleanUp() {

    }
}
