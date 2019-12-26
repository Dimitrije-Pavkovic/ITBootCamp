package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dogs {

	public static final String URLDOGS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS";

	
	private static final String BULDOG_XPATH = "//a[contains(text(),'K9-BD-01')]";
	private static final String POODLE_XPATH = "//a[contains(text(),'K9-PO-02')]";
	
	
	public static WebElement getBuldog(WebDriver driver) {
		return driver.findElement(By.xpath(BULDOG_XPATH));
	}
	public static void clickBuldog(WebDriver driver) {
		getBuldog(driver).click();
	}


	public static WebElement getPoodle(WebDriver driver) {
		return driver.findElement(By.xpath(POODLE_XPATH));
	}
	public static void clickPoodle(WebDriver driver) {
		getPoodle(driver).click();
	}
}
