package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist_Page {
	@FindBy(xpath="//div[contains(@class,'flits-box')]//div//div//div//button[text()='Add to Cart']")
	private WebElement addcart;
	
	public Wishlist_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void addcartclick() {
		addcart.click();
	}
}
