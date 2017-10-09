/**
 * 
 */
package com.easyFrame.factory;

import com.easyFrame.dataProvider.ConfigDataProvider;
import com.easyFrame.dataProvider.ExcelDataProvider;

/**
 * @author cyrus
 *
 */
public class DataProviderFactory {
	
	
	public static ConfigDataProvider getConfig(){
		
		ConfigDataProvider config=new ConfigDataProvider();
		
		return config;
	}
	
	public static ExcelDataProvider getExcel(){
		
		ExcelDataProvider excel=new ExcelDataProvider();
		
		return excel;
	}

}
