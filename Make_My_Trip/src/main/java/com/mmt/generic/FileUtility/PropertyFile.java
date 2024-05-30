package com.mmt.generic.FileUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {

	public String getDataFromPropertyFile(String key) throws Throwable {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String data = prop.getProperty(key);
		return data;
	}
}
