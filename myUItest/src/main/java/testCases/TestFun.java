package testCases;

import org.testng.annotations.Test;

import PageTasks.ConsolePageTask;
import PageTasks.CreateUserPageTask;
import PageTasks.LoginPageTask;
import pages.ConsolePage;
import utils.TestURL;
import utils.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class TestFun {
	private CreateUserPageTask createuserpagetask;
	private ConsolePageTask consolepagetask;
	private ConsolePage consolepage;
	private WebDriver driver;
	private WebDriverWait wait;
	private static final Logger logger= Logger.getLogger(TestFun.class);
	private LoginPageTask loginPageTask;
  @Test
  public void f() {
       
	  //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("iam_users")));

	  //consolepagetask.gotoCreteUserPage();

		logger.info("go to create user page");
		logger.info("click user list");
		consolepage.clickUserList();
		logger.info("click create user button");
		consolepage.clickCreateUserBtn();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  String url = TestURL.CONSOLEURL;
	  String username = "z00354714";
	  String pwd = "zyl2019_";

	  
	  try {
		WebDriver driver = (WebDriver) WebDriverManager.getDriver();
		loginPageTask = new LoginPageTask(driver);
		consolepage = new ConsolePage(driver);
	    ConsolePageTask consolepagetask = new ConsolePageTask(driver);
		CreateUserPageTask createuserpagetask = new CreateUserPageTask(driver);
		loginPageTask.loginTask(url, username, pwd);

	} catch (Exception e) {
		// TODO Auto-generated catch block
		logger.error(e);
	}
  }

  @AfterClass
  public void afterClass() {
  }

}
