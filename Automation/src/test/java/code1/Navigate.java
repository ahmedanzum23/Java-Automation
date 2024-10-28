//video-03

package code1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
 
public class Navigate extends Login {
	
	
	String Url ="https://www.daraz.com.bd/";
	@Test
	 public void navigatetest() throws InterruptedException {
		 
		 
		 driver.get(Url);
		 driver.manage().window().maximize();
		 
		 
		 
		 WebElement becomeSeller = driver.findElement(By.xpath("//a[contains(text(),'Become a Seller')]"));
		 becomeSeller.click();
		 Thread.sleep(1000);
		 //navigate back
		 driver.navigate().back();
		 Thread.sleep(1000);
		 
		 //navigate forward
		 
		 driver.navigate().forward();
		 Thread.sleep(1000);
		 
		 //refresh the webpage
		 
		 
		 driver.navigate().refresh();
		 Thread.sleep(1000);
		 
		 //need to navigated to another websites
		 
		 driver.navigate().to("https://www.youtube.com/");
		 Thread.sleep(1000);
		 
		 
		 
		 
		 
	 }

}
