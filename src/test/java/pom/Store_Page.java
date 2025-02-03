package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Store_Page {
  
	@FindBy(id="searchInput")
	private WebElement search;
	
	@FindBy(xpath="//a[@class=\"directions-btn\"]")
	private WebElement getdirection;
	
	
	public Store_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void entersearchpincode(String pin) {
		search.sendKeys(pin);
	}
	public void clickgetdirection() {
		getdirection.click();
	}
	
}
