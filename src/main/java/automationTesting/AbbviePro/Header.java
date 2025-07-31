package automationTesting.AbbviePro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Header extends BasePage {

	public Header(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[32]")
	private WebElement homePageButton;

	// Product Page
	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[33]")
	private WebElement productPageButton;

	@FindBy(xpath = "(//button[@class='dmpro-v2_icon dmpro-v2_icon-chevron-down'])[4]")
	private WebElement productChevronIcon;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[34]")
	private WebElement ProductOverviewButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[35]")
	private WebElement productAndUserInformationButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[36]")
	private WebElement trainingMaterialButton;

	// Therapiegebiete Page
	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[38]")
	private WebElement therapiegebieteButton;

	@FindBy(xpath = "(//button[@class='dmpro-v2_icon dmpro-v2_icon-chevron-down'])[5]")
	private WebElement therapiegebieteChevronIcon;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[39]")
	private WebElement ImmunologieButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[40]")
	private WebElement dermatologieButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[41]")
	private WebElement gastroenterologieButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[42]")
	private WebElement rheumatologieButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[43]")
	private WebElement onkologieButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[44]")
	private WebElement hematooncologyButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[45]")
	private WebElement solidTumorsButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[46]")
	private WebElement neurologyButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[47]")
	private WebElement migraineButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[48]")
	private WebElement parkinsonsDiseaseButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[49]")
	private WebElement spasticityAfterStrokeButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[50]")
	private WebElement virologyButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[51]")
	private WebElement hepatitis_C_HCV_Button;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[52]")
	private WebElement ophthalmologyParentButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[53]")
	private WebElement ophthalmologyChildButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[54]")
	private WebElement urologyButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[55]")
	private WebElement idiopathicOveractiveBladderButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[56]")
	private WebElement neurogenicDetrusorOveractivityButton;

	@FindBy(xpath = "(//div[@class='main-navigation__inner']//a)[57]")
	private WebElement registerNowButton;

	public Header clickOnHomePageButton() {
		homePageButton.click();
		Assert.assertTrue(driver.getTitle().contains("Startseite - AbbVie Pro Deutschland"),
				"Failed to navigate to Startseite page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de.html",
				"Incorrect URL after clicking Home Page button");
		return this;
	}

	public Header clickOnProductPageButton() {
		productPageButton.click();
		Assert.assertTrue(driver.getTitle().contains("Produkte | AbbVie Pro Deutschland"),
				"Failed to navigate to Produkte page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/produkte.html",
				"Incorrect URL after clicking Product Page button");
		return this;
	}

	public Header clickOnProductChevronIcon() {
		productChevronIcon.click();

		return this;
	}

	public Header clickOnProductOverviewButton() {
		ProductOverviewButton.click();
		Assert.assertTrue(driver.getTitle().contains("Anmeldung"), "Failed to navigate to Anmeldung page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://id.abbvie.com/Login?startURL=%2FAppRouterMVN",
				"Incorrect URL after clicking Product Chevron Icon");
		return this;
	}

	public Header clickOnproductAndUserInformationButton() {
		productAndUserInformationButton.click();
		Assert.assertTrue(driver.getTitle().contains("Fach- & Gebrauchsinformation | AbbVie Pro Deutschland"),
				"Failed to navigate to Fach- & Gebrauchsinformation page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/produkte/fach-und-gebrauchsinformation.html",
				"Incorrect URL after clicking Product Overview button");

		return this;
	}

	public Header clickOnTrainingMaterialButton() {
		trainingMaterialButton.click();
		Assert.assertTrue(driver.getTitle().contains("Fach- & Gebrauchsinformation | AbbVie Pro Deutschland"),
				"Failed to navigate to Fach- & Gebrauchsinformation page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/produkte/fach-und-gebrauchsinformation.html",
				"Incorrect URL after clicking Product And User Information button");

//		Assert.assertTrue(driver.getTitle().contains("Fach- & Gebrauchsinformation | AbbVie Pro Deutschland"), "Failed to navigate to Fach- & Gebrauchsinformation page");
//		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/produkte/fach-und-gebrauchsinformation.html", "Incorrect URL after clicking Training Material button");
		return this;
	}

	// Thearpy Area
	public Header clickOnTherapiegebieteButton() {
		therapiegebieteButton.click();
		Assert.assertTrue(driver.getTitle().contains("Therapiegebiete | AbbVie Pro Deutschland"),
				"Failed to navigate to Therapiegebiete page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/therapiegebiete.html",
				"Incorrect URL after clicking Therapiegebiete button");
		return this;
	}

	public Header clickOntherapiegebieteChevronIcon() {
		therapiegebieteChevronIcon.click();
		return this;
	}

	public Header clickOnImmunologieButton() {
		ImmunologieButton.click();
		System.out.println(driver.getCurrentUrl() + " - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Immunologie | AbbVie Pro Deutschland"),
				"Failed to navigate to Immunologie page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/therapiegebiete/immunologie.html",
				"Incorrect URL after clicking Immunologie button");

		return this;
	}

	public Header clickOnDermatologieButton() {
		dermatologieButton.click();
		Assert.assertTrue(driver.getTitle().contains("Dermatologie | AbbVie Pro Deutschland"),
				"Failed to navigate to Dermatologie page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/dermatologie.html",
				"Incorrect URL after clicking Dermatologie button");

		return this;
	}

	public Header clickOnGastroenterologieButton() {
		gastroenterologieButton.click();
		Assert.assertTrue(driver.getTitle().contains("Gastroenterologie | AbbVie Pro Deutschland"),
				"Failed to navigate to Gastroenterologie page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/gastroenterologie.html",
				"Incorrect URL after clicking Gastroenterologie button");
		return this;
	}

	public Header clickOnRheumatologieButton() {
		rheumatologieButton.click();
		// System.out.println(driver.getCurrentUrl() + " - " + driver.getTitle());

		Assert.assertTrue(driver.getTitle().contains("Rheumatologie | AbbVie Pro Deutschland"),
				"Failed to navigate to Migräne page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/immunologie/rheumatologie.html",
				"Incorrect URL after clicking Rheumatologie button");
		return this;
	}

	// Onkologie
	public Header clickOnOnkologieButton() {
		onkologieButton.click();
		Assert.assertTrue(driver.getTitle().contains("Onkologie | AbbVie Pro Deutschland"),
				"Failed to navigate to Parkinson-Krankheit page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/therapiegebiete/onkologie.html",
				"Incorrect URL after clicking Onkologie button");
		return this;
	}

	public Header clickOnHematooncologyButton() {
		hematooncologyButton.click();
		Assert.assertTrue(driver.getTitle().contains("Haematoonkologie | AbbVie Pro Deutschland"),
				"Failed to navigate to Haematoonkologie page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/onkologie/haematoonkologie.html",
				"Incorrect URL after clicking Hematooncology button");
		return this;
	}

	public Header clickOnSolidTumorsButton() {
		solidTumorsButton.click();
		Assert.assertTrue(driver.getTitle().contains("Solide Tumoren | AbbVie Pro Deutschland"),
				"Failed to navigate to Solide Tumoren page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/onkologie/solide-tumoren.html",
				"Incorrect URL after clicking Solid Tumors button");
		return this;
	}

//Neurology 
	public Header clickOnNeurologyButton() {

		neurologyButton.click();

		Assert.assertTrue(driver.getTitle().contains("Neurologie | AbbVie Pro Deutschland"),
				"Failed to navigate to Neurologie page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/therapiegebiete/neurologie.html",
				"Incorrect URL after clicking Neurologie button");

//		Assert.assertTrue(driver.getTitle().contains("Hepatitis C (HCV) | AbbVie Pro Deutschland"),
//				"Failed to navigate to Hepatitis C (HCV) page");
//		Assert.assertEquals(driver.getCurrentUrl(),
//				"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c.html",
//				"Incorrect URL after clicking Neurology button");
		return this;
	}

	public Header clickOnMigraineButton() {
		migraineButton.click();

		Assert.assertTrue(driver.getTitle().contains("Migräne | AbbVie Pro Deutschland"),
				"Failed to navigate to Migräne page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/neurologie/migraene.html",
				"Incorrect URL after clicking Migraine button");
		return this;
	}

	public Header clickOnParkinsonsDiseaseButton() {
		parkinsonsDiseaseButton.click();

		Assert.assertTrue(driver.getTitle().contains("Parkinson-Krankheit | AbbVie Pro Deutschland"),
				"Failed to navigate to Ophthalmologie page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/neurologie/parkinson-krankheit.html",
				"Incorrect URL after clicking Parkinsons Disease button");
		return this;
	}

	public Header clickOnSpasticityAfterStrokeButton() {
		spasticityAfterStrokeButton.click();
		// System.out.println(driver.getCurrentUrl() + " - " + driver.getTitle());

		Assert.assertTrue(driver.getTitle().contains("Spastik nach Schlaganfall | AbbVie Pro Deutschland"),
				"Failed to navigate to Spastik nach Schlaganfall page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/neurologie/spastik-nach-schlaganfall.html",
				"Incorrect URL after clicking Spastik nach Schlaganfall button");
		return this;
	}

// Virology
	public Header clickOnVirologyButton() {
		virologyButton.click();
		Assert.assertTrue(driver.getTitle().contains("Virologie | AbbVie Pro Deutschland"),
				"Failed to navigate to Virologie page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/therapiegebiete/virologie.html",
				"Incorrect URL after clicking Virology button");
		return this;
	}

	public Header clickOnHepatitisCHCVButton() {
		hepatitis_C_HCV_Button.click();
		Assert.assertTrue(driver.getTitle().contains("Hepatitis C (HCV) | AbbVie Pro Deutschland"),
				"Failed to navigate to Hepatitis C (HCV) page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/virologie/hepatitis-c.html",
				"Incorrect URL after clicking Hepatitis C HCV button");
		return this;
	}

	public Header clickOnOphthalmologyParentButton() {
		ophthalmologyParentButton.click();
		Assert.assertTrue(driver.getTitle().contains("Augenheilkunde | AbbVie Pro Deutschland"),
				"Failed to navigate to Augenheilkunde page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/augenheilkunde/ophthalmologie.html",
				"Incorrect URL after clicking Ophthalmology Parent button");
		return this;
	}

	public Header clickOnOphthalmologyChildButton() {
		ophthalmologyChildButton.click();
		Assert.assertTrue(driver.getTitle().contains("Ophthalmologie | AbbVie Pro Deutschland"),
				"Failed to navigate to Register page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/augenheilkunde.html",
				"Incorrect URL after clicking Ophthalmology Parent button");
		return this;
	}

	public Header clickOnUrologyButton() {
		urologyButton.click();
		Assert.assertTrue(driver.getTitle().contains("Urologie | AbbVie Pro Deutschland"),
				"Failed to navigate to Urologie page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.abbviepro.com/de/de/therapiegebiete/urologie.html",
				"Incorrect URL after clicking Urologie button");
		return this;
	}

	public Header clickOnIdiopathicOveractiveBladderButton() {
		idiopathicOveractiveBladderButton.click();
		Assert.assertTrue(driver.getTitle().contains("Idiopathische überaktive Blase | AbbVie Pro Deutschland"),
				"Failed to navigate to Idiopathic overactive bladder page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/urologie/idiopathische-ueberaktive-blase.html",
				"Incorrect URL after clicking Idiopathic overactive bladder button");
		return this;
	}

	public Header clickOnNeurogenicDetrusorOveractivityButton() {
		neurogenicDetrusorOveractivityButton.click();
		Assert.assertTrue(driver.getTitle().contains("Neurogene Detrusorhyperaktivität | AbbVie Pro Deutschland"),
				"Failed to navigate to Neurogenic detrusor overactivity page");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.abbviepro.com/de/de/therapiegebiete/urologie/neurogene-detrusorhyperaktivitaet.html",
				"Incorrect URL after clicking Neurogenic detrusor overactivity button");
		return this;
	}

	public Header clickOnRegisterNowButton() {
		registerNowButton.click();
		Assert.assertTrue(driver.getTitle().contains("register"),
				"Failed to navigate to register page");
		Assert.assertEquals(driver.getCurrentUrl(), "https://id.abbvie.com/Locale?startURL=%2Fapex%2FRegister",
				"Incorrect URL after clicking register button");
		return this;
	}
}

