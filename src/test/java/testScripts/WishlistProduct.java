package testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLibraies.BaseClass;
import pom.MonteCarlo_LoginPage;
import pom.StoleCollection_Page;
import pom.StoleProduct_Page;
import pom.WomenCollection_Page;

public class WishlistProduct extends BaseClass{
	
	@Test
	public void Testcase7() throws FileNotFoundException, IOException, InterruptedException {
		MonteCarlo_LoginPage login = new MonteCarlo_LoginPage(driver);
		login.clickwomen();
		
		WomenCollection_Page womencollection_page = new WomenCollection_Page(driver);
		womencollection_page.clickstole();
		
		StoleCollection_Page stolecollection_page = new StoleCollection_Page(driver);
		//stolecollection_page.clickprice();
		//Thread.sleep(3000);
		stolecollection_page.enterfirstrange(datautilities.readingdataPropertyFile("frange"));
		stolecollection_page.enterlastrange(datautilities.readingdataPropertyFile("lrange"));
		//stolecollection_page.clickEnter();
		stolecollection_page.clickresetfilter();
		stolecollection_page.enterfirstrange(datautilities.readingdataPropertyFile("frange"));
		stolecollection_page.enterlastrange(datautilities.readingdataPropertyFile("frange"));
		stolecollection_page.clickstoleproductimg();
		
		StoleProduct_Page stoleproduct_page = new StoleProduct_Page(driver);
		stoleproduct_page.clickwishlist();
		stoleproduct_page.enterMail(datautilities.readingdataPropertyFile("email"));
		stoleproduct_page.clickAdd();
		stoleproduct_page.verifyProductAdd();
	}

}
