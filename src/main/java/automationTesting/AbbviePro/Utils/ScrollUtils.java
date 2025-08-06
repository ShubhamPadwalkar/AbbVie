package automationTesting.AbbviePro.Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class ScrollUtils {

    /**
     * Scrolls the page to the bottom slowly, handles dynamic content, takes a screenshot at the bottom,
     * and then returns to the top.
     *
     * @param driver         The WebDriver instance.
     * @param scrollIncrement The number of pixels to scroll in each step (e.g., 25, 50).
     * @param delayMillis    The delay in milliseconds between each scroll step to control speed.
     * @param screenshotPath The file path to save the screenshot at the bottom of the page.
     */
    public static void scrollPageToBottomAndBackToTop(WebDriver driver, int scrollIncrement, int delayMillis, String screenshotPath) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        System.out.println("Starting slow scroll to bottom...");

        long lastScrollPosition = -1; // Initialize with a value that ensures the loop starts

        // Loop continuously until the scroll position stops changing
        while (true) {
            // Scroll by a small increment to create the slow effect
            js.executeScript("window.scrollBy(0, arguments[0]);", scrollIncrement);
            
            try {
                // Wait for the slow scroll effect and for content to potentially load
                Thread.sleep(delayMillis); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
                System.err.println("Scrolling interrupted: " + e.getMessage());
                break; // Exit loop if interrupted
            }

            // Get the current vertical scroll position
            long currentScrollPosition = (long) js.executeScript("return window.pageYOffset;");
            
            // If the scroll position hasn't changed, we've reached the bottom
            if (currentScrollPosition == lastScrollPosition) {
                System.out.println("Reached bottom of the page.");
                break;
            }
            
            lastScrollPosition = currentScrollPosition; // Update last position for the next iteration
        }
        
        // Take a screenshot at the bottom of the page
        takeScreenshot(driver, screenshotPath);

        System.out.println("Returning to top of the page...");
        // Scroll back to the top instantly
        js.executeScript("window.scrollTo(0, 0);");
        System.out.println("Returned to top.");
    }
    
    /**
     * Helper method to take a screenshot and save it to a specified path.
     */
    private static void takeScreenshot(WebDriver driver, String path) {
        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File(path));
            System.out.println("Screenshot saved to: " + path);
        } catch (Exception e) {
            System.err.println("Failed to take screenshot: " + e.getMessage());
        }
    }
}
//package automationTesting.AbbviePro.Utils;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import java.io.File;
//import org.apache.commons.io.FileUtils;
//
//public class ScrollUtils {
//
//    /**
//     * Scrolls the page to the bottom slowly, handles dynamic content, takes a screenshot at the bottom,
//     * and then returns to the top.
//     *
//     * @param driver         The WebDriver instance.
//     * @param scrollIncrement The number of pixels to scroll in each step (e.g., 25, 50).
//     * @param delayMillis    The delay in milliseconds between each scroll step to control speed.
//     * @param screenshotPath The file path to save the screenshot at the bottom of the page.
//     */
//    public static void scrollPageToBottomAndBackToTop(WebDriver driver, int scrollIncrement, int delayMillis, String screenshotPath) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        System.out.println("Starting slow scroll to bottom...");
//
//        long lastHeight = (long) js.executeScript("return window.pageYOffset;");
//        long totalPageHeight = (long) js.executeScript("return document.body.scrollHeight;");
//
//        while (true) {
//            // Scroll by a small increment to create the slow effect
//            js.executeScript("window.scrollBy(0, arguments[0]);", scrollIncrement);
//            
//            try {
//                // Wait for the slow scroll effect
//                Thread.sleep(delayMillis);
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt(); 
//                System.err.println("Scrolling interrupted: " + e.getMessage());
//                break;
//            }
//
//            // Get the current scroll position after the scroll
//            long currentScrollPosition = (long) js.executeScript("return window.pageYOffset;");
//            
//            // Check if we have reached the bottom of the page
//            if (currentScrollPosition >= totalPageHeight - driver.manage().window().getSize().getHeight()) {
//                System.out.println("Reached bottom of the page.");
//                break;
//            }
//            
//            // Update total page height in case new content has loaded
//            totalPageHeight = (long) js.executeScript("return document.body.scrollHeight;");
//        }
//        
//        // Take a screenshot at the bottom of the page
//        takeScreenshot(driver, screenshotPath);
//
//        System.out.println("Returning to top of the page...");
//        // Scroll back to the top instantly
//        js.executeScript("window.scrollTo(0, 0);");
//        System.out.println("Returned to top.");
//    }
//    
//    /**
//     * Helper method to take a screenshot and save it to a specified path.
//     */
//    private static void takeScreenshot(WebDriver driver, String path) {
//        try {
//            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(screenshotFile, new File(path));
//            System.out.println("Screenshot saved to: " + path);
//        } catch (Exception e) {
//            System.err.println("Failed to take screenshot: " + e.getMessage());
//        }
//    }
//}
//
