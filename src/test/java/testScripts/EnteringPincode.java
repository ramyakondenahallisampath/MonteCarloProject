package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibraies.BaseClass;
import pom.MonteCarlo_LoginPage;
import pom.MonteCarlo_SignupPage;
import pom.Product_Page;
import pom.RoundNeckProduct_Page;
import pom.RoundNeck_Page;
import pom.UserAccount_Page;

public class EnteringPincode extends BaseClass {
	
	@Test
	public void Testcase2() throws EncryptedDocumentException, IOException
	{

	MonteCarlo_LoginPage login = new MonteCarlo_LoginPage(driver);
	login.loginBtn();
	
	MonteCarlo_SignupPage signup_page = new MonteCarlo_SignupPage(driver);
	signup_page.emailbox(datautilities.readingdataExcelFile("Sheet1", 1, 1));
	signup_page.passwordBox(datautilities.readingdataExcelFile("Sheet1", 1, 2));
	signup_page.loginBtn();
	
	UserAccount_Page account_page = new UserAccount_Page(driver);
	WebElement ele = account_page.getMen();
	utilities.mouseHover(ele,driver);
	account_page.roundNeckSweaterclick();
	
	RoundNeck_Page roundneck_page = new RoundNeck_Page(driver);
	roundneck_page.clicksize();
	roundneck_page.clicksizemedium();
	
	roundneck_page.clickbrand();
	roundneck_page.clickrockit();
	
	roundneck_page.clicksleeve();
	roundneck_page.clickfullsleeve();
	
	roundneck_page.clickproductimg();
	
	RoundNeckProduct_Page roundneckproduct_page = new RoundNeckProduct_Page(driver);
	roundneckproduct_page.pincodebox(datautilities.readingdataExcelFile("Sheet1", 1, 3));
	roundneckproduct_page.clickcheckpincode();
	
	
	
	
	
	
	
	}

}
