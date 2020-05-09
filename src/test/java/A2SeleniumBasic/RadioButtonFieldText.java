package A2SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RadioButtonFieldText extends BaseTest {
    @BeforeTest
    public void setUp() {

    }

    @Test
    public void Flights() {

        String url = "http://demo.guru99.com/test/newtours/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement flights = driver.findElement(By.linkText("Flights"));
        flights.click();

        System.out.println("======== VERIFICATION 1 : Flight Details is displayed ========");
        WebElement flightDetails = driver.findElement(By.xpath("//*[contains(text(),'Details')]"));
        softAssert.assertEquals(flightDetails.isDisplayed(), true, "PASSED: ");
        System.out.println("VERIFICATION 1 : PASSED");

        System.out.println("======== VERIFICATION 2: roundTrip is selected as default value =======");
        WebElement roundTrip = driver.findElement(By.xpath("//*[@value='roundtrip']"));
        softAssert.assertEquals(roundTrip.isSelected(), true, "FAILED");
        System.out.println("VERIFICATION 2: PASSED");

        System.out.println("==== Select Flight value as One Way ====");
        WebElement oneWay = driver.findElement(By.xpath("//*[@value='oneway']"));
        oneWay.click();


        System.out.println("==== Select Passenger Counts ====");
        Select passengers = new Select(driver.findElement(By.xpath("//*[@name='passCount']")));
        passengers.selectByValue("2");

        System.out.println("==== Select Departing From ====");
        Select departingFrom = new Select(driver.findElement(By.xpath("//*[@name='fromPort']")));
        departingFrom.selectByValue("San Francisco");

        System.out.println("==== Select On ====");
        Select fromMonth = new Select(driver.findElement(By.xpath("//*[@name='fromMonth']")));
        fromMonth.selectByValue("4");
        Select fromDay = new Select(driver.findElement(By.xpath("//*[@name='fromDay']")));
        fromDay.selectByValue("13");


        System.out.println("==== Select Arrival  ====");
        Select arrival = new Select(driver.findElement(By.xpath("//*[@name='toPort']")));
        arrival.selectByValue("Seattle");


        System.out.println("==== Select Returning ====");
        Select toMonth = new Select(driver.findElement(By.xpath("//*[@name='toMonth']")));
        fromMonth.selectByValue("4");
        Select toDay = new Select(driver.findElement(By.xpath("//*[@name='toDay']")));
        toDay.selectByValue("20");


        System.out.println("==== Select Service Class ====");
        WebElement serviceClass = driver.findElement(By.xpath("//*[@value='First']"));
        serviceClass.click();

        System.out.println("==== Select Airline ====");
        Select airline = new Select(driver.findElement(By.xpath("//*[@name='airline']")));
        airline.getFirstSelectedOption();
        // airline.selectByVisibleText"Unified Airlines");

        System.out.println("==== Click Continue ====");
       // WebElement findFlights = driver.findElement(By.linkText("Flights"));
        WebElement findFlights = driver.findElement(By.xpath("//*[@name='findFlights']"));
        findFlights.click();

        System.out.println("===== VERIFICATION: RESERVATION PAGE 2 IS DISPLAYED =====");
        WebElement message = driver.findElement(By.xpath("//*[contains(text(),'BACK TO HOME')]"));
        softAssert.assertEquals(message.isDisplayed(), true, "PASSED: Next page is displayed");
        System.out.println("VERIFICATION: RESERVATION PAGE 2 IS DISPLAYED: PASSED");


    }

    @AfterTest
    public void cleanUp() {

    }

}
