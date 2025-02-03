package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoundNeck_Page {

	@FindBy(xpath="//button[text()='Size']")
	private WebElement size;
	
	@FindBy(xpath="//label[contains(text(),'38/M')]")
	private WebElement sizemedium;
	
	@FindBy(xpath="//button[contains(text(),'Brand')]")
	private WebElement brand;
	
	@FindBy(xpath="//label[contains(text(),'Rock.it ')]")
	private WebElement rockit;
	
	@FindBy(xpath="//button[contains(text(),'Sleeve')]")
	private WebElement sleeve;
	
	@FindBy(xpath="//label[contains(text(),'Full Sleeve ')]")
	private WebElement fullsleeve;
	
	@FindBy(xpath="(//a[contains(text(),'Solid Round Neck Full Sleeve')])[3]")
	private WebElement productimg;
	
	public RoundNeck_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clicksize() {
		size.click();
	}
	public void clicksizemedium() {
		sizemedium.click();
	}
	public void clickbrand() {
		brand.click();
	}
	public void clickrockit() {
		rockit.click();
	}
	public void clicksleeve() {
		sleeve.click();
	}
	public void clickfullsleeve() {
		fullsleeve.click();
	}
	public void clickproductimg() {
	productimg.click();
	}
}
