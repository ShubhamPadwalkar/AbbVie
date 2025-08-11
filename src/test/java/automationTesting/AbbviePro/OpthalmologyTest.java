package automationTesting.AbbviePro;

import org.testng.annotations.Test;

import automationTesting.AbbviePro.Utils.ReportUtil;

public class OpthalmologyTest extends BaseTest{
	
	@Test
	public void testNavigation() {
		performCommonNavigation();
	}

	@Test
	public void testOphthalmologyButton() {
		ReportUtil.createTest("Click On Ophthalmology Button");
		try {
			ophthalmology.clickOnOphthalmologyButton();
			ReportUtil.logPass("Click on Footer Ophthalmology Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("Ophthalmology");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Navigation to Ophthalmology page failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Ophthalmology");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	
	 @Test
	    public void testAbbvieCareButton() {
	        ReportUtil.createTest("Click On AbbVie Care Button");
	        try {
	            // Updated hcv to ophthalmology
	        	ophthalmology.clickOnAbbvieCareButton();
	            ReportUtil.logPass("Click on AbbVie Care Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("AbbvieCarePage");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on AbbVie Care button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("AbbvieCare_failure");
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
	            // Updated hcv to ophthalmology
	        	ophthalmology.clickOnLearnMoreButton();
	            ReportUtil.logPass("Click on Learn More Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("LearnMorePage");
	            ReportUtil.attachScreenshot(screenshotPath);
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
	    public void testToTheDownloadAreaButtonForPatient() {
	        ReportUtil.createTest("Click On To The Download Area Button For Patient");
	        try {
	            // Updated hcv to ophthalmology
	            ophthalmology.clickOnToTheDownloadAreaButtonForPatient();
	            ReportUtil.logPass("Click on To The Download Area Button For Patient Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("ToTheDownloadAreaPatientPage");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on To The Download Area button For Patient failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("ToTheDownloadAreaPatient_failure");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	    }

	    @Test
	    public void testToTheDownloadAreaButtonForPractitioners() {
	        ReportUtil.createTest("Click On To The Download Area Button For Practitioners");
	        try {
	            // Updated hcv to ophthalmology
	        	ophthalmology.clickOnToTheDownloadAreaButtonForPractitioners();
	            ReportUtil.logPass("Click on To The Download Area Button For Practitioners Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("ToTheDownloadAreaPractitionersPage");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on To The Download Area button For Practitioners failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("ToTheDownloadAreaPractitioners_failure");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	    }

	    @Test
	    public void testContactUsButton() {
	        ReportUtil.createTest("Click On Contact Us Button");
	        try {
	            // Updated hcv to ophthalmology
	        	ophthalmology.clickOnContactUsButton();
	            ReportUtil.logPass("Click on Contact Us Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("ContactUsPage");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Contact Us button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("ContactUs_failure");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	    }
}
