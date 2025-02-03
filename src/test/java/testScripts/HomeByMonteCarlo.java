package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericLibraies.BaseClass;
import pom.BlanketCollection_Page;
import pom.BlanketProduct_Page;
import pom.Home_Page;
import pom.MonteCarlo_LoginPage;
import pom.MonteCarlo_SignupPage;
import pom.Store_Page;
import pom.UserAccount_Page;

public class HomeByMonteCarlo extends BaseClass {
	
	@Test
	public void Testcase4() throws EncryptedDocumentException, IOException {
	MonteCarlo_LoginPage login = new MonteCarlo_LoginPage(driver);
	login.loginBtn();
	
	MonteCarlo_SignupPage signup_page = new MonteCarlo_SignupPage(driver);
	signup_page.emailbox(datautilities.readingdataExcelFile("Sheet1", 1, 1));
	signup_page.passwordBox(datautilities.readingdataExcelFile("Sheet1", 1, 2));
	signup_page.loginBtn();
	
	UserAccount_Page account_page = new UserAccount_Page(driver);
	account_page.clickhomelogo();
	
	Home_Page home_page = new Home_Page(driver);
	home_page.clickshopblanket();
	
	BlanketCollection_Page blanketcollection_page = new BlanketCollection_Page(driver);
	blanketcollection_page.clickproductimg();
	
	BlanketProduct_Page blanketproduct_page = new BlanketProduct_Page(driver);
	blanketproduct_page.clickproductdesc();
	blanketproduct_page.clickstores();
	
	Store_Page store_page = new Store_Page(driver);
	store_page.entersearchpincode(datautilities.readingdataPropertyFile("pincode"));
	store_page.clickgetdirection();
	}

}
