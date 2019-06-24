package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageTasks.ConsolePageTask;
import PageTasks.CreateUserPageTask;
import utils.TestURL;
import utils.WebDriverManager;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=(WebDriver) WebDriverManager.getDriver();
		driver.get(TestURL.CONSOLEURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userNameId']")).clear();
		driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("z00354714");
		driver.findElement(By.xpath("//input[@id='pwdId']")).clear();
		driver.findElement(By.xpath("//input[@id='pwdId']")).sendKeys("zyl2019_");
		driver.findElement(By.xpath("//*[@id='btn_submit']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//String xpath = "//*[@id='iam_users']";
		//driver.findElement(By.xpath(xpath));
		//driver.findElement(By.xpath("//*[@id=\"createUserBtn\"]/span[2]")).click();
		ConsolePageTask consolepagetask = new ConsolePageTask(driver);
		CreateUserPageTask createuserpagetask = new CreateUserPageTask(driver);
		consolepagetask.gotoCreteUserPage();
		//createuserpagetask.createUserByKey(username);

	}

}
