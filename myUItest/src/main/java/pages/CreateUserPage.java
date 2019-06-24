package pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.Section;

public class CreateUserPage extends BasePage {
	private String filename=null;;
	private Section section;
	private static final Logger logger = Logger.getLogger(CreateUserPage.class);

	public CreateUserPage(WebDriver driver) {
		super(driver);
		this.filename="src/main/resources/pageElements/createUserPageElements.properties";
		this.section = new Section(driver,filename);
		// TODO Auto-generated constructor stub
	}
	
	public void setUserName(String s) {
		try {
			WebElement element = section.locateElement("inputUsername");
			this.sendKeys(element, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
	}
	public void clickByPWD() {
		try {
			List<WebElement> elements = section.locateElements("inputUsername");
			this.click(elements.get(0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
	}
	public void clickByKey() {
		try {
			List<WebElement> elements = section.locateElements("pwdType");
			this.click(elements.get(1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
	}
	public void clickGroupDrop() {
		
		try {
			WebElement element = section.locateElement("inputUsername");
			this.click(element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}	
	}
	public void clickAdmin() {
		try {
			WebElement element = section.locateElement("admin");
			this.click(element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
	}
	public void clicksubmitBtn1() {
		try {
			WebElement element = section.locateElement("submitBtn1");
			this.click(element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
	}
	public void setEmail(String email) {
		try {
			WebElement element = section.locateElement("email");
			this.sendKeys(element, email);
		}catch(Exception e) {
			logger.error(e);
		}
	}
	public void clickOK() {
		try {
			WebElement element = section.locateElement("submitBtn");
			this.click(element);
		}catch(Exception e) {
			logger.error(e);	
		}
	}
	
	

}
