package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AscendingCollection_Page {
	
	@FindBy(xpath="//a[text()='Womens Beige Printed Top']")
	private WebElement productimg;
	
	public AscendingCollection_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickproductimg() {
		productimg.click();
	}
	
}
