package automationTesting.AbbviePro;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import automationTesting.AbbviePro.Utils.ScrollUtils;
import automationTesting.AbbviePro.Utils.WindowSession;

public class Dermatologie extends BasePage {

	public Dermatologie(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//div[@class='button-link aem-GridColumn aem-GridColumn--default--12']/a)[16]")
	private WebElement dermatologieButton;

	@FindBy(xpath = "//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-white btn--locked    text-left']")
	private WebElement learnMoreButton;

	@FindBy(xpath = "//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-white     text-left']")
	private WebElement streamNowButton;
	
	// -------------------------
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[3]")
	private WebElement firstCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[4]")
	private WebElement secondCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[5]")
	private WebElement thirdCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[6]")
	private WebElement fourthCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[7]")
	private WebElement fifthCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[8]")
	private WebElement sixthCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[9]")
	private WebElement seventhCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[10]")
	private WebElement eighthCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[11]")
	private WebElement ninethCardReadMoreButton;


	// -------------------------

	@FindBy(xpath = "//button[@class='dmpro-v2 btn btn-primary btn-with-icon']")
	private WebElement cardLoadMoreButton;

	public Dermatologie clickOnDermatologieButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", dermatologieButton);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(dermatologieButton));
		dermatologieButton.click();

		wait.until(ExpectedConditions.urlContains("dermatologie.html"));
		Assert.assertTrue(driver.getTitle().contains("Dermatologie | AbbVie Pro Deutschland"),
				"Failed to navigate to Dermatologie page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/dermatologie.html",
				"Incorrect URL after clicking Dermatologie button");
		return this;
	}

	public Dermatologie clickLearnMoreButton() {
		learnMoreButton.click();
		System.out.println(driver.getCurrentUrl() + " - " + driver.getTitle());
		// Assert that we're on the expected page after clicking Learn More
//		Assert.assertTrue(driver.getTitle().contains("Register"), "Failed to navigate to Register page");
//		Assert.assertEquals(driver.getCurrentUrl(), "https://id.abbvie.com/Register?AID=AID-0000021&locale=de-DE",
//				"Incorrect URL after clicking Learn More button");
		return this;
	}

	public Dermatologie clickStreamNowButton() {
		streamNowButton.click();
		System.out.println(driver.getCurrentUrl() + " - " + driver.getTitle());
		return this;
	}
	// -------------------------

	
	public Dermatologie clickOnFirstCardReadMoreButton() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
	    // Scroll the button into view
	    js.executeScript("arguments[0].scrollIntoView(true);", firstCardReadMoreButton);

	    // Wait for the button to be clickable
	    WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(firstCardReadMoreButton));
	    
	    // Use JavaScript to open the link in a new tab
	    js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
	    clickableButton.click();

	    // Use the WindowSession utility to switch to the new tab, capture details, and switch back
	    try (WindowSession session = new WindowSession(driver, true)) {
	        session.switchToNewWindow();
	        System.out.println("New Tab Title: " + driver.getTitle());
	        System.out.println("New Tab URL: " + driver.getCurrentUrl());
	    }

	    System.out.println("1 --> "+driver.getCurrentUrl() + " - " + driver.getTitle());
	    return this;
	}
	
	public Dermatologie clickOnSecondCardReadMoreButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		js.executeScript("arguments[0].scrollIntoView(true);", secondCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(secondCardReadMoreButton));
		
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			System.out.println("New Tab Title: " + driver.getTitle());
			System.out.println("New Tab URL: " + driver.getCurrentUrl());
		}

		System.out.println("Returned to Parent Page: " + driver.getCurrentUrl() + " - " + driver.getTitle());
		return this;
	}

	public Dermatologie clickOnThirdCardReadMoreButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		js.executeScript("arguments[0].scrollIntoView(true);", thirdCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(thirdCardReadMoreButton));
		
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			System.out.println("New Tab Title: " + driver.getTitle());
			System.out.println("New Tab URL: " + driver.getCurrentUrl());
		}

		System.out.println("Returned to Parent Page: " + driver.getCurrentUrl() + " - " + driver.getTitle());
		return this;
	}

	public Dermatologie clickOnFourthCardReadMoreButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		js.executeScript("arguments[0].scrollIntoView(true);", fourthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(fourthCardReadMoreButton));
		
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			System.out.println("New Tab Title: " + driver.getTitle());
			System.out.println("New Tab URL: " + driver.getCurrentUrl());
		}

		System.out.println("Returned to Parent Page: " + driver.getCurrentUrl() + " - " + driver.getTitle());
		return this;
	}

	public Dermatologie clickOnFifthCardReadMoreButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		js.executeScript("arguments[0].scrollIntoView(true);", fifthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(fifthCardReadMoreButton));
		
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			System.out.println("New Tab Title: " + driver.getTitle());
			System.out.println("New Tab URL: " + driver.getCurrentUrl());
		}

		System.out.println("Returned to Parent Page: " + driver.getCurrentUrl() + " - " + driver.getTitle());
		return this;
	}

	public Dermatologie clickOnSixthCardReadMoreButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		js.executeScript("arguments[0].scrollIntoView(true);", sixthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(sixthCardReadMoreButton));
		
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			System.out.println("New Tab Title: " + driver.getTitle());
			System.out.println("New Tab URL: " + driver.getCurrentUrl());
		}

		System.out.println("Returned to Parent Page: " + driver.getCurrentUrl() + " - " + driver.getTitle());
		return this;
	}

	public Dermatologie clickOnSeventhCardReadMoreButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		js.executeScript("arguments[0].scrollIntoView(true);", seventhCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(seventhCardReadMoreButton));
		
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			System.out.println("New Tab Title: " + driver.getTitle());
			System.out.println("New Tab URL: " + driver.getCurrentUrl());
		}

		System.out.println("Returned to Parent Page: " + driver.getCurrentUrl() + " - " + driver.getTitle());
		return this;
	}

	public Dermatologie clickOnEighthCardReadMoreButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		js.executeScript("arguments[0].scrollIntoView(true);", eighthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(eighthCardReadMoreButton));
		
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			System.out.println("New Tab Title: " + driver.getTitle());
			System.out.println("New Tab URL: " + driver.getCurrentUrl());
		}

		System.out.println("Returned to Parent Page: " + driver.getCurrentUrl() + " - " + driver.getTitle());
		return this;
	}

	public Dermatologie clickOnNinethCardReadMoreButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		js.executeScript("arguments[0].scrollIntoView(true);", ninethCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(ninethCardReadMoreButton));
		
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			System.out.println("New Tab Title: " + driver.getTitle());
			System.out.println("New Tab URL: " + driver.getCurrentUrl());
		}

		System.out.println("Returned to Parent Page: " + driver.getCurrentUrl() + " - " + driver.getTitle());
		return this;
	}
	
	//-------------------------

	public Dermatologie clickCardLoadMoreButton() {
		// Use JavascriptExecutor to scroll the element into view first
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", cardLoadMoreButton);

		// Create a WebDriverWait instance with a 10-second timeout
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait for the element to be visible (or clickable)
		WebElement clickableCardLoadMoreButton = wait
				.until(ExpectedConditions.elementToBeClickable(cardLoadMoreButton));

		// Use JavascriptExecutor to click the element, bypassing any overlaps
		js.executeScript("arguments[0].click();", clickableCardLoadMoreButton);

		System.out.println(driver.getCurrentUrl() + " - " + driver.getTitle());
		return this;
	}

	public Dermatologie clickOnCardLoadMoreButton() {
		cardLoadMoreButton.click();
		return this;
	}
	
	public Dermatologie scrollToPageTop() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
        System.out.println("Page scrolled to the top.");
        return this;
    }
}
