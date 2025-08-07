package automationTesting.AbbviePro;

import org.testng.annotations.Test;

import automationTesting.AbbviePro.Utils.ReportUtil;
import automationTesting.AbbviePro.Utils.ScrollUtils;

public class GastroenterologieTest extends BaseTest {

	@Test
	public void testNavigation() {
		performCommonNavigation();
	}

	@Test
	public void testGastroenterologieButton() {
		ReportUtil.createTest("Click On Footer Gastroenterologie Button");
		try {
			gastroenterologie.clickOnGastroenterologieButton();
			ReportUtil.logPass("Click on Footer Gastroenterologie Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("GastroenterologiePage");
			ReportUtil.attachScreenshot(screenshotPath);
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

	@Test
	public void testCardLoadMoreButton() {
		ReportUtil.createTest("Click On Card Load More Button");
		try {
			for (int i = 0; i < 13; i++) {
				gastroenterologie.clickCardLoadMoreButton();
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
			gastroenterologie.clickOnFirstCardReadMoreButton();
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
			gastroenterologie.clickOnSecondCardReadMoreButton();
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
			gastroenterologie.clickOnThirdCardReadMoreButton();
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
			gastroenterologie.clickOnFourthCardReadMoreButton();
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
			gastroenterologie.clickOnFifthCardReadMoreButton();
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
			gastroenterologie.clickOnSixthCardReadMoreButton();
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
			gastroenterologie.clickOnSeventhCardReadMoreButton();
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
			gastroenterologie.clickOnEighthCardReadMoreButton();
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
			gastroenterologie.clickOnNinethCardReadMoreButton();
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
	public void testTenthCardReadMoreButton() {
		ReportUtil.createTest("Click On Tenth Card Read More Button");
		try {
			gastroenterologie.clickOnTenthCardReadMoreButton();
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
			gastroenterologie.clickOnEleventhCardReadMoreButton();
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
	public void testTwelvethCardReadMoreButton() {
		ReportUtil.createTest("Click On Twelveth Card Read More Button");
		try {
			gastroenterologie.clickOnTwelvethCardReadMoreButton();
			ReportUtil.logPass("Click on Twelveth Card Read More Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("TwelvethCardReadMorePage");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Twelveth Card Read More button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("TwelvethCardReadMore_failure");
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
			gastroenterologie.clickOnThirteenthCardReadMoreButton();
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
			gastroenterologie.clickOnFourteenthCardReadMoreButton();
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
	    public void testCongressHighlightButton() {
	        ReportUtil.createTest("Click On Congress Highlight Button");
	        try {
	            gastroenterologie.clickOnCongressHighlightButton();
	            ReportUtil.logPass("Click on Congress Highlight Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("CongressHighlightPage");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Congress Highlight button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("CongressHighlight_failure");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	    }

	    @Test
	    public void testTakeALookNowButton() {
	        ReportUtil.createTest("Click On Take A Look Now Button");
	        try {
	            gastroenterologie.clickOnTakeALookNowButton();
	            ReportUtil.logPass("Click on Take A Look Now Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("TakeALookNowPage");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Take A Look Now button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("TakeALookNow_failure");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	    }

	    @Test
	    public void testExclusivelyLearnMoreButton() {
	        ReportUtil.createTest("Click On Exclusively Learn More Button");
	        try {
	            gastroenterologie.clickOnExclusivelyLearnMoreButton();
	            ReportUtil.logPass("Click on Exclusively Learn More Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("ExclusivelyLearnMorePage");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Exclusively Learn More button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("ExclusivelyLearnMore_failure");
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
	            gastroenterologie.clickOnContactUsButton();
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
	    public void testAbbvieCareButton() {
	        ReportUtil.createTest("Click On Abbvie Care Button");
	        try {
	            gastroenterologie.clickOnAbbvieCareButton();
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
	    public void testLivingWith_IBD_LearnMoreButton() {
	        ReportUtil.createTest("Click On Living With IBD Learn More Button");
	        try {
	            gastroenterologie.clickOnLivingWith_IBD_LearnMoreButton();
	            ReportUtil.logPass("Click on Living With IBD Learn More Button Successful.");
	            String screenshotPath = screenshotUtil.takeScreenshot("LivingWithIBDLearnMorePage");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Living With IBD Learn More button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("LivingWithIBDLearnMore_failure");
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


