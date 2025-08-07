package automationTesting.AbbviePro;

import org.testng.annotations.*;

import automationTesting.AbbviePro.Utils.ReportUtil;

public class HomePageTest extends BaseTest {

	@Test
	public void testNavigation() {
		performCommonNavigation();
	}

	@Test
	public void testRegisterButton() {
		ReportUtil.createTest("Click On Register Button");
		try {
			homePage.clickOnRegisterButton();
			ReportUtil.logPass("Navigation Register Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("RegisterButton");
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

	@Test
	public void testLearnMoreButton() {
		ReportUtil.createTest("Click On Learn More Button");
		try {
			homePage.clickOnLearnMoreButton();
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

	@Test
	public void testProductsLearnMore() {
		ReportUtil.createTest("Click On Product Learn More Button");
		try {
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

	@Test
	public void testTheoropaticButton() {
		ReportUtil.createTest("Click On Theoropatic Button Button");
		try {
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

	@Test
	public void testContactButton() {
		ReportUtil.createTest("Click On Contact Button Button");
		try {
			homePage.contactButtonMethod();
			ReportUtil.logPass("Navigation to Contact Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("ContactButton");
			ReportUtil.attachScreenshot(screenshotPath);
			homePage.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
		}
	}

	@Test
	public void testSecondRegisterButton() {
		ReportUtil.createTest("Click On Second Register Button");
		try {
			homePage.secondRegisterButtonMethod();
			ReportUtil.logPass("Navigation to Register Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("RegisterButton");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
		}
	}

	@Test
	public void testSecondContactUsButton() {
		ReportUtil.createTest("Click On Contact Us Button");
		try {
			homePage.secondContactUsButton();
			ReportUtil.logPass("Navigation to Contact Us Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("secondContactUsButton");
			ReportUtil.attachScreenshot(screenshotPath);
			homePage.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
		}
	}
	
	@Test
	public void testBackToTopButton() {
		ReportUtil.createTest("Click On Back To Top Button");
		try {
			homePage.clickOnBackToTopButton();
			ReportUtil.logPass("Navigation to On Back To Top Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("BackToTopButton");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
		}
	}
}
