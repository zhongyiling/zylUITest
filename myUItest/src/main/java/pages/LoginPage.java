package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.Section;

public class LoginPage extends BasePage {
	private String fileName = null;
	public Section section;
	public LoginPage(WebDriver driver) {
		super(driver);
		fileName = "src/main/resources/pageElements/loginPageElements.properties";
		this.section = new Section(driver,fileName);
	}
	public void getUserName() throws Exception {
		section.locateElement("userName");
	}
	public void setUserName(String username) throws Exception {
		WebElement element = section.locateElement("userName");
		section.sendKeys(element,username);
	}
	public void setPassword(String password) throws Exception {
		WebElement element = section.locateElement("password");
		section.sendKeys(element,password);
	}
	public void clickLoginBtn() throws Exception {
		WebElement element = section.locateElement("loginBtn");
		section.click(element);
	}
}
