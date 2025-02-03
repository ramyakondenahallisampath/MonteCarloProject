package genericLibraies;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class WebDriverUtilities{
	public WebDriver driver;
	

	
	public void mouseHover(WebElement ele,WebDriver driv) {
		Actions a = new Actions(driv);
		a.moveToElement(ele).perform();
	}
	public void rightClick(WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void doubleclick(WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	public void dropDown(WebElement ele,String text) {
		Select s= new Select(ele);
		s.selectByVisibleText(text);
	}
	public void framewithWebElementAddress(WebElement ele) {
		driver.switchTo().frame(ele);
	}
	public void framewithIndex(int index) {
		driver.switchTo().frame(index);
	}
	public void switchbackframe() {
		driver.switchTo().defaultContent();
	}
	public void alertacceptPopup(WebDriver driv) {
		driv.switchTo().alert().accept();
	}
	public void alertdismissPopup() {
		driver.switchTo().alert().dismiss();
	}
	public void alertpopupText() {
		Alert alert = driver.switchTo().alert();
		Reporter.log(alert.getText(),true);
	}
	public void scrollbarTopButtom() {
		JavascriptExecutor javascriptexecutor = (JavascriptExecutor)driver;
		javascriptexecutor.executeScript("window.scrollBy(o,5000)");
	}
	public void scrollbarButtomTop() {
		JavascriptExecutor javascriptexecutor = (JavascriptExecutor)driver;
		javascriptexecutor.executeScript("window.scrollBy(o,-5000)");
	}
	public void scrollToEle(WebElement ele) {
		JavascriptExecutor javascriptexecutor = (JavascriptExecutor)driver;
		javascriptexecutor.executeScript("arguments[0].scrollIntoView();",ele);
	}
	public void switchChildwindow() {
		Set<String> child = driver.getWindowHandles();
		
		for (String ch:child) {
			driver.switchTo().window(ch);
		}
		
	}
	public void multipletabs(int index) {
		Set<String> child = driver.getWindowHandles();
		ArrayList<String>arraylist= new ArrayList<String>(child);
		driver.switchTo().window(arraylist.get(index));
	}
	
	public void waitElement(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void waitElementClick(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	

}
