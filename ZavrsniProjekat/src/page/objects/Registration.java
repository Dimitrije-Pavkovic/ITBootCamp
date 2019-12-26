package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	public static final String URL_REGISTRATION = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";
	private static final String USERID_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
	private static final String NPASSWORD_XPATH = "//input[@name='repeatedPassword']";
	private static final String RPASSWORD_XPATH = "//input[@name='password']";
	private static final String ACCFNAME_XPATH = "//input[@name='account.firstName']";
	private static final String ACC_LASTNAME_XPATH = "//input[@name='account.lastName']";
	private static final String ACC_EMAIL_XPATH = "//input[@name='account.email']";
	private static final String ACC_PHONE_NUM_XPATH = "//input[@name='account.phone']";
	private static final String ACC_ADRESS1_XPATH = "//input[@name='account.address1']";
	private static final String ACC_ADRESS2_XPATH = "//input[@name='account.address2']";
	private static final String ACC_CITY_XPATH = "//input[@name='account.city']";
	private static final String ACC_STATE_XPATH = "//input[@name='account.state']";
	private static final String ACC_ZIP_XPATH = "//input[@name='account.zip']";
	private static final String ACC_COUNTRY_XPATH = "//input[@name='account.country']";
	private static final String SELECT_PI_LANPREF_XPATH = "//select[@name='account.languagePreference']";
	private static final String SELECT_PI_FAVCAT_XPATH = "//select[@name='account.favouriteCategoryId']";
	private static final String CHECKBOX1_XPATH = "//input[@name='account.listOption']";
	private static final String CHECKBOX2_XPATH = "//input[@name='account.bannerOption']";
	private static final String SAVE_ACCINFO_XPATH = "//input[@name='newAccount']";

	// User ID
	public static WebElement getUserId(WebDriver driver) {
		return driver.findElement(By.xpath(USERID_XPATH));
	}

	public static void clickUserId(WebDriver driver) {
		getUserId(driver).click();
	}

	public static void inputUserId(WebDriver driver, String data) {
		getUserId(driver).sendKeys(data);
	}

	// Password
	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(NPASSWORD_XPATH));
	}

	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	public static void inputPassword(WebDriver driver, String data) {
		getPassword(driver).sendKeys(data);
	}

	// Repeat Password
	public static WebElement getRPassword(WebDriver driver) {
		return driver.findElement(By.xpath(RPASSWORD_XPATH));
	}

	public static void clickRPassword(WebDriver driver) {
		getRPassword(driver).click();
	}

	public static void inputRPassword(WebDriver driver, String data) {
		getRPassword(driver).sendKeys(data);
	}

	// ACCOUNT INFO - FIRST NAME
	public static WebElement getFName(WebDriver driver) {
		return driver.findElement(By.xpath(ACCFNAME_XPATH));
	}

	public static void clickFName(WebDriver driver) {
		getFName(driver).click();
	}

	public static void inputFName(WebDriver driver, String data) {
		getFName(driver).sendKeys(data);
	}

	// ACCOUNT INFO - LAST NAME
	public static WebElement getLName(WebDriver driver) {
		return driver.findElement(By.xpath(ACC_LASTNAME_XPATH));
	}

	public static void clickLName(WebDriver driver) {
		getLName(driver).click();
	}

	public static void inputLName(WebDriver driver, String data) {
		getLName(driver).sendKeys(data);
	}

	/// ACCOUNT INFO - EMAIL
	public static WebElement getEMail(WebDriver driver) {
		return driver.findElement(By.xpath(ACC_EMAIL_XPATH));
	}

	public static void clickEMail(WebDriver driver) {
		getEMail(driver).click();
	}

	public static void inputEMail(WebDriver driver, String data) {
		getEMail(driver).sendKeys(data);
	}

	// ACOUNT INFO - PHONE NUMBER
	public static WebElement getPhoneNumber(WebDriver driver) {
		return driver.findElement(By.xpath(ACC_PHONE_NUM_XPATH));
	}

	public static void clickPhoneNumber(WebDriver driver) {
		getPhoneNumber(driver).click();
	}

	public static void inputPhoneNumber(WebDriver driver, String data) {
		getPhoneNumber(driver).sendKeys(data);
	}

	// ACOUNT INFO - ADRESS 1
	public static WebElement getAdress1(WebDriver driver) {
		return driver.findElement(By.xpath(ACC_ADRESS1_XPATH));
	}

	public static void clickAdress1(WebDriver driver) {
		getAdress1(driver).click();
	}

	public static void inputAdress1(WebDriver driver, String data) {
		getAdress1(driver).sendKeys(data);
	}

	// ACOUNT INFO - ADRESS 2
	public static WebElement getAdress2(WebDriver driver) {
		return driver.findElement(By.xpath(ACC_ADRESS2_XPATH));
	}

	public static void clickAdress2(WebDriver driver) {
		getAdress2(driver).click();
	}

	public static void inputAdress2(WebDriver driver, String data) {
		getAdress2(driver).sendKeys(data);
	}

	// ACCOUNT INFO - CITY
	public static WebElement getCity(WebDriver driver) {
		return driver.findElement(By.xpath(ACC_CITY_XPATH));
	}

	public static void clickCity(WebDriver driver) {
		getCity(driver).click();
	}

	public static void inputCity(WebDriver driver, String data) {
		getCity(driver).sendKeys(data);
	}

	// ACCOUNT INFO - STATE
	public static WebElement getState(WebDriver driver) {
		return driver.findElement(By.xpath(ACC_STATE_XPATH));
	}

	public static void clickState(WebDriver driver) {
		getState(driver).click();
	}

	public static void inputState(WebDriver driver, String data) {
		getState(driver).sendKeys(data);
	}

	// ACCOUNT INFO - ZIP CODE
	public static WebElement getZip(WebDriver driver) {
		return driver.findElement(By.xpath(ACC_ZIP_XPATH));
	}

	public static void clickZip(WebDriver driver) {
		getZip(driver).click();
	}

	public static void inputZip(WebDriver driver, String data) {
		getZip(driver).sendKeys(data);
	}

	// ACCOUNT INFO - COUNTRY
	public static WebElement getCountry(WebDriver driver) {
		return driver.findElement(By.xpath(ACC_COUNTRY_XPATH));
	}

	public static void clicCountry(WebDriver driver) {
		getCountry(driver).click();
	}

	public static void inputCountry(WebDriver driver, String data) {
		getCountry(driver).sendKeys(data);
	}

	// SELECT LANGUAGE PREFERENCE
	public static Select getLanPref(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_PI_LANPREF_XPATH)));
	}

	public static void inputLanPref(WebDriver driver, String data) {
		getLanPref(driver).selectByVisibleText(data);
	}

	// SELECT FAVORITE CATEGORY
	public static Select getFavCat(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_PI_FAVCAT_XPATH)));
	}

	public static void inputFavCat(WebDriver driver, String data) {
		getFavCat(driver).selectByVisibleText(data);
	}

	// check box 1

	public static WebElement getCheckBox1(WebDriver driver) {
		return driver.findElement(By.xpath(CHECKBOX1_XPATH));

	}

	public static void clickCheckBox1(WebDriver driver) {
		getCheckBox1(driver).click();
	}

	// CHECK BOX 2

	public static WebElement getCheckBox2(WebDriver driver) {
		return driver.findElement(By.xpath(CHECKBOX2_XPATH));

	}

	public static void clickCheckBox2(WebDriver driver) {
		getCheckBox2(driver).click();
	}

	// SAVE ACCOUNT INFORMATION

	public static WebElement getSaveAccInfo(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_ACCINFO_XPATH));

	}

	public static void clickSaveAccInfo(WebDriver driver) {
		getSaveAccInfo(driver).click();
	}

}