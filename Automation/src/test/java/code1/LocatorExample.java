package code1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorExample extends Login {
	   String url ="https://www.saucedemo.com/" ;
	   
	   
	   
	   @Test
	      public void TestId() throws InterruptedException {
	    	  
	    	  driver.get(url);
	    	  driver.manage().window().maximize();
	    	  
	  //id
	WebElement search =driver.findElement(By.id("user-name"));
    search.click();
    search.sendKeys("standard_user");
    System.out.println(search.getAttribute("name"));//value of name attribute was printed
    String font = search.getCssValue("font-size");
    System.out.println("Css value"+font);
    
    String color = search.getCssValue("background-color");
    System.out.println("Back-ground"+color);
	Thread.sleep(5000);
	    	  
	    	  
	 //WebElement search2 =driver.findElement(By.id("password"));
    // search2.click();
    // search2.sendKeys("secret_sauce");
	// Thread.sleep(5000);
	 
	 
	// WebElement login =driver.findElement(By.id("login-button"));
   //  login.click();
	
	
	
	
	WebElement text = driver.findElement(By.xpath("//div[contains(text(),'Swag Labs')]"));
	System.out.println(text.getText()); // text =swag labs should be printed
	
	System.out.println(driver.getTitle());
	
	
	
	
	
	
	
     //......................................................//
	 //tag name example 
	         //*[@class="button-1 register-button"]
	 //or/and
	    	//*[@type='button' and @class='button-1 register-button']
	    	//*[@type='button' or @class='button-1 register-button']
	    	  
	   //contains
	    	//*[contains(text(),'Register')]
	    	  
	    //contains and/or
	    	////*[contains(text(),'String')and@id='some-id']
	    	  
	    	  
	    	//start-with()
	    	//*[starts-with(text(),'Welcome')] 
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	      } 

}
