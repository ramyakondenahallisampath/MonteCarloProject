package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AscendingProduct_Page {

		@FindBy(xpath="(//span[@class=\"loader-button__text\"])[2]")
		private WebElement addtocart;
		
		@FindBy(xpath="(//button[@type=\"button\"])[1]")
		private WebElement close;
		
		public AscendingProduct_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public void clickaddtocart() {
			addtocart.click();
		}
		public void clickclose() {
			close.click();
		}
		
}
