package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericLibraies.BaseClass;
import pom.AscendingCollection_Page;
import pom.AscendingProduct_Page;
import pom.Collection_Page;
import pom.MonteCarlo_LoginPage;
import pom.MonteCarlo_SignupPage;
import pom.UserAccount_Page;

public class Addcart extends BaseClass {
	
	@Test
	public void Testcase8() throws EncryptedDocumentException, IOException {
		MonteCarlo_LoginPage login = new MonteCarlo_LoginPage(driver);
		login.loginBtn();
		
		MonteCarlo_SignupPage signup_page = new MonteCarlo_SignupPage(driver);
		signup_page.emailbox(datautilities.readingdataExcelFile("Sheet1", 1, 1));
		signup_page.passwordBox(datautilities.readingdataExcelFile("Sheet1", 1, 2));
		signup_page.loginBtn();
		
		UserAccount_Page useraccount_page = new UserAccount_Page(driver);
		useraccount_page.clickcart();
		useraccount_page.clickstartshopping();
		
		Collection_Page collection_page = new Collection_Page(driver);
		collection_page.clickbestselling();
		collection_page.clickoldtonew();
		
		AscendingCollection_Page ascendingcollection_page = new AscendingCollection_Page(driver);
		ascendingcollection_page.clickproductimg();
		
		AscendingProduct_Page ascendingproduct_page = new AscendingProduct_Page(driver);
		ascendingproduct_page.clickaddtocart();
		ascendingproduct_page.clickclose();
	}

}
