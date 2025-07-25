package automationTesting.AbbviePro;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import automationTesting.AbbviePro.Utils.WindowSession;

public class HomePage extends BasePage {

	@FindBy(xpath = "//select[@id='country--2058528217']/option[text()='Germany']")
	private WebElement languageDropdown;

	@FindBy(xpath = "//button[@class='btn btn-hcp']")
	private WebElement clickOnContinueButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[2]")
	private WebElement registerButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon btn--white text-secondary-color     text-left'])[7]")
	private WebElement learnMoreButton;

	@FindBy(xpath = "//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-white     text-left']")
	private WebElement productsLearnMoreButtonField;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-secondary-color     text-left'])[1]")
	private WebElement therapeuticAreasButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[1]")
	private WebElement contactButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon btn--white text-secondary-color     text-left'])[9]")
	private WebElement secondRegisterbutton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-secondary-color     text-left'])[2]")
	private WebElement signUpbutton;

	BasePage basePage = new BasePage(driver);

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public HomePage navigateTo() throws Exception {
		driver.get(PAGE_URL);
		driver.manage().window().maximize();
		// basePage.allure_attachment("pass", driver);
		// Assert that we're on the expected URL
		Assert.assertEquals(driver.getCurrentUrl(), PAGE_URL, "Navigation to homepage failed");
		return this;
	}

	public HomePage selectCountry() throws Exception {
		languageDropdown.click();
		// basePage.allure_attachment("pass", driver);
		return this;
	}

	public HomePage clickingOnContinueButton() throws Exception {
		clickOnContinueButton.click();
		// basePage.allure_attachment("pass", driver);
		return this;
	}

	public HomePage acceptHomePageCookies() {
		acceptCookies();
		return this;
	}

	public HomePage clickLearnMoreButton() {
		learnMoreButton.click();
		// Assert that we're on the expected page after clicking Learn More
		Assert.assertTrue(driver.getTitle().contains("Register"), "Failed to navigate to Register page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://id.abbvie.com/Register?AID=AID-0000021&locale=de-DE",
				"Incorrect URL after clicking Learn More button");
		return this;
	}

	public HomePage productslearnButton() {
		productsLearnMoreButtonField.click();
		// Assert that we're on the expected page after clicking Products Learn More
		Assert.assertTrue(driver.getTitle().contains("Produkte | AbbVie Pro Deutschland"),
				"Failed to navigate to Products page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/produkte.html",
				"Incorrect URL after clicking Products Learn More button");
		return this;
	}

	public HomePage therapeuticAreasButtonMethod() {
		therapeuticAreasButton.click();
		return this;
	}

	public HomePage contactButtonMethod() {
		contactButton.click();
		// Assert that we're on the expected page after clicking Contact button
//		 Assert.assertTrue(driver.getTitle().contains("Service und Kontakt | AbbViePro Deutschland"),
//		 "Failed to navigate to Contact page");
//		 Assert.assertEquals(driver.getCurrentUrl(),
//		 "https://www.abbviepro.com/de/de/kontakt-und-service.html",
//		 "Incorrect URL after clicking Contact button");
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
	    } finally {
	        driver.switchTo().window(originalWindow);
	    }
	    return this;
	}


	public HomePage signupButtonMethod() {
		signUpbutton.click();
		Assert.assertTrue(driver.getTitle().contains("Service und Kontakt | AbbVie Pro Deutschland"),
				"Failed to navigate to Contact page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/kontakt-und-service.html",
				"Incorrect URL after clicking Contact button");
		return this;

	}

}
