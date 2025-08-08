package automationTesting.AbbviePro;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import automationTesting.AbbviePro.Utils.ReportUtil;
import automationTesting.AbbviePro.Utils.WindowSession;

public class Rheumatologie extends BasePage {

	public Rheumatologie(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//div[@class='button-link aem-GridColumn aem-GridColumn--default--12']/a)[18]")
	private WebElement rheumatologieButton;

	@FindBy(xpath = "//button[@class='content-carousel__action-icon carousel-control-next-icon next-prev-sm']")
	private WebElement carouselChevronIcon;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[1]")
	private WebElement conferencAndEventsLearnMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[2]")
	private WebElement careTopicsLearnMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[3]")
	private WebElement exchangePlatformLearnMoreButton;

	@FindBy(xpath = "//button[@class='dmpro-v2 btn btn-primary btn-with-icon']")
	private WebElement cardLoadMoreButton;
	// ------

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
	private WebElement ninthCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[12]")
	private WebElement tenthCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[13]")
	private WebElement eleventhCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[14]")
	private WebElement twelfthCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[15]")
	private WebElement thirteenthCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[16]")
	private WebElement fourteenthCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[17]")
	private WebElement fifteenthCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[18]")
	private WebElement sixteenthCardReadMoreButton;
	// ------

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[4]")
	private WebElement podcastButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[5]")
	private WebElement abbvieCareButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[6]")
	private WebElement commitmentLearnMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[7]")
	private WebElement contactUsButton;

	// ------
	public Rheumatologie clickOnRheumatologieButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", rheumatologieButton);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(rheumatologieButton));
		rheumatologieButton.click();
		return this;
	}

	public Rheumatologie clickOncarouselChevronIcon() {
		carouselChevronIcon.click();
		return this;
	}

	public Rheumatologie clickOnConferencAndEventsLearnMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", conferencAndEventsLearnMoreButton);
		WebElement clickableButton = wait
				.until(ExpectedConditions.elementToBeClickable(conferencAndEventsLearnMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("conferencAndEventsLearnMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie/kongresse-und-events.html",
					"Incorrect URL after clicking Conferenc And Events Learn More Button");
		}
		return this;
	}

	public Rheumatologie clickOnCareTopicsLearnMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", careTopicsLearnMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(careTopicsLearnMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("careTopicsLearnMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(
					driver.getTitle().contains("Score-Rechner und Versorgungsthemen | AbbVie Pro Deutschland"),
					"Failed to navigate to Care Topics");
		}
		return this;
	}

	public Rheumatologie clickOnExchangePlatformLearnMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", exchangePlatformLearnMoreButton);
		WebElement clickableButton = wait
				.until(ExpectedConditions.elementToBeClickable(exchangePlatformLearnMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("exchangePlatformLearnMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(driver.getTitle().contains("Austauschplattform und Karriere | AbbVie Pro Deutschland"),
					"Failed to navigate to Exchange Platform");
		}
		return this;
	}

	public Rheumatologie clickCardLoadMoreButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", cardLoadMoreButton);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement clickableCardLoadMoreButton = wait
				.until(ExpectedConditions.elementToBeClickable(cardLoadMoreButton));
		js.executeScript("arguments[0].click();", clickableCardLoadMoreButton);
		return this;
	}

	public Rheumatologie clickOnFirstCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", firstCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(firstCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("firstCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie/artikel/offen/congress-shorts-rheumapreg-2025.html",
					"Incorrect URL after clicking First Card Read More Button");
		}
		return this;
	}

//	public Rheumatologie clickOnSecondCardReadMoreButton() throws IOException {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		js.executeScript("arguments[0].scrollIntoView(true);", secondCardReadMoreButton);
//		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(secondCardReadMoreButton));
//		js.executeScript("arguments[0].click();", clickableButton);
//		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
//		clickableButton.click();
//		try (WindowSession session = new WindowSession(driver, true)) {
//			session.switchToNewWindow();
//			System.out.println("SecondCardReadMoreButton Url : " + driver.getCurrentUrl());
//			String screenshotPath = screenshotUtil.takeScreenshot("secondCardReadMoreButton");
//			ReportUtil.attachScreenshot(screenshotPath);
//			// IMPORTANT: Update this URL with the actual expected URL for the second card
////			Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/rheumatologie/card-2-url.html",
////					"Incorrect URL after clicking Second Card Read More Button");
//		}
//		return this;
//	}

	public Rheumatologie clickOnThirdCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", thirdCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(thirdCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("thirdCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie/artikel/offen/patientenversorgung-neu-denken.html",
					"Incorrect URL after clicking Third Card Read More Button");
		}
		return this;
	}

	public Rheumatologie clickOnFourthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", fourthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(fourthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("fourthCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie/artikel/offen/rheuma-update-2025.html",
					"Incorrect URL after clicking Fourth Card Read More Button");
		}
		return this;
	}

	public Rheumatologie clickOnFifthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", fifthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(fifthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("fifthCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie/artikel/offen/docxchange-live-2025.html",
					"Incorrect URL after clicking Fifth Card Read More Button");
		}
		return this;
	}

	public Rheumatologie clickOnSixthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", sixthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(sixthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("sixthCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie/artikel/offen/docxchange.html",
					"Incorrect URL after clicking Sixth Card Read More Button");
		}
		return this;
	}

	public Rheumatologie clickOnSeventhCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", seventhCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(seventhCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("seventhCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie/artikel/offen/dgrh-2024-zusammenfassung-prof-krueger.html",
					"Incorrect URL after clicking Seventh Card Read More Button");
		}
		return this;
	}

	public Rheumatologie clickOnEighthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", eighthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(eighthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("eighthCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie/artikel/offen/psp-coach-videos.html",
					"Incorrect URL after clicking Eighth Card Read More Button");
		}
		return this;
	}

	public Rheumatologie clickOnNinthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", ninthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(ninthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("ninthCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie/artikel/offen/riesenzellarteriitis.html",
					"Incorrect URL after clicking Ninth Card Read More Button");
		}
		return this;
	}

	public Rheumatologie clickOnTenthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", tenthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(tenthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("tenthCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie/artikel/offen/sprechstunde-neu-denken.html",
					"Incorrect URL after clicking Tenth Card Read More Button");
		}
		return this;
	}

	public Rheumatologie clickOnEleventhCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", eleventhCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(eleventhCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("eleventhCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie/artikel/offen/nach-der-sprechstunde.html",
					"Incorrect URL after clicking Eleventh Card Read More Button");
		}
		return this;
	}

	public Rheumatologie clickOnTwelfthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", twelfthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(twelfthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("twelfthCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie/artikel/offen/in-der-sprechstunde.html",
					"Incorrect URL after clicking Twelfth Card Read More Button");
		}
		return this;
	}

	public Rheumatologie clickOnThirteenthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", thirteenthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(thirteenthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("thirteenthCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie/artikel/offen/vor-der-sprechstunde.html",
					"Incorrect URL after clicking Thirteenth Card Read More Button");
		}
		return this;
	}

	public Rheumatologie clickOnFourteenthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", fourteenthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(fourteenthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("fourteenthCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie/artikel/offen/psp-abbvie-care.html",
					"Incorrect URL after clicking Fourteenth Card Read More Button");
		}
		return this;
	}

	public Rheumatologie clickOnFifteenthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", fifteenthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(fifteenthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("fifteenthCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie/artikel/offen/medizinstudium-und-jetzt.html",
					"Incorrect URL after clicking Fifteenth Card Read More Button");
		}
		return this;
	}

	public Rheumatologie clickOnSixteenthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", sixteenthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(sixteenthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("sixteenthCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie/kongresse-und-events/events/congress-tv-gent-2022.html",
					"Incorrect URL after clicking Sixteenth Card Read More Button");
		}
		return this;
	}

	public Rheumatologie clickOnPodcastButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", podcastButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(podcastButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("podcastButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie/podcasts.html",
					"Incorrect URL after clicking Podcast Button");
		}
		return this;
	}

	public Rheumatologie clickOnAbbvieCareButton() throws IOException {
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
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbvie-care.de/",
					"Incorrect URL after clicking Abbviev Care Button");
		}
		return this;
	}

	public Rheumatologie clickOnCommitmentLearnMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", commitmentLearnMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(commitmentLearnMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("commitmentLearnMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbvie.de/patient-innen.html?trackingSelection=Ask",
					"Incorrect URL after clicking Commitment Learn More Button");
		}
		return this;
	}

	public Rheumatologie clickOnContactUsButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", contactUsButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(contactUsButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("contactUsButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/kontakt-und-service.html",
					"Incorrect URL after clicking contact Us Button");
		}
		return this;
	}
}