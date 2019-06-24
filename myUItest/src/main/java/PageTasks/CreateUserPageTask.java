package PageTasks;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

//import pages.ConsolePage;
import pages.CreateUserPage;

public class CreateUserPageTask {
	private ConsolePageTask consolepagetask;
	private CreateUserPage createuserpage;
	public WebDriver driver;
	private static final Logger logger= Logger.getLogger(CreateUserPageTask.class);
	public CreateUserPageTask(WebDriver driver) {
		this.driver = driver;
		this.createuserpage = new CreateUserPage(this.driver);
		this.consolepagetask = new ConsolePageTask(driver);
	}
	
	public void createUserByKey(String s) {
		logger.info("begin to create user by key");
		logger.info("set user name");
		createuserpage.setUserName(s);
		logger.info("select key");
		createuserpage.clickByKey();
		logger.info("add to group");
		createuserpage.clickGroupDrop();
		createuserpage.clickAdmin();
		logger.info("submit");
		createuserpage.clicksubmitBtn1();
		logger.info("click ok");
		createuserpage.clickOK();
	}
	public void createUserByPwd(String s,String email) {
		if (email == null) {
			email = s+"@iam.com";
		}
		logger.info("begin to create user by password");
		logger.info("set user name");
		createuserpage.setUserName(s);
		logger.info("select password");
		createuserpage.clickByPWD();
		logger.info("add to group");
		createuserpage.clickGroupDrop();
		createuserpage.clickAdmin();
		logger.info("submit");
		createuserpage.clicksubmitBtn1();
		logger.info("set emial");
		createuserpage.setEmail(email);
		createuserpage.clickOK();
		
	}

}
