package automationTesting.AbbviePro;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationTesting.AbbviePro.Utils.ReportUtil;
import automationTesting.AbbviePro.Utils.ScrollUtils;

public class RheumatologieTest extends BaseTest {

	@Test
	public void testNavigation() {
		performCommonNavigation();
	}

	@Test
	public void testRheumatologieButton() {
		ReportUtil.createTest("Click On Footer Rheumatologie Button");
		try {
			rheumatologie.clickOnRheumatologieButton();
			ReportUtil.logPass("Click on Footer Rheumatologie Button Successful.");
			String screenshotPath = screenshotUtil.takeScreenshot("RheumatologiePage");
			ReportUtil.attachScreenshot(screenshotPath);
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

	@Test
	public void testConferencAndEventsLearnMoreButton() {
		ReportUtil.createTest("Click On Conferenc And Events Learn More Button");
		try {
			rheumatologie.clickOnConferencAndEventsLearnMoreButton();
			ReportUtil.logPass("Click on Conferenc And Events Learn More Button Successful");
			String screenshotPath = screenshotUtil.takeScreenshot("ConferencAndEventsLearnMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Card Load More button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("ConferencAndEventsLearnMoreButton");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
	public void testCareTopicsLearnMoreButton() {
		ReportUtil.createTest("Click On Care Topics Learn More Button");
		try {
			rheumatologie.clickOncarouselChevronIcon();
			rheumatologie.clickOnCareTopicsLearnMoreButton();
			ReportUtil.logPass("Click on Care Topics Learn More Button");
			String screenshotPath = screenshotUtil.takeScreenshot("CareTopicsLearnMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Care Topics Learn More Button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("CareTopicsLearnMoreButton_failure");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
	public void testExchangePlatformLearnMoreButton() {
		ReportUtil.createTest("Click On Exchange Platform Learn More Button");
		try {
			rheumatologie.clickOncarouselChevronIcon();
			rheumatologie.clickOnExchangePlatformLearnMoreButton();
			ReportUtil.logPass("Click on Exchange Platform Learn More Button Successful - ");
			String screenshotPath = screenshotUtil.takeScreenshot("ExchangePlatformLearnMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on Exchange Platform Learn More Button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("ExchangePlatformLearnMoreButton_failure");
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
			for (int i = 0; i < 10; i++) {
				rheumatologie.clickCardLoadMoreButton();
				ReportUtil.logPass("Click on"+ i+1 +" Card Load More Button Successful" );
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
			rheumatologie.clickOnFirstCardReadMoreButton();
			ReportUtil.logPass("Click on First Card Read More Button Successful");
			String screenshotPath = screenshotUtil.takeScreenshot("FirstCardReadMoreButton");
			ReportUtil.attachScreenshot(screenshotPath);
		} catch (Exception e) {
			ReportUtil.logFail("Click on First Card Read More Button failed: " + e.getMessage());
			try {
				String screenshotPath = screenshotUtil.takeScreenshot("FirstCardReadMoreButton");
				ReportUtil.attachScreenshot(screenshotPath);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
//	 @Test
//	    public void testSecondCardReadMoreButton() {
//	        ReportUtil.createTest("Click On Second Card Read More Button");
//	        try {
//	        	rheumatologie.handleAnyOverlays();
//	            rheumatologie.clickOnSecondCardReadMoreButton();
//	            ReportUtil.logPass("Click on Second Card Read More Button Successful");
//	            String screenshotPath = screenshotUtil.takeScreenshot("SecondCardReadMoreButton");
//	            ReportUtil.attachScreenshot(screenshotPath);
//	        } catch (Exception e) {
//	            ReportUtil.logFail("Click on Second Card Read More Button failed: " + e.getMessage());
//	            try {
//	                String screenshotPath = screenshotUtil.takeScreenshot("SecondCardReadMoreButton_Failed");
//	                ReportUtil.attachScreenshot(screenshotPath);
//	            } catch (Exception ex) {
//	                ex.printStackTrace();
//	            }
//	            Assert.fail("Test failed due to: " + e.getMessage());
//	        }
//	    }

	    @Test
	    public void testThirdCardReadMoreButton() {
	        ReportUtil.createTest("Click On Third Card Read More Button");
	        try {
	            rheumatologie.clickOnThirdCardReadMoreButton();
	            ReportUtil.logPass("Click on Third Card Read More Button Successful");
	            String screenshotPath = screenshotUtil.takeScreenshot("ThirdCardReadMoreButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Third Card Read More Button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("ThirdCardReadMoreButton_Failed");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	            Assert.fail("Test failed due to: " + e.getMessage());
	        }
	    }

	    @Test
	    public void testFourthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Fourth Card Read More Button");
	        try {
	            rheumatologie.clickOnFourthCardReadMoreButton();
	            ReportUtil.logPass("Click on Fourth Card Read More Button Successful");
	            String screenshotPath = screenshotUtil.takeScreenshot("FourthCardReadMoreButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Fourth Card Read More Button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("FourthCardReadMoreButton_Failed");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	            Assert.fail("Test failed due to: " + e.getMessage());
	        }
	    }

	    @Test
	    public void testFifthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Fifth Card Read More Button");
	        try {
	            rheumatologie.clickOnFifthCardReadMoreButton();
	            ReportUtil.logPass("Click on Fifth Card Read More Button Successful");
	            String screenshotPath = screenshotUtil.takeScreenshot("FifthCardReadMoreButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Fifth Card Read More Button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("FifthCardReadMoreButton_Failed");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	            Assert.fail("Test failed due to: " + e.getMessage());
	        }
	    }

	    @Test
	    public void testSixthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Sixth Card Read More Button");
	        try {
	            rheumatologie.clickOnSixthCardReadMoreButton();
	            ReportUtil.logPass("Click on Sixth Card Read More Button Successful");
	            String screenshotPath = screenshotUtil.takeScreenshot("SixthCardReadMoreButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Sixth Card Read More Button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("SixthCardReadMoreButton_Failed");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	            Assert.fail("Test failed due to: " + e.getMessage());
	        }
	    }

	    @Test
	    public void testSeventhCardReadMoreButton() {
	        ReportUtil.createTest("Click On Seventh Card Read More Button");
	        try {
	            rheumatologie.clickOnSeventhCardReadMoreButton();
	            ReportUtil.logPass("Click on Seventh Card Read More Button Successful");
	            String screenshotPath = screenshotUtil.takeScreenshot("SeventhCardReadMoreButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Seventh Card Read More Button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("SeventhCardReadMoreButton_Failed");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	            Assert.fail("Test failed due to: " + e.getMessage());
	        }
	    }

	    @Test
	    public void testEighthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Eighth Card Read More Button");
	        try {
	            rheumatologie.clickOnEighthCardReadMoreButton();
	            ReportUtil.logPass("Click on Eighth Card Read More Button Successful");
	            String screenshotPath = screenshotUtil.takeScreenshot("EighthCardReadMoreButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Eighth Card Read More Button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("EighthCardReadMoreButton_Failed");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	            Assert.fail("Test failed due to: " + e.getMessage());
	        }
	    }

	    @Test
	    public void testNinthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Ninth Card Read More Button");
	        try {
	            rheumatologie.clickOnNinthCardReadMoreButton();
	            ReportUtil.logPass("Click on Ninth Card Read More Button Successful");
	            String screenshotPath = screenshotUtil.takeScreenshot("NinthCardReadMoreButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Ninth Card Read More Button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("NinthCardReadMoreButton_Failed");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	            Assert.fail("Test failed due to: " + e.getMessage());
	        }
	    }

	    @Test
	    public void testTenthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Tenth Card Read More Button");
	        try {
	            rheumatologie.clickOnTenthCardReadMoreButton();
	            ReportUtil.logPass("Click on Tenth Card Read More Button Successful");
	            String screenshotPath = screenshotUtil.takeScreenshot("TenthCardReadMoreButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Tenth Card Read More Button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("TenthCardReadMoreButton_Failed");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	            Assert.fail("Test failed due to: " + e.getMessage());
	        }
	    }

	    @Test
	    public void testEleventhCardReadMoreButton() {
	        ReportUtil.createTest("Click On Eleventh Card Read More Button");
	        try {
	            rheumatologie.clickOnEleventhCardReadMoreButton();
	            ReportUtil.logPass("Click on Eleventh Card Read More Button Successful");
	            String screenshotPath = screenshotUtil.takeScreenshot("EleventhCardReadMoreButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Eleventh Card Read More Button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("EleventhCardReadMoreButton_Failed");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	            Assert.fail("Test failed due to: " + e.getMessage());
	        }
	    }

	    @Test
	    public void testTwelfthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Twelfth Card Read More Button");
	        try {
	            rheumatologie.clickOnTwelfthCardReadMoreButton();
	            ReportUtil.logPass("Click on Twelfth Card Read More Button Successful");
	            String screenshotPath = screenshotUtil.takeScreenshot("TwelfthCardReadMoreButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Twelfth Card Read More Button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("TwelfthCardReadMoreButton_Failed");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	            Assert.fail("Test failed due to: " + e.getMessage());
	        }
	    }

	    @Test
	    public void testThirteenthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Thirteenth Card Read More Button");
	        try {
	            rheumatologie.clickOnThirteenthCardReadMoreButton();
	            ReportUtil.logPass("Click on Thirteenth Card Read More Button Successful");
	            String screenshotPath = screenshotUtil.takeScreenshot("ThirteenthCardReadMoreButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Thirteenth Card Read More Button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("ThirteenthCardReadMoreButton_Failed");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	            Assert.fail("Test failed due to: " + e.getMessage());
	        }
	    }

	    @Test
	    public void testFourteenthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Fourteenth Card Read More Button");
	        try {
	            rheumatologie.clickOnFourteenthCardReadMoreButton();
	            ReportUtil.logPass("Click on Fourteenth Card Read More Button Successful");
	            String screenshotPath = screenshotUtil.takeScreenshot("FourteenthCardReadMoreButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Fourteenth Card Read More Button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("FourteenthCardReadMoreButton_Failed");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	            Assert.fail("Test failed due to: " + e.getMessage());
	        }
	    }

	    @Test
	    public void testFifteenthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Fifteenth Card Read More Button");
	        try {
	            rheumatologie.clickOnFifteenthCardReadMoreButton();
	            ReportUtil.logPass("Click on Fifteenth Card Read More Button Successful");
	            String screenshotPath = screenshotUtil.takeScreenshot("FifteenthCardReadMoreButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Fifteenth Card Read More Button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("FifteenthCardReadMoreButton_Failed");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	            Assert.fail("Test failed due to: " + e.getMessage());
	        }
	    }

	    @Test
	    public void testSixteenthCardReadMoreButton() {
	        ReportUtil.createTest("Click On Sixteenth Card Read More Button");
	        try {
	            rheumatologie.clickOnSixteenthCardReadMoreButton();
	            ReportUtil.logPass("Click on Sixteenth Card Read More Button Successful");
	            String screenshotPath = screenshotUtil.takeScreenshot("SixteenthCardReadMoreButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Sixteenth Card Read More Button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("SixteenthCardReadMoreButton_Failed");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	            Assert.fail("Test failed due to: " + e.getMessage());
	        }
	    }
	    
	    @Test
	    public void testPodcastButton() {
	        ReportUtil.createTest("Click On Podcast Button");
	        try {
	            rheumatologie.clickOnPodcastButton();
	            ReportUtil.logPass("Click on Podcast Button Successful");
	            String screenshotPath = screenshotUtil.takeScreenshot("PodcastButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Podcast Button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("PodcastButton_Failed");
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
	            rheumatologie.clickOnAbbvieCareButton();
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
	    public void testCommitmentLearnMoreButton() {
	        ReportUtil.createTest("Click On Commitment Learn More Button");
	        try {
	            rheumatologie.clickOnCommitmentLearnMoreButton();
	            ReportUtil.logPass("Click on Commitment Learn More Button Successful");
	            String screenshotPath = screenshotUtil.takeScreenshot("CommitmentLearnMoreButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Commitment Learn More Button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("CommitmentLearnMoreButton_Failed");
	                ReportUtil.attachScreenshot(screenshotPath);
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	            Assert.fail("Test failed due to: " + e.getMessage());
	        }
	    }

	    @Test
	    public void testContactUsButton() {
	        ReportUtil.createTest("Click On Contact Us Button");
	        try {
	            rheumatologie.clickOnContactUsButton();
	            ReportUtil.logPass("Click on Contact Us Button Successful");
	            String screenshotPath = screenshotUtil.takeScreenshot("ContactUsButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	        } catch (Exception e) {
	            ReportUtil.logFail("Click on Contact Us Button failed: " + e.getMessage());
	            try {
	                String screenshotPath = screenshotUtil.takeScreenshot("ContactUsButton_Failed");
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
