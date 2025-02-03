package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenCollection_Page {
   @FindBy (xpath="(//div[@class=\"custom-tems slick-slide slick-active\"])[4]")
   private WebElement stole;
   
   public WomenCollection_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
   public void clickstole() {
	   stole.click();
   }
}
