package automationTesting.AbbviePro;

import org.testng.annotations.*;
import automationTesting.AbbviePro.Utils.ReportUtil;

public class FooterTest extends BaseTest {

	@Test(priority = 1)
	public void testNavigation() {
		performCommonNavigation();
	}

	@Test(priority = 2)
	public void testFooterLogo() {
		ReportUtil.createTest("Click On Home Page Footer Logo");
		try {
			footer.clickOnFooterLogo();
			ReportUtil.logPass("Click on Home Page Footer Logo Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("FooterLogo");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_FooterLogo");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 3)
	public void testDermatologieButton() {
		ReportUtil.createTest("Click On Footer Dermatologie Button");
		try {
			footer.clickOnDermatologieButton();
			ReportUtil.logPass("Click on Footer Dermatologie Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("DermatologiePage");
			ReportUtil.attachScreenshot(screenshotPath);
			footer.pageBackButton();
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

	@Test(priority = 4)
	public void testGastroenterologieButton() {
		ReportUtil.createTest("Click On Footer Gastroenterologie Button");
		try {
			footer.clickOnGastroenterologieButton();
			ReportUtil.logPass("Click on Footer Gastroenterologie Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("GastroenterologiePage");
			ReportUtil.attachScreenshot(screenshotPath);
			footer.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation to Gastroenterologie page failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Gastroenterologie");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 5)
	public void testRheumatologieButton() {
		ReportUtil.createTest("Click On Footer Rheumatologie Button");
		try {
			footer.clickOnRheumatologieButton();
			ReportUtil.logPass("Click on Footer Rheumatologie Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("RheumatologiePage");
			ReportUtil.attachScreenshot(screenshotPath);
			footer.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation to Rheumatologie page failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Rheumatologie");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 6)
	public void testOnkologieButton() {
		ReportUtil.createTest("Click On Footer Onkologie Button");
		try {
			footer.clickOnOnkologieButton();
			ReportUtil.logPass("Click on Footer Onkologie Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("OnkologiePage");
			ReportUtil.attachScreenshot(screenshotPath);
			footer.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation to Onkologie page failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Onkologie");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 7)
	public void testNeurologieButton() {
		ReportUtil.createTest("Click On Footer Neurologie Button");
		try {
			footer.clickOnNeurologieButton();
			ReportUtil.logPass("Click on Footer Neurologie Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("NeurologiePage");
			ReportUtil.attachScreenshot(screenshotPath);
			footer.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation to Neurologie page failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Neurologie");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 8)
	public void testHCVButton() {
		ReportUtil.createTest("Click On Footer HCV Button");
		try {
			footer.clickOnHCVButton();
			ReportUtil.logPass("Click on Footer HCV Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("HCVPage");
			ReportUtil.attachScreenshot(screenshotPath);
			footer.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation to HCV page failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_HCV");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 9)
	public void testOphthalmologieButton() {
		ReportUtil.createTest("Click On Footer Ophthalmologie Button");
		try {
			footer.clickOnOphthalmologieButton();
			ReportUtil.logPass("Click on Footer Ophthalmologie Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("OphthalmologiePage");
			ReportUtil.attachScreenshot(screenshotPath);
			footer.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation to Ophthalmologie page failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Ophthalmologie");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 10)
	public void testUrologieButton() {
		ReportUtil.createTest("Click On Footer Urologie Button");
		try {
			footer.clickOnUrologieButton();
			ReportUtil.logPass("Click on Footer Urologie Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("UrologiePage");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Navigation to Urologie page failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Urologie");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	@Test(priority = 11)
	public void testImprintButton() {
		ReportUtil.createTest("Click On Footer Imprint Button");
		try {
			footer.clickOnImprintButton();
			ReportUtil.logPass("Click on Footer Imprint Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("ImprintPage");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Navigation to Imprint page failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Imprint");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 12)
	public void testPrivacyPolicyButton() {
		ReportUtil.createTest("Click On Footer Privacy Policy Button");
		try {
			footer.clickOnPrivacyPolicyButton();
			ReportUtil.logPass("Click on Footer Privacy Policy Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("PrivacyPolicyPage");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Navigation to Privacy Policy page failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_PrivacyPolicy");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 13)
	public void testTermsOfUseButton() {
		ReportUtil.createTest("Click On Footer Terms of Use Button");
		try {
			footer.clickOnTermsOfUseButton();
			ReportUtil.logPass("Click on Footer Terms of Use Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("TermsOfUsePage");
			ReportUtil.attachScreenshot(screenshotPath);
			footer.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation to Terms of Use page failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_TermsOfUse");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	@Test(priority = 14)
	public void testContactInformationButton() {
		ReportUtil.createTest("Click On Contact Information Button");
		try {
			footer.clickOnContactInformationButton();
			ReportUtil.logPass("Click on Contact Information Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("ContactInformation");
			ReportUtil.attachScreenshot(screenshotPath);
			footer.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation to Terms of Use page failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_ContactInformation");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	@Test(priority = 15)
	public void testSitemapButton() {
		ReportUtil.createTest("Click On SiteMap Button");
		try {
			footer.clickOnSiteMapButton();
			ReportUtil.logPass("Click on SiteMap Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("SiteMap");
			ReportUtil.attachScreenshot(screenshotPath);
			footer.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation to Terms of Use page failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_SiteMap");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
//package automationTesting.AbbviePro;
//
//import org.testng.annotations.*;
//import automationTesting.AbbviePro.Utils.ReportUtil;
//
//public class FooterTest extends BaseTest {
//
//	@Test
//	public void testNavigation() {
//		performCommonNavigation();
//	}
//
//	@Test
//	public void testFooterLogo() {
//		ReportUtil.createTest("Click On Home Page Footer Logo");
//		try {
//			footer.clickOnFooterLogo();
//			ReportUtil.logPass("Click on Home Page Footer Logo Successful.");
//
//			String screenshotPath = screenshotUtil.takeScreenshot("FooterLogo"); // Changed screenshot name for clarity
//			ReportUtil.attachScreenshot(screenshotPath);
//
//		} catch (Exception e) {
//			ReportUtil.logFail("Navigation failed: " + e.getMessage());
//			try {
//				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_FooterLogo");
//				ReportUtil.attachScreenshot(screenshotPath);
//
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}
//		}
//	}
//
//	// --- Remaining Test Methods ---
//
//	@Test
//	public void testDermatologieButton() {
//		ReportUtil.createTest("Click On Footer Dermatologie Button");
//		try {
//			footer.clickOnDermatologieButton();
//			ReportUtil.logPass("Click on Footer Dermatologie Button Successful.");
//
//			String screenshotPath = screenshotUtil.takeScreenshot("DermatologiePage");
//			ReportUtil.attachScreenshot(screenshotPath);
//			footer.pageBackButton();
//		} catch (Exception e) {
//			ReportUtil.logFail("Navigation to Dermatologie page failed: " + e.getMessage());
//			try {
//				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Dermatologie");
//				ReportUtil.attachScreenshot(screenshotPath);
//
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}
//		}
//	}
//
//	@Test
//	public void testGastroenterologieButton() {
//		ReportUtil.createTest("Click On Footer Gastroenterologie Button");
//		try {
//			footer.clickOnGastroenterologieButton();
//			ReportUtil.logPass("Click on Footer Gastroenterologie Button Successful.");
//
//			String screenshotPath = screenshotUtil.takeScreenshot("GastroenterologiePage");
//			ReportUtil.attachScreenshot(screenshotPath);
//			footer.pageBackButton();
//
//		} catch (Exception e) {
//			ReportUtil.logFail("Navigation to Gastroenterologie page failed: " + e.getMessage());
//			try {
//				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Gastroenterologie");
//				ReportUtil.attachScreenshot(screenshotPath);
//
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}
//		}
//	}
//
//	@Test
//	public void testRheumatologieButton() {
//		ReportUtil.createTest("Click On Footer Rheumatologie Button");
//		try {
//			footer.clickOnRheumatologieButton();
//			ReportUtil.logPass("Click on Footer Rheumatologie Button Successful.");
//
//			String screenshotPath = screenshotUtil.takeScreenshot("RheumatologiePage");
//			ReportUtil.attachScreenshot(screenshotPath);
//			footer.pageBackButton();
//
//		} catch (Exception e) {
//			ReportUtil.logFail("Navigation to Rheumatologie page failed: " + e.getMessage());
//			try {
//				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Rheumatologie");
//				ReportUtil.attachScreenshot(screenshotPath);
//
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}
//		}
//	}
//
//	@Test
//	public void testOnkologieButton() {
//		ReportUtil.createTest("Click On Footer Onkologie Button");
//		try {
//			footer.clickOnOnkologieButton();
//			ReportUtil.logPass("Click on Footer Onkologie Button Successful.");
//
//			String screenshotPath = screenshotUtil.takeScreenshot("OnkologiePage");
//			ReportUtil.attachScreenshot(screenshotPath);
//			footer.pageBackButton();
//
//		} catch (Exception e) {
//			ReportUtil.logFail("Navigation to Onkologie page failed: " + e.getMessage());
//			try {
//				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Onkologie");
//				ReportUtil.attachScreenshot(screenshotPath);
//
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}
//		}
//	}
//
//	@Test
//	public void testNeurologieButton() {
//		ReportUtil.createTest("Click On Footer Neurologie Button");
//		try {
//			footer.clickOnNeurologieButton();
//			ReportUtil.logPass("Click on Footer Neurologie Button Successful.");
//
//			String screenshotPath = screenshotUtil.takeScreenshot("NeurologiePage");
//			ReportUtil.attachScreenshot(screenshotPath);
//			footer.pageBackButton();
//
//		} catch (Exception e) {
//			ReportUtil.logFail("Navigation to Neurologie page failed: " + e.getMessage());
//			try {
//				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Neurologie");
//				ReportUtil.attachScreenshot(screenshotPath);
//
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}
//		}
//	}
//
//	@Test
//	public void testHCVButton() {
//		ReportUtil.createTest("Click On Footer HCV Button");
//		try {
//			footer.clickOnHCVButton();
//			ReportUtil.logPass("Click on Footer HCV Button Successful.");
//
//			String screenshotPath = screenshotUtil.takeScreenshot("HCVPage");
//			ReportUtil.attachScreenshot(screenshotPath);
//			footer.pageBackButton();
//
//		} catch (Exception e) {
//			ReportUtil.logFail("Navigation to HCV page failed: " + e.getMessage());
//			try {
//				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_HCV");
//				ReportUtil.attachScreenshot(screenshotPath);
//
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}
//		}
//	}
//
//	@Test
//	public void testOphthalmologieButton() {
//		ReportUtil.createTest("Click On Footer Ophthalmologie Button");
//		try {
//			footer.clickOnOphthalmologieButton();
//			ReportUtil.logPass("Click on Footer Ophthalmologie Button Successful.");
//
//			String screenshotPath = screenshotUtil.takeScreenshot("OphthalmologiePage");
//			ReportUtil.attachScreenshot(screenshotPath);
//			footer.pageBackButton();
//
//		} catch (Exception e) {
//			ReportUtil.logFail("Navigation to Ophthalmologie page failed: " + e.getMessage());
//			try {
//				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Ophthalmologie");
//				ReportUtil.attachScreenshot(screenshotPath);
//
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}
//		}
//	}
//
//	@Test
//	public void testUrologieButton() {
//		ReportUtil.createTest("Click On Footer Urologie Button");
//		try {
//			footer.clickOnUrologieButton();
//			ReportUtil.logPass("Click on Footer Urologie Button Successful.");
//
//			String screenshotPath = screenshotUtil.takeScreenshot("UrologiePage");
//			ReportUtil.attachScreenshot(screenshotPath);
//
//		} catch (Exception e) {
//			ReportUtil.logFail("Navigation to Urologie page failed: " + e.getMessage());
//			try {
//				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Urologie");
//				ReportUtil.attachScreenshot(screenshotPath);
//
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}
//		}
//	}
//	
//	@Test
//	public void testImprintButton() {
//		ReportUtil.createTest("Click On Footer Imprint Button");
//		try {
//			footer.clickOnImprintButton();
//			ReportUtil.logPass("Click on Footer Imprint Button Successful.");
//
//			String screenshotPath = screenshotUtil.takeScreenshot("ImprintPage");
//			ReportUtil.attachScreenshot(screenshotPath);
//		} catch (Exception e) {
//			ReportUtil.logFail("Navigation to Imprint page failed: " + e.getMessage());
//			try {
//				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_Imprint");
//				ReportUtil.attachScreenshot(screenshotPath);
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}
//		}
//	}
//
//	@Test
//	public void testPrivacyPolicyButton() {
//		ReportUtil.createTest("Click On Footer Privacy Policy Button");
//		try {
//			footer.clickOnPrivacyPolicyButton();
//			ReportUtil.logPass("Click on Footer Privacy Policy Button Successful.");
//
//			String screenshotPath = screenshotUtil.takeScreenshot("PrivacyPolicyPage");
//			ReportUtil.attachScreenshot(screenshotPath);
//		} catch (Exception e) {
//			ReportUtil.logFail("Navigation to Privacy Policy page failed: " + e.getMessage());
//			try {
//				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_PrivacyPolicy");
//				ReportUtil.attachScreenshot(screenshotPath);
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}
//		}
//	}
//
//	@Test
//	public void testTermsOfUseButton() {
//		ReportUtil.createTest("Click On Footer Terms of Use Button");
//		try {
//			footer.clickOnTermsOfUseButton();
//			ReportUtil.logPass("Click on Footer Terms of Use Button Successful.");
//
//			String screenshotPath = screenshotUtil.takeScreenshot("TermsOfUsePage");
//			ReportUtil.attachScreenshot(screenshotPath);
//			footer.pageBackButton();
//		} catch (Exception e) {
//			ReportUtil.logFail("Navigation to Terms of Use page failed: " + e.getMessage());
//			try {
//				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_TermsOfUse");
//				ReportUtil.attachScreenshot(screenshotPath);
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}
//		}
//	}
//	
//	@Test
//	public void testContactInformationButton() {
//		ReportUtil.createTest("Click On Contact Information Button");
//		try {
//			footer.clickOnContactInformationButton();
//			ReportUtil.logPass("Click on Contact Information Button Successful.");
//
//			String screenshotPath = screenshotUtil.takeScreenshot("ContactInformation");
//			ReportUtil.attachScreenshot(screenshotPath);
//			footer.pageBackButton();
//		} catch (Exception e) {
//			ReportUtil.logFail("Navigation to Terms of Use page failed: " + e.getMessage());
//			try {
//				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_ContactInformation");
//				ReportUtil.attachScreenshot(screenshotPath);
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}
//		}
//	}
//	
//	@Test
//	public void testSitemapButton() {
//		ReportUtil.createTest("Click On SiteMap Button");
//		try {
//			footer.clickOnSiteMapButton();
//			ReportUtil.logPass("Click on SiteMap Button Successful.");
//
//			String screenshotPath = screenshotUtil.takeScreenshot("SiteMap");
//			ReportUtil.attachScreenshot(screenshotPath);
//			footer.pageBackButton();
//		} catch (Exception e) {
//			ReportUtil.logFail("Navigation to Terms of Use page failed: " + e.getMessage());
//			try {
//				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure_SiteMap");
//				ReportUtil.attachScreenshot(screenshotPath);
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}
//		}
//	}
//}
