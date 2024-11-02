//video-5
package code1;


import org.openqa.selenium.WindowType;

import org.testng.annotations.Test;

public class Switchtab extends Login {
    
    String url1 = "https://demoqa.com/frames";
    String url2 = "https://hianime.to/";

    @Test
    public void switchBetweenTabs() throws InterruptedException {
        
        // Open the first URL in the initial tab
        driver.get(url1);
        driver.manage().window().maximize();

        // Store the handle of the original tab
        String originalTab = driver.getWindowHandle();
        Thread.sleep(3000);

        // Open a new tab and navigate to the second URL
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(url2);
        String secondTab = driver.getWindowHandle();
        Thread.sleep(3000);

        // Switch back to the first tab
        driver.switchTo().window(originalTab);
        System.out.println("Switched back to the first tab.");
        Thread.sleep(3000);

        // Switch again to the second tab
        driver.switchTo().window(secondTab);
        System.out.println("Switched to the second tab.");
        Thread.sleep(3000);

        // Switch back to the first tab again if needed
        driver.switchTo().window(originalTab);
        System.out.println("Back to the first tab again.");
        Thread.sleep(3000);

        // Close all tabs and quit the browser
        driver.quit();
    }
}
