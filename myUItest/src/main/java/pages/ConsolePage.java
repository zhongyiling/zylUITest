package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageTasks.LoginPageTask;
import utils.Section;

public class ConsolePage extends BasePage {
	private String fileName = null;
	public Section section;
	private static final Logger logger = Logger.getLogger(ConsolePage.class);
	public ConsolePage(WebDriver driver) {
		super(driver);
		fileName = "src/main/resources/pageElements/consolePageElements.properties";
		this.section = new Section(driver,fileName);
	}
	public void clickCreateUserBtn() {
		try {
			WebElement element = section.locateElement("createUserBtn");
			logger.info(element);
			//System.out.println(element);
			this.click(element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
	}
	public void clickUserList() {
		try {
			WebElement element = section.locateElement("userList");
			//System.out.println(element);
			this.click(element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
	}
	public void setUserForSearch(String s) {
		try {
			WebElement element = section.locateElement("searchInput");
			this.sendKeys(element, s);
		}catch(Exception e){
			logger.error(e);
		}
	}
	public void clickSearchIcon() {
		try {
			WebElement element = section.locateElement("Searchicon");
			this.click(element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
	}
	public void clickDeleteUser() {
		try {
			WebElement element = section.locateElement("deleteUser");
			this.click(element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
	}
	public void clickOKBtn() {
		try {
			WebElement element = section.locateElement("okBtn");
			this.click(element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
	}
	
}
