package utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPath {
	private String filename = "src/main/resources/utils/filePath.properties";
	private Properties p = new Properties();
	public GetPath(String filename) {
		if(filename != null)
			this.filename = filename;
	}
	public String getFilePath(String key) {
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
		return p.getProperty(key);
		}

}
