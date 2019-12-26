package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HomePage;
import page.objects.PetStoreMenu;

public class MainPetStoreMenu {

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

		driver.get(HomePage.URL);
		driver.manage().window().maximize();
		HomePage.clickTheStoreButton(driver);
		wait2();
		PetStoreMenu.clickLFishButton(driver);
		wait2();
		PetStoreMenu.clickLRetMainMenuButton(driver);

	}

}
