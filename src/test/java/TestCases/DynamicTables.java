package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTables extends BaseTest {

    @BeforeTest
    public void SetUp() {
    }

    @Test

    public void VerifyDynamicTables() {
        String url = "http://demo.guru99.com/test/web-table-element.php";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        List<WebElement> col = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
        System.out.println("Number of columns are: " + col.size());

        List<WebElement> row = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("Number of rows are: " + row.size());


        WebElement baseTable = driver.findElement(By.tagName("table"));

        //To find third row of table
        WebElement tableRow = baseTable.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[5]"));
        String rowtext = tableRow.getText();
        System.out.println("Third row of table : " + rowtext);

        //to get 3rd row's 2nd column data
        WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[5]/td[1]"));
        String valueIneed = cellIneed.getText();
        System.out.println("Cell value is : " + valueIneed);

        // List all companies

        for (int i = 1; i < row.size(); i++) {
            WebElement company = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[" + (i + 1) + "]/td[1]/a"));
            String companyTitle = company.getText();
            System.out.println("Company Name " + i + " is: " + companyTitle);
        }

    }

    @AfterTest

    public void cleanUp() {

    }
}
