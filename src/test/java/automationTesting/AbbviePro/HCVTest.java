package automationTesting.AbbviePro;

import org.testng.annotations.Test;

import automationTesting.AbbviePro.Utils.ReportUtil;

public class HCVTest extends BaseTest{
	
	@Test
	public void testNavigation() {
		performCommonNavigation();
	}

	@Test
	public void testHCVButton() {
		ReportUtil.createTest("Click On Footer HCV Button");
		try {
			hcv.clickOnHCVButton();
			ReportUtil.logPass("Click on Footer HCV Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("HCVPage");
			ReportUtil.attachScreenshot(screenshotPath);
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

	@Test
	public void testCardLoadMoreButton() {
		ReportUtil.createTest("Click On Card Load More Button");
		try {
			for (int i = 0; i < 6; i++) {
				hcv.clickCardLoadMoreButton();
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
	    public void testFirstCardReadMoreButton() {
	        ReportUtil.createTest("Click On First Card Read More Button");
	        try {
	            hcv.clickOnFirstCardReadMoreButton();
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
	            hcv.clickOnSecondCardReadMoreButton();
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
	            hcv.clickOnThirdCardReadMoreButton();
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
	            hcv.clickOnFourthCardReadMoreButton();
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
	            hcv.clickOnFifthCardReadMoreButton();
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
	            hcv.clickOnSixthCardReadMoreButton();
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
	            hcv.clickOnSeventhCardReadMoreButton();
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
	            hcv.clickOnEighthCardReadMoreButton();
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
	    public void testNinthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Ninth Card Read More Button");
	        try {
	            hcv.clickOnNinthCardReadMoreButton();
	            ReportUtil.logPass("Click on Ninth Card Read More Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("NinthCardReadMorePage");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Ninth Card Read More button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("NinthCardReadMore_failure");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	    }

	    @Test
	    public void testTenthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Tenth Card Read More Button");
	        try {
	            hcv.clickOnTenthCardReadMoreButton();
	            ReportUtil.logPass("Click on Tenth Card Read More Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("TenthCardReadMorePage");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Tenth Card Read More button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("TenthCardReadMore_failure");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	    }

	    @Test
	    public void testEleventhCardReadMoreButton() {
	        ReportUtil.createTest("Click On Eleventh Card Read More Button");
	        try {
	            hcv.clickOnEleventhCardReadMoreButton();
	            ReportUtil.logPass("Click on Eleventh Card Read More Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("EleventhCardReadMorePage");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Eleventh Card Read More button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("EleventhCardReadMore_failure");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	    }

	    @Test
	    public void testTwelfthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Twelfth Card Read More Button");
	        try {
	            hcv.clickOnTwelfthCardReadMoreButton();
	            ReportUtil.logPass("Click on Twelfth Card Read More Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("TwelfthCardReadMorePage");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Twelfth Card Read More button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("TwelfthCardReadMore_failure");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	    }

	    @Test
	    public void testThirteenthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Thirteenth Card Read More Button");
	        try {
	            hcv.clickOnThirteenthCardReadMoreButton();
	            ReportUtil.logPass("Click on Thirteenth Card Read More Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("ThirteenthCardReadMorePage");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Thirteenth Card Read More button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("ThirteenthCardReadMore_failure");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	    }

	    @Test
	    public void testFourteenthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Fourteenth Card Read More Button");
	        try {
	            hcv.clickOnFourteenthCardReadMoreButton();
	            ReportUtil.logPass("Click on Fourteenth Card Read More Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("FourteenthCardReadMorePage");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Fourteenth Card Read More button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("FourteenthCardReadMore_failure");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	    }

	    @Test
	    public void testFifteenthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Fifteenth Card Read More Button");
	        try {
	            hcv.clickOnFifteenthCardReadMoreButton();
	            ReportUtil.logPass("Click on Fifteenth Card Read More Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("FifteenthCardReadMorePage");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Fifteenth Card Read More button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("FifteenthCardReadMore_failure");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	    }

	    @Test
	    public void testSixteenthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Sixteenth Card Read More Button");
	        try {
	            hcv.clickOnSixteenthCardReadMoreButton();
	            ReportUtil.logPass("Click on Sixteenth Card Read More Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("SixteenthCardReadMorePage");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Sixteenth Card Read More button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("SixteenthCardReadMore_failure");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	    }

	    @Test
	    public void testSeventeenthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Seventeenth Card Read More Button");
	        try {
	            hcv.clickOnSeventeenthCardReadMoreButton();
	            ReportUtil.logPass("Click on Seventeenth Card Read More Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("SeventeenthCardReadMorePage");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Seventeenth Card Read More button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("SeventeenthCardReadMore_failure");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	    }
	    
	    @Test
	    public void testAbbvieCareButton() {
	        ReportUtil.createTest("Click On Abbvie Care Button");
	        try {
	            hcv.clickOnAbbvieCareButton();
	            ReportUtil.logPass("Click on Abbvie Care Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("AbbvieCarePage");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Abbvie Care button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("AbbvieCare_failure");
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
	            hcv.clickOnRegisterNowButton();
	            ReportUtil.logPass("Click on Register Now Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("RegisterNow");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Register Now button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("RegisterNow_failure");
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
	            hcv.clickOnContactUsButton();
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
	    
	    @Test
	    public void testAccordionButton() {
	        ReportUtil.createTest("Click On Accordion Button");
	        try {
	            hcv.clickOnAccordionButton();
	            ReportUtil.logPass("Click on Accordion Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("Accordion");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Accordion button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("Accordion_failure");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	    }
}
