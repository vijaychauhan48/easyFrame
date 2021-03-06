/**
 * 
 */
package com.easyFrame.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.easyFrame.dataProvider.ConfigDataProvider;

/**
 * @author cyrus
 *
 */
public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver getBrowser(String browser){
		
		if(browser.equalsIgnoreCase("firefox")){

			System.setProperty("webdriver.gecko.driver", DataProviderFactory.getConfig().getfirefoxPath());
			
			driver=new FirefoxDriver();
		}
		
		else if (browser.equalsIgnoreCase("chrome")){

			DataProviderFactory.getConfig();
			System.setProperty("webdriver.chrome.driver", ConfigDataProvider.getChromePath());
			
			driver=new ChromeDriver();
		}
		
		else if (browser.equalsIgnoreCase("IE")){
			
			System.setProperty("webdriver.ie.driver",DataProviderFactory.getConfig().getIEPath());
			
			driver=new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return driver;
	}
	
}
