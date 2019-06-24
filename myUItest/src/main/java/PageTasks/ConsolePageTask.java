package PageTasks;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.ConsolePage;
//import pages.LoginPage;

public class ConsolePageTask {
	//private LoginPageTask loginpagetask;
	private ConsolePage consolepage;
	private WebDriver driver;
	private WebDriverWait wait;
	private static final Logger logger= Logger.getLogger(ConsolePageTask.class);
	public ConsolePageTask(WebDriver driver) {
		this.driver = driver;
		this.consolepage = new ConsolePage(driver);
		//this.loginpagetask = new LoginPageTask(driver);
	}
	public void searchUser(String s) {
		consolepage.setUserForSearch(s);
		consolepage.clickSearchIcon();
	}
	public void gotoCreteUserPage() {
		logger.info("go to create user page");
		logger.info("click user list");
		consolepage.clickUserList();
		logger.info("click create user button");
		consolepage.clickCreateUserBtn();
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"submitBtnStep1\"]")));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void deleteUser(String s) {
		this.searchUser(s);
		consolepage.clickDeleteUser();
		consolepage.clickOKBtn();
	}

}
