package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	
public class HomePage {
	
		public static final String URL = " https://petstore.octoperf.com/";
		public static final String URL_HPAGE = "https://petstore.octoperf.com/actions/Catalog.action";
		private static final String ENTER_THE_STORE = "//a[contains(text(),'Enter the Store')]";

		public static WebElement getTheStoreButton(WebDriver driver) {
			return driver.findElement(By.xpath(ENTER_THE_STORE));
		}

		public static void clickTheStoreButton(WebDriver driver) {
			getTheStoreButton(driver).click();
		}
		
		public static void wait2() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			

		}
	}}