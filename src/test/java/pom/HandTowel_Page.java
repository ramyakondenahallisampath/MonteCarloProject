package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HandTowel_Page {

	@FindBy(xpath="(//a[contains(@class,'flits-wls-button flits-wls-two')])")
	private WebElement whishlist;
	@FindBy(xpath="//span[@class=\"icon-title\"]")
	private WebElement wishlistelement;
	
	public HandTowel_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickwhishlist() {
		whishlist.click();
	}
	public void clickwishlistelement() {
		wishlistelement.click();
	}
}
