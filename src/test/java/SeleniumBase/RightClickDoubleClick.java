package SeleniumBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RightClickDoubleClick extends BaseTest {
    @BeforeTest
    public void SetUp() {
    }

    @Test
    public void actionsClick() {
        String url = "https://demoqa.com/tooltip-and-double-click/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement doubleClick = driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));
        WebElement rightClick = driver.findElement(By.xpath("//*[@id='rightClickBtn']"));
        WebElement copyMe = driver.findElement(By.xpath("//*[@id='rightclickItem']/div[1]"));

        Actions builder = new Actions(driver);
        Action multipleActions = builder
                .moveToElement(doubleClick).contextClick(doubleClick)
                .moveToElement(rightClick).contextClick(rightClick)
                .moveToElement(copyMe).click(copyMe)
                .build();
        multipleActions.perform();
        driver.switchTo().alert().accept();


    }

    @AfterTest
    public void cleanUp() {

    }

}
