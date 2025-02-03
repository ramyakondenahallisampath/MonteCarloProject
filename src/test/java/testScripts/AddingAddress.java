package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericLibraies.BaseClass;
import pom.Address_Page;
import pom.MonteCarlo_LoginPage;
import pom.MonteCarlo_SignupPage;
import pom.UserAccount_Page;

public class AddingAddress extends BaseClass {
	
	@Test
	public void Testcase5() throws EncryptedDocumentException, IOException {
		MonteCarlo_LoginPage login = new MonteCarlo_LoginPage(driver);
		login.loginBtn();
		
		MonteCarlo_SignupPage signup_page = new MonteCarlo_SignupPage(driver);
		signup_page.emailbox(datautilities.readingdataExcelFile("Sheet1", 1, 1));
		signup_page.passwordBox(datautilities.readingdataExcelFile("Sheet1", 1, 2));
		signup_page.loginBtn();
		
		UserAccount_Page account_page = new UserAccount_Page(driver);
		account_page.clickaddress();
		
		Address_Page address_page = new Address_Page(driver);
		address_page.clicknewaddress();
		address_page.enterfirstname(datautilities.readingdataPropertyFile("firstName"));
		address_page.enterlastname(datautilities.readingdataPropertyFile("lastName"));
		address_page.entercompany(datautilities.readingdataPropertyFile("companyName"));
		address_page.enterphonenumber(datautilities.readingdataPropertyFile("mobile"));
		address_page.enteraddress1(datautilities.readingdataPropertyFile("address"));
		address_page.entercity(datautilities.readingdataPropertyFile("city"));
		address_page.enterzip(datautilities.readingdataPropertyFile("zipNo"));
		address_page.clickdefaultcheckbox();
		address_page.clickaddnewaddress();
	}

}
