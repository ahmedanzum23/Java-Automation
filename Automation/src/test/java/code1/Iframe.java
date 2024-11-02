//video-5


package code1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframe extends Login {
	
	

	String Url = "https://demoqa.com/frames";

    @Test
    public void mouseHover() throws InterruptedException {

        driver.get(Url);
        driver.manage().window().maximize();
        
        // Find all iframe elements
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        // Print the number of iframes found
        System.out.println("Total number of iframes on the page: " + iframes.size());
        
        
        driver.switchTo().frame("frame1");   //for iframe id or name print
        
        
        WebElement text = driver.findElement(By.id("sampleHeading"));
        System.out.println(text.getText());
        

        // Switch back to the main content
        driver.switchTo().defaultContent();
        
        
        WebElement text2 = driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe page There are 2 Iframes in this pag')]"));
        System.out.println(text2.getText());
        
        
        
        
        
	
	
    }
}
