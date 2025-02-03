package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoundNeckProduct_Page {
	@FindBy(id="pincode")
	private WebElement pincode;
	
	@FindBy(id="check-pincode")
	private WebElement checkpincode;
	
	public RoundNeckProduct_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void pincodebox(String pin) {
		pincode.sendKeys(pin);
	}
	public void clickcheckpincode() {
		checkpincode.click();
	}
}
