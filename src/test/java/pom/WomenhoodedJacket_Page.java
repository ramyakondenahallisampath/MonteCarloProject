package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenhoodedJacket_Page {

	@FindBy(xpath="//product-item[@class=\"product-item  hhh Byee\"]")
	private WebElement productimg;
	
	public WomenhoodedJacket_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickproductimg() {
		productimg.click();
	}
}
