package testCases;

import org.testng.annotations.Test;

import PageTasks.LoginPageTask;
import pages.LoginPage;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import utils.TestURL;
import utils.WebDriverManager;

public class LoginPageTestSuites {
	private LoginPageTask loginPageTask;
	private LoginPage loginPage;
	private String url = "https://auth.huaweicloud.com/authui";
	public WebDriver driver;
	private static final Logger logger= Logger.getLogger(LoginPageTest.class);
	//public static ThreadLocal<WebDriver> ThreadDriver=new ThreadLocal<WebDriver>() ;
  @Test
  @Parameters({"username","password"})
  public void f(String username,String password) throws Exception {
		/*这是将driver设置为局部变量的方式实现并发
		 * WebDriver driver = new ChromeDriver(); LoginPageTask loginPageTask = new
		 * LoginPageTask(driver); loginPageTask.loginTask(url,username,password);
		 * driver.quit();
		 */
		/*
		 * ThreadDriver.get().get(url);
		 * ThreadDriver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * ThreadDriver.get().manage().window().maximize(); WebElement userName =
		 * ThreadDriver.get().findElement(By.xpath("//input[@id='userNameId']"));
		 * userName.clear(); userName.sendKeys(username); WebElement pwd =
		 * ThreadDriver.get().findElement(By.xpath("//input[@id='pwdId']"));
		 * pwd.clear(); pwd.sendKeys(password); WebElement loginBtn =
		 * ThreadDriver.get().findElement(By.xpath("//*[@id='btn_submit']"));
		 * loginBtn.click();
		 */
	  WebDriver driver = (WebDriver) WebDriverManager.getDriver();
	  LoginPageTask loginPageTask = new LoginPageTask(driver);
	  loginPageTask.loginTask(url,username,password);
		/*
		 * WebDriver driver = (WebDriver) WebDriverManager.getDriver(); //driver =
		 * ThreadDriver.get(); driver.get(url);
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * driver.manage().window().maximize(); WebElement userName =
		 * driver.findElement(By.xpath("//input[@id='userNameId']")); userName.clear();
		 * userName.sendKeys(username); WebElement pwd =
		 * driver.findElement(By.xpath("//input[@id='pwdId']")); pwd.clear();
		 * pwd.sendKeys(password); WebElement loginBtn =
		 * driver.findElement(By.xpath("//*[@id='btn_submit']")); loginBtn.click();
		 */
	  
  }
  @Test
  @Parameters({"phone","password1"})
  public void f1(String phone,String password1) throws Exception {
	  
		/*这是将driver设置为局部变量的方式实现并发
		 * WebDriver driver = new ChromeDriver(); LoginPageTask loginPageTask = new
		 * LoginPageTask(driver); loginPageTask.loginTask(url,phone,password1);
		 * driver.quit();
		 */
		/*
		 * ThreadDriver.get().get(url);
		 * ThreadDriver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * ThreadDriver.get().manage().window().maximize(); WebElement userName =
		 * ThreadDriver.get().findElement(By.xpath("//input[@id='userNameId']"));
		 * userName.clear(); userName.sendKeys(phone); WebElement pwd =
		 * ThreadDriver.get().findElement(By.xpath("//input[@id='pwdId']"));
		 * pwd.clear(); pwd.sendKeys(password1); WebElement loginBtn =
		 * ThreadDriver.get().findElement(By.xpath("//*[@id='btn_submit']"));
		 * loginBtn.click();
		 */
	  WebDriver driver = (WebDriver) WebDriverManager.getDriver();
	  LoginPageTask loginPageTask = new LoginPageTask(driver);
	  loginPageTask.loginTask(url,phone,password1);
	  //driver = ThreadDriver.get();
		/*
		 * driver.get(url); driver.manage().timeouts().implicitlyWait(30,
		 * TimeUnit.SECONDS); driver.manage().window().maximize(); WebElement userName =
		 * driver.findElement(By.xpath("//input[@id='userNameId']")); userName.clear();
		 * userName.sendKeys(phone); WebElement pwd =
		 * driver.findElement(By.xpath("//input[@id='pwdId']")); pwd.clear();
		 * pwd.sendKeys(password1); WebElement loginBtn =
		 * driver.findElement(By.xpath("//*[@id='btn_submit']")); loginBtn.click();
		 */
	  
  }  
  @BeforeMethod
  public void BeforeMethon() {
	  //WebDriver driver = (WebDriver) WebDriverManager.getDriver();
	  //LoginPageTask loginPageTask = new LoginPageTask(driver);
	  //WebDriver driver = (WebDriver) WebDriverManager.getDriver();

		//System.out.println((ThreadDriver.get()).getClass());
		//System.out.println(driver.getClass());
	  //driver = WebDriverManager.getDriver();

  }
  @BeforeClass
  public void beforeClass() {
	  
	  LoginPageTask loginPageTask = new LoginPageTask(driver);

  }

  @AfterClass
  public void afterClass() {
	  

  }

  @BeforeTest
  public void beforeTest() {

  }
  @AfterMethod
  public void afterMethod() {
	  WebDriverManager.quitDriver();

	  //driver.get(TestURL.LOGOUTURL);

  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();  
  }
}
