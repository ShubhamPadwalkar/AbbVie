package automationTesting.AbbviePro;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import automationTesting.AbbviePro.Utils.ReportUtil;
import automationTesting.AbbviePro.Utils.ScreenshotUtil;

public class RegistrationTest {

	private WebDriver driver;
	private HomePage homePage;
	private ScreenshotUtil screenshotUtil;

	@BeforeClass
	public void setUp() {
		ReportUtil.initReport();
		ReportUtil.createTest("Registration Test Setup");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		homePage = new HomePage(driver);
		screenshotUtil = new ScreenshotUtil(driver);
		ReportUtil.logInfo("Browser launched and cookies cleared.");
	}

	@Test(priority = 1)
	public void testNavigation() {
		ReportUtil.createTest("Test Navigation");
		try {
			// Navigation
			homePage.navigateTo();
			ReportUtil.logPass("Navigation To AbbViePro Website Successful.");
			
//			homePage.allure_attachment("Pass", driver);

			String screenshotPath = screenshotUtil.takeScreenshot("Navigation");
			ReportUtil.attachScreenshot(screenshotPath);

			// Country Selection
			homePage.selectCountry();
			ReportUtil.logPass("Country Selection successful.");

			String screenshotPath1 = screenshotUtil.takeScreenshot("Select Country");
			ReportUtil.attachScreenshot(screenshotPath1);

			// Clicking On Continue Button
			homePage.clickingOnContinueButton();
			ReportUtil.logPass("Clicked On Continue Button Successful.");

			String screenshotPath2 = screenshotUtil.takeScreenshot("Continue Button");
			ReportUtil.attachScreenshot(screenshotPath2);

			// Accept HomePage Cookies
			homePage.acceptHomePageCookies();
			ReportUtil.logPass("Navigation and cookie acceptance successful.");

			String screenshotPath3 = screenshotUtil.takeScreenshot("Home Page Cookies");
			ReportUtil.attachScreenshot(screenshotPath3);

		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 2)
	public void testHomePageNavigation() {
		ReportUtil.createTest("Click On Learn More Button");
		try {
			// Learn More Button
			homePage.clickLearnMoreButton();
			ReportUtil.logPass("Navigation Learn More Button Successful.");

			String screenshotPath = screenshotUtil.takeScreenshot("LearnMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);

			homePage.pageBackButton();

		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 3)
	public void testProductsLearnMore() {
		ReportUtil.createTest("Click On Product Learn More Button");
		try {
			// Learn More Button
			homePage.productslearnButton();
			ReportUtil.logPass("Navigation to Product Learn More Button Successful.");

			String screenshotPath = screenshotUtil.takeScreenshot("ProductLearnMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);

			homePage.pageBackButton();

		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	@Test(priority = 4)
	public void testTheoropaticButton() {
		ReportUtil.createTest("Click On Theoropatic Button Button");
		try {
			// Learn More Button
			homePage.therapeuticAreasButtonMethod();
			ReportUtil.logPass("Navigation to Theoropatic Button Successful.");

			String screenshotPath = screenshotUtil.takeScreenshot("TherapeuticButton");
			ReportUtil.attachScreenshot(screenshotPath);

			homePage.pageBackButton();

		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	@Test(priority = 5)
	public void testContactButton() {
		ReportUtil.createTest("Click On Contact Button Button");
		try {
			// Learn More Button
			homePage.contactButtonMethod();
			ReportUtil.logPass("Navigation to Contact Button Successful.");

			String screenshotPath = screenshotUtil.takeScreenshot("ContactButton");
			ReportUtil.attachScreenshot(screenshotPath);

			homePage.pageBackButton();

		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			
		}
	}
	@Test(priority = 6)
	public void testSecondRegisterButton() {
		ReportUtil.createTest("Click On Second Register Button");
		try {
			// Learn More Button
			homePage.secondRegisterButtonMethod();
			ReportUtil.logPass("Navigation to Register Button Successful.");

			String screenshotPath = screenshotUtil.takeScreenshot("RegisterButton");
			ReportUtil.attachScreenshot(screenshotPath);

		//	homePage.pageBackButton();

		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			
			
		}
	}
	@Test(priority = 7)
	public void testSignUpButton() throws InterruptedException {
		Thread.sleep(2000);
		ReportUtil.createTest("Click On Sign Up Button");
		try {
			// Learn More Button
			homePage.signupButtonMethod();
			ReportUtil.logPass("Navigation to Sign Up Button Successful.");

			String screenshotPath = screenshotUtil.takeScreenshot("signupButton");
			ReportUtil.attachScreenshot(screenshotPath);

			homePage.pageBackButton();

		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			
		}
	}
	@AfterClass
	public void tearDown() {
		ReportUtil.createTest("Test Teardown");
		if (driver != null) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				driver.quit();
				ReportUtil.logInfo("Browser closed.");
			}
		}
		ReportUtil.flushReport();
	}
}




//
////
////	@Test(priority = 5)
////	public void testRegistrationForm() throws InterruptedException {
////		homePage.registerButtonMethod();
////		
////		registrationPage.acceptRegistrationPageCookies().fillRegistrationForm("Shubham", "Padwalkar", "1234",
////				"8888493888", "test@gmail.com", "Testing Institution Name ", "M Road Newyork", "1234", "USA");
////		registrationPage.pageBackButton();
////		Thread.sleep(3000);
////	}
////	@Test(priority = 6)
////	public void getAllFooterLinks() {
////		homePage.getAllFooterLinksMethod();
////	}

