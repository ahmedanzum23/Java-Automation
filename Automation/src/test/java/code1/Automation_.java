package code1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automation_ extends Login{

	 String url = "https://www.selenium.dev/documentation/webdriver/" ;
	 
	 @Test
	 
	 
	@BeforeTest
	public void oprnUrl() throws InterruptedException {
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(10000);  //1000ms=1second, this count as a mili second.
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); 
		driver.findElement(By.xpath("//span[contains(text(),'Blog')]")).click();
		Thread.sleep(10000);
		driver.quit();
	}
	
}