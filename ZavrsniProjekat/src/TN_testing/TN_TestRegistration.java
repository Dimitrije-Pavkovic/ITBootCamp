package TN_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.PetStoreMenu;
import page.objects.SignIn;
import page.objects.Registration;
import Ex.utility.ExcelUtils;

public class TN_TestRegistration {
	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	@Test

	// Test for registering single user from Excell table

	public void TestingForOneUser() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pavlo\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(HomePage.URL_HPAGE);
		driver.manage().window().maximize();
		SignIn.clickTheSignInButton(driver);
		SignIn.clickRegisterLink(driver);
		wait2();

		String DATA_SOURCE = "UserRandomData.xlsx";
		TN_TestRegistration.wait2();
		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet(0);
		String userID, nPassword, rPassword, firstName, lastName, email, phone, adress1, adress2, city, state, zip,
				country;

		userID = ExcelUtils.getDataAt(1, 0);
		nPassword = ExcelUtils.getDataAt(1, 1);
		rPassword = ExcelUtils.getDataAt(1, 1);
		firstName = ExcelUtils.getDataAt(1, 2);
		lastName = ExcelUtils.getDataAt(1, 3);
		email = ExcelUtils.getDataAt(1, 4);
		phone = ExcelUtils.getDataAt(1, 5);
		adress1 = ExcelUtils.getDataAt(1, 6);
		adress2 = ExcelUtils.getDataAt(1, 7);
		city = ExcelUtils.getDataAt(1, 8);
		state = ExcelUtils.getDataAt(1, 9);
		zip = ExcelUtils.getDataAt(1, 10);
		country = ExcelUtils.getDataAt(1, 11);

		Registration.inputUserId(driver, userID);
		Registration.inputPassword(driver, nPassword);
		Registration.inputRPassword(driver, rPassword);
		Registration.inputFName(driver, firstName);
		Registration.inputLName(driver, lastName);
		Registration.inputEMail(driver, email);
		Registration.inputPhoneNumber(driver, phone);
		Registration.inputAdress1(driver, adress1);
		Registration.inputAdress2(driver, adress2);
		Registration.inputCity(driver, city);
		Registration.inputState(driver, state);
		Registration.inputZip(driver, zip);
		Registration.inputCountry(driver, country);

		Registration.inputLanPref(driver, "japanese");
		Registration.inputFavCat(driver, "DOGS");
		Registration.clickCheckBox1(driver);
		Registration.clickCheckBox2(driver);
		driver.get(SignIn.URLSIGNIN);
		SignIn.clickRegisterLink(driver);
		System.out.println("Uspesno je popunjen info accounta");
		TN_TestRegistration.wait2();

		PetStoreMenu.clickPSignIn(driver);
		TN_TestRegistration.wait2();
		SignIn.enterSnUsername(driver, userID);
		SignIn.getSnPassword(driver).clear();
		SignIn.enterSnPassword(driver, nPassword);
		TN_TestRegistration.wait2();
		SignIn.clickLogInButton(driver);
		TN_TestRegistration.wait2();

		boolean ExistSignOut = driver.findElement(By.xpath(PetStoreMenu.SIGNOUT)).isDisplayed();

		sa.assertEquals(ExistSignOut, true, "Log In Unsuccesful!");

		sa.assertAll();
		driver.close();
	}

	@Test

	// Test for registering all 50 users from Excell table

	public void TestFor50ExcelUsers() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pavlo\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Registration.URL_REGISTRATION);
		driver.manage().window().maximize();
		String DATA_SOURCE = "UserRandomData.xlsx";
		TN_TestRegistration.wait2();
		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet(0);
		String userID, nPassword, rPassword, firstName, lastName, email, phone, adress1, adress2, city, state, zip,
				country;

		for (int i = 1; i < 51; i++) {

			userID = ExcelUtils.getDataAt(i, 0);
			nPassword = ExcelUtils.getDataAt(i, 1);
			rPassword = ExcelUtils.getDataAt(i, 1);
			firstName = ExcelUtils.getDataAt(i, 2);
			lastName = ExcelUtils.getDataAt(i, 3);
			email = ExcelUtils.getDataAt(i, 4);
			phone = ExcelUtils.getDataAt(i, 5);
			adress1 = ExcelUtils.getDataAt(i, 6);
			adress2 = ExcelUtils.getDataAt(i, 7);
			city = ExcelUtils.getDataAt(i, 8);
			state = ExcelUtils.getDataAt(i, 9);
			zip = ExcelUtils.getDataAt(i, 10);
			country = ExcelUtils.getDataAt(i, 11);

			Registration.inputUserId(driver, userID);
			Registration.inputPassword(driver, nPassword);
			Registration.inputRPassword(driver, rPassword);
			Registration.inputFName(driver, firstName);
			Registration.inputLName(driver, lastName);
			Registration.inputEMail(driver, email);
			Registration.inputPhoneNumber(driver, phone);
			Registration.inputAdress1(driver, adress1);
			Registration.inputAdress2(driver, adress2);
			Registration.inputCity(driver, city);
			Registration.inputState(driver, state);
			Registration.inputZip(driver, zip);
			Registration.inputCountry(driver, country);

			Registration.inputLanPref(driver, "japanese");
			Registration.inputFavCat(driver, "DOGS");
			Registration.clickCheckBox1(driver);
			Registration.clickCheckBox2(driver);
			driver.get(SignIn.URLSIGNIN);
			SignIn.clickRegisterLink(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

			TN_TestRegistration.wait2();
			boolean ExistSignOut = driver.findElements(By.xpath(PetStoreMenu.SIGNOUT)).size() > 0;
			if (ExistSignOut) {
				PetStoreMenu.clickPSignOut(driver);
				TN_TestRegistration.wait2();
			}
			PetStoreMenu.clickPSignIn(driver);
			TN_TestRegistration.wait2();
			SignIn.getSnUsername(driver).clear();
			SignIn.enterSnUsername(driver, userID);
			SignIn.getSnPassword(driver).clear();
			SignIn.enterSnPassword(driver, nPassword);
			TN_TestRegistration.wait2();
			SignIn.clickLogInButton(driver);
			TN_TestRegistration.wait2();
			ExistSignOut = driver.findElement(By.xpath(PetStoreMenu.SIGNOUT)).isDisplayed();

			sa.assertEquals(ExistSignOut, true, "Log In Unsuccesful!");

			driver.navigate().to(Registration.URL_REGISTRATION);

			Registration.getUserId(driver).clear();
			Registration.getPassword(driver).clear();
			Registration.getRPassword(driver).clear();

			Registration.getFName(driver).clear();
			Registration.getLName(driver).clear();
			Registration.getEMail(driver).clear();
			Registration.getPhoneNumber(driver).clear();
			Registration.getAdress1(driver).clear();
			Registration.getAdress2(driver).clear();
			Registration.getCity(driver).clear();

			Registration.getState(driver).clear();
			Registration.getZip(driver).clear();
			Registration.getCountry(driver).clear();

			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		}

		sa.assertAll();
		driver.close();

	}

}