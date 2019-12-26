package TN_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.Dogs;
import page.objects.HomePage;
import page.objects.Bulldog;
import page.objects.PetStoreMenu;

public class TN_Bin {

	@Test
	public void Test1Change() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\testiranje\\Qa Selenium\\src\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(PetStoreMenu.URLPET);
		driver.manage().window().maximize();
		PetStoreMenu.clickUDogButton(driver);
		HomePage.wait2();
		Dogs.clickBuldog(driver);
		HomePage.wait2();
		Bulldog.getAddToCart(driver);

		HomePage.wait2();
		driver.navigate().to(PetStoreMenu.URLPET);
		PetStoreMenu.clickBin(driver);
		HomePage.wait2();
		boolean ExistRemoveButton = driver.findElements(By.xpath("//a[contains(text(),'Remove')]")).size() > 0;
		sa.assertEquals(true, ExistRemoveButton, "Not added to cart!");

		sa.assertAll();
		driver.close();

	}

}