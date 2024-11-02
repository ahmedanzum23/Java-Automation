//video-4
package code1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover extends Login {

	
	
	
	String Url = "https://www.browserstack.com/guide/mouse-hover-in-selenium" ;
	@Test
	public void mouseHover() throws InterruptedException {
		
		driver.get(Url);
		driver.manage().window().maximize();
		
		
		Actions action = new Actions(driver);
		WebElement Developers = driver.findElement(By.xpath("//button[@id='developers-dd-toggle']"));
		action.moveToElement(Developers).perform();
		Thread.sleep(2000);
		
		
		WebElement developersClick = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/a[1]/span[1]"));
		developersClick.click();
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
