package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page {
 
	@FindBy(xpath="//a[@data-tippy-content='Add to Wishlist']")
	private WebElement wishlist;
	
	@FindBy(xpath="//span[contains(text(),'Wishlist')]")
	private WebElement wishlisticon;
	
	
	public Product_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void wishlistclick() {
		wishlist.click();
	}
	public void wishlisticonclick() {
		wishlisticon.click();
	}
	
	
}
