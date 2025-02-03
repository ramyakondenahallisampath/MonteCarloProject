package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import genericLibraies.BaseClass;
import pom.HandTowel_Page;
import pom.HandtowelWishlist_page;
import pom.MonteCarlo_LoginPage;
import pom.MonteCarlo_SignupPage;
import pom.UserAccount_Page;

public class VerifyProductAdded extends BaseClass {

	@Test
	public void Testcase3() throws EncryptedDocumentException, IOException {
	MonteCarlo_LoginPage login = new MonteCarlo_LoginPage(driver);
	login.loginBtn();
	
	MonteCarlo_SignupPage signup_page = new MonteCarlo_SignupPage(driver);
	signup_page.emailbox(datautilities.readingdataExcelFile("Sheet1", 1, 1));
	signup_page.passwordBox(datautilities.readingdataExcelFile("Sheet1", 1, 2));
	signup_page.loginBtn();
	UserAccount_Page account_page = new UserAccount_Page(driver);
	account_page.clicksearch();
	account_page.entersearchproduct(datautilities.readingdataPropertyFile("productName"));
	account_page.clickproductimg();
	
	HandTowel_Page handtowel_page = new HandTowel_Page(driver);
	handtowel_page.clickwhishlist();
	handtowel_page.clickwishlistelement();
	
	HandtowelWishlist_page handtowelwishlist_page = new HandtowelWishlist_page(driver);
	handtowelwishlist_page.clickclose();
	}
}
