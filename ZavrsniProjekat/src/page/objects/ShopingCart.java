package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopingCart {

	public static final String URL_SHOPPINGCART = " https://petstore.octoperf.com/actions/Cart.action?viewCart=";
	
	public static final String UPDATE_CART = " //input[@name='updateCartQuantities']";
	// METODE ZA CLICK REGISTER LINK
		public static WebElement getUpdateCart(WebDriver driver) {
			return driver.findElement(By.xpath(UPDATE_CART));
		}

		public static void clickUpdatecart(WebDriver driver) {
			getUpdateCart(driver).click();
		}
}
