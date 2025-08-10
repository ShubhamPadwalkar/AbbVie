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

public class Neurology extends BasePage {

	public Neurology(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//div[@class='button-link aem-GridColumn aem-GridColumn--default--12']/a)[20]")
	private WebElement neurologyButton;

	@FindBy(xpath = "//a[@class='carousel-control-next']")
	private WebElement carouselChevronIcon;

	@FindBy(xpath = "//button[@class='dmpro-v2 btn btn-primary btn-with-icon']")
	private WebElement cardLoadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[3]")
	private WebElement EAN_CongressReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[4]")
	private WebElement S2K_GuidelineReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[5]")
	private WebElement eventsInNeurologyReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[5]")
	private WebElement parkinsonDiseaseReadMoreButton;
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[1]")
	private WebElement manage_PD_AccessToolButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[10]")
	private WebElement externalLinkmanage_PD_AccessToolButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[2]")
	private WebElement informationRequestForFreeButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[3]")
	private WebElement abbvieCareButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[4]")
	private WebElement PARKOUR_ToTheCurrentIssueButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[5]")
	private WebElement parkinsonLearnMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[6]")
	private WebElement abbvieNetworking_PHP_Button;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[7]")
	private WebElement parkinsonNetworkYoutubeVideoButton;
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[10]")
	private WebElement ExternalLinkparkinsonNetworkYoutubeVideoButton;
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[8]")
	private WebElement parkinsonNetworkGermany_PND_Button;
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[10]")
	private WebElement externalLinkparkinsonNetworkGermany_PND_Button;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[9]")
	private WebElement contactUsButton;

	public Neurology clickOnNeurologyButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", neurologyButton);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(neurologyButton));
		neurologyButton.click();
		return this;
	}

	public Neurology clickOnCarouselChevronIcon() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(carouselChevronIcon));
		carouselChevronIcon.click();
		return this;
	}

	public Neurology clickCardLoadMoreButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", cardLoadMoreButton);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement clickableCardLoadMoreButton = wait
				.until(ExpectedConditions.elementToBeClickable(cardLoadMoreButton));
		js.executeScript("arguments[0].click();", clickableCardLoadMoreButton);
		return this;
	}

	public Neurology clickOnEAN_CongressReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", EAN_CongressReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(EAN_CongressReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("EAN_CongressReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getTitle(), "EAN Kongressupdate 2025 | AbbVie Pro Deutschland",
					"Incorrect URL after clicking EAN Congress Read More Button");
		}
		return this;
	}

	public Neurology clickOnS2K_GuidelineReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", S2K_GuidelineReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(S2K_GuidelineReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("S2K_GuidelineReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getTitle(), "Aktualisierungen der S2k-Leitlinie | AbbVie Pro Deutschland",
					"Incorrect URL after clicking S2K_Guideline Read More Button");
		}
		return this;
	}

	public Neurology clickOnEventsInNeurologyReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", eventsInNeurologyReadMoreButton);
		WebElement clickableButton = wait
				.until(ExpectedConditions.elementToBeClickable(eventsInNeurologyReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("eventsInNeurologyReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getTitle(), "Kongresse & Events Neurologie | AbbVie Pro Deutschland",
					"Incorrect URL after clicking Events In Neurology Read More Button");
		}
		return this;
	}

	public Neurology clickOnParkinsonDiseaseReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", parkinsonDiseaseReadMoreButton);
		WebElement clickableButton = wait
				.until(ExpectedConditions.elementToBeClickable(parkinsonDiseaseReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("parkinsonDiseaseReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(driver.getTitle().contains("Kongresse & Events Neurologie | AbbVie Pro Deutschland"),
					"Failed to navigate to Parkinson Disease page." + driver.getTitle());
		}
		return this;
	}

	public Neurology clickOnManage_PD_AccessToolButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", manage_PD_AccessToolButton);
		WebElement clickableIcon = wait.until(ExpectedConditions.elementToBeClickable(manage_PD_AccessToolButton));
		clickableIcon.click();
		WebElement clickableExternalLink = wait
				.until(ExpectedConditions.elementToBeClickable(externalLinkmanage_PD_AccessToolButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableExternalLink); // Ensure it opens in
		clickableExternalLink.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow(); 
			String screenshotPath = screenshotUtil.takeScreenshot("InstagramPageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.managepd.eu/DE/index",
					"Incorrect URL after clicking Learn More Button");
		}
		return this;
	}

	public Neurology clickOnInformationRequestForFreeButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", informationRequestForFreeButton);
		WebElement clickableButton = wait
				.until(ExpectedConditions.elementToBeClickable(informationRequestForFreeButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("informationRequestForFreeButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbvie-care.de/parkinson-check/infomappe/",
					"Incorrect URL after clicking Learn More Button");
		}
		return this;
	}

	public Neurology clickOnAbbvieCareButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", abbvieCareButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(abbvieCareButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("abbvieCareButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getTitle(), "Was ist Parkinson - Erkrankungen des Nervensystems",
					"Incorrect Page after clicking Abbvie Care Button");
		}
		return this;
	}

	public Neurology clickOnPARKOUR_ToTheCurrentIssueButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", PARKOUR_ToTheCurrentIssueButton);
		WebElement clickableButton = wait
				.until(ExpectedConditions.elementToBeClickable(PARKOUR_ToTheCurrentIssueButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("PARKOUR_ToTheCurrentIssueButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getTitle(), "Parkour Magazin",
					"Incorrect Page after clicking Parkour Magazin Button");
		}
		return this;
	}

	public Neurology clickOnParkinsonLearnMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", parkinsonLearnMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(parkinsonLearnMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("parkinsonLearnMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getTitle(), "Parkinson-Check",
					"Incorrect Page after clicking Parkinson Learn More Button");
		}
		return this;
	}

	public Neurology clickOnAbbvieNetworking_PHP_Button() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", abbvieNetworking_PHP_Button);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(abbvieNetworking_PHP_Button));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("abbvieNetworking_PHP_Button");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getTitle(), "Parkinsonnetze+ | AbbVie Pro Deutschland",
					"Incorrect Page after clicking Parkinson Learn More Button");
		}
		return this;
	}
	
	public Neurology clickOnParkinsonNetworkYoutubeVideoButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", parkinsonNetworkYoutubeVideoButton);
		WebElement clickableIcon = wait.until(ExpectedConditions.elementToBeClickable(parkinsonNetworkYoutubeVideoButton));
		clickableIcon.click();
		WebElement clickableExternalLink = wait
				.until(ExpectedConditions.elementToBeClickable(ExternalLinkparkinsonNetworkYoutubeVideoButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableExternalLink); // Ensure it opens in
		clickableExternalLink.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow(); 
			String screenshotPath = screenshotUtil.takeScreenshot("parkinsonNetworkYoutubeVideoButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.youtube.com/watch?v=c2ykh9Xef0Y",
					"Incorrect Page after clicking Parkinson Network Youtube Video");
		}
		return this;
	}

	public Neurology clickOnParkinsonNetworkGermany_PND_Button() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", parkinsonNetworkGermany_PND_Button);
		WebElement clickableIcon = wait.until(ExpectedConditions.elementToBeClickable(parkinsonNetworkGermany_PND_Button));
		clickableIcon.click();
		WebElement clickableExternalLink = wait
				.until(ExpectedConditions.elementToBeClickable(externalLinkparkinsonNetworkGermany_PND_Button));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableExternalLink); // Ensure it opens in
		clickableExternalLink.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow(); 
			String screenshotPath = screenshotUtil.takeScreenshot("parkinsonNetworkGermany_PND_Button");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getTitle(), "Parkinson Netzwerke Deutschland e.V.",
					"Incorrect Page after clicking Parkinson Learn More Button");
		}
		return this;
	}

	public Neurology clickOnContactUsButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", contactUsButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(contactUsButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("neurologyContactUsButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getTitle(), "Service und Kontakt | AbbVie Pro Deutschland",
					"Incorrect Page after clicking Parkinson Learn More Button");
		}
		return this;
	}
}
