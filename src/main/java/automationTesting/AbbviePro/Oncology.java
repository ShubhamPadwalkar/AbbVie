package automationTesting.AbbviePro;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import automationTesting.AbbviePro.Utils.ReportUtil;
import automationTesting.AbbviePro.Utils.WindowSession;

public class Oncology extends BasePage{

	public Oncology(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "(//div[@class='button-link aem-GridColumn aem-GridColumn--default--12']/a)[19]")
	private WebElement oncologyButton;
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon btn--white text-secondary-color     text-left'])[8]")
	private WebElement registerButton;
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[1]")
	private WebElement hermatoOncologyLearnMoreButton;
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[2]")
	private WebElement solidTumorLearnMoreButton;
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[3]")
	private WebElement contactUsButton;
	
	public Oncology clickOnOncologyButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", oncologyButton);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(oncologyButton));
		oncologyButton.click();
		return this;
	}
	
	 public Oncology clickOnRegisterButton() throws IOException {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        js.executeScript("arguments[0].scrollIntoView(true);", registerButton);
	        WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(registerButton));
	        js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
	        clickableButton.click();
	        try (WindowSession session = new WindowSession(driver, true)) {
	            session.switchToNewWindow();
	            String screenshotPath = screenshotUtil.takeScreenshot("registerButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	            Assert.assertEquals(driver.getCurrentUrl(),
						"https://id.abbvie.com/Locale?startURL=%2Fapex%2FRegister",
						"Incorrect URL after clicking Conferenc And Events Learn More Button");
	        }
	        return this;
	    }

	    public Oncology clickOnHematoOncologyLearnMoreButton() throws IOException {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        js.executeScript("arguments[0].scrollIntoView(true);", hermatoOncologyLearnMoreButton);
	        WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(hermatoOncologyLearnMoreButton));
	        js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
	        clickableButton.click();
	        try (WindowSession session = new WindowSession(driver, true)) {
	            session.switchToNewWindow();
	            String screenshotPath = screenshotUtil.takeScreenshot("hematoOncologyLearnMoreButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	            Assert.assertEquals(driver.getCurrentUrl(),
						"https://www.abbviepro.com/de/de/therapiegebiete/onkologie/haematoonkologie.html",
						"Incorrect URL after clicking Conferenc And Events Learn More Button");
	        }
	        return this;
	    }

	    public Oncology clickOnSolidTumorLearnMoreButton() throws IOException {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        js.executeScript("arguments[0].scrollIntoView(true);", solidTumorLearnMoreButton);
	        WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(solidTumorLearnMoreButton));
	        js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
	        clickableButton.click();
	        try (WindowSession session = new WindowSession(driver, true)) {
	            session.switchToNewWindow();
	            String screenshotPath = screenshotUtil.takeScreenshot("solidTumorLearnMoreButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	            Assert.assertEquals(driver.getCurrentUrl(),
						"https://www.abbviepro.com/de/de/therapiegebiete/onkologie/solide-tumoren.html",
						"Incorrect URL after clicking Conferenc And Events Learn More Button");
	        }
	        return this;
	    }

	    public Oncology clickOnContactUsButton() throws IOException {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        js.executeScript("arguments[0].scrollIntoView(true);", contactUsButton);
	        WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(contactUsButton));
	        js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
	        clickableButton.click();
	        try (WindowSession session = new WindowSession(driver, true)) {
	            session.switchToNewWindow();
	            String screenshotPath = screenshotUtil.takeScreenshot("oncologyContactUsButton");
	            ReportUtil.attachScreenshot(screenshotPath);
	            Assert.assertEquals(driver.getCurrentUrl(),
						"https://www.abbviepro.com/de/de/kontakt-und-service.html",
						"Incorrect URL after clicking Conferenc And Events Learn More Button");
	        }
	        return this;
	    }

}
