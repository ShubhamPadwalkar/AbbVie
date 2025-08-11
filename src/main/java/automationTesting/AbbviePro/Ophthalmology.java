package automationTesting.AbbviePro;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import automationTesting.AbbviePro.Utils.ReportUtil;
import automationTesting.AbbviePro.Utils.WindowSession;

public class Ophthalmology extends BasePage {

	public Ophthalmology(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//div[@class='button-link aem-GridColumn aem-GridColumn--default--12']/a)[22]")
	private WebElement ophthalmologyButton;
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[1]")
	private WebElement abbvieCareButton;
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[2]")
	private WebElement learnMoreButton;
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[3]")
	private WebElement toTheDownloadAreaButtonForPatient;
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[4]")
	private WebElement toTheDownloadAreaButtonForPractitioners;  
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[5]")
	private WebElement contactUsButton;

	public Ophthalmology clickOnOphthalmologyButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ophthalmologyButton);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ophthalmologyButton));
		ophthalmologyButton.click();
		return this;
	}
	   public Ophthalmology clickOnAbbvieCareButton() throws IOException {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        js.executeScript("arguments[0].scrollIntoView(true);", abbvieCareButton);
	        WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(abbvieCareButton));
	        js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton); // Opens in new tab
	        clickableButton.click();

	        try (WindowSession session = new WindowSession(driver, true)) {
	            session.switchToNewWindow();
	            String screenshotPath = screenshotUtil.takeScreenshot("AbbvieCarePageAfterClick");
	            ReportUtil.attachScreenshot(screenshotPath);
	            
				Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbvie-care.de/",
				        "Incorrect URL after clicking AbbVie Care button");
	        }
	        return this;
	    }

	    public Ophthalmology clickOnLearnMoreButton() throws IOException {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        js.executeScript("arguments[0].scrollIntoView(true);", learnMoreButton);
	        WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(learnMoreButton));
	        js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton); // Opens in new tab
	        clickableButton.click();
	        try (WindowSession session = new WindowSession(driver, true)) {
	            session.switchToNewWindow();
	            String screenshotPath = screenshotUtil.takeScreenshot("LearnMorePageAfterClick");
	            ReportUtil.attachScreenshot(screenshotPath);
	            
				Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbvie-care.de/amsler/",
				        "Incorrect URL after clicking Learn More button");
	        }
	        return this;
	    }

	    public Ophthalmology clickOnToTheDownloadAreaButtonForPatient() throws IOException {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        js.executeScript("arguments[0].scrollIntoView(true);", toTheDownloadAreaButtonForPatient);
	        WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(toTheDownloadAreaButtonForPatient));
	        js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton); // Opens in new tab
	        clickableButton.click();
	        try (WindowSession session = new WindowSession(driver, true)) {
	            session.switchToNewWindow();
	            String screenshotPath = screenshotUtil.takeScreenshot("DownloadAreaPatientPageAfterClick");
	            ReportUtil.attachScreenshot(screenshotPath);
	            
				Assert.assertEquals(driver.getCurrentUrl(),
						"https://www.abbviepro.com/de/de/therapiegebiete/augenheilkunde/ophthalmologie/download-patientinnen.html",
				         "Incorrect URL after clicking Download Area (Patient) button");
	        }
	        return this;
	    }

	    public Ophthalmology clickOnToTheDownloadAreaButtonForPractitioners() throws IOException {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        js.executeScript("arguments[0].scrollIntoView(true);", toTheDownloadAreaButtonForPractitioners);
	        WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(toTheDownloadAreaButtonForPractitioners));
	        js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton); // Opens in new tab
	        clickableButton.click();
	        try (WindowSession session = new WindowSession(driver, true)) {
	            session.switchToNewWindow();
	            String screenshotPath = screenshotUtil.takeScreenshot("DownloadAreaPractitionersPageAfterClick");
	            ReportUtil.attachScreenshot(screenshotPath);
	            
				Assert.assertEquals(driver.getCurrentUrl(),
						"https://www.abbviepro.com/de/de/therapiegebiete/augenheilkunde/ophthalmologie/download-behandlerinnen.html",
				        "Incorrect URL after clicking Download Area (Practitioners) button");
	        }
	        return this;
	    }

	    public Ophthalmology clickOnContactUsButton() throws IOException {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        js.executeScript("arguments[0].scrollIntoView(true);", contactUsButton);
	        WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(contactUsButton));
	        js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton); // Opens in new tab
	        clickableButton.click();
	        try (WindowSession session = new WindowSession(driver, true)) {
	            session.switchToNewWindow();
	            String screenshotPath = screenshotUtil.takeScreenshot("ContactUsPageAfterClick");
	            ReportUtil.attachScreenshot(screenshotPath);
				Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/kontakt-und-service.html",
				        "Incorrect URL after clicking Contact Us button");
	        }
	        return this;
	    }
}
