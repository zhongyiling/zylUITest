package utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Section {
	public String fileName;
	WebDriver driver;
	public final int shortTimeOut = 10;
	public final int midTimeOut = 20;
	public final int longTimeOut = 30;
	public Section(WebDriver driver, String fileName) {
		this.fileName = fileName;
		this.driver = driver;
	}
	public WebElement locateElement(String key) throws NoSuchElementException  {
		ReadElements r = new ReadElements(this.fileName);
		String xpath = null;
		try {
			xpath = r.getXpath(key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//System.out.println(e);
		}
		return driver.findElement(By.xpath(xpath));
	}
	public List<WebElement> locateElements(String key) throws NoSuchElementException  {
		ReadElements r = new ReadElements(this.fileName);
		String xpath = null;
		try {
			xpath = r.getXpath(key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//System.out.println(e);
		}
		return driver.findElements(By.xpath(xpath));
	}

	/*
	 * public void openPage(String url) { driver.get(url);
	 * driver.manage().timeouts().implicitlyWait(longTimeOut, TimeUnit.SECONDS); }
	 */
	public void sendKeys(WebElement element,String s) {
		new WebDriverWait(driver,shortTimeOut).until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(s);
	}
	public void click(WebElement element) {
		new WebDriverWait(driver,shortTimeOut).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
