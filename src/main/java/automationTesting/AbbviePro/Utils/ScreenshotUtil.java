package automationTesting.AbbviePro.Utils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {
    
    private WebDriver driver;
    private final String BASE_SCREENSHOT_PATH = "screenshots/navigation";
    private final String folderName;
    
    public ScreenshotUtil(WebDriver driver) {
        this.driver = driver;
        // Create a folder name based on current date and time when the class is instantiated
        this.folderName = new SimpleDateFormat("dd MMM HH.mm").format(new Date());
    }
    
    public String takeScreenshot(String pageName) throws IOException {
        // Path includes the dynamic folder name
        String screenshotPath = BASE_SCREENSHOT_PATH + "/" + folderName;
        
        // Create timestamp for the filename
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String fileName = pageName + "_" + timestamp + ".png";
        
        // Create directory if it doesn't exist
        File directory = new File(screenshotPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        
        // Take screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        // Save screenshot
        File destination = new File(directory.getAbsolutePath() + "/" + fileName);
        FileUtils.copyFile(screenshot, destination);
        
        return destination.getAbsolutePath();
    }
}
