package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlanketCollection_Page {
	 
	@FindBy(xpath="//div[@class='product-list__inner']/product-item")
	private WebElement productimg;
	
	
	public BlanketCollection_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickproductimg() {
		productimg.click();
	}
	
}
