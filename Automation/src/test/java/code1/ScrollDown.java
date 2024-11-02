
//video-5
package code1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollDown extends Login{
	
	

    String Url = "https://www.daraz.com.bd/#hp-categories";

    @Test
    public void mouseHover() throws InterruptedException {

        driver.get(Url);
        driver.manage().window().maximize();
        
        
     // Initialize JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        
        
    //specific position  
        
        
        WebElement specificElement = driver.findElement(By.xpath("//body/section[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/a[1]/div[1]/img[1]"));
        js.executeScript("arguments[0].scrollIntoView(true);", specificElement);
        Thread.sleep(2000);
        
        
        
   //top
        
        js.executeScript("window.scrollTo(0, 0)");
        Thread.sleep(2000);

      
        
   //down
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);

        
        
}
}
