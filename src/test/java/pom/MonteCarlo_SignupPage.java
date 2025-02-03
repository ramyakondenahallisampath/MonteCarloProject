package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonteCarlo_SignupPage {
	
	@FindBy(id="customer[email]")
	private WebElement email;
	
	@FindBy(id="customer[password]")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginbtn;
	
	public MonteCarlo_SignupPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void emailbox(String username) {
		email.sendKeys(username);
	}
	public void passwordBox(String pwd) {
		password.sendKeys(pwd);
	}
	public void loginBtn() {
		loginbtn.click();
	}
	

}
