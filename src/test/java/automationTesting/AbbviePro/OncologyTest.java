package automationTesting.AbbviePro;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationTesting.AbbviePro.Utils.ReportUtil;
import automationTesting.AbbviePro.Utils.ScrollUtils;

public class OncologyTest extends BaseTest {

	@Test
	public void testNavigation() {
		performCommonNavigation();
	}

	@Test
	public void testOncologyButton() {
		ReportUtil.createTest("Click On Footer Oncology Button");
		try {
			oncology.clickOnOncologyButton();
			ReportUtil.logPass("Click on Footer Oncology Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("RheumatologiePage");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Navigation to Oncology page failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Oncology");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	@Test
    public void testRegisterButton() {
        ReportUtil.createTest("Click On Register Button");
        try {
            oncology.clickOnRegisterButton();
            ReportUtil.logPass("Click on Register Button Successful");
            String screenshotPath = screenshotUtil.takeScreenshot("RegisterButton");
            ReportUtil.attachScreenshot(screenshotPath);
        } catch (Exception e) {
            ReportUtil.logFail("Click on Register Button failed: " + e.getMessage());
            try {
                String screenshotPath = screenshotUtil.takeScreenshot("RegisterButton_Failed");
                ReportUtil.attachScreenshot(screenshotPath);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            Assert.fail("Test failed due to: " + e.getMessage());
        }
    }

    @Test
    public void testHematoOncologyLearnMoreButton() {
        ReportUtil.createTest("Click On Hemato-Oncology Learn More Button");
        try {
            oncology.clickOnHematoOncologyLearnMoreButton();
            ReportUtil.logPass("Click on Hemato-Oncology Learn More Button Successful");
            String screenshotPath = screenshotUtil.takeScreenshot("HematoOncologyLearnMoreButton");
            ReportUtil.attachScreenshot(screenshotPath);
        } catch (Exception e) {
            ReportUtil.logFail("Click on Hemato-Oncology Learn More Button failed: " + e.getMessage());
            try {
                String screenshotPath = screenshotUtil.takeScreenshot("HematoOncologyLearnMoreButton_Failed");
                ReportUtil.attachScreenshot(screenshotPath);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            Assert.fail("Test failed due to: " + e.getMessage());
        }
    }

    @Test
    public void testSolidTumorLearnMoreButton() {
        ReportUtil.createTest("Click On Solid Tumor Learn More Button");
        try {
            oncology.clickOnSolidTumorLearnMoreButton();
            ReportUtil.logPass("Click on Solid Tumor Learn More Button Successful");
            String screenshotPath = screenshotUtil.takeScreenshot("SolidTumorLearnMoreButton");
            ReportUtil.attachScreenshot(screenshotPath);
        } catch (Exception e) {
            ReportUtil.logFail("Click on Solid Tumor Learn More Button failed: " + e.getMessage());
            try {
                String screenshotPath = screenshotUtil.takeScreenshot("SolidTumorLearnMoreButton_Failed");
                ReportUtil.attachScreenshot(screenshotPath);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            Assert.fail("Test failed due to: " + e.getMessage());
        }
    }

    @Test
    public void testContactUsButton() {
        ReportUtil.createTest("Click On Oncology Contact Us Button");
        try {
            oncology.clickOnContactUsButton();
            ReportUtil.logPass("Click on Oncology Contact Us Button Successful");
            String screenshotPath = screenshotUtil.takeScreenshot("OncologyContactUsButton");
            ReportUtil.attachScreenshot(screenshotPath);
        } catch (Exception e) {
            ReportUtil.logFail("Click on Oncology Contact Us Button failed: " + e.getMessage());
            try {
                String screenshotPath = screenshotUtil.takeScreenshot("OncologyContactUsButton_Failed");
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
			rheumatologie.scrollToPageTop();
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

			String scrollScreenshotPath = screenshotUtil.takeScreenshot("rheumatologie_Scrolled_Bottom");
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
