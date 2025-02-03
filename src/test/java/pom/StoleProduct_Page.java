package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class StoleProduct_Page {
	@FindBy(xpath="//a[@data-flits-product-title=\"Women Brown Self Design Stole\"]")
	private WebElement wishlist;
	
	@FindBy(id="flits_email_id")
	private WebElement enterEmail;
	
	@FindBy(xpath="//button[text()=' Add to Wishlist ']")
	private WebElement ClickAddToWishlist;
	@FindBy(xpath="//p[text()=' Product has been added to your wishlist ']")
	private WebElement productAdd;
	public StoleProduct_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickwishlist() {
		
		wishlist.click();
	}
	public void enterMail(String email){
			enterEmail.sendKeys(email);
	 }
		public void clickAdd()
		{
			ClickAddToWishlist.click();
		}
		public void verifyProductAdd()
		{
			String ele = productAdd.getText();
			Reporter.log(ele,true);
		}
	
}
