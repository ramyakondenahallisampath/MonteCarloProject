package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlackSlevee_Page {
     
	@FindBy(id="AddToCart")
	private WebElement addcartslevee;
	
	@FindBy(xpath="//button[text()='Add order note']")
	private WebElement addnote;
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;
	
	@FindBy(id="cart[note]")
	private WebElement cartnote;
	@FindBy(xpath="(//button[@class=\"drawer__close-button tap-area\"])[1]")
	private WebElement close;
	
	public BlackSlevee_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickblackslevee() {
		addcartslevee.click();
	}
	public void clickaddnote() {
		addnote.click();
	}
	public void entercartnote(String text) {
		cartnote.sendKeys(text);
	}
	public void clicksave() {
		save.click();
	}
	public void clickclose() {
		close.click();
	}
}
