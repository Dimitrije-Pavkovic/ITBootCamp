package TN_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.PetStoreMenu;
import page.objects.SignIn;

public class TN_PetStoreMenu {


	@Test
	public void Test1Left() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pavlo\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(PetStoreMenu.URLPET);
		driver.manage().window().maximize();

/// Left fish menu 
		PetStoreMenu.clickLFishButton(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URL_LEFTFISH, currUrl);
		HomePage.wait2();
		driver.navigate().back();

/// Left dogs menu 
		PetStoreMenu.clickLDogButton(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URL_LEFTDOG, currUrl);
		HomePage.wait2();

/// Left cats menu 
		driver.navigate().back();
		PetStoreMenu.clickLCatsButton(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URL_LEFTCAT, currUrl);
		HomePage.wait2();

/// Left reptiles menu 
		driver.navigate().back();
		PetStoreMenu.clickLReptilesButton(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URL_LEFTREPTILE, currUrl);
		HomePage.wait2();

/// Left birds menu 
		driver.navigate().back();
		PetStoreMenu.clickLBirdsButton(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URL_LEFTBIRDS, currUrl);
		HomePage.wait2();

		sa.assertAll();
		driver.close();

	}

	@Test
	public void Test2Top() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\testiranje\\Qa Selenium\\src\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(PetStoreMenu.URLPET);
		driver.manage().window().maximize();

/// UP fish menu 

		PetStoreMenu.clickUFishButton(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URL_UPFISH, currUrl);
		HomePage.wait2();

/// UP dogs menu 
		driver.navigate().back();
		PetStoreMenu.clickUDogButton(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URL_UPDOG, currUrl);
		HomePage.wait2();

/// UP cats menu 
		driver.navigate().back();
		PetStoreMenu.clickUCatsButton(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URL_UPCAT, currUrl);
		HomePage.wait2();

/// UP reptiles menu 
		driver.navigate().back();
		PetStoreMenu.clickUReptilesButton(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URL_UPREPTILE, currUrl);
		HomePage.wait2();

/// UP birds menu 
		driver.navigate().back();
		PetStoreMenu.clickUBirdsButton(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URL_UPBIRDS, currUrl);
		HomePage.wait2();

		sa.assertAll();
		driver.close();
	}

	@Test
	public void Test3Mid() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\testiranje\\Qa Selenium\\src\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(PetStoreMenu.URLPET);
		driver.manage().window().maximize();

/// MIDDLE FISH MENU
		PetStoreMenu.clickPFishButton(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URL_MIDDLEFISH, currUrl);
		HomePage.wait2();

/// MIDDLE DOG MENU
		driver.navigate().back();
		PetStoreMenu.clickPDogButton(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URL_MIDDLEDOG, currUrl);
		HomePage.wait2();

/// MIDDLE REPTILES MENU
		driver.navigate().back();
		PetStoreMenu.clickPReptilesButton(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URL_MIDDLEREPTILE, currUrl);
		HomePage.wait2();

/// MIDDLE CATS MENU
		driver.navigate().back();
		PetStoreMenu.clickPCatsButton(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URL_MIDDLETCAT, currUrl);
		HomePage.wait2();

/// MIDDLE BIRDS MENU
		driver.navigate().back();
		PetStoreMenu.clickPBirdsButton(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URL_MIDDLEBIRDS, currUrl);
		HomePage.wait2();

/// MIDDLE BIGPICTURE MENU 
		driver.navigate().back();
		PetStoreMenu.clickPBigButton(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URL_BIGPARRET, currUrl);
		HomePage.wait2();

		sa.assertAll();
		driver.close();
	}

	@Test
	public void Test4SingIn() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\testiranje\\Qa Selenium\\src\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get(PetStoreMenu.URLPET);
		driver.manage().window().maximize();

/// Sing in button
		PetStoreMenu.clickPSignIn(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(SignIn.URLSIGNIN, currUrl);
		HomePage.wait2();
		driver.close();

	}
}