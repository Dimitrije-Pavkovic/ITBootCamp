package TN_testing;


	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;


public class TNHome {	
		
		
	  @Test
	  public void testEnter() {
		  
		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\pavlo\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get(HomePage.URL);

			driver.manage().window().maximize();
			
			HomePage.clickTheStoreButton(driver);
			HomePage.wait2();
			
			String testUrl = driver.getCurrentUrl();
			
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(testUrl, "https://petstore.octoperf.com/actions/Catalog.action");
			
			
			sa.assertAll();
		  
		  
	  }
}