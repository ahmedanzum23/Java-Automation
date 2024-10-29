package code1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertExamples  extends Login {

	
	String Url = "https://demoqa.com/alerts" ;
	
	@Test
	public void alertTest() throws InterruptedException {
		
		driver.get(Url);
		driver.manage().window().maximize();
		
		//use alert method for drop down click
		WebElement alert1= driver.findElement(By.xpath("//button[@id='alertButton']"));
		alert1.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		//alert.accept();   //drop down accept click()
		
		
		
		
		//use alert method for drop down cancel
				WebElement alert2= driver.findElement(By.xpath("//button[@id='confirmButton']"));
				alert2.click();
				Thread.sleep(2000);
				alert.dismiss();   //drop down accept click()
				
				
		
		
				
	       //use alert method for drop down and write something
						WebElement alert3= driver.findElement(By.xpath("//button[@id='promtButton']"));
						alert3.click();
						Thread.sleep(2000);
						alert.sendKeys("hello");   //drop down write something on the blank
						Thread.sleep(2000);
						alert.accept();
		
		
		
	}
	
	
	
	
	
	
	
	
}
