package automationTesting.AbbviePro;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automationTesting.AbbviePro.Utils.ScreenshotUtil;
import io.qameta.allure.Allure;

public class BasePage {
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected ScreenshotUtil screenshotUtil;
	protected static final String PAGE_URL = "https://www.abbviepro.com/";

	private By cookieAcceptButton = By
			.xpath("//button[@class='trustarc-primary-btn trustarc-acceptall-btn trustarc-agree-btn']");

	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.screenshotUtil = new ScreenshotUtil(driver);
		PageFactory.initElements(driver, this);
	}

	public void acceptCookies() {
		try {
			WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement acceptButton = shortWait.until(ExpectedConditions.elementToBeClickable(cookieAcceptButton));
			acceptButton.click();
		} catch (Exception e) {
			System.out.println("Cookie popup not found or already accepted: " + e.getMessage());
		}
	}

	public void pageBackButton() {
		driver.navigate().back();
	}

	protected String captureScreenshotAfterNavigation(String pageName) throws java.awt.AWTException {
		try {
			String screenshotPath = screenshotUtil.takeScreenshot(pageName);
			return screenshotPath;
		} catch (IOException e) {
			System.err.println("Failed to capture screenshot: " + e.getMessage());
			return null;
		}
	}
//	public void allure_attachment(String result , WebDriver driver) throws Exception {
//
//		Allure.addAttachment(result, new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
//
//		}
	
	
}
