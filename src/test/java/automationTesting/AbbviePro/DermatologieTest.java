package automationTesting.AbbviePro;

import org.testng.annotations.Test;
import automationTesting.AbbviePro.Utils.ReportUtil;
import automationTesting.AbbviePro.Utils.ScrollUtils;

public class DermatologieTest extends BaseTest {

	@Test
	public void testNavigation() {
		performCommonNavigation();
	}

	@Test
	public void testDermatologieButtonNavigation() {
		ReportUtil.createTest("Click On Footer Dermatologie Button");
		try {
			dermatologie.clickOnDermatologieButton();
			ReportUtil.logPass("Click on Footer Dermatologie Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("DermatologiePage");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Navigation to Dermatologie page failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Dermatologie");
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
			dermatologie.clickLearnMoreButton();
			ReportUtil.logPass("Click on Learn More Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("LearnMorePage");
			ReportUtil.attachScreenshot(screenshotPath);
			dermatologie.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Click on Learn More button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("LearnMore_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
	public void testStreamNowButton() {
		ReportUtil.createTest("Click On Stream Now Button");
		try {
			dermatologie.clickStreamNowButton();
			ReportUtil.logPass("Click on Stream Now Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("StreamNowPage");
			ReportUtil.attachScreenshot(screenshotPath);
			dermatologie.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Click on Stream Now button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("StreamNow_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
	public void testCardLoadMoreButton() {
		ReportUtil.createTest("Click On Card Load More Button");
		try {
			for (int i = 0; i < 14; i++) {
				dermatologie.clickCardLoadMoreButton();
				ReportUtil.logPass("Click on Card Load More Button Successful - " + i);
				String screenshotPath = screenshotUtil.takeScreenshot("CardLoadMorePage");
				ReportUtil.attachScreenshot(screenshotPath);
				Thread.sleep(1000);
			}
			// JavascriptExecutor js = (JavascriptExecutor) driver;
			// js.executeScript("window.scrollTo(0, 0)");

		} catch (Exception e) {
			ReportUtil.logFail("Click on Card Load More button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("CardLoadMore_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
	public void testPageScrolling() {
		ReportUtil.createTest("Test Page Scrolling from Top to Bottom and Back to Top");
		try {
			ReportUtil.logInfo("Scrolling page slowly from top to bottom and back to top.");

			String scrollScreenshotPath = screenshotUtil.takeScreenshot("DermatologiePage_Scrolled_Bottom");
			ScrollUtils.scrollPageToBottomAndBackToTop(driver, 50, 100, scrollScreenshotPath);

			ReportUtil.logPass("Page scroll successful. Screenshot taken at the bottom.");
			ReportUtil.attachScreenshot(scrollScreenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Page scrolling failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Scrolling_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
	public void testFirstCardReadMoreButton() {
		ReportUtil.createTest("Click On First Card Read More Button");
		try {
			dermatologie.clickOnFirstCardReadMoreButton();
			ReportUtil.logPass("Click on First Card Read More Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("FirstCardReadMorePage");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on First Card Read More button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("FirstCardReadMore_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
	public void testSecondCardReadMoreButton() {
		ReportUtil.createTest("Click On Second Card Read More Button");
		try {
			dermatologie.clickOnSecondCardReadMoreButton();
			ReportUtil.logPass("Click on Second Card Read More Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("SecondCardReadMorePage");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Second Card Read More button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("SecondCardReadMore_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
	public void testThirdCardReadMoreButton() {
		ReportUtil.createTest("Click On Third Card Read More Button");
		try {
			dermatologie.clickOnThirdCardReadMoreButton();
			ReportUtil.logPass("Click on Third Card Read More Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("ThirdCardReadMorePage");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Third Card Read More button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("ThirdCardReadMore_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
	public void testFourthCardReadMoreButton() {
		ReportUtil.createTest("Click On Fourth Card Read More Button");
		try {
			dermatologie.clickOnFourthCardReadMoreButton();
			ReportUtil.logPass("Click on Fourth Card Read More Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("FourthCardReadMorePage");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Fourth Card Read More button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("FourthCardReadMore_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
	public void testFifthCardReadMoreButton() {
		ReportUtil.createTest("Click On Fifth Card Read More Button");
		try {
			dermatologie.clickOnFifthCardReadMoreButton();
			ReportUtil.logPass("Click on Fifth Card Read More Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("FifthCardReadMorePage");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Fifth Card Read More button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("FifthCardReadMore_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
	public void testSixthCardReadMoreButton() {
		ReportUtil.createTest("Click On Sixth Card Read More Button");
		try {
			dermatologie.clickOnSixthCardReadMoreButton();
			ReportUtil.logPass("Click on Sixth Card Read More Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("SixthCardReadMorePage");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Sixth Card Read More button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("SixthCardReadMore_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
	public void testSeventhCardReadMoreButton() {
		ReportUtil.createTest("Click On Seventh Card Read More Button");
		try {
			dermatologie.clickOnSeventhCardReadMoreButton();
			ReportUtil.logPass("Click on Seventh Card Read More Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("SeventhCardReadMorePage");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Seventh Card Read More button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("SeventhCardReadMore_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
	public void testEighthCardReadMoreButton() {
		ReportUtil.createTest("Click On Eighth Card Read More Button");
		try {
			dermatologie.clickOnEighthCardReadMoreButton();
			ReportUtil.logPass("Click on Eighth Card Read More Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("EighthCardReadMorePage");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Eighth Card Read More button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("EighthCardReadMore_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
	public void testNinethCardReadMoreButton() {
		ReportUtil.createTest("Click On Nineth Card Read More Button");
		try {
			dermatologie.clickOnNinethCardReadMoreButton();
			ReportUtil.logPass("Click on Nineth Card Read More Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("NinethCardReadMorePage");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Nineth Card Read More button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("NinethCardReadMore_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
	public void testScrollToPageTop() {
		ReportUtil.createTest("Test Page Scrolling from Bottom to Top");
		try {
			ReportUtil.logInfo("Page Scrolling from Bottom to Top.");
			dermatologie.scrollToPageTop();
			String scrollBottomtoTop = screenshotUtil.takeScreenshot("BottomtoTop");
			ReportUtil.attachScreenshot(scrollBottomtoTop);

		} catch (Exception e) {
			ReportUtil.logFail("Page scrolling failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Scrolling_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

}
