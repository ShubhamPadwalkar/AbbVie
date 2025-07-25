package automationTesting.AbbviePro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
	
	
	@FindBy(xpath = "(//button[@id='truste-consent-button'])[1]")
	private WebElement regPageCookie;
	
	@FindBy(xpath = "//input[@id='j_id0:j_id6:registerForm2:j_id295:0:j_id312']")
	private WebElement firstNameField;

	@FindBy(xpath = "//input[@id='j_id0:j_id6:registerForm2:j_id295:1:j_id312']")
	private WebElement lastNameField;

	@FindBy(xpath = "//input[@id='j_id0:j_id6:registerForm2:j_id295:2:accountField']")
	private WebElement accountNumberField;

	@FindBy(xpath = "//input[@id='j_id0:j_id6:registerForm2:j_id343:0:abv_phoneField']")
	private WebElement phoneNumberField;

	@FindBy(xpath = "//input[@id='j_id0:j_id6:registerForm2:j_id362:0:addressEmailField']")
	private WebElement emailIdField;

	@FindBy(xpath = "//input[@id='j_id0:j_id6:registerForm2:j_id395:0:addressPhysicalField']")
	private WebElement institutionNameField;

	@FindBy(xpath = "//input[@id='j_id0:j_id6:registerForm2:j_id395:1:addressPhysicalField']")
	private WebElement streetNameField;

	@FindBy(xpath = "//input[@id='j_id0:j_id6:registerForm2:j_id395:2:addressPhysicalField']")
	private WebElement postalCodeField;

	@FindBy(xpath = "//input[@id='j_id0:j_id6:registerForm2:j_id395:3:addressPhysicalField']")
	private WebElement locationField;

	@FindBy(xpath = "//span[@class='check']")
	private WebElement checkboxField;

	@FindBy(xpath = "//input[@id='j_id0:j_id6:registerForm2:registerBtn']")
	private WebElement registerButtonField;

	@FindBy(xpath = "//ul[@class='form-messages alert alert-danger']")
	private WebElement errorMessageField;

	@FindBy(id = "j_id0:j_id6:j_id51")
	private WebElement registrationFormBackButtonField;
	


	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	public RegistrationPage acceptRegistrationPageCookies() {
		regPageCookie.click();
		return this;
	}


	public RegistrationPage enterFirstName(String firstName) {
		firstNameField.sendKeys(firstName);
		return this;
	}

	public RegistrationPage enterLastName(String lastName) {
		lastNameField.sendKeys(lastName);
		return this;
	}

	public RegistrationPage enterAccountNumber(String accountNumber) {
		accountNumberField.sendKeys(accountNumber);
		return this;
	}

	public RegistrationPage enterPhoneNumber(String phoneNumber) {
		phoneNumberField.sendKeys(phoneNumber);
		return this;
	}

	public RegistrationPage enterEmailId(String email) {
		emailIdField.sendKeys(email);
		return this;
	}

	public RegistrationPage enterInstitutionName(String institutionName) {
		institutionNameField.sendKeys(institutionName);
		return this;
	}

	public RegistrationPage enterStreetName(String streetName) {
		streetNameField.sendKeys(streetName);
		return this;
	}

	public RegistrationPage enterPostalCode(String postalCode) {
		postalCodeField.sendKeys(postalCode);
		return this;
	}

	public RegistrationPage enterLocation(String location) {
		locationField.sendKeys(location);
		return this;
	}

	public RegistrationPage clickCheckbox() {
		checkboxField.click();
		return this;
	}

	public RegistrationPage registerButton() {
		registerButtonField.click();
		return this;
	}

	public RegistrationPage errorMessage() {
		System.out.println(errorMessageField.getText());
		return this;
	}

	public RegistrationPage fillRegistrationForm( String firstName, String lastName, String accountNumber,
			String phoneNumber, String email, String institutionName, String streetName, String postalCode,
			String location) {
		enterFirstName(firstName);
		enterLastName(lastName);
		enterAccountNumber(accountNumber);
		enterPhoneNumber(phoneNumber);
		enterEmailId(email);
		enterInstitutionName(institutionName);
		enterStreetName(streetName);
		enterPostalCode(postalCode);
		enterLocation(location);
		clickCheckbox();
		registerButton();
		errorMessage();
		return this;
	}
	}
