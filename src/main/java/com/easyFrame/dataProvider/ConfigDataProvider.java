/**
 * 
 */
package com.easyFrame.dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * @author cyrus
 *
 */
public class ConfigDataProvider {
	
	static Properties prop;
	
	public ConfigDataProvider(){
		
		File src=new File("./Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is: "+e.getMessage());
		}
	}
	
	public String getAppUrl(){
		
		String url=prop.getProperty("url");
		return url;
	}
	
	public static String getChromePath(){
		
		String chromePath=prop.getProperty("chromePath");
		return chromePath;
	}
	
	public String getfirefoxPath(){
		
		String firefoxPath=prop.getProperty("firefoxPath");
		return firefoxPath;
	}
	
	public String getIEPath(){
		
		String iePath=prop.getProperty("iePath");
		return iePath;
	}

}
