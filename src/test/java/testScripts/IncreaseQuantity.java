package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibraies.BaseClass;
import pom.MonteCarlo_LoginPage;
import pom.MonteCarlo_SignupPage;
import pom.UserAccount_Page;
import pom.WomenMaroonJacket_Page;
import pom.WomenhoodedJacket_Page;

public class IncreaseQuantity extends BaseClass {
	
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
	account_page.entersearchproduct(datautilities.readingdataPropertyFile("product"));
	account_page.clickviewproduct();
	
	WomenhoodedJacket_Page womenhoodedjacket_page = new WomenhoodedJacket_Page(driver);
	womenhoodedjacket_page.clickproductimg();
	
	WomenMaroonJacket_Page womenmaroonjacket_page = new WomenMaroonJacket_Page(driver);
	womenmaroonjacket_page.clicksize();
	womenmaroonjacket_page.clickquantity();
	womenmaroonjacket_page.clickaddcart();
	womenmaroonjacket_page.clickcheckout();
	
	}

}
