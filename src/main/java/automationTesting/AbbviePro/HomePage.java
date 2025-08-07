package automationTesting.AbbviePro;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import automationTesting.AbbviePro.Utils.ReportUtil;
import automationTesting.AbbviePro.Utils.WindowSession;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[2]")
	private WebElement registerButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon btn--white text-secondary-color     text-left'])[7]")
	private WebElement learnMoreButton;

	@FindBy(xpath = "//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-white     text-left']")
	private WebElement productsLearnMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-secondary-color     text-left'])[1]")
	private WebElement therapeuticAreasButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[1]")
	private WebElement contactButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon btn--white text-secondary-color     text-left'])[9]")
	private WebElement secondRegisterbutton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-secondary-color     text-left'])[2]")
	private WebElement secondContactbutton;
	
	@FindBy(xpath = "//button[@class='back-to-top-button show']")
	private WebElement backToTopButton;
	

//-----

	public HomePage clickOnRegisterButton() throws IOException {
		registerButton.click();
		String screenshotPath = screenshotUtil.takeScreenshot("RegisterPageAfterClick");
		ReportUtil.attachScreenshot(screenshotPath);
		Assert.assertTrue(driver.getTitle().contains("Register"), "Failed to navigate to Register Page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://id.abbvie.com/Register?AID=AID-0000021&locale=de-DE",
				"Incorrect URL after clicking Register Button");
		return this;
	}

	public HomePage clickOnLearnMoreButton() throws IOException {
		learnMoreButton.click();
		String screenshotPath = screenshotUtil.takeScreenshot("RegisterPageAfterClick");
		ReportUtil.attachScreenshot(screenshotPath);
		Assert.assertTrue(driver.getTitle().contains("Register"), "Failed to navigate to Register Page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://id.abbvie.com/Register?AID=AID-0000021&locale=de-DE",
				"Incorrect URL after clicking Register Button");
		return this;
	}

	public HomePage productslearnButton() {
		productsLearnMoreButton.click();
		Assert.assertTrue(driver.getTitle().contains("Produkte | AbbVie Pro Deutschland"),
				"Failed to navigate to Products page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/produkte.html",
				"Incorrect URL after clicking Products Learn More button");
		return this;
	}

	public HomePage therapeuticAreasButtonMethod() {
		therapeuticAreasButton.click();
		Assert.assertTrue(driver.getTitle().contains("Therapiegebiete | AbbVie Pro Deutschland"),
				"Failed to navigate to Therapiegebiete page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/therapiegebiete.html",
				"Incorrect URL after clicking Therapiegebiete button");
		return this;
	}

	public HomePage contactButtonMethod() {
		contactButton.click();
		// Assert that we're on the expected page after clicking Contact button
		Assert.assertTrue(driver.getTitle().contains("Service und Kontakt | AbbVie Pro Deutschland"),
				"Failed to navigate to Contact page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/kontakt-und-service.html",
				"Incorrect URL after clicking Contact button");
		return this;
	}
	
	public HomePage secondRegisterButtonMethod() {
	    String originalWindow = driver.getWindowHandle();
	    
	    try (WindowSession windowSession = new WindowSession(driver, false)) {
	        secondRegisterbutton.click();
	        windowSession.switchToNewWindow();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(driver -> driver.getTitle().contains("Register"));
	        Assert.assertTrue(driver.getTitle().contains("Register"),
	                "Failed to navigate to expected page after clicking Register button");
	        Assert.assertEquals(driver.getCurrentUrl(), "https://id.abbvie.com/Register?AID=AID-0000021&locale=de-DE",
	                "Incorrect URL after clicking Register button");
	        driver.close();
	    } 
	    finally {
	        driver.switchTo().window(originalWindow);
	    }
	    return this;
	}

	public HomePage secondContactUsButton() {
		secondContactbutton.click();
		Assert.assertTrue(driver.getTitle().contains("Service und Kontakt | AbbVie Pro Deutschland"),
				"Failed to navigate to Contact page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/kontakt-und-service.html",
				"Incorrect URL after clicking Contact button");
		return this;
	}
	
	public HomePage clickOnBackToTopButton() {
		backToTopButton.click();
		return this;
		
		
	}

}
