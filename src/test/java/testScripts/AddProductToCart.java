package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibraies.BaseClass;
import pom.AcComforter_Page;
import pom.MonteCarlo_LoginPage;
import pom.MonteCarlo_SignupPage;
import pom.Product_Page;
import pom.UserAccount_Page;
import pom.Wishlist_Page;


public class AddProductToCart extends BaseClass {

	
	@Test
	public void Testcase1() throws EncryptedDocumentException, IOException, InterruptedException
	{
		MonteCarlo_LoginPage login = new MonteCarlo_LoginPage(driver);
		login.loginBtn();
		
		MonteCarlo_SignupPage signup_page = new MonteCarlo_SignupPage(driver);
		signup_page.emailbox(datautilities.readingdataExcelFile("Sheet1", 1, 1));
		signup_page.passwordBox(datautilities.readingdataExcelFile("Sheet1", 1, 2));
		signup_page.loginBtn();
		
		UserAccount_Page account_page = new UserAccount_Page(driver);
		WebElement mouse_hover_ele = account_page.getHomefur();
		utilities.mouseHover(mouse_hover_ele,driver);
		account_page.acComforter();
		
		AcComforter_Page page = new AcComforter_Page(driver);
		page.clickSize();
		page.selectSize();
		Thread.sleep(1000);
		page.clickColor();
		page.selectColor();
		Thread.sleep(1000);
		page.clickBrand();
		page.selectBrand();
		Thread.sleep(1000);
		page.clickAvailability();
		page.selectAvailability();
		Thread.sleep(3000);
//		accomf_page.productimgclick();
		
		Product_Page product_page = new Product_Page(driver);
		product_page.wishlistclick();
		product_page.wishlisticonclick();
		
		Wishlist_Page wishlist_page = new Wishlist_Page(driver);
		wishlist_page.addcartclick();
		
		
		
		
		
	}
	
}