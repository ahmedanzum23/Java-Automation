package code1;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;  // Import WebDriver
import org.openqa.selenium.chrome.ChromeDriver;  // Import ChromeDriver
import org.testng.annotations.Test;

public class Demo {

   
	@Test
	//public static void main(String[] args) {
	public void googleSearch() throws InterruptedException{
        // Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Use driver to navigate to a URL, for example:
        driver.get("https://www.google.com");

        // Close the browser
       
        Thread.sleep(5000); 
        driver.quit();
    }
}

