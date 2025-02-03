package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoleCollection_Page {
    //@FindBy (xpath="//div[@class=\"uu_plus\"]")
   // private WebElement price;
    
	@FindBy(id="filter.v.price.gte")
    private WebElement firstrange;
    
	@FindBy(id="filter.v.price.lte")
    private WebElement lastrange;
    
	@FindBy(xpath="template--24170044064032__main")
	private WebElement enter;
    
	@FindBy(xpath="//a[text()='Reset filters']")
    private WebElement restfilter;
    
	@FindBy(xpath="//a[text()='Women Brown Self Design Stole']")
    private WebElement stoleproductimg;
    
    public StoleCollection_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
   // public void clickprice() {
    //	price.click();
    //}
    public void enterfirstrange(String range) {
    	
    	firstrange.sendKeys(range);
    	
    }
    public void enterlastrange(String rng) {
    
    	lastrange.sendKeys(rng);
    }
    public void clickEnter()
	{
		enter.click();
	}
    public void clickresetfilter() {
    	restfilter.click();
    }
    
   // public void enterminprice(String min) {
    //	firstrange.sendKeys(min);
    //}
    //public void entermaxprice(String max) {
    //	lastrange.sendKeys(max);
    	
   // }
    public void clickstoleproductimg() {
    	stoleproductimg.click();
    }
    
    
    
}
