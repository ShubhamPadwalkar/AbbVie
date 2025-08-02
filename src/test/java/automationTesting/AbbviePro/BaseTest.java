package automationTesting.AbbviePro;

import java.time.Duration;

import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import automationTesting.AbbviePro.Utils.ReportUtil;
import automationTesting.AbbviePro.Utils.ScreenshotUtil;

public class BaseTest {

	protected WebDriver driver;
	protected ScreenshotUtil screenshotUtil;
	protected HomePage homePage;
	protected Header header;
	protected Footer footer;

	@BeforeClass
	public void commonSetUp() {
		ReportUtil.initReport();
		ReportUtil.createTest("Test Setup"); // Or handle this differently if each class creates its own test
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		homePage = new HomePage(driver);
		header = new Header(driver);
		footer = new Footer(driver);
		screenshotUtil = new ScreenshotUtil(driver);
		ReportUtil.logInfo("Browser launched and cookies cleared.");
	}

	// This method encapsulates the common navigation logic
	protected void performCommonNavigation() {
		ReportUtil.createTest("Navigation"); // Or integrate into the calling test's report entry
		try {
			homePage.navigateTo();
			ReportUtil.logPass("Navigation To AbbViePro Website Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("Navigation");
			ReportUtil.attachScreenshot(screenshotPath);

			homePage.selectCountry();
			ReportUtil.logPass("Country Selection successful.");
			String screenshotPath1 = screenshotUtil.takeScreenshot("Select Country");
			ReportUtil.attachScreenshot(screenshotPath1);

			homePage.clickingOnContinueButton();
			ReportUtil.logPass("Clicked On Continue Button Successful.");
			String screenshotPath2 = screenshotUtil.takeScreenshot("Continue Button");
			ReportUtil.attachScreenshot(screenshotPath2);

			homePage.acceptHomePageCookies();
			ReportUtil.logPass("Navigation and cookie acceptance successful.");
			String screenshotPath3 = screenshotUtil.takeScreenshot("Home Page Cookies");
			ReportUtil.attachScreenshot(screenshotPath3);

		} catch (Exception e) {
			ReportUtil.logFail("Common Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("common_navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			throw new RuntimeException("Navigation failed, stopping test execution.", e); // Re-throw to fail the
																							// test
		}
	}

	@AfterClass
	public void commonTearDown() {
		ReportUtil.createTest("Common Test Teardown");
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