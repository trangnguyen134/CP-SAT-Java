package SeleniumBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FileUploadDownload {
    @BeforeTest
    public void setUp() {

    }

    @Test
    public void VerifyFileUploadDownload() {

        String uploadFileUrl = "http://demo.guru99.com/test/upload/";
        String downloadFileUrl = "http://demo.guru99.com/test/yahoo.html";
        String filePath = "C:\\Users\\Ammie\\Desktop\\Chrome_bookmark.html";

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get(uploadFileUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        WebElement uploadFile = driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
        uploadFile.sendKeys(filePath);
        WebElement acceptTerms = driver.findElement(By.xpath("//*[@id='terms']"));
        acceptTerms.click();
        WebElement submitButton = driver.findElement(By.xpath("//*[@id='submitbutton']"));
        submitButton.click();

        System.out.println("Finish upload the file");


        driver.get(downloadFileUrl);
        WebElement downloadButton = driver.findElement(By.id("messenger-download"));
        String sourceLocation = downloadButton.getAttribute("href");
        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D:\\Ammie --no-check-certificate " + sourceLocation;

        try {
            Process exec = Runtime.getRuntime().exec(wget_command);
            int exitVal = exec.waitFor();
            System.out.println("Exit value: " + exitVal);
        } catch (InterruptedException | IOException ex) {
            System.out.println(ex.toString());
        }

        System.out.println("Finish download file");

    }

    @AfterTest
    public void cleanUp() {
    }

}
