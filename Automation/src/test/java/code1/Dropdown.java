
//video-4
package code1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown extends Login {
	
	

    String Url = "https://app.endtest.io/guides/docs/how-to-test-dropdowns/";

    @Test
    public void mouseHover() throws InterruptedException {

        driver.get(Url);
        driver.manage().window().maximize();

        // Locate the <select> element by its ID
        WebElement options = driver.findElement(By.id("pets"));
        Select select = new Select(options);

        // Select by index
        select.selectByIndex(1);  // This will select "Dog"
        Thread.sleep(300);
        
        
        //text
        
     // Select by visible text
        select.selectByVisibleText("Rabbit");  // This will select "Rabbit"
        Thread.sleep(300);
    }
}
