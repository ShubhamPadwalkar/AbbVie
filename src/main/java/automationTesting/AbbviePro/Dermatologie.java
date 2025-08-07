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

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[1]")
	private WebElement contactUsButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[2]")
	private WebElement abbvieCareButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[3]")
	private WebElement abbvieCareLearnMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[4]")
	private WebElement atopicDermatitisButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[5]")
	private WebElement PSOUL_ReadMoreButton;

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

	public Dermatologie clickLearnMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", learnMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(learnMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("clickLearnMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(driver.getTitle().contains("Anmeldung"),
					"Failed to navigate to DermaTalks");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://id.abbvie.com/Login?startURL=%2FAppRouterMVN",
					"Incorrect URL after clicking Learn More Button");
		}
		return this;
	}

	public Dermatologie clickStreamNowButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", streamNowButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(streamNowButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("StreamNowButton");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(driver.getTitle().contains("Derma Talks &amp; Congress TV | AbbVie Pro Deutschland"),
					"Failed to navigate to DermaTalks");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/dermatologie/fortbildungsangebote/dermatalks-und-congresstv.html",
					"Incorrect URL after clicking Learn More Button");
		}
		return this;
	}

	public Dermatologie clickOnFirstCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", firstCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(firstCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("FirstCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(driver.getTitle().contains("DermaTalks on demand | AbbVie Pro Deutschland"),
					"Failed to navigate to DermaTalks");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/dermatologie/fortbildungsangebote/dermatalks-ondemand.html",
					"Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public Dermatologie clickOnSecondCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", secondCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(secondCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("SecondCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);

			Assert.assertTrue(driver.getTitle().contains("EADV 2024 | AbbVie Pro Deutschland"),
					"Failed to navigate to DermaTalks");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/dermatologie/artikel/offen/eadv-2024.html",
					"Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public Dermatologie clickOnThirdCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", thirdCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(thirdCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("ThirdCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);

			wait.until(ExpectedConditions.urlContains("aad-2024.htm"));
			Assert.assertTrue(driver.getTitle().contains("CongressTV vom AAD 2024 | AbbVie Pro Deutschland"),
					"Failed to navigate to CongressTV");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/dermatologie/artikel/offen/aad-2024.html",
					"Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public Dermatologie clickOnFourthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", fourthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(fourthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("FourthCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);

			wait.until(ExpectedConditions.urlContains("eadv-2023.html"));
			Assert.assertTrue(driver.getTitle().contains("EADV 2023 | AbbVie Pro Deutschland"),
					"Failed to navigate to CongressTV");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/dermatologie/artikel/offen/eadv-2023.html",
					"Incorrect URL after clicking EADV 2023");

		}
		return this;
	}

	public Dermatologie clickOnFifthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", fifthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(fifthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("FifthCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);

			wait.until(ExpectedConditions.urlContains("aad-2023.html"));

			Assert.assertTrue(
					driver.getTitle().contains("CongressTV vom AAD 2023 – Kongress-Highlights aus erster Hand"),
					"Failed to navigate to CongressTV");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/dermatologie/artikel/offen/aad-2023.html",
					"Incorrect URL after clicking EADV 2023");
		}
		return this;
	}

	public Dermatologie clickOnSixthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", sixthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(sixthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("SixthCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);

			wait.until(ExpectedConditions.urlContains("adopt.html"));

			Assert.assertTrue(
					driver.getTitle().contains(
							"Kandidat*innen für Systemtherapie der AD identifizieren | AbbVie Pro Deutschland"),
					"Failed to navigate to CongressTV");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/dermatologie/artikel/offen/adopt.html",
					"Incorrect URL after clicking EADV 2023");
		}
		return this;
	}

	public Dermatologie clickOnSeventhCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", seventhCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(seventhCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("SeventhCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);

			wait.until(ExpectedConditions.urlContains("eadv-2022.html"));

			Assert.assertTrue(driver.getTitle().contains("CongressTV vom EADV 2022"),
					"Failed to navigate to CongressTV");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/dermatologie/artikel/offen/eadv-2022.html",
					"Incorrect URL after clicking EADV 2023");
		}
		return this;
	}

	public Dermatologie clickOnEighthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", eighthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(eighthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();
		String screenshotPath = screenshotUtil.takeScreenshot("EighthCardReadMoreButton");
		ReportUtil.attachScreenshot(screenshotPath);

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			wait.until(ExpectedConditions.urlContains("genitale-psoriasis-im-fokus-der-forschung.html"));

			Assert.assertTrue(driver.getTitle().contains("Genitale Psoriasis im Fokus der Forschung"),
					"Failed to navigate to CongressTV");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/dermatologie/artikel/offen/genitale-psoriasis-im-fokus-der-forschung.html",
					"Incorrect URL after clicking EADV 2023");
		}
		return this;
	}

	public Dermatologie clickOnNinethCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", ninethCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(ninethCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("NinethCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);

			wait.until(
					ExpectedConditions.urlContains("wie-zufrieden-sind-psoriasis-patienten-mit-ihrer-therapie.html"));
			Assert.assertTrue(driver.getTitle().contains("Wie zufrieden sind Psoriasis-Patienten mit ihrer Therapie?"),
					"Failed to navigate to CongressTV");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/dermatologie/artikel/offen/wie-zufrieden-sind-psoriasis-patienten-mit-ihrer-therapie.html",
					"Incorrect URL after clicking EADV 2023");
		}
		return this;
	}

	public Dermatologie clickCardLoadMoreButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", cardLoadMoreButton);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement clickableCardLoadMoreButton = wait
				.until(ExpectedConditions.elementToBeClickable(cardLoadMoreButton));
		js.executeScript("arguments[0].click();", clickableCardLoadMoreButton);
		return this;
	}

	public Dermatologie scrollToPageTop() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
		System.out.println("Page scrolled to the top.");
		return this;
	}

	public Dermatologie clickContactUsButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", contactUsButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(contactUsButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("ContactUsButton");
			ReportUtil.attachScreenshot(screenshotPath);

			Assert.assertTrue(driver.getTitle().contains("Service und Kontakt | AbbVie Pro Deutschland"),
					"New tab title for Contact Us is incorrect.");
			Assert.assertTrue(
					driver.getCurrentUrl().contains("https://www.abbviepro.com/de/de/kontakt-und-service.html"),
					"New tab URL for Contact Us is incorrect.");
		}
		return this;
	}

	public Dermatologie clickAbbvieCareButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", abbvieCareButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(abbvieCareButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("AbbvieCareButton");
			ReportUtil.attachScreenshot(screenshotPath);

			Assert.assertTrue(
					driver.getTitle()
							.contains("AbbVie Care unterstützt Sie bei der Therapie Ihrer chronischen Erkrankung"),
					"New tab title for AbbVie Care is incorrect.");
			Assert.assertTrue(driver.getCurrentUrl().contains("https://www.abbvie-care.de/"),
					"New tab URL for AbbVie Care is incorrect.");
		}
		return this;
	}

	public Dermatologie clickAbbvieCareLearnMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", abbvieCareLearnMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(abbvieCareLearnMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("AbbvieCareLearnMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);

			wait.until(ExpectedConditions.urlContains("abbvie-care-serviceprogramme/"));
			Assert.assertTrue(driver.getTitle().contains("AbbVie Care ist ein Serviceprogramm für chronisch Erkrankte"),
					"New tab title for AbbVie Care is incorrect.");
			Assert.assertTrue(
					driver.getCurrentUrl().contains("https://www.abbvie-care.de/abbvie-care-serviceprogramme/"),
					"New tab URL for AbbVie Care is incorrect.");
		}
		return this;
	}

	public Dermatologie clickAtopicDermatitisButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", atopicDermatitisButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(atopicDermatitisButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("AtopicDermatitisButton");
			ReportUtil.attachScreenshot(screenshotPath);

			Assert.assertTrue(driver.getTitle().contains("Neurodermitis? Wen juckt’s? Das Krankheitsbild erkennen"),
					"New tab title for Atopic Dermatitis is incorrect.");
			Assert.assertTrue(driver.getCurrentUrl().contains("https://www.neurodermitis-wen-juckts.de/"),
					"New tab URL for Atopic Dermatitis is incorrect.");
		}
		return this;
	}

	public Dermatologie clickPSOUL_ReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", PSOUL_ReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(PSOUL_ReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("PSOUL_ReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);


			wait.until(ExpectedConditions.urlContains("psoul/"));
			Assert.assertTrue(driver.getTitle().contains("PSOUL – Das Magazin über, mit und ohne Schuppenflechte"),
					"New tab title for PSOUL Read More is incorrect.");
			Assert.assertTrue(driver.getCurrentUrl().contains("https://www.abbvie-care.de/psoul/"),
					"New tab URL for PSOUL Read More is incorrect.");
		}
		return this;
	}

}
