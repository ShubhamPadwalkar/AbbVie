package automationTesting.AbbviePro;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationTesting.AbbviePro.Utils.ReportUtil;
import automationTesting.AbbviePro.Utils.ScrollUtils;

public class UrologyTest extends BaseTest{

	@Test
	public void testNavigation() {
		performCommonNavigation();
	}

	@Test
	public void testUrologyButton() {
		ReportUtil.createTest("Click On Footer Urology Button");
		try {
			urology.clickOnUrologyButton();
			ReportUtil.logPass("Click on Footer Urology Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("UrologyPage");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Navigation to Urology page failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Urology");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	@Test
    public void testIdiopathicOveractiveBladderButton() {
        ReportUtil.createTest("Click On Idiopathic Overactive Bladder Button");
        try {
            urology.clickOnIdiopathicOveractiveBladderButton();
            ReportUtil.logPass("Click on Idiopathic Overactive Bladder Button Successful");
            String screenshotPath = screenshotUtil.takeScreenshot("IdiopathicOveractiveBladderButton");
            ReportUtil.attachScreenshot(screenshotPath);
        } catch (Exception e) {
            ReportUtil.logFail("Click on Idiopathic Overactive Bladder Button failed: " + e.getMessage());
            try {
                String screenshotPath = screenshotUtil.takeScreenshot("IdiopathicOveractiveBladderButton_Failed");
                ReportUtil.attachScreenshot(screenshotPath);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            Assert.fail("Test failed due to: " + e.getMessage());
        }
    }

    @Test
    public void testNeurogenicDetrusorOveractivityButton() {
        ReportUtil.createTest("Click On Neurogenic Detrusor Overactivity Button");
        try {
            urology.clickOnNeurogenicDetrusorOveractivityButton();
            ReportUtil.logPass("Click on Neurogenic Detrusor Overactivity Button Successful");
            String screenshotPath = screenshotUtil.takeScreenshot("NeurogenicDetrusorOveractivityButton");
            ReportUtil.attachScreenshot(screenshotPath);
        } catch (Exception e) {
            ReportUtil.logFail("Click on Neurogenic Detrusor Overactivity Button failed: " + e.getMessage());
            try {
                String screenshotPath = screenshotUtil.takeScreenshot("NeurogenicDetrusorOveractivityButton_Failed");
                ReportUtil.attachScreenshot(screenshotPath);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            Assert.fail("Test failed due to: " + e.getMessage());
        }
    }

    @Test
    public void testUrologyContactUsButton() {
        ReportUtil.createTest("Click On Urology Contact Us Button");
        try {
            urology.clickOnContactUsButton();
            ReportUtil.logPass("Click on Urology Contact Us Button Successful");
            String screenshotPath = screenshotUtil.takeScreenshot("UrologyContactUsButton");
            ReportUtil.attachScreenshot(screenshotPath);
        } catch (Exception e) {
            ReportUtil.logFail("Click on Urology Contact Us Button failed: " + e.getMessage());
            try {
                String screenshotPath = screenshotUtil.takeScreenshot("UrologyContactUsButton_Failed");
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
