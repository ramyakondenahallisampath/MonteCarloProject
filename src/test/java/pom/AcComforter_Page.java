package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcComforter_Page {
	
//	@FindBy(xpath="(//button[@class='collapsible-toggle text--strong'])[2]")
//	private WebElement size;
//	
//	@FindBy(xpath="(//label[@class='block-swatch__item'])[1]")
//	private WebElement single;
//	
//	@FindBy(xpath="(//button[text()='Color']")
//	private WebElement colour;
//	
//	@FindBy(xpath="//label[@style='background-color: coral']")
//	private WebElement colourname;
//	
//	@FindBy(xpath="(//button[@type='button'])[11]")
//	private WebElement brand;
//	
//	@FindBy(xpath="(//input[@class='checkbox'])[4]")
//	private WebElement checkbox;
//	
//	@FindBy(xpath="(//button[@type='button'])[12]")
//	private WebElement availability;
//	
//	@FindBy(xpath="(//input[@class='checkbox'])[5]")
//	private WebElement instockcheck;
//	
//	@FindBy(xpath="//img[@class='product-item__secondary-image']")
//	private WebElement productimg;
//	
//	public AcComforter_Page(WebDriver driver) {
//		PageFactory.initElements(driver,this);
//	}
//	
//	public void sizeclick() {
//		size.click();
//	}
//	public void singleclick() {
//		single.click();
//	}
//	public void colourclick() {
//		colour.click();
//	}
//	public void colournameclick() {
//		colourname.click();
//	}
//	public void brandclick() {
//		brand.click();
//	}
//	public void checkboxclick() {
//		checkbox.click();
//	}
//	public void availabilityclick() {
//		availability.click();
//	}
//	public void instockclick() {
//		instockcheck.click();
//	}
//	public void productimgclick() {
//		productimg.click();
//	}
	@FindBy(xpath = "//button[text()='Size'] ")
	private WebElement size;

	@FindBy(xpath = "//label[contains(text(),'Single')] ")
	private WebElement SizeOption;

	@FindBy(xpath = "//button[text()='Color']")
	private WebElement color;

	@FindBy(xpath = "(//label[@class=\"color-swatch__item\"])[2]")
	private WebElement colorOption;

	@FindBy(xpath = "//button[text()='Brand']")
	private WebElement brand;

	@FindBy(xpath = "//label[contains(text(),'Monte Carlo')]")
	private WebElement brandOption;

	@FindBy(xpath = "//button[text()='Availability']")
	private WebElement availability;

	@FindBy(xpath = "//label[contains(text(),'In stock') or input[@class='checkbox']]")
	private WebElement instockOption;

	@FindBy(xpath = "(//div[@class='title-wish'])[1]")
	private WebElement firstProduct;
	
	public AcComforter_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickSize() {
		size.click();
	}

	public void selectSize() {
		SizeOption.click();
	}

	public void clickColor() {
		color.click();
	}

	public void selectColor() {
		colorOption.click();
	}

	public void clickBrand() {
		brand.click();
	}

	public void selectBrand() {
		brandOption.click();
	}

	public void clickAvailability() {
		availability.click();
	}

	public void selectAvailability() {
		instockOption.click();
	}

	public void clickOnProduct() {
		firstProduct.click();
	}








}
