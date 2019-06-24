package testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import PageTasks.LoginPageTask;
import pages.LoginPage;
import utils.TestURL;
import utils.WebDriverManager;

import org.testng.Assert;

public class LoginPageTest {
	private LoginPageTask loginPageTask;
	//private LoginPage loginPage;
	private String url = TestURL.LOGINURL;
	WebDriver driver;
	public WebDriverWait wait;
	private static final Logger logger= Logger.getLogger(LoginPageTest.class);
  @Test(dataProvider = "accountInfo")
  @Parameters({"username","password"})
  public void f(String username,String password) {
	  logger.info("login by usename");
	  try {
		  WebDriver driver = (WebDriver) WebDriverManager.getDriver();
		  LoginPageTask loginPageTask = new LoginPageTask(driver);
		  loginPageTask.loginTask(url,username,password);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='header-user-name']")));
		  Assert.assertEquals(driver.getTitle(),"华为云 +智能，见未来"); 
		  WebElement e =driver.findElement(By.xpath("//*[@class='header-user-name']"));
	  }catch (Exception e)
	  {
		  logger.error(e);
	  }
		/*
		 * WebDriver driver = (WebDriver) WebDriverManager.getDriver(); LoginPageTask
		 * loginPageTask = new LoginPageTask(driver);
		 * loginPageTask.loginTask(url,username,password);
		 */

	  //driver.get(TestURL.LOGOUTURL);
  }
 
  @BeforeMethod
  public void BeforeMethon() {

  }
  @BeforeClass
  public void beforeClass() {
		/*
		 * driver = WebDriverManager.getDriver(); //loginPage = new LoginPage(driver);
		 * loginPageTask = new LoginPageTask(driver); wait = new
		 * WebDriverWait(driver,30); logger.info("beginning");
		 */

  }
  @AfterMethod
  public void afterMethod() {
	  //driver.get(TestURL.LOGOUTURL);
	  WebDriverManager.quitDriver();
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();  
  }
  @DataProvider(name="accountInfo",parallel = true)
  public Object[][] accountInfo(){
	  
	return new Object[][] {{"z00354714","zyl2019_"},{"15002991409","Test1234_"}};
	  
  }
}