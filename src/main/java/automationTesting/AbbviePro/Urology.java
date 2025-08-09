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

public class Urology extends BasePage{

	public Urology(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "(//div[@class='button-link aem-GridColumn aem-GridColumn--default--12']/a)[23]")
	private WebElement urologyButton;
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-white     text-left'])[1]")
	private WebElement idiopathicOveractiveBladderButton;
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-white     text-left'])[2]")
	private WebElement neurogenicDetrusorOveractivityButton;	
	
	@FindBy(xpath = "(//a[@class='dmpro-v2 btn btn-primary btn-with-icon  text-primary-color     text-left'])[1]")
	private WebElement contactUsButton;
	
	
	
	public Urology clickOnUrologyButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", urologyButton);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(urologyButton));
		urologyButton.click();
		return this;
	}
	
	public Urology clickOnIdiopathicOveractiveBladderButton() throws IOException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js.executeScript("arguments[0].scrollIntoView(true);", idiopathicOveractiveBladderButton);
        WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(idiopathicOveractiveBladderButton));
        js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
        clickableButton.click();
        try (WindowSession session = new WindowSession(driver, true)) {
            session.switchToNewWindow();
            String screenshotPath = screenshotUtil.takeScreenshot("idiopathicOveractiveBladderButton");
            ReportUtil.attachScreenshot(screenshotPath);
            Assert.assertEquals(driver.getCurrentUrl(),
    				"https://www.abbviepro.com/de/de/therapiegebiete/urologie/idiopathische-ueberaktive-blase.html",
    				"Incorrect URL after clicking Dermatologie button");
        }
        return this;
    }

    public Urology clickOnNeurogenicDetrusorOveractivityButton() throws IOException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js.executeScript("arguments[0].scrollIntoView(true);", neurogenicDetrusorOveractivityButton);
        WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(neurogenicDetrusorOveractivityButton));
        js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
        clickableButton.click();
        try (WindowSession session = new WindowSession(driver, true)) {
            session.switchToNewWindow();
            String screenshotPath = screenshotUtil.takeScreenshot("neurogenicDetrusorOveractivityButton");
            ReportUtil.attachScreenshot(screenshotPath);
            Assert.assertEquals(driver.getCurrentUrl(),
    				"https://www.abbviepro.com/de/de/therapiegebiete/urologie/neurogene-detrusorhyperaktivitaet.html",
    				"Incorrect URL after clicking Dermatologie button");
        }
        return this;
    }

    public Urology clickOnContactUsButton() throws IOException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js.executeScript("arguments[0].scrollIntoView(true);", contactUsButton);
        WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(contactUsButton));
        js.executeScript("arguments[0].setAttribute('target', '_blank');", clickableButton);
        clickableButton.click();
        try (WindowSession session = new WindowSession(driver, true)) {
            session.switchToNewWindow();
            String screenshotPath = screenshotUtil.takeScreenshot("urologyContactUsButton");
            ReportUtil.attachScreenshot(screenshotPath);
            Assert.assertEquals(driver.getCurrentUrl(),
    				"https://www.abbviepro.com/de/de/kontakt-und-service.html",
    				"Incorrect URL after clicking Dermatologie button");
        }
        return this;
    }
}
