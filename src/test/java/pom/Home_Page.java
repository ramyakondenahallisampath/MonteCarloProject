package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	@FindBy (xpath="//a[contains(text(),'SHOP Blankets')]")
	private WebElement shopblanket;
	
	
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickshopblanket() {
		shopblanket.click();
	}

}
