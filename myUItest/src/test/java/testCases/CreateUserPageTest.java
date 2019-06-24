package testCases;

import org.testng.annotations.Test;

import PageTasks.ConsolePageTask;
import PageTasks.CreateUserPageTask;
import PageTasks.LoginPageTask;
import pages.ConsolePage;
import utils.TestURL;
import utils.Tools;
import utils.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CreateUserPageTest {
	private CreateUserPageTask createuserpagetask;
	private ConsolePageTask consolepagetask;
	private ConsolePage consolepage;
	private WebDriver driver;
	private WebDriverWait wait;
	private static final Logger logger= Logger.getLogger(CreateUserPageTest.class);
	private LoginPageTask loginPageTask; 
  @Test(dataProvider = "testData")
  public void createUserByKeyTest(String username) {

	  consolepagetask.gotoCreteUserPage();
	  createuserpagetask.createUserByKey(username);
	  //Assert.assertEquals(,);
	  //Thread.sleep(3000);
	  consolepagetask.deleteUser(username);
	  
  }
  @BeforeMethod
  public void beforeMethod() {


	  
  }

  @AfterMethod
  public void afterMethod() {
	  WebDriverManager.quitDriver();
  }


  @DataProvider(name="testData")
  public Object[][] testData() {
	  String username = Tools.createUserName();
	  System.out.println(username);
	  Object[][] result = null;
	  result = new Object[][] {
		  {username}
	  };
	return result;
  }
  @BeforeClass
  public void beforeClass() {
	  String url = TestURL.CONSOLEURL;
	  String username = "z00354714";
	  String pwd = "zyl2019_";

	  try {
		WebDriver driver = (WebDriver) WebDriverManager.getDriver();
		consolepagetask = new ConsolePageTask(driver);
		createuserpagetask = new CreateUserPageTask(driver);
		consolepage = new ConsolePage(driver);
		loginPageTask = new LoginPageTask(driver);
		loginPageTask.loginTask(url, username, pwd);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"submitBtnStep1\"]")));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"console-topbar-fixed-width-username ng-binding ng-scope\"]")));
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		logger.error(e);
	}
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
