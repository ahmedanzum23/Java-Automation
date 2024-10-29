package code1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CopyPaste extends Login {

	String Url = "https://demoqa.com/automation-practice-form" ;
	@Test
	public void mouseHover() throws InterruptedException {
		
		driver.get(Url);
		driver.manage().window().maximize();
		
	
	Actions action = new Actions(driver);
	 WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
	 firstname.sendKeys("Ahnaf Ahmed Anzum");
	Thread.sleep(2000);
	
	
	
	//select
	
	
	action.keyDown(Keys.CONTROL);
	action.sendKeys("a");
	action.keyUp(Keys.CONTROL);
	action.build().perform();
	
	
	//copy
	
	action.keyDown(Keys.CONTROL);
	action.sendKeys("c");
	action.keyUp(Keys.CONTROL);
	action.build().perform();
	
	
	
	//Tab
	action.keyDown(Keys.TAB);
	action.build().perform();
	
	
	
	//paste
	
	//copy
	
	action.keyDown(Keys.CONTROL);
	action.sendKeys("v");
	action.keyUp(Keys.CONTROL);
	action.build().perform();
	
	
	
	
	
	
	
	
	
	
	
}
}