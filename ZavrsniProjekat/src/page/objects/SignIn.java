package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
	public static final String URLSIGNIN = " https://petstore.octoperf.com/actions/Account.action?signonForm=";
	private static final String CLICK_REGISTER_LINK = "/html[1]/body[1]/div[2]/div[1]/a[1]";
	private static final String ENTER_THE_SIGN_IN = "//a[contains(text(),'Sign In')]";
	private static final String SN_USERNAME = "//input[@name='username']";
	private static final String SN_PASSWORD = "//input[@name='password']";
	private static final String LOGIN_BUTTON = "//input[@name='signon']";

	// METODE ZA CLICK REGISTER LINK
	public static WebElement getRegisterLink(WebDriver driver) {
		return driver.findElement(By.xpath(CLICK_REGISTER_LINK));
	}

	public static void clickRegisterLink(WebDriver driver) {
		getRegisterLink(driver).click();
	}

	// METODE ZA SIGN IN BUTTON

	public static WebElement getTheSignInButton(WebDriver driver) {
		return driver.findElement(By.xpath(ENTER_THE_SIGN_IN));
	}

	public static void clickTheSignInButton(WebDriver driver) {
		getTheSignInButton(driver).click();
	}

	// METODE ZA KORISNICKO IME
	public static WebElement getSnUsername(WebDriver driver) {
		return driver.findElement(By.xpath(SN_USERNAME));

	}

	public static void clickSnUsername(WebDriver driver) {
		getSnUsername(driver).click();
	}

	public static void enterSnUsername(WebDriver driver, String text) {
		getSnUsername(driver).sendKeys(text);

	}

	// METODE ZA PASSWORD
	public static WebElement getSnPassword(WebDriver driver) {
		return driver.findElement(By.xpath(SN_PASSWORD));

	}

	public static void clickSnPassword(WebDriver driver) {
		getSnPassword(driver).click();
	}

	public static void enterSnPassword(WebDriver driver, String text) {
		getSnPassword(driver).sendKeys(text);

	}

	// METODE ZA SIGN_IN
	public static WebElement getLogInButton(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_BUTTON));

	}

	public static void clickLogInButton(WebDriver driver) {
		getLogInButton(driver).click();
	}
}
