package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HandtowelWishlist_page {

	@FindBy(xpath="//button[contains(text(),'X')] ")
	private WebElement close;
	
	public HandtowelWishlist_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickclose() {
		close.click();
	}
}
