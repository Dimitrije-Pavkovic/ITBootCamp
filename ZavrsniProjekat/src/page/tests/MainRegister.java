package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Ex.utility.ExcelUtils;
import page.objects.HomePage;
import page.objects.Registration;
import page.objects.SignIn;

public class MainRegister {

	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pavlo\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		for (int i = 1; i < 51; i++) {
			driver.get(HomePage.URL);
			driver.manage().window().maximize();
			String DATA_SOURCE = "UserRandomData.xlsx";

			HomePage.clickTheStoreButton(driver);
			wait2();
			SignIn.clickTheSignInButton(driver);
			SignIn.clickRegisterLink(driver);
			wait2();
			ExcelUtils.setExcell(DATA_SOURCE);
			ExcelUtils.setWorkSheet(0);

			String userID, nPassword, rPassword, firstName, lastName, email, phone, adress1, adress2, city, state, zip,
					country;

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
			System.out.println("Uspesno je popunjen info accounta");
		}
		driver.quit();
	}
}
