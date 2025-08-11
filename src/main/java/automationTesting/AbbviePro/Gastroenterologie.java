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

public class Gastroenterologie extends BasePage {

	public Gastroenterologie(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//div[@class='button-link aem-GridColumn aem-GridColumn--default--12']/a)[17]")
	private WebElement gastroenterologieButton;

	@FindBy(xpath = "//button[@class='dmpro-v2 btn btn-primary btn-with-icon']")
	private WebElement cardLoadMoreButton;

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

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[12]")
	private WebElement tenthCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[13]")
	private WebElement eleventhCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[14]")
	private WebElement twelvethCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[15]")
	private WebElement thirteenthCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[16]")
	private WebElement fourteenthCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-white     text-left'])[1]")
	private WebElement congressHighlightButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-white     text-left'])[2]")
	private WebElement takeALookNowButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-white     text-left'])[3]")
	private WebElement exclusivelyLearnMoreButton;
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[2]")
	private WebElement contactUsButton;
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[3]")
	private WebElement abbvieCareButton;
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[4]")
	private WebElement livingWith_IBD_LearnMoreButton;
	
	public Gastroenterologie clickOnGastroenterologieButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", gastroenterologieButton);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(gastroenterologieButton));
		gastroenterologieButton.click();

		return this;
	}

	public Gastroenterologie clickCardLoadMoreButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", cardLoadMoreButton);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement clickableCardLoadMoreButton = wait
				.until(ExpectedConditions.elementToBeClickable(cardLoadMoreButton));
		js.executeScript("arguments[0].click();", clickableCardLoadMoreButton);
		return this;
	}

	public Gastroenterologie clickOnFirstCardReadMoreButton() throws IOException {
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
			Assert.assertTrue(driver.getTitle().contains("DDW 2025 - Kongresshighlights | AbbVie Pro Deutschland"),
					"Failed to navigate to DermaTalks");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/gastroenterologie/artikel/offen/ddw-2025.html",
					"Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public Gastroenterologie clickOnSecondCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", secondCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(secondCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("SecondCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(driver.getTitle().contains("Perspektive CED Berlin | AbbVie Pro Deutschland"),
					"Failed to navigate to DermaTalks");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/gastroenterologie/artikel/offen/perspektive-ced-berlin.html",
					"Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public Gastroenterologie clickOnThirdCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", thirdCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(thirdCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("ThirdCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(driver.getTitle().contains("Colitis ulcerosa | AbbVie Pro Deutschland"),
					"Failed to navigate to DermaTalks");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/gastroenterologie/artikel/offen/colitis-ulcerosa-rundum-informiert.html",
					"Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public Gastroenterologie clickOnFourthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", fourthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(fourthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("FourthCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(driver.getTitle().contains(
					"Studie untermauert Schlüsselrolle von MFAs in der CED-Versorgung | AbbVie Pro Deutschland"),
					"Failed to navigate to DermaTalks");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/gastroenterologie/artikel/offen/ibd-nurse-study.html",
					"Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public Gastroenterologie clickOnFifthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", fifthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(fifthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("FifthCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(driver.getTitle().contains("CED-Fachassistenz | AbbVie Pro Deutschland"),
					"Failed to navigate to DermaTalks");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/gastroenterologie/artikel/offen/ced-bio-assist.html",
					"Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public Gastroenterologie clickOnSixthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", sixthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(sixthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("SixthCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(driver.getTitle().contains("N-ECCO Kongresshighlights | AbbVie Pro Deutschland"),
					"Failed to navigate to DermaTalks");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/gastroenterologie/artikel/offen/kongresshighlights-n-ecco-newsletter.html",
					"Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public Gastroenterologie clickOnSeventhCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", seventhCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(seventhCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("SeventhCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(driver.getTitle().contains(
					"Morbus Crohn – Wissenswertes zur Erkrankung, Diagnose & Therapie | AbbVie Pro Deutschland"),
					"Failed to navigate to DermaTalks");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/gastroenterologie/artikel/offen/morbus-crohn-rundum-informiert.html",
					"Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public Gastroenterologie clickOnEighthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", eighthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(eighthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("EighthCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(
					driver.getTitle().contains("Interview zur Device-gestützten CED-Therapie | AbbVie Pro Deutschland"),
					"Failed to navigate to DermaTalks");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/gastroenterologie/artikel/offen/interview-device-therapie.html",
					"Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public Gastroenterologie clickOnNinethCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", ninethCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(ninethCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("NinethCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(
					driver.getTitle().contains("Interview CED-Infusionstherapie MFA | AbbVie Pro Deutschland"),
					"Failed to navigate to DermaTalks");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/gastroenterologie/artikel/offen/interview-ced-infusionstherapie-mfa.html",
					"Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public Gastroenterologie clickOnTenthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", tenthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(tenthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("TenthCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(
					driver.getTitle().contains(
							"CED-Therapie | IBD:DICE-Studie beleuchtet Steroidgebrauch | AbbVie Pro Deutschland"),
					"Failed to navigate to DermaTalks");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/gastroenterologie/artikel/offen/ibd-dice.html",
					"Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public Gastroenterologie clickOnEleventhCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", eleventhCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(eleventhCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("EleventhCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(
					driver.getTitle()
							.contains("Artikel-20-Verfahren zu Januskinase-Inhibitoren | AbbVie Pro Deutschland"),
					"Failed to navigate to DermaTalks");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/gastroenterologie/artikel/offen/art20-januskinase-inhibitoren.html",
					"Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public Gastroenterologie clickOnTwelvethCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", twelvethCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(twelvethCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("TwelvethCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(driver.getTitle().contains(
					"Ultraschalldiagnostik bei Morbus Crohn und Colitis ulcerosa: neue potenzielle Therapieziele? | AbbVie Pro Deutschland"),
					"Failed to navigate to DermaTalks");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/gastroenterologie/artikel/offen/trustpooldata.html",
					"Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public Gastroenterologie clickOnThirteenthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", thirteenthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(thirteenthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("ThirteenthCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			System.out.println("13 - " + driver.getCurrentUrl() + " - " + driver.getTitle());
			 Assert.assertTrue(driver.getTitle().contains("Im Kopf einer schwangeren Morbus-Crohn-Patientin | AbbVie Pro Deutschland"),
			 "Failed to navigate to DermaTalks");
			 Assert.assertEquals(driver.getCurrentUrl(),
			 "https://www.abbviepro.com/de/de/therapiegebiete/immunologie/gastroenterologie/artikel/offen/ced-und-schwangerschaft.html",
			 "Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public Gastroenterologie clickOnFourteenthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", fourteenthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(fourteenthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("FourteenthCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(
					driver.getTitle()
							.contains("Therapieerfolge mit der CED-Disk sichtbar machen | AbbVie Pro Deutschland"),
					"Failed to navigate to DermaTalks");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/gastroenterologie/artikel/offen/visueller-patientenfragebogen.html",
					"Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public Gastroenterologie clickOnCongressHighlightButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", congressHighlightButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(congressHighlightButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("CongressHighlightPageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertTrue(driver.getTitle().contains("Gastroenterologie | AbbVie Pro Deutschland"),
					"Failed to navigate to DermaTalks");
		}
		return this;
	}

	public Gastroenterologie clickOnTakeALookNowButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", takeALookNowButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(takeALookNowButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("TakeALookNowPageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			System.out.println("Take a Look Now - " + driver.getCurrentUrl() + " - " + driver.getTitle());
			 Assert.assertTrue(driver.getTitle().contains("Gastroenterologie | AbbVie Pro Deutschland"),
			 "Failed to navigate to DermaTalks");
			 Assert.assertEquals(driver.getCurrentUrl(),
			 "https://www.abbviepro.com/de/de/therapiegebiete/immunologie/gastroenterologie.html?topicarticle-list-d19d1b7086=abbvie-pro:de/article-filter/chips-artikel/gastroenterologie/perspektive-ced#artikel",
			 "Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public Gastroenterologie clickOnExclusivelyLearnMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", exclusivelyLearnMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(exclusivelyLearnMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("ExclusivelyLearnMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			System.out.println("Exclusively Learn More - " + driver.getCurrentUrl() + " - " + driver.getTitle());
			Assert.assertTrue(driver.getTitle().contains("Gastroenterologie | AbbVie Pro Deutschland"),
					"Failed to navigate to DermaTalks");
		}
		return this;
	}
	
	public Gastroenterologie clickOnContactUsButton() throws IOException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js.executeScript("arguments[0].scrollIntoView(true);", contactUsButton);
        WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(contactUsButton));
        js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
        clickableButton.click();

        try (WindowSession session = new WindowSession(driver, true)) {
            session.switchToNewWindow();
            String screenshotPath = screenshotUtil.takeScreenshot("ContactUsPageAfterClick");
            ReportUtil.attachScreenshot(screenshotPath);
             Assert.assertTrue(driver.getTitle().contains("Service und Kontakt | AbbVie Pro Deutschland"),
             "Failed to navigate to Kontakt | AbbVie Pro Deutschland");
             Assert.assertEquals(driver.getCurrentUrl(),
             "https://www.abbviepro.com/de/de/kontakt-und-service.html",
             "Incorrect URL after clicking Kontakt | AbbVie Pro Deutschland");
        }
        return this;
    }

    public Gastroenterologie clickOnAbbvieCareButton() throws IOException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js.executeScript("arguments[0].scrollIntoView(true);", abbvieCareButton);
        WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(abbvieCareButton));
        js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
        clickableButton.click();

        try (WindowSession session = new WindowSession(driver, true)) {
            session.switchToNewWindow();
            String screenshotPath = screenshotUtil.takeScreenshot("AbbvieCarePageAfterClick");
            ReportUtil.attachScreenshot(screenshotPath);
             Assert.assertTrue(driver.getTitle().contains("AbbVie Care unterstützt Sie bei der Therapie Ihrer chronischen Erkrankung"),
             "Failed to navigate to AbbVie Care | AbbVie Pro Deutschland");
             Assert.assertEquals(driver.getCurrentUrl(),
             "https://www.abbvie-care.de/",
             "Incorrect URL after clicking AbbVie Care | AbbVie Pro Deutschland");
        }
        return this;
    }

    public Gastroenterologie clickOnLivingWith_IBD_LearnMoreButton() throws IOException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js.executeScript("arguments[0].scrollIntoView(true);", livingWith_IBD_LearnMoreButton);
        WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(livingWith_IBD_LearnMoreButton));
        js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
        clickableButton.click();

        try (WindowSession session = new WindowSession(driver, true)) {
            session.switchToNewWindow();
            String screenshotPath = screenshotUtil.takeScreenshot("LivingWithIBDLearnMorePageAfterClick");
            ReportUtil.attachScreenshot(screenshotPath);
             Assert.assertTrue(driver.getTitle().contains("Leben mit CED | Dein Portal für Morbus Crohn und Colitis ulcerosa"),
             "Failed to navigate to Leben mit CED | AbbVie Pro Deutschland");
             Assert.assertEquals(driver.getCurrentUrl(),
             "https://www.leben-mit-ced.de/",
             "Incorrect URL after clicking Leben mit CED | AbbVie Pro Deutschland");
        }
        return this;
    }
    
    public Gastroenterologie scrollToPageTop() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
		System.out.println("Page scrolled to the top.");
		return this;
	}
}

