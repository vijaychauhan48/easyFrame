package com.easyFrame.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
	
	
	public static WebDriver driver;
	
	//This will get the driver
	public WebDriver getDriver(){
		return driver;
	}

	
	//this method will click on the element by passing the element to this method.
	public void clickOn(WebElement ele){
		ele.click();
	}
	
	//This method will clear the field and type into that field
	public void typeInto(WebElement ele, String value){
		ele.clear();
		ele.sendKeys(value);
	}
	
	//This method will click on the web link.
	public void clickOnLink(WebElement ele){
		ele.click();
	}
	
	//This method will get the title of the page.
	public static String getPageTitle(){
		return driver.getTitle();
	}
	
}
