package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAccount_Page {
	
	@FindBy(xpath="//li//a[@aria-controls='desktop-menu-5']")
	private WebElement homefur;
	
	public WebElement getHomefur() {
		return homefur;
	}
	@FindBy(xpath="//a[@class=\"   header__linklist-link link--animated\"]")
	private WebElement men;

	public WebElement getMen() {
		return men;
	}
	
	@FindBy(xpath="//li[@class='linklist__item']//a[text()='AC Comforter']")
	private WebElement accomfor;
	
	@FindBy(xpath="//a[text()='Round Neck Sweaters']")
	private WebElement roundNextSweater;
	
	@FindBy(xpath="//img[@alt=\"women coat\"]")
	private WebElement womenimg;
	
	@FindBy (xpath="//img[@alt=\"home logo\"]")
	private WebElement homelogo;
	
	@FindBy(xpath="//a[text()='Addresses']")
	private WebElement address;
	
	@FindBy(xpath="(//a[@aria-controls=\"mini-cart\"])[2]")
	private WebElement cart;
	
	@FindBy(xpath="//a[text()='Start shopping']")
	private WebElement startshopping;
	
	@FindBy(xpath="//a[@aria-label=\"Search\"]")
	private WebElement search;
	@FindBy(xpath="//input[@placeholder=\"What are you looking for?\"]")
	private WebElement searchproduct;
	
	@FindBy(xpath="//button[text()='View all results']")
	private WebElement viewproduct;
	
	@FindBy(xpath="//a[@class=\"line-item__content-wrapper\"]")
	private WebElement productimg;
	
	
	
	
	
	
	
	public UserAccount_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void acComforter() {
		accomfor.click();
	}
	
	public void roundNeckSweaterclick() {
		roundNextSweater.click();
	}
	public void clickwomenimg() {
		womenimg.click();
	}
	
	public void clickhomelogo() {
		homelogo.click();
	}
	public void clickaddress() {
		address.click();
	}
	public void clickcart() {
		cart.click();
	}
	
	public void clickstartshopping() {
		startshopping.click();
	}
	public void clicksearch() {
		search.click();
	}
	public  void entersearchproduct(String text) {
		searchproduct.sendKeys(text);
	}
	public void clickviewproduct() {
		viewproduct.click();
	}
	public void clickproductimg() {
		productimg.click();
	}
	
	
	

}
