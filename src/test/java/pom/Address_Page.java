package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {

	@FindBy (xpath="//button[@aria-controls=\"drawer-new-address\"]")
	private WebElement newaddress;
	
	@FindBy(id="address-new[first_name]")
	private WebElement firstname;
	
	@FindBy(id="address-new[last_name]")
	private WebElement lastname;
	
	@FindBy(id="address-new[company]")
	private WebElement company;
	
	@FindBy(id="address-new[phone]")
	private WebElement phonenumber;
	
	@FindBy(id="address-new[address1]")
	private WebElement address1;
	 
	@FindBy(id="address-new[city]")
	private WebElement city;
	
	@FindBy(id="address-new[zip]")
	private WebElement zip;
	
	@FindBy(xpath="//input[@name=\"address[default]\"]")
	private WebElement defaultcheckbox;
	
	@FindBy(xpath="//span[text()='Add a new address']")
	private WebElement addnewaddress;
	
	@FindBy(xpath="//button[text()='Delete']")
	private WebElement delete;
	
	public Address_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clicknewaddress() {
		newaddress.click();	
	}
	public void enterfirstname(String fstname) {
		firstname.sendKeys(fstname);
	}
	public void enterlastname(String lstname) {
		lastname.sendKeys(lstname);
	}
	public void entercompany(String compy) {
		company.sendKeys(compy);
	}
	public void enterphonenumber(String num) {
	phonenumber.sendKeys(num);
	}
	public void enteraddress1(String addrs) {
		address1.sendKeys(addrs);
	}
	public void entercity(String cty) {
		city.sendKeys(cty);	
	}
	public void enterzip(String zipcode) {
		zip.sendKeys(zipcode);
	}
	public void clickdefaultcheckbox() {
		defaultcheckbox.click();
	}
	public void clickaddnewaddress() {
		addnewaddress.click();
	}
	public void clickdelete() {
		delete.click();
	}
}
