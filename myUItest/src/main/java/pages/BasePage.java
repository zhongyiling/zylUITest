package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public WebDriver driver;
	public String fileName;
	public final int shortTimeOut = 10;
	public final int midTimeOut = 20;
	public final int longTimeOut = 30;
	//public Section section;
	/*
	 * public final int shortTimeOut = 10; public final int midTimeOut = 20; public
	 * final int longTimeOut = 30;
	 */
	
	public BasePage(WebDriver driver) {
		this.driver = driver;		
	}
	public void setFileName(String filename) {
		this.fileName = fileName;
	}
	/* 
	 * public WebElement locateElement(Srting key) { readElements r = new
	 * readElements(this.fileName); String xpath = r.getXpath(key) return
	 * driver.findElement(By.xpath(xpath)); }
	 * 
	 * public List<WebElement> locateElements(Srting key) { readElements r = new
	 * readElements(this.fileName); String xpath = r.getXpath(key) return
	 * driver.findElements(By.xpath(xpath)); }
	 */
	
	  public void openPage(String url) { 
		  driver.get(url);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	  }
	 public void sendKeys(WebElement element,String s) {
		  new WebDriverWait(driver,shortTimeOut).until(ExpectedConditions.visibilityOf(element));
		  element.clear();
		  element.sendKeys(s);
	 }
	 public void click(WebElement element) {
		  new WebDriverWait(driver,shortTimeOut).until(ExpectedConditions.elementToBeClickable(element));
		  element.click();
	 }
	/*
	 * public void sendKeys(WebElement element,String s) { new
	 * WebDriverWait(driver,shortTimeOut).until(ExpectedConditions.visibilityOf(
	 * element)); element.clear(); element.sendKeys(s); } public void
	 * click(WebElement element) { new
	 * WebDriverWait(driver,shortTimeOut).until(ExpectedConditions.
	 * elementToBeClickable(element)); element.click(); }
	 */
}
