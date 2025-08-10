package automationTesting.AbbviePro;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationTesting.AbbviePro.Utils.ReportUtil;
import automationTesting.AbbviePro.Utils.ScrollUtils;

public class NeurologyTest extends BaseTest {

	@Test
	public void testNavigation() {
		performCommonNavigation();
	}

	@Test
	public void testNeurologyButton() {
		ReportUtil.createTest("Click On Footer Neurology Button");
		try {
			neurology.clickOnNeurologyButton();
			ReportUtil.logPass("Click on Footer Neurology Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("NeurologyPage");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Navigation to Neurology page failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Neurology");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
	public void testCarouselChevronIcon() {
		ReportUtil.createTest("Click On Carousel Chevron Icon Button");
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 500);");
			Thread.sleep(1000);
			for (int i = 0; i < 3; i++) {
				neurology.clickOnCarouselChevronIcon();
				ReportUtil.logPass("Click on Carousel Chevron Icon " + (i + 1) + " Successful.");
				String screenshotPath = screenshotUtil.takeScreenshot("carouselChevronIcon" + i);
				ReportUtil.attachScreenshot(screenshotPath);
				Thread.sleep(2000);
			}

		} catch (Exception e) {
			ReportUtil.logFail("Navigation to Carousel Chevron Icon failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_carouselChevronIcon");
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
			for (int i = 0; i < 8; i++) {
				neurology.clickCardLoadMoreButton();
				ReportUtil.logPass("Click on Card Load More Button Successful - " + i);
				String screenshotPath = screenshotUtil.takeScreenshot("CardLoadMorePage");
				ReportUtil.attachScreenshot(screenshotPath);
			}
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
	public void testEAN_CongressReadMoreButton() {
		ReportUtil.createTest("Click On EAN Congress Read More Button");
		try {
			neurology.clickOnEAN_CongressReadMoreButton();
			ReportUtil.logPass("Click on EAN Congress Read More Button Successful");
			String screenshotPath = screenshotUtil.takeScreenshot("EAN_CongressReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on EAN Congress Read More Button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("EAN_CongressReadMoreButton_Failed");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			Assert.fail("Test failed due to: " + e.getMessage());
		}
	}

	@Test
	public void testS2K_GuidelineReadMoreButton() {
		ReportUtil.createTest("Click On S2K Guideline Read More Button");
		try {
			neurology.clickOnS2K_GuidelineReadMoreButton();
			ReportUtil.logPass("Click on S2K Guideline Read More Button Successful");
			String screenshotPath = screenshotUtil.takeScreenshot("S2K_GuidelineReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on S2K Guideline Read More Button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("S2K_GuidelineReadMoreButton_Failed");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			Assert.fail("Test failed due to: " + e.getMessage());
		}
	}

	@Test
	public void testEventsInNeurologyReadMoreButton() {
		ReportUtil.createTest("Click On Events in Neurology Read More Button");
		try {
			neurology.clickOnEventsInNeurologyReadMoreButton();
			ReportUtil.logPass("Click on Events in Neurology Read More Button Successful");
			String screenshotPath = screenshotUtil.takeScreenshot("EventsInNeurologyReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Events in Neurology Read More Button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("EventsInNeurologyReadMoreButton_Failed");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			Assert.fail("Test failed due to: " + e.getMessage());
		}
	}

	@Test
	public void testParkinsonDiseaseReadMoreButton() {
		ReportUtil.createTest("Click On Parkinson Disease Read More Button");
		try {
			neurology.clickOnParkinsonDiseaseReadMoreButton();
			ReportUtil.logPass("Click on Parkinson Disease Read More Button Successful");
			String screenshotPath = screenshotUtil.takeScreenshot("ParkinsonDiseaseReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Parkinson Disease Read More Button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("ParkinsonDiseaseReadMoreButton_Failed");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			Assert.fail("Test failed due to: " + e.getMessage());
		}
	}

	@Test
	public void testManage_PD_AccessToolButton() {
		ReportUtil.createTest("Click On Manage PD Access Tool Button");
		try {
			neurology.clickOnManage_PD_AccessToolButton();
			Thread.sleep(2000);
			ReportUtil.logPass("Click on Manage PD Access Tool Button Successful");
			String screenshotPath = screenshotUtil.takeScreenshot("Manage_PD_AccessToolButton");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Manage PD Access Tool Button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Manage_PD_AccessToolButton_Failed");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			Assert.fail("Test failed due to: " + e.getMessage());
		}
	}

	@Test
	public void testInformationRequestForFreeButton() {
		ReportUtil.createTest("Click On Information Request For Free Button");
		try {
			neurology.clickOnInformationRequestForFreeButton();
			ReportUtil.logPass("Click on Information Request For Free Button Successful");
			String screenshotPath = screenshotUtil.takeScreenshot("InformationRequestForFreeButton");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Information Request For Free Button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("InformationRequestForFreeButton_Failed");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			Assert.fail("Test failed due to: " + e.getMessage());
		}
	}

	@Test
	public void testAbbvieCareButton() {
		ReportUtil.createTest("Click On AbbVie Care Button");
		try {
			neurology.clickOnAbbvieCareButton();
			ReportUtil.logPass("Click on AbbVie Care Button Successful");
			String screenshotPath = screenshotUtil.takeScreenshot("AbbvieCareButton");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on AbbVie Care Button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("AbbvieCareButton_Failed");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			Assert.fail("Test failed due to: " + e.getMessage());
		}
	}

	@Test
	public void testPARKOUR_ToTheCurrentIssueButton() {
		ReportUtil.createTest("Click On PARKOUR To The Current Issue Button");
		try {
			neurology.clickOnPARKOUR_ToTheCurrentIssueButton();
			ReportUtil.logPass("Click on PARKOUR To The Current Issue Button Successful");
			String screenshotPath = screenshotUtil.takeScreenshot("PARKOUR_ToTheCurrentIssueButton");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on PARKOUR To The Current Issue Button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("PARKOUR_ToTheCurrentIssueButton_Failed");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			Assert.fail("Test failed due to: " + e.getMessage());
		}
	}

	@Test
	public void testParkinsonLearnMoreButton() {
		ReportUtil.createTest("Click On Parkinson Learn More Button");
		try {
			neurology.clickOnParkinsonLearnMoreButton();
			ReportUtil.logPass("Click on Parkinson Learn More Button Successful");
			String screenshotPath = screenshotUtil.takeScreenshot("ParkinsonLearnMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Parkinson Learn More Button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("ParkinsonLearnMoreButton_Failed");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			Assert.fail("Test failed due to: " + e.getMessage());
		}
	}

	@Test
	public void testAbbvieNetworking_PHP_Button() {
		ReportUtil.createTest("Click On AbbVie Networking PHP Button");
		try {
			neurology.clickOnAbbvieNetworking_PHP_Button();
			ReportUtil.logPass("Click on AbbVie Networking PHP Button Successful");
			String screenshotPath = screenshotUtil.takeScreenshot("AbbvieNetworking_PHP_Button");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on AbbVie Networking PHP Button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("AbbvieNetworking_PHP_Button_Failed");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			Assert.fail("Test failed due to: " + e.getMessage());
		}
	}

	@Test
	public void testParkinsonNetworkYoutubeVideoButton() {
		ReportUtil.createTest("Click On Parkinson Network Youtube Video Button");
		try {
			neurology.clickOnParkinsonNetworkYoutubeVideoButton();
			ReportUtil.logPass("Click on Parkinson Network Youtube Video Button Successful");
			String screenshotPath = screenshotUtil.takeScreenshot("ParkinsonNetworkYoutubeVideoButton");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Parkinson Network Youtube Video Button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("ParkinsonNetworkYoutubeVideoButton_Failed");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			Assert.fail("Test failed due to: " + e.getMessage());
		}
	}

	@Test
	public void testParkinsonNetworkGermany_PND_Button() {
		ReportUtil.createTest("Click On Parkinson Network Germany (PND) Button");
		try {
			neurology.clickOnParkinsonNetworkGermany_PND_Button();
			ReportUtil.logPass("Click on Parkinson Network Germany (PND) Button Successful");
			String screenshotPath = screenshotUtil.takeScreenshot("ParkinsonNetworkGermany_PND_Button");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Parkinson Network Germany (PND) Button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("ParkinsonNetworkGermany_PND_Button_Failed");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			Assert.fail("Test failed due to: " + e.getMessage());
		}
	}

	@Test
	public void testContactUsButton() {
		ReportUtil.createTest("Click On Neurology Contact Us Button");
		try {
			neurology.clickOnContactUsButton();
			ReportUtil.logPass("Click on Neurology Contact Us Button Successful");
			String screenshotPath = screenshotUtil.takeScreenshot("NeurologyContactUsButton");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Neurology Contact Us Button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("NeurologyContactUsButton_Failed");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			Assert.fail("Test failed due to: " + e.getMessage());
		}
	}
	
	@Test
	public void testScrollToPageTop() {
		ReportUtil.createTest("Test Page Scrolling from Bottom to Top");
		try {
			ReportUtil.logInfo("Page Scrolling from Bottom to Top.");
			gastroenterologie.scrollToPageTop();
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

}
