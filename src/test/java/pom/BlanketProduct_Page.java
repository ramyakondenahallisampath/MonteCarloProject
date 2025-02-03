package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlanketProduct_Page {
	
	@FindBy(xpath="//button[@class=\"accordion accordion-btn-s\"]")
	private WebElement productdesc;
	
	@FindBy(xpath="//a[text()='Our Stores']")
	private WebElement stores;
	
	public BlanketProduct_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickproductdesc() {
		productdesc.click();
	}
	public void clickstores() {
		stores.click();
	}
}
