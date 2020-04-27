package SeleniumBase;

import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class LaunchBrowser {
    public static void main(String[] args) {
        String browsers = "edge";

        switch (browsers) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                WebDriver chromeDriver = new ChromeDriver();
                chromeDriver.get("http://www.toolsqa.com");
                chromeDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                chromeDriver.close();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                WebDriver firefoxDriver = new FirefoxDriver();
                firefoxDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                firefoxDriver.navigate().to("http://www.toolsqa.com");
                firefoxDriver.close();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
                caps.setCapability("ignoreZoomSetting", true);
                InternetExplorerDriver internetExplorerDriver = new InternetExplorerDriver(caps);
                internetExplorerDriver.navigate().to("http://www.toolsqa.com");
                internetExplorerDriver.close();
                break;
            case "edge":
                EdgeDriverManager.edgedriver().setup();
                DesiredCapabilities edgeCaps = new DesiredCapabilities("MicrosoftEdge", "", Platform.WINDOWS);
                edgeCaps.setCapability("ignoreProtectedModeSettings", true);
                edgeCaps.setCapability("ignoreZoomSetting", true);
                EdgeDriver edgeDriver = new EdgeDriver(edgeCaps);
                edgeDriver.navigate().to("http://wwww.toolsqa.com");
                System.out.println("Opening successful");
                edgeDriver.close();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + browsers);
        }


    }
}
