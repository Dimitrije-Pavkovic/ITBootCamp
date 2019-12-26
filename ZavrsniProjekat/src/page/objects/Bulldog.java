package page.objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Bulldog {

	
	public static final String URLBULDOG = "https://petstore.octoperf.com/actions/Catalog.action?viewProduct=&productId=K9-BD-01";


	private static final String MALE_ADULT_BULLDOG_XPATH = "//a[contains(text(),'EST-6')]";
	
	public static WebElement getAddToCart(WebDriver driver) {
		return driver.findElement(By.xpath(MALE_ADULT_BULLDOG_XPATH));
	}
	public static void clickAddToCart(WebDriver driver) {
		getAddToCart(driver).click();
	}
	
	
}