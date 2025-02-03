package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonteCarlo_LoginPage {
	
	@FindBy(xpath="//span[contains(text(),\"Login/Signup\")]")
	private WebElement login;
	
	@FindBy(xpath="//a[text()='WOMEN']")
	private WebElement women;
	
	
	
	public  MonteCarlo_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginBtn() {
		login.click();
	}
	public void clickwomen() {
		women.click();
	}
	

}
