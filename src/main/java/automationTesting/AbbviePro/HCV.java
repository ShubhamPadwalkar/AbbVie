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

public class HCV extends BasePage {

	public HCV(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//div[@class='button-link aem-GridColumn aem-GridColumn--default--12']/a)[21]")
	private WebElement HCVButton;

	@FindBy(xpath = "//button[@class='dmpro-v2 btn btn-primary btn-with-icon']")
	private WebElement cardLoadMoreButton;
	// ---------

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[3]")
	private WebElement firstCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[2]")
	private WebElement secondCardReadMoreButton;

	// Index 3
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[3]")
	private WebElement thirdCardReadMoreButton;

	// Index 4
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[4]")
	private WebElement fourthCardReadMoreButton;

	// Index 5
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[5]")
	private WebElement fifthCardReadMoreButton;

	// Index 6
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[6]")
	private WebElement sixthCardReadMoreButton;

	// Index 7
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[7]")
	private WebElement seventhCardReadMoreButton;

	// Index 8
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[8]")
	private WebElement eighthCardReadMoreButton;

	// Index 9
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[9]")
	private WebElement ninthCardReadMoreButton;

	// Index 10
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[10]")
	private WebElement tenthCardReadMoreButton;

	// Index 11
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[11]")
	private WebElement eleventhCardReadMoreButton;

	// Index 12
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[12]")
	private WebElement twelfthCardReadMoreButton;

	// Index 13
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[13]")
	private WebElement thirteenthCardReadMoreButton;

	// Index 14
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[14]")
	private WebElement fourteenthCardReadMoreButton;

	// Index 15
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[15]")
	private WebElement fifteenthCardReadMoreButton;

	// Index 16
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[16]")
	private WebElement sixteenthCardReadMoreButton;

	// Index 17
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon mb-0'])[17]")
	private WebElement seventeenthCardReadMoreButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[1]")
	private WebElement abbvieCareButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[2]")
	private WebElement registerNowButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[3]")
	private WebElement contactUsButton;
	
	@FindBy(xpath = "//button[@class='btn btn-link accordion_item collapsed']")
	private WebElement accordionButton;
	
	@FindBy(id = "collapse-1754924702203_1211")
    private WebElement accordionContent;
	

	// ---------
	public HCV clickOnHCVButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", HCVButton);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(HCVButton));
		HCVButton.click();

		return this;
	}

	public HCV clickCardLoadMoreButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", cardLoadMoreButton);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement clickableCardLoadMoreButton = wait
				.until(ExpectedConditions.elementToBeClickable(cardLoadMoreButton));
		js.executeScript("arguments[0].click();", clickableCardLoadMoreButton);
		return this;
	}

	public HCV clickOnFirstCardReadMoreButton() throws IOException {
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
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c/artikel/open/plus-forum-2025.html",
					"Incorrect URL after clicking DermaTalks");
		}
		return this;
	}

	public HCV clickOnSecondCardReadMoreButton() throws IOException {
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
			Assert.assertEquals(driver.getCurrentUrl(), "https://id.abbvie.com/Register?AID=AID-0000021&locale=de-DE",
					"Incorrect URL after clicking Second Card Read More button");
		}
		return this;
	}

	public HCV clickOnThirdCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", thirdCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(thirdCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			System.out.println("Third Card Page Title: " + driver.getTitle());
			System.out.println("Third Card Page URL: " + driver.getCurrentUrl());
			String screenshotPath = screenshotUtil.takeScreenshot("ThirdCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c/artikel/open/plus-forum-2025.html",
					"Incorrect URL after clicking Third Card Read More button");
		}
		return this;
	}

	public HCV clickOnFourthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", fourthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(fourthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			System.out.println("Fourth Card Page Title: " + driver.getTitle());
			System.out.println("Fourth Card Page URL: " + driver.getCurrentUrl());
			String screenshotPath = screenshotUtil.takeScreenshot("FourthCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);

			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c/artikel/open/hcv-tracker.html",
					"Incorrect URL after clicking Fourth Card Read More button");
		}
		return this;
	}

	public HCV clickOnFifthCardReadMoreButton() throws IOException {
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
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c/artikel/open/hepatitis-c-screening.html",
					"Incorrect URL after clicking Fifth Card Read More button");
		}
		return this;
	}

	public HCV clickOnSixthCardReadMoreButton() throws IOException {
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
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c/artikel/open/freshup-hausarztmedizin-2024-11.html",
					"Incorrect URL after clicking Sixth Card Read More button");
		}
		return this;
	}

	public HCV clickOnSeventhCardReadMoreButton() throws IOException {
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
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c/artikel/open/hcv-elimination-whitepaper.html",
					"Incorrect URL after clicking Seventh Card Read More button");
		}
		return this;
	}

	public HCV clickOnEighthCardReadMoreButton() throws IOException {
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
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c/artikel/open/plus-forum-2024.html",
					"Incorrect URL after clicking Eighth Card Read More button");
		}
		return this;
	}

	public HCV clickOnNinthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", ninthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(ninthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("NinthCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c/artikel/open/dgs-symposium.html",
					"Incorrect URL after clicking Ninth Card Read More button");
		}
		return this;
	}

	public HCV clickOnTenthCardReadMoreButton() throws IOException {
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
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c/artikel/open/update-aasld-2023.html",
					"Incorrect URL after clicking Tenth Card Read More button");
		}
		return this;
	}

	public HCV clickOnEleventhCardReadMoreButton() throws IOException {
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
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c/artikel/open/spotlights2023.html",
					"Incorrect URL after clicking Eleventh Card Read More button");
		}
		return this;
	}

	public HCV clickOnTwelfthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", twelfthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(twelfthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("TwelfthCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c/artikel/open/testbus-schlewsig-holstein.html",
					"Incorrect URL after clicking Twelfth Card Read More button");
		}
		return this;
	}

	public HCV clickOnThirteenthCardReadMoreButton() throws IOException {
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
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c/artikel/open/nicht-nur-an-die-leber-denken.html",
					"Incorrect URL after clicking Thirteenth Card Read More button");
		}
		return this;
	}

	public HCV clickOnFourteenthCardReadMoreButton() throws IOException {
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
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c/artikel/open/dagnae-2022-hcv-elimination.html",
					"Incorrect URL after clicking Fourteenth Card Read More button");
		}
		return this;
	}

	public HCV clickOnFifteenthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", fifteenthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(fifteenthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("FifteenthCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c/artikel/open/welt-hepatitis-tag-2022.html",
					"Incorrect URL after clicking Fifteenth Card Read More button");
		}
		return this;
	}

	public HCV clickOnSixteenthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", sixteenthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(sixteenthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("SixteenthCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c/artikel/open/hepatitis-c-elimination-360-grad.html",
					"Incorrect URL after clicking Sixteenth Card Read More button");
		}
		return this;
	}

	public HCV clickOnSeventeenthCardReadMoreButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", seventeenthCardReadMoreButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(seventeenthCardReadMoreButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			String screenshotPath = screenshotUtil.takeScreenshot("SeventeenthCardReadMorePageAfterClick");
			ReportUtil.attachScreenshot(screenshotPath);
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c/artikel/open/2023-auf-hepatitis-c-testen-und-behandeln.html",
					"Incorrect URL after clicking Seventeenth Card Read More button");
		}
		return this;
	}

	public HCV clickOnAbbvieCareButton() throws IOException {
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
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbvie-care.de/",
					"Incorrect URL after clicking AbbVie Care | AbbVie Pro Deutschland");
		}
		return this;
	}
	
	public HCV clickOnRegisterNowButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView(true);", registerNowButton);
		WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(registerNowButton));
		js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
		clickableButton.click();

		try (WindowSession session = new WindowSession(driver, true)) {
			session.switchToNewWindow();
			System.out.println("registerNowButton "+driver.getCurrentUrl());
			String screenshotPath = screenshotUtil.takeScreenshot("registerNowButton");
			ReportUtil.attachScreenshot(screenshotPath);
//			Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbvie-care.de/",
//					"Incorrect URL after clicking AbbVie Care | AbbVie Pro Deutschland");
		}
		return this;
	}

	public HCV clickOnContactUsButton() throws IOException {
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
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/kontakt-und-service.html",
					"Incorrect URL after clicking Kontakt | AbbVie Pro Deutschland");
		}
		return this;
	}
	
	public HCV clickOnAccordionButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // 1. Scroll the element into view. This ensures it's within the viewport
        // and interactive if it wasn't already.
        js.executeScript("arguments[0].scrollIntoView(true);", accordionButton);

        // 2. Wait until the element is explicitly clickable by Selenium's standards.
        // This checks for visibility, enabled state, and absence of overlaying elements.
        wait.until(ExpectedConditions.elementToBeClickable(accordionButton));

        // For debugging: Print current state of the button before attempting click
        System.out.println("Attempting to click accordion button: ");
        System.out.println("  Is Displayed: " + accordionButton.isDisplayed());
        System.out.println("  Is Enabled: " + accordionButton.isEnabled());
        System.out.println("  Current Class: " + accordionButton.getAttribute("class"));
        System.out.println("  Data Target: " + accordionButton.getAttribute("data-target"));


        // 3. Perform the click using JavaScript. This is often more reliable than
        // native WebDriver clicks for elements with complex styling, animations,
        // or potential hidden overlays, as it bypasses some of Selenium's checks
        // that might incorrectly deem an element unclickable.
        js.executeScript("arguments[0].click();", accordionButton);

        // 4. Crucial verification step: Wait for the accordion's content to become visible.
        // If the click was successful, the content linked by data-target should expand.
        try {
            wait.until(ExpectedConditions.visibilityOf(accordionContent));
            System.out.println("SUCCESS: Accordion content is now visible after click.");
        } catch (Exception e) {
            // If the content doesn't become visible within the timeout,
            // it indicates the click likely failed or the content didn't expand as expected.
            System.err.println("FAILURE: Accordion content (ID: " + accordionContent.getAttribute("id") +
                               ") did not become visible after click within 10 seconds: " + e.getMessage());
            // Re-throw as a RuntimeException to clearly fail the test method.
            throw new RuntimeException("Accordion content did not appear after click.", e);
        }

        return this;
    }
}
