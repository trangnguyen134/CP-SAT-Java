package SeleniumBasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragDrop {
    public static void main(String[] args) {
        String firstUrl = "https://demoqa.com/droppable/";
        String secondUrl = "http://demo.guru99.com/test/drag_drop.html";
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();


        driver.get(firstUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        Actions builder = new Actions(driver);
        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));
        //Perform drag and drop
        builder.dragAndDrop(from, to).perform();
        //verify text changed in to 'Drop here' box
        String textTo = to.getText();
        if (textTo.equals("Dropped!")) {
            System.out.println("PASS: Source is dropped to target as expected");
        } else {
            System.out.println("FAIL: Source couldn't be dropped to target as expected");
        }


        driver.get(secondUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

       /*   WebElement bankFrom = driver.findElement(By.xpath("//*[@id='credit2']/a"));
        Actions act = new Actions(driver);
        act.dragAndDropBy(bankFrom,160,40).build().perform();
        System.out.println("Finish drag and drop");*/


        //Element(BANK) which need to drag.
        WebElement From1 = driver.findElement(By.xpath("//*[@id='credit2']/a"));

        //Element(DEBIT SIDE) on which need to drop.
        WebElement To1 = driver.findElement(By.xpath("//*[@id='bank']/li"));

        //Element(SALES) which need to drag.
        WebElement From2 = driver.findElement(By.xpath("//*[@id='credit1']/a"));

        //Element(CREDIT SIDE) on which need to drop.
        WebElement To2 = driver.findElement(By.xpath("//*[@id='loan']/li"));

        //Element(500) which need to drag.
        WebElement From3 = driver.findElement(By.xpath("//*[@id='fourth']/a"));

        //Element(DEBIT SIDE) on which need to drop.
        WebElement To3 = driver.findElement(By.xpath("//*[@id='amt7']/li"));

        //Element(500) which need to drag.
        WebElement From4 = driver.findElement(By.xpath("//*[@id='fourth']/a"));

        //Element(CREDIT SIDE) on which need to drop.
        WebElement To4 = driver.findElement(By.xpath("//*[@id='amt8']/li"));

        //Using Action class for drag and drop.
        Actions act = new Actions(driver);

        //BANK drag and drop.
        act.dragAndDrop(From1, To1).build().perform();

        //SALES drag and drop.
        act.dragAndDrop(From2, To2).build().perform();

        //500 drag and drop debit side.
        act.dragAndDrop(From3, To3).build().perform();

        //500 drag and drop credit side.
        act.dragAndDrop(From4, To4).build().perform();

        //Verifying the Debit Movement! message.
        if (driver.findElement(By.xpath("//*[contains(text(),'Debit Movement')]")).isDisplayed()) {
            System.out.println("Debit Movement Displayed !!!");
        } else {
            System.out.println("Debit Movement is not Displayed !!!");
        }

        driver.close();

    }
}
