package testCases;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import utils.ReadElements;

public class MyTest {
  @Test
  public void f() throws Exception {
	  String fileName = "src/main/resources/pageElements/loginPageElements.properties";
		
	  ReadElements r = new ReadElements(fileName); 
	  String xpath = r.getXpath("userName"); 

  }
}
