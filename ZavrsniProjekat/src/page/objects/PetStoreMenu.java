package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetStoreMenu {
	public static final String URL_LEFTFISH = " https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";
	public static final String URL_LEFTDOG = " https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS";
	public static final String URL_LEFTCAT = " https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";
	public static final String URL_LEFTREPTILE = " https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES";
	public static final String URL_LEFTBIRDS = " https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";
	
	
	public static final String URL_UPFISH = " https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";
	public static final String URL_UPDOG = " https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS";
	public static final String URL_UPREPTILE = " https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES";
	public static final String URL_UPCAT = " https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";
	public static final String URL_UPBIRDS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";
	
	
	public static final String URL_MIDDLEFISH = " https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";
	public static final String URL_MIDDLEDOG = " https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS";
	public static final String URL_MIDDLEREPTILE = " https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES";
	public static final String URL_MIDDLETCAT = " https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";
	public static final String URL_MIDDLEBIRDS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";
	public static final String URL_BIGPARRET = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";
	
	
	public static final String URLPET = " https://petstore.octoperf.com/actions/Catalog.action";
	public static final String PSIGNIN = " //a[contains(text(),'Sign In')]";
	public static final String SIGNOUT = " //a[contains(text(),'Sign Out')]";
	public static final String BIN = " //img[@name='img_cart']";
	// POVRATAK NA GLAVNI MENI/POCETNU STRANICU
	private static final String RETURN_TO_MAINMENU = "//a[contains(text(),'Return to Main Menu')]";
	private static final String JPET_STORE_LOGO = "//div[@id='LogoContent']//a//img";
	// LEVI MENI
	public static final String LEFTMENU_FISH = "//div[@id='Content']//a[1]//img[1]";
	public static final String LEFTMENU_DOGS = "//div[@id='Content']//a[2]//img[1]";
	public static final String LEFTMENU_CATS = "//div[@id='Content']//a[3]//img[1]";
	public static final String LEFTMENU_REPTILES = "//div[@id='Content']//a[4]//img[1]";
	public static final String LEFTMENU_BIRDS = "//div[@id='Content']//a[5]//img[1]";
	// GORNJI MENI
	public static final String UPMENU_FISH = "//div[@id='QuickLinks']//a[1]//img[1]";
	public static final String UPMENU_DOGS = "//div[@id='Header']//a[2]//img[1]";
	public static final String UPMENU_REPTILES = "//div[@id='Header']//a[3]//img[1]";
	public static final String UPMENU_CATS = "//div[@id='Header']//a[4]//img[1]";
	public static final String UPMENU_BIRDS = "//div[@id='Content']//a[5]//img[1]";
	// DONJI MENI SA SLIKAMA
	public static final String BIG_PICMENU_PICTURE = "//body//area[1]";
	public static final String PICMENU_FISH = "//body//area[2]";
	public static final String PICMENU_DOGS = "//body//area[3]";
	public static final String PICMENU_REPTILES = "//body//area[4]";
	public static final String PICMENU_CATS = "//body//area[5]";
	public static final String PICMENU_BIRDS = "//body//area[6]";

	// METODA ZA DOHVATANJE SIGN IN-A
	public static WebElement getPSignIn(WebDriver driver) {
		return driver.findElement(By.xpath(PSIGNIN));
	}

	public static void clickPSignIn(WebDriver driver) {
		getPSignIn(driver).click();
	}

	// METODA ZA DOHVATANJE SIGN OUT-A 
	public static WebElement getPSignOut(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNOUT));
	}

	public static void clickPSignOut(WebDriver driver) {
		getPSignOut(driver).click();
	}
	// METODA ZA DOHVATANJE BINA
		public static WebElement getBin(WebDriver driver) {
			return driver.findElement(By.xpath(BIN));
		}

		public static void clickBin(WebDriver driver) {
			getBin(driver).click();
		}

	// METODA ZA POVRATAK U GLAVNI MENI
	public static WebElement getRetMainMenuButton(WebDriver driver) {
		return driver.findElement(By.xpath(RETURN_TO_MAINMENU));
	}

	public static void clickLRetMainMenuButton(WebDriver driver) {
		getRetMainMenuButton(driver).click();
	}

	// METODA ZA JPET STORE LOGO KOJA TAKODJE IZVRSAVA POVRATAK U GLAVNI MENI
	public static WebElement getLogoButton(WebDriver driver) {
		return driver.findElement(By.xpath(JPET_STORE_LOGO));
	}

	public static void clickLogoButton(WebDriver driver) {
		getLogoButton(driver).click();
	}

	// METODA ZA ULAZ U FISH LEVOG MENIJA
	public static WebElement getLFishButton(WebDriver driver) {
		return driver.findElement(By.xpath(LEFTMENU_FISH));
	}

	public static void clickLFishButton(WebDriver driver) {
		getLFishButton(driver).click();
	}

	// METODA ZA ULAZ U DOG LEVOG MENIJA
	public static WebElement getLDogButton(WebDriver driver) {
		return driver.findElement(By.xpath(LEFTMENU_DOGS));
	}

	public static void clickLDogButton(WebDriver driver) {
		getLDogButton(driver).click();
	}

	// METODA ZA ULAZ U CATS LEVOG MENIJA
	public static WebElement getLCatsButton(WebDriver driver) {
		return driver.findElement(By.xpath(LEFTMENU_CATS));
	}

	public static void clickLCatsButton(WebDriver driver) {
		getLCatsButton(driver).click();
	}

	// METODA ZA ULAZ U REPTILES LEVOG MENIJA
	public static WebElement getLReptilesButton(WebDriver driver) {
		return driver.findElement(By.xpath(LEFTMENU_REPTILES));
	}

	public static void clickLReptilesButton(WebDriver driver) {
		getLReptilesButton(driver).click();
	}

	// METODA ZA ULAZ U BIRDS LEVOG MENIJA
	public static WebElement getLBirdsButton(WebDriver driver) {
		return driver.findElement(By.xpath(LEFTMENU_BIRDS));
	}

	public static void clickLBirdsButton(WebDriver driver) {
		getLBirdsButton(driver).click();
	}

	// METODA ZA ULAZ U FISH GORNJEG MENIJA
	public static WebElement getUFishButton(WebDriver driver) {
		return driver.findElement(By.xpath(UPMENU_FISH));
	}

	public static void clickUFishButton(WebDriver driver) {
		getUFishButton(driver).click();
	}

	// METODA ZA ULAZ U DOG GORNJEG MENIJA
	public static WebElement getUDogButton(WebDriver driver) {
		return driver.findElement(By.xpath(UPMENU_DOGS));
	}

	public static void clickUDogButton(WebDriver driver) {
		getUDogButton(driver).click();
	}

	// METODA ZA ULAZ U REPTILES GORNJEG MENIJA
	public static WebElement getUReptilesButton(WebDriver driver) {
		return driver.findElement(By.xpath(UPMENU_REPTILES));
	}

	public static void clickUReptilesButton(WebDriver driver) {
		getLReptilesButton(driver).click();
	}

	// METODA ZA ULAZ U CATS GORNJEG MENIJA
	public static WebElement getUCatsButton(WebDriver driver) {
		return driver.findElement(By.xpath(UPMENU_CATS));
	}

	public static void clickUCatsButton(WebDriver driver) {
		getUCatsButton(driver).click();
	}

	// METODA ZA ULAZ U BIRDS GORNJEG MENIJA
	public static WebElement getUBirdsButton(WebDriver driver) {
		return driver.findElement(By.xpath(UPMENU_BIRDS));
	}

	public static void clickUBirdsButton(WebDriver driver) {
		getUBirdsButton(driver).click();
	}

	// METODA ZA ULAZ U GLAVNU SLIKU SLIKOVNOG MENIJA
	public static WebElement getPBigButton(WebDriver driver) {
		return driver.findElement(By.xpath(BIG_PICMENU_PICTURE));
	}

	public static void clickPBigButton(WebDriver driver) {
		getPBigButton(driver).click();
	}

	// METODA ZA ULAZ U FISH SLIKOVNOG MENIJA
	public static WebElement getPFishButton(WebDriver driver) {
		return driver.findElement(By.xpath(PICMENU_FISH));
	}

	public static void clickPFishButton(WebDriver driver) {
		getPFishButton(driver).click();
	}

	// METODA ZA ULAZ U DOG SLIKOVNOG MENIJA
	public static WebElement getPDogButton(WebDriver driver) {
		return driver.findElement(By.xpath(PICMENU_DOGS));
	}

	public static void clickPDogButton(WebDriver driver) {
		getPDogButton(driver).click();
	}

	// METODA ZA ULAZ U REPTILES SLIKOVNOG MENIJA
	public static WebElement getPReptilesButton(WebDriver driver) {
		return driver.findElement(By.xpath(PICMENU_REPTILES));
	}

	public static void clickPReptilesButton(WebDriver driver) {
		getPReptilesButton(driver).click();
	}

	// METODA ZA ULAZ U CATS SLIKOVNOG MENIJA
	public static WebElement getPCatsButton(WebDriver driver) {
		return driver.findElement(By.xpath(PICMENU_CATS));
	}

	public static void clickPCatsButton(WebDriver driver) {
		getPCatsButton(driver).click();
	}

	// METODA ZA ULAZ U BIRDS SLIKOVNOG MENIJA
	public static WebElement getPBirdsButton(WebDriver driver) {
		return driver.findElement(By.xpath(PICMENU_BIRDS));
	}

	public static void clickPBirdsButton(WebDriver driver) {
		getPBirdsButton(driver).click();
	}
}