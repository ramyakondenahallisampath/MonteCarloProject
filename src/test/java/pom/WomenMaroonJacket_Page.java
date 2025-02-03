package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenMaroonJacket_Page {
  
	@FindBy(xpath="(//label[@class=\"block-swatch__item\"])[3]")
	private WebElement size;
	@FindBy(xpath="(//button[@class=\"quantity-selector__button\"])[2]")
	private WebElement quantity;
	@FindBy(xpath="(//span[text()='Add to cart'])[2]")
	private WebElement  addcart;
	@FindBy (xpath="//button[@name=\"checkout\"]")
	private WebElement checkout;
	
	public WomenMaroonJacket_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clicksize() {
		size.click();
	}
	public void clickquantity() {
		quantity.click();
	}
	public void clickaddcart() {
		addcart.click();
	}
	public void clickcheckout() {
		checkout.click();
	}
	
}
