package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClickDoubleClick extends BaseTest {
    @BeforeTest
    public void SetUp() {
        String url = "https://demoqa.com/tooltip-and-double-click/";
        driver.get(url);
    }

/*    Launch the web browser and launch our practice page https://demoqa.com/tooltip-and-double-click/
    Find the required element i.e. button in our sample and do double click on the element
    Accept the alert message
    Close the browser to end the program*/

    @Test
    public void actionsClick() {
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
