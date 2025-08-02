package automationTesting.AbbviePro;

import org.testng.annotations.*;
import automationTesting.AbbviePro.Utils.ReportUtil;

public class HeaderTest extends BaseTest {

	@Test
	public void testNavigation() {
		performCommonNavigation();
	}
	// ---------------------

	@Test
	public void testHeaderLogo() {
		ReportUtil.createTest("Click On Home Page Header Logo");
		try {
			header.clickOnHeaderLogo();
			ReportUtil.logPass("Click on Home Page Header Logo Successful.");

			String screenshotPath = screenshotUtil.takeScreenshot("HeaderLogo");
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

	@Test
	public void testRegister_WithEmail() {
		ReportUtil.createTest("Click On Home Page Register Button (If Already SignIn)");
		try {
			header.clickOnRegisterWithEmail();
			ReportUtil.logPass("Click on Home Page Register Button (If Already SignIn) Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("HeaderLogo");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
			Thread.sleep(1000);

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

	@Test
	public void testRegister_FillDetails() {
		ReportUtil.createTest("Click On Home Page Register Button (If Not SignIn)");
		try {
			header.clickOnRegister_FillDetails();
			ReportUtil.logPass("Click on Home Page Register Button (If Not SignIn)) Successful.");
			
			String screenshotPath = screenshotUtil.takeScreenshot("Register_FillDetails");
			ReportUtil.attachScreenshot(screenshotPath);
			header.pageBackButton();
			Thread.sleep(1000);

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
	
	// After clicking on it it is opening mail box... Eliminating the Test case
//	@Test(priority = 5)
//	public void testReport_An_Adverse_Event() {
//		ReportUtil.createTest("Click On Home Page Report An Adverse Event");
//		try {
//			header.clickOnReport_An_Adverse_Event();
//			ReportUtil.logPass("Click on Report An Adverse Event Successful.");
//			// Screenshot cannot be captured
//			header.pageBackButton();
//
//		} catch (Exception e) {
//			ReportUtil.logFail("Navigation failed: " + e.getMessage());
//			try {
//				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
//				ReportUtil.attachScreenshot(screenshotPath);
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}
//		}
//	}

	// ---------------------

	// Product Page
	@Test
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
				header.pageBackButton();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
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

	@Test
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

	@Test
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

	@Test
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

	@Test
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
	@Test
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

	@Test
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

	@Test
	public void testImmunologieButton() {
		ReportUtil.createTest("Click On Immunologie Button");
		try {
			Thread.sleep(2000); // Consider removing or replacing with explicit waits
			header.clickOntherapiegebieteChevronIcon();
			Thread.sleep(2000); // Consider removing or replacing with explicit waits
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
				// This is crucial: if pageBackButton() also fails, it won't clean up
				header.pageBackButton(); // This might also fail if the page is in a bad state
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			// *** THIS IS THE MISSING PIECE ***
			// You must re-throw the exception to mark the TestNG test as failed
			throw new RuntimeException("Test Immunologie Button failed due to navigation issue.", e);
		}
	}
//	@Test(priority = 10)
//	public void testImmunologieButton() {
//		ReportUtil.createTest("Click On Immunologie Button");
//		try {
//			Thread.sleep(2000);
//			header.clickOntherapiegebieteChevronIcon();
//			Thread.sleep(2000);
//			header.clickOnImmunologieButton();
//			ReportUtil.logPass("Click on Immunologie Button Successful.");
//			String screenshotPath = screenshotUtil.takeScreenshot("ImmunologieButton");
//			ReportUtil.attachScreenshot(screenshotPath);
//			header.pageBackButton();
//		} catch (Exception e) {
//			ReportUtil.logFail("Navigation failed: " + e.getMessage());
//			try {
//				String screenshotPath = screenshotUtil.takeScreenshot("Navigation_failure");
//				ReportUtil.attachScreenshot(screenshotPath);
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}
//		}
//	}

	@Test
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

	@Test
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

	@Test
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

	@Test
	public void testOnkologieButton() {
		ReportUtil.createTest("Click On Onkologie Button");
		try {
			header.clickOntherapiegebieteChevronIcon();
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

	@Test
	public void testHematooncologyButton() {
		ReportUtil.createTest("Click On Hematooncology Button");
		try {
			header.clickOntherapiegebieteChevronIcon();
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

	@Test
	public void testSolidTumorsButton() {
		ReportUtil.createTest("Click On Solid Tumors Button");
		try {
			header.clickOntherapiegebieteChevronIcon();
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

	@Test
	public void testNeurologyButton() {
		ReportUtil.createTest("Click On Neurology Button");
		try {
			header.clickOntherapiegebieteChevronIcon();
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

	@Test
	public void testMigraineButton() {
		ReportUtil.createTest("Click On Migraine Button");
		try {
			header.clickOntherapiegebieteChevronIcon();
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

	@Test
	public void testParkinsonsDiseaseButton() {
		ReportUtil.createTest("Click On Parkinsons Disease Button");
		try {
			header.clickOntherapiegebieteChevronIcon();
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

	@Test
	public void testSpasticityAfterStrokeButton() {
		ReportUtil.createTest("Click On Spasticity After Stroke Button");
		try {
			header.clickOntherapiegebieteChevronIcon();
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

	@Test
	public void testVirologyButton() {
		ReportUtil.createTest("Click On Virology Button");
		try {
			header.clickOntherapiegebieteChevronIcon();
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

	@Test
	public void testHepatitisCHCVButton() {
		ReportUtil.createTest("Click On Hepatitis C HCV Button");
		try {
			header.clickOntherapiegebieteChevronIcon();
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

	@Test
	public void testOphthalmologyParentButton() {
		ReportUtil.createTest("Click On Ophthalmology Parent Button");
		try {
			header.clickOntherapiegebieteChevronIcon();
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

	@Test
	public void testOphthalmologyChildButton() {
		ReportUtil.createTest("Click On Ophthalmology Child Button");
		try {
			header.clickOntherapiegebieteChevronIcon();
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

	@Test
	public void testUrologyButton() {
		ReportUtil.createTest("Click On Urology Button");
		try {
			header.clickOntherapiegebieteChevronIcon();
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

	@Test
	public void testIdiopathicOveractiveBladderButton() {
		ReportUtil.createTest("Click On Idiopathic Overactive Bladder Button");
		try {
			header.clickOntherapiegebieteChevronIcon();
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

	@Test
	public void testNeurogenicDetrusorOveractivityButton() {
		ReportUtil.createTest("Click On Neurogenic Detrusor Overactivity Button");
		try {
			header.clickOntherapiegebieteChevronIcon();
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

	@Test
	public void testRegisterNowButton() {
		ReportUtil.createTest("Click On Register Now Button");
		try {
			header.clickOntherapiegebieteChevronIcon();
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
	// - - - -

	@Test
	public void testEventsAndTrainingButton() {
		ReportUtil.createTest("Click On Events And Training Button");
		try {
			header.clickOneventsAndTrainingButton();
			ReportUtil.logPass("Click on Events And Training Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("eventsAndTraining");
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

	@Test
	public void testEventsAndTrainingChevronIcon() {
		ReportUtil.createTest("Click On Events And Training Chevron Icon");
		try {
			header.clickOnEventsAndTrainingChevronIcon();
			ReportUtil.logPass("Click on Events And Training Chevron Icon Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("EventsAndTrainingChevronIcon");
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

	@Test
	public void testMedicalScientificEventsButton() {
		ReportUtil.createTest("Click On Medical Scientific Events Button");
		try {
			header.clickOnEventsAndTrainingChevronIcon();
			header.clickOnMedicalScientificEventsButton();
			ReportUtil.logPass("Click on Medical Scientific Events Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("MedicalScientificEvents");
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

	@Test
	public void testProductRelatedEventsButton() {
		ReportUtil.createTest("Click On Product Related Events Button");
		try {
			header.clickOnEventsAndTrainingChevronIcon();
			header.clickOnProductRelatedEventsButton();
			ReportUtil.logPass("Click on Product Related Events Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("ProductRelatedEvents");
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

	@Test
	public void testEventsAndTrainingRegisterNowButton() {
		ReportUtil.createTest("Click On Events And Training Register Now Button");
		try {
			header.clickOnEventsAndTrainingChevronIcon();
			header.clickOnEventsAndTrainingRegisterNowButton();
			ReportUtil.logPass("Click on Events And Training Register Now Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("EventsAndTrainingRegisterNowButton");
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

	@Test
	public void testServiceAndContactButton() {
		ReportUtil.createTest("Click On Service And Contact Button Now Button");
		try {
			header.clickOnServiceAndContactButton();
			ReportUtil.logPass("Click on Service And Contact Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("ServiceAndContactButton");
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