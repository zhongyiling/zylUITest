package PageTasks;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pages.LoginPage;

public class LoginPageTask {
	private LoginPage loginpage;
	public WebDriver driver;
	private static final Logger logger= Logger.getLogger(LoginPageTask.class);

	public LoginPageTask(WebDriver driver) {
		//super();
		this.driver = driver;
		this.loginpage = new LoginPage(driver) ;
	}
	public void loginTask(String url,String username,String pwd) throws Exception {
		logger.info("bagin to login");
		logger.info("open the brower");
		loginpage.openPage(url);
		logger.info("set username");
		loginpage.setUserName(username);
		logger.info("set password");
		loginpage.setPassword(pwd);
		logger.info("click login button");
		loginpage.clickLoginBtn();
	}

}
