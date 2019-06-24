package testCases;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import TestLog.TestLog;

import java.util.Map.Entry;

import org.apache.log4j.Logger;

import utils.ReadElements;

public class Test {

	@org.junit.Test
	public void test() {
		Logger logger = Logger.getLogger(Test.class);
		  String fileName = "src/main/resources/pageElements/loginPageElements.properties";
			/*
			 * ReadElements r = new ReadElements(fileName); String xpath =
			 * r.getXpath("userName"); System.out.println(xpath);
			 */
		  ReadElements r = new ReadElements(fileName);
		  r.loadFile();
		  Properties p1=  r.p;
		  Iterator<Entry<Object, Object>> it=p1.entrySet().iterator();
		  logger.info("begainning");
		Map<String,String> elementMap = new HashMap<String, String>();
		for(Object key:p1.keySet()) {
			String keystr = key.toString();
			System.out.println(keystr);
			String value = p1.getProperty(keystr);
			System.out.println(value);
			elementMap.put(keystr, value);
		}
		/*
		 * while(it.hasNext()) { //Map.Entry mapEntry = (Map.Entry)it.next(); String key
		 * = (String)it.next().getKey(); String value = (String)it.next().getValue();
		 * elementMap.put(key,value); }
		 */
	}

}
