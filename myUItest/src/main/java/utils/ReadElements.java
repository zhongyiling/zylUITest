package utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
//import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class ReadElements {
	public String filename = null;
	public Properties p = new Properties();
	public ReadElements(String filename) {
		if(filename == null)
			System.out.println("filename is null");
		this.filename = filename;
	}
	public void loadFile() {
		//Properties p = new Properties();
		try {
			InputStream in = new BufferedInputStream(new FileInputStream(filename));
			p.load(in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Map<String,String> getElementMap() {
		Map<String,String> elementMap = new HashMap<String, String>();
		for(Object key:p.keySet()) {
			String keystr = key.toString();
			//System.out.println(keystr);
			String value = p.getProperty(keystr);
			//System.out.println(value);
			elementMap.put(keystr, value);
		}
		return elementMap;
	}
	public String getXpath(String key) throws Exception {
		this.loadFile();
		Map<String, String> elementMap = this.getElementMap();
		if(elementMap == null) {
			throw new Exception("the elementMap is null");
		}
		return elementMap.get(key);
	}
}
