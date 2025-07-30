package automationTesting.AbbviePro;

import org.testng.annotations.*;
import automationTesting.AbbviePro.Utils.ReportUtil;

public class HeaderTest extends BaseTest {

	@Test(priority = 1)
	public void testNavigation() {
		performCommonNavigation();
	}

 // Product Page
	@Test(priority = 2)
	public void testHomePageButton() {
		ReportUtil.createTest("Click On Home Page Button");
		try {
			header.clickOnHomePageButton();
			ReportUtil.logPass("Click on Home Page Button Successful.");

			String screenshotPath = screenshotUtil.takeScreenshot("HomePageButton");
			ReportUtil.attachScreenshot(screenshotPath);

		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 3)
	public void testProductPageButton() {
		ReportUtil.createTest("Click On Product Page Button");
		try {
			header.clickOnProductPageButton();
			ReportUtil.logPass("Click on Product Page Button Successful.");

			String screenshotPath = screenshotUtil.takeScreenshot("ProductPageButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();

		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 4)
	public void testProductChevronIcon() {
		ReportUtil.createTest("Click On Product Chevron Icon");
		try {
			header.clickOnProductChevronIcon();
			ReportUtil.logPass("Click on Product Chevron Icon Successful.");

			String screenshotPath = screenshotUtil.takeScreenshot("ProductChevronIcon");
			ReportUtil.attachScreenshot(screenshotPath);

		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 5)
	public void testProductOverviewButton() {
		ReportUtil.createTest("Click On Product Overview Button");
		try {
			header.clickOnProductOverviewButton();
			ReportUtil.logPass("Click on Product Overview Button Successful.");

			String screenshotPath = screenshotUtil.takeScreenshot("ProductOverviewButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();

		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 6)
	public void testProductAndUserInformationButton() {
		ReportUtil.createTest("Click On Product And User Information Button");
		try {
			Thread.sleep(2000);
			header.clickOnProductChevronIcon();
			header.clickOnproductAndUserInformationButton();
			ReportUtil.logPass("Click on Product And User Information Button Successful.");

			String screenshotPath = screenshotUtil.takeScreenshot("productAndUserInformationButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();

		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 7)
	public void testTrainingMaterialButton() {
		ReportUtil.createTest("Click On Training Material Button");
		try {
			Thread.sleep(2000);
			header.clickOnProductChevronIcon();
			header.clickOnproductAndUserInformationButton();
			ReportUtil.logPass("Click on Training Material Button Successful.");

			String screenshotPath = screenshotUtil.takeScreenshot("TrainingMaterialButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();

		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	// Thearpy Area
	@Test(priority = 8)
	public void testTherapiegebieteButton() {
		ReportUtil.createTest("Click On Therapiegebiete Button");
		try {
			header.clickOnTherapiegebieteButton();
			ReportUtil.logPass("Click on Therapiegebiete Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("TherapiegebieteButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	@Test(priority = 9)
	public void testtherapiegebieteChevronIcon() {
		ReportUtil.createTest("Click On Product Chevron Icon");
		try {
			header.clickOntherapiegebieteChevronIcon();
			ReportUtil.logPass("Click on Therapiegebiete Chevron Icon Successful.");

			String screenshotPath = screenshotUtil.takeScreenshot("therapiegebieteChevronIcon");
			ReportUtil.attachScreenshot(screenshotPath);

		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	@Test(priority = 10)
	public void testImmunologieButton() {
		ReportUtil.createTest("Click On Immunologie Button");
		try {
			Thread.sleep(2000);
			header.clickOntherapiegebieteChevronIcon();
			Thread.sleep(2000);
			header.clickOnImmunologieButton();
			ReportUtil.logPass("Click on Immunologie Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("ImmunologieButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 11)
	public void testDermatologieButton() {
		ReportUtil.createTest("Click On Dermatologie Button");
		try {
			header.clickOntherapiegebieteChevronIcon();
			header.clickOnDermatologieButton();
			ReportUtil.logPass("Click on Dermatologie Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("DermatologieButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 12)
	public void testGastroenterologieButton() {
		ReportUtil.createTest("Click On Gastroenterologie Button");
		try {
			header.clickOntherapiegebieteChevronIcon();
			header.clickOnGastroenterologieButton();
			ReportUtil.logPass("Click on Gastroenterologie Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("GastroenterologieButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 13)
	public void testRheumatologieButton() {
		ReportUtil.createTest("Click On Rheumatologie Button");
		try {
			header.clickOntherapiegebieteChevronIcon();
			header.clickOnRheumatologieButton();
			ReportUtil.logPass("Click on Rheumatologie Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("RheumatologieButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 13)
	public void testOnkologieButton() {
		ReportUtil.createTest("Click On Onkologie Button");
		try {
			header.clickOnOnkologieButton();
			ReportUtil.logPass("Click on Onkologie Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("OnkologieButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 14)
	public void testHematooncologyButton() {
		ReportUtil.createTest("Click On Hematooncology Button");
		try {
			header.clickOnHematooncologyButton();
			ReportUtil.logPass("Click on Hematooncology Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("HematooncologyButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 15)
	public void testSolidTumorsButton() {
		ReportUtil.createTest("Click On Solid Tumors Button");
		try {
			header.clickOnSolidTumorsButton();
			ReportUtil.logPass("Click on Solid Tumors Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("SolidTumorsButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 16)
	public void testNeurologyButton() {
		ReportUtil.createTest("Click On Neurology Button");
		try {
			header.clickOnNeurologyButton();
			ReportUtil.logPass("Click on Neurology Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("NeurologyButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 17)
	public void testMigraineButton() {
		ReportUtil.createTest("Click On Migraine Button");
		try {
			header.clickOnMigraineButton();
			ReportUtil.logPass("Click on Migraine Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("MigraineButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 18)
	public void testParkinsonsDiseaseButton() {
		ReportUtil.createTest("Click On Parkinsons Disease Button");
		try {
			header.clickOnParkinsonsDiseaseButton();
			ReportUtil.logPass("Click on Parkinsons Disease Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("ParkinsonsDiseaseButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 19)
	public void testSpasticityAfterStrokeButton() {
		ReportUtil.createTest("Click On Spasticity After Stroke Button");
		try {
			header.clickOnSpasticityAfterStrokeButton();
			ReportUtil.logPass("Click on Spasticity After Stroke Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("SpasticityAfterStrokeButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 20)
	public void testVirologyButton() {
		ReportUtil.createTest("Click On Virology Button");
		try {
			header.clickOnVirologyButton();
			ReportUtil.logPass("Click on Virology Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("VirologyButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 21)
	public void testHepatitisCHCVButton() {
		ReportUtil.createTest("Click On Hepatitis C HCV Button");
		try {
			header.clickOnHepatitisCHCVButton();
			ReportUtil.logPass("Click on Hepatitis C HCV Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("HepatitisCHCVButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 22)
	public void testOphthalmologyParentButton() {
		ReportUtil.createTest("Click On Ophthalmology Parent Button");
		try {
			header.clickOnOphthalmologyParentButton();
			ReportUtil.logPass("Click on Ophthalmology Parent Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("OphthalmologyParentButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 23)
	public void testOphthalmologyChildButton() {
		ReportUtil.createTest("Click On Ophthalmology Child Button");
		try {
			header.clickOnOphthalmologyChildButton();
			ReportUtil.logPass("Click on Ophthalmology Child Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("OphthalmologyChildButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 24)
	public void testUrologyButton() {
		ReportUtil.createTest("Click On Urology Button");
		try {
			header.clickOnUrologyButton();
			ReportUtil.logPass("Click on Urology Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("UrologyButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 25)
	public void testIdiopathicOveractiveBladderButton() {
		ReportUtil.createTest("Click On Idiopathic Overactive Bladder Button");
		try {
			header.clickOnIdiopathicOveractiveBladderButton();
			ReportUtil.logPass("Click on Idiopathic Overactive Bladder Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("IdiopathicOveractiveBladderButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 26)
	public void testNeurogenicDetrusorOveractivityButton() {
		ReportUtil.createTest("Click On Neurogenic Detrusor Overactivity Button");
		try {
			header.clickOnNeurogenicDetrusorOveractivityButton();
			ReportUtil.logPass("Click on Neurogenic Detrusor Overactivity Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("NeurogenicDetrusorOveractivityButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test(priority = 27)
	public void testRegisterNowButton() {
		ReportUtil.createTest("Click On Register Now Button");
		try {
			header.clickOnRegisterNowButton();
			ReportUtil.logPass("Click on Register Now Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("RegisterNowButton");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
		} catch (Exception e) {
			ReportUtil.logFail("Navigation failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

}