package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Collection_Page {
	
	@FindBy(xpath="//button[@class=\"popover-button hidden-pocket\"]")
	private WebElement bestselling;
	
	@FindBy(xpath="//span[text()='Date, old to new']")
	private WebElement oldtonew;
	
	@FindBy(xpath="(//product-item[@class=\"product-item  hhh Byee\"])[1]")
	private WebElement productimg;
	
	public Collection_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickbestselling() {
		bestselling.click();
	}
	public void clickoldtonew() {
		oldtonew.click();	
	}
	public void clickproductimg() {
		productimg.click();
	}
}
