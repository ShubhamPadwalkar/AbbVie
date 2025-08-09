package automationTesting.AbbviePro;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import automationTesting.AbbviePro.Utils.ScreenshotUtil;
//import io.qameta.allure.Allure;

public class BasePage {
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected ScreenshotUtil screenshotUtil;
	protected static final String PAGE_URL = "https://www.abbviepro.com/";

	private By cookieAcceptButton = By
			.xpath("//button[@class='trustarc-primary-btn trustarc-acceptall-btn trustarc-agree-btn']");
	
	@FindBy(xpath = "//select[@id='country--2058528217']/option[text()='Germany']")
	private WebElement languageDropdown;

	@FindBy(xpath = "//button[@class='btn btn-hcp']")
	private WebElement clickOnContinueButton;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.screenshotUtil = new ScreenshotUtil(driver);
		PageFactory.initElements(driver, this);
	}
	
	public BasePage navigateTo() throws Exception {
		driver.get(PAGE_URL);
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getCurrentUrl(), PAGE_URL, "Navigation to homepage failed");
		return this;
	}

	public BasePage selectCountry() throws Exception {
		languageDropdown.click();
		return this;
	}

	public BasePage clickingOnContinueButton() throws Exception {
		clickOnContinueButton.click();
		return this;
	}

	public BasePage acceptHomePageCookies() {
		acceptCookies();
		return this;
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
	
	public BasePage scrollToPageTop() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
		System.out.println("Page scrolled to the top.");
		return this;
	}
}
