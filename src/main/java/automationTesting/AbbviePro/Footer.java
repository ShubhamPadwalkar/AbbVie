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

public class Footer extends BasePage {

	public Footer(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//img[@class='img-fluid d-none d-lg-block lazyloaded']")
	private WebElement footerLogo;

	@FindBy(xpath = "(//div[@class='button-link aem-GridColumn aem-GridColumn--default--12']/a)[16]")
	private WebElement dermatologieButton;

	@FindBy(xpath = "(//div[@class='button-link aem-GridColumn aem-GridColumn--default--12']/a)[17]")
	private WebElement gastroenterologieButton;

	@FindBy(xpath = "(//div[@class='button-link aem-GridColumn aem-GridColumn--default--12']/a)[18]")
	private WebElement rheumatologieButton;

	@FindBy(xpath = "(//div[@class='button-link aem-GridColumn aem-GridColumn--default--12']/a)[19]")
	private WebElement onkologieButton;

	@FindBy(xpath = "(//div[@class='button-link aem-GridColumn aem-GridColumn--default--12']/a)[20]")
	private WebElement neurologieButton;

	@FindBy(xpath = "(//div[@class='button-link aem-GridColumn aem-GridColumn--default--12']/a)[21]")
	private WebElement HCVButton;

	@FindBy(xpath = "(//div[@class='button-link aem-GridColumn aem-GridColumn--default--12']/a)[22]")
	private WebElement ophthalmologieButton;

	@FindBy(xpath = "(//div[@class='button-link aem-GridColumn aem-GridColumn--default--12']/a)[23]")
	private WebElement urologieButton;

	// External Link
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn-link fw-regular link--front--icon  text-left  text-primary '])[1]")
	private WebElement imprintButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn-link fw-regular link--front--icon  text-left  text-primary '])[2]")
	private WebElement privacyPolicyButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn-link fw-regular link--front--icon  text-left  text-primary '])[3]")
	private WebElement termsOfUseButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn-link   text-left fw-regular text-primary '])[17]")
	private WebElement contactInformationButton;

	@FindBy(xpath = "(//a[@class='dmpro-v2 btn-link   text-left fw-regular text-primary '])[18]")
	private WebElement sitemapButton;

	public Footer clickOnFooterLogo() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll to the absolute bottom of the page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		footerLogo.click();
		Assert.assertTrue(driver.getTitle().contains("Startseite - AbbVie Pro Deutschland"),
				"Failed to navigate to Footer Logo");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de.html",
				"Incorrect URL after clicking Footer Logo");
		return this;
	}

	public Footer clickOnDermatologieButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		dermatologieButton.click();
		System.out.println(driver.getCurrentUrl() + " - " + driver.getTitle());
		// IMPORTANT: Replace "Expected Title Part" and "Expected URL" with actual
		// values
		Assert.assertTrue(driver.getTitle().contains("Dermatologie | AbbVie Pro Deutschland"),
				"Failed to navigate to Dermatologie page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/dermatologie.html",
				"Incorrect URL after clicking Dermatologie button");
		return this;
	}

	public Footer clickOnGastroenterologieButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		gastroenterologieButton.click();
		System.out.println(driver.getCurrentUrl() + " - " + driver.getTitle());

		// IMPORTANT: Replace "Expected Title Part" and "Expected URL" with actual
		// values
		Assert.assertTrue(driver.getTitle().contains("Gastroenterologie | AbbVie Pro Deutschland"),
				"Failed to navigate to Gastroenterologie page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/gastroenterologie.html",
				"Incorrect URL after clicking Gastroenterologie button");
		return this;
	}

	public Footer clickOnRheumatologieButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		rheumatologieButton.click();
		System.out.println(driver.getCurrentUrl() + " - " + driver.getTitle());

		// IMPORTANT: Replace "Expected Title Part" and "Expected URL" with actual
		// values
		Assert.assertTrue(driver.getTitle().contains("Rheumatologie | AbbVie Pro Deutschland"),
				"Failed to navigate to Rheumatologie page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie.html",
				"Incorrect URL after clicking Rheumatologie button");
		return this;
	}

	public Footer clickOnOnkologieButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		onkologieButton.click();
		System.out.println(driver.getCurrentUrl() + " - " + driver.getTitle());

		// IMPORTANT: Replace "Expected Title Part" and "Expected URL" with actual
		// values
		Assert.assertTrue(driver.getTitle().contains("Onkologie | AbbVie Pro Deutschland"),
				"Failed to navigate to Onkologie page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/therapiegebiete/onkologie.html",
				"Incorrect URL after clicking Onkologie button");
		return this;
	}

	public Footer clickOnNeurologieButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		neurologieButton.click();
		System.out.println(driver.getCurrentUrl() + " - " + driver.getTitle());

		// IMPORTANT: Replace "Expected Title Part" and "Expected URL" with actual
		// values
		Assert.assertTrue(driver.getTitle().contains("Parkinson-Krankheit | AbbVie Pro Deutschland"),
				"Failed to navigate to Neurologie page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/neurologie/parkinson-krankheit.html",
				"Incorrect URL after clicking Neurologie button");
		return this;
	}

	public Footer clickOnHCVButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		HCVButton.click();
		System.out.println(driver.getCurrentUrl() + " - " + driver.getTitle());

		// IMPORTANT: Replace "Expected Title Part" and "Expected URL" with actual
		// values
		Assert.assertTrue(driver.getTitle().contains("Hepatitis C (HCV) | AbbVie Pro Deutschland"),
				"Failed to navigate to HCV page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c.html",
				"Incorrect URL after clicking HCV button");
		return this;
	}

	public Footer clickOnOphthalmologieButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		ophthalmologieButton.click();
		System.out.println(driver.getCurrentUrl() + " - " + driver.getTitle());

		// IMPORTANT: Replace "Expected Title Part" and "Expected URL" with actual
		// values
		Assert.assertTrue(driver.getTitle().contains("Ophthalmologie | AbbVie Pro Deutschland"),
				"Failed to navigate to Ophthalmologie page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/augenheilkunde/ophthalmologie.html",
				"Incorrect URL after clicking Ophthalmologie button");
		return this;
	}

	public Footer clickOnUrologieButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		urologieButton.click();
		System.out.println(driver.getCurrentUrl() + " - " + driver.getTitle());

		// IMPORTANT: Replace "Expected Title Part" and "Expected URL" with actual
		// values
		Assert.assertTrue(driver.getTitle().contains("Urologie | AbbVie Pro Deutschland"),
				"Failed to navigate to Urologie page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/therapiegebiete/urologie.html",
				"Incorrect URL after clicking Urologie button");
		return this;
	}

	// External Links

	public Footer clickOnImprintButton() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		// 1. Get the handle of the original window
		String originalWindowHandle = driver.getWindowHandle();

		try {
			// 2. Click the button to open the new window/tab
			imprintButton.click();

			// Wait for the new window to open
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.numberOfWindowsToBe(2));

			// 3. Find the new window handle and switch to it
			String newWindowHandle = driver.getWindowHandles().stream()
					.filter(handle -> !handle.equals(originalWindowHandle)).findFirst()
					.orElseThrow(() -> new IllegalStateException("New window handle not found"));

			driver.switchTo().window(newWindowHandle);

			// The wait condition is now corrected to look for the correct title
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.titleContains("Impressum"));

			String screenshotPath = screenshotUtil.takeScreenshot("Impressum");
			ReportUtil.attachScreenshot(screenshotPath);
			ReportUtil.logPass("Screenshot of Impressum page captured.");

			Assert.assertTrue(driver.getTitle().contains("Impressum | AbbVie"), "Failed to navigate to Imprint page");
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbvie.de/impressum.html",
					"Incorrect URL after clicking Imprint button");

			driver.close();
			System.out.println("New window closed.");

		} finally {
			driver.switchTo().window(originalWindowHandle);
			System.out.println("Switched back to original window.");
		}
		return this;
	}

	public Footer clickOnPrivacyPolicyButton() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		String originalWindowHandle = driver.getWindowHandle();

		try {
			privacyPolicyButton.click();
			new WebDriverWait(driver, java.time.Duration.ofSeconds(10)).until(d -> d.getWindowHandles().size() > 1);

			for (String windowHandle : driver.getWindowHandles()) {
				if (!originalWindowHandle.equals(windowHandle)) {
					driver.switchTo().window(windowHandle);
					break;
				}
			}
			Thread.sleep(2000);
			String screenshotPath = screenshotUtil.takeScreenshot("PrivacyPolicyPage");
			ReportUtil.attachScreenshot(screenshotPath);
			ReportUtil.logPass("Screenshot of Privacy Policy page captured.");

			Assert.assertTrue(driver.getTitle().contains("Germany Privacy Notice - Privacy Policies | AbbVie"),
					"Failed to navigate to Privacy Policy Button");
			Assert.assertEquals(driver.getCurrentUrl(),
					"https://privacy.abbvie/privacy-policies/germany-privacy-notice.html",
					"Incorrect URL after clicking Privacy Policy Button");
			driver.close();
		} finally {
			driver.switchTo().window(originalWindowHandle);
		}

		return this;
	}

	public Footer clickOnTermsOfUseButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		termsOfUseButton.click();

		// Update the expected URL and title to match your new format
		Assert.assertTrue(driver.getTitle().contains("Nutzungsbedingungen | AbbVie"),
				"Failed to navigate to Terms of Use page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbvie.de/nutzungsbedingungen.html",
				"Incorrect URL after clicking Terms of Use button");
		return this;
	}

	public Footer clickOnContactInformationButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		contactInformationButton.click();

		Assert.assertTrue(driver.getTitle().contains("Anmeldung"), "Failed to navigate to Terms of Use page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://id.abbvie.com/Login?startURL=%2FAppRouterMVN",
				"Incorrect URL after clicking Terms of Use button");
		return this;
	}

	public Footer clickOnSiteMapButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		sitemapButton.click();

		Assert.assertTrue(driver.getTitle().contains("Sitemap | AbbVie Pro Deutschland"),
				"Failed to navigate to Terms of Use page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/site-map.html",
				"Incorrect URL after clicking Terms of Use button");
		return this;
	}

}
