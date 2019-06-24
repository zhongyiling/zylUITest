package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {
    public static ThreadLocal<WebDriver> ThreadDriver=new ThreadLocal<WebDriver>();
    //public static String browserType;
    public static void setDriver(WebDriver driver){
        //WebDriver driver=new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver", "D:\\Program Files (x86)\\WebDriver\\chromedriver.exe");
        ThreadDriver.set(driver);    
 
        }
    public static WebDriver getDriver(){
    	WebDriver driver=new ChromeDriver();
    	ThreadDriver.set(driver);
    	driver = (WebDriver)ThreadDriver.get();
		return driver;
    	
    }
    
    public static void quitDriver() {
    	ThreadDriver.get().quit();
    	ThreadDriver.remove();
    }
    
    public static void get(String url) {
    	ThreadDriver.get().get(url);
    }
}
