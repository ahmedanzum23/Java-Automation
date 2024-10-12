package code1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {

    WebDriver driver;

    @BeforeSuite
    public void startBrowser() {
        // Get browser name from system properties or default to Chrome
        String browsername = System.getProperty("browser", "chrome");

        // Check browser name and initialize respective driver
        if (browsername.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();  // Use ChromeDriver for Chrome browser

        } else if (browsername.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();  // Use FirefoxDriver for Firefox browser

        } else if (browsername.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();  // Use EdgeDriver for Edge browser

        } else {
            // If browser not supported, throw an exception or log an error
            System.out.println("Browser not supported: " + browsername);
        }
    }
    
}

    