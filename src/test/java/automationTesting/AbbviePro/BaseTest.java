package automationTesting.AbbviePro;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
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
	protected Dermatologie dermatologie;
	protected Gastroenterologie gastroenterologie;
	protected BasePage basePage;
	protected Rheumatologie rheumatologie;
	protected Oncology oncology;
	protected Urology urology;
	protected Neurology neurology;

	@BeforeSuite
	public void initReportSuite() {
		ReportUtil.initReport();
	}

	@BeforeClass
	public void commonSetUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		basePage = new BasePage(driver);
		header = new Header(driver);
		footer = new Footer(driver);
		homePage = new HomePage(driver);
		dermatologie = new Dermatologie(driver);
		gastroenterologie = new Gastroenterologie(driver);
		rheumatologie = new Rheumatologie(driver);
		oncology = new Oncology(driver);
		urology = new Urology(driver);
		neurology = new Neurology(driver);
		
		screenshotUtil = new ScreenshotUtil(driver);
		ReportUtil.logInfo("Browser launched and cookies cleared.");
	}

	protected void performCommonNavigation() {
		ReportUtil.createTest("Navigation");
		try {
			basePage.navigateTo();
			ReportUtil.logPass("Navigation To AbbViePro Website Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("Navigation");
			ReportUtil.attachScreenshot(screenshotPath);

			basePage.selectCountry();
			ReportUtil.logPass("Country Selection successful.");
			String screenshotPath1 = screenshotUtil.takeScreenshot("Select Country");
			ReportUtil.attachScreenshot(screenshotPath1);

			basePage.clickingOnContinueButton();
			ReportUtil.logPass("Clicked On Continue Button Successful.");
			String screenshotPath2 = screenshotUtil.takeScreenshot("Continue Button");
			ReportUtil.attachScreenshot(screenshotPath2);

			basePage.acceptHomePageCookies();
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
			throw new RuntimeException("Navigation failed, stopping test execution.", e);
		}
	}

	// Scrolled to top of page
	public void scrollToPageTop() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
		System.out.println("Page scrolled to the top.");
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

//		ReportUtil.flushReport();
	}

	@AfterSuite
	public void flushReportSuite() {
		ReportUtil.flushReport(); 
	}

}