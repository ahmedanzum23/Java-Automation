package code1;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class EdgeBrowser {

    WebDriver driver;

    @BeforeSuite
    public void startBrowser() {
        // Initialize Edge WebDriver
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();  // Use EdgeDriver for Edge browser
    }
    
    // Add your test methods here
    
   
    }

