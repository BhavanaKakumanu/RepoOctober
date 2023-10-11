package org.abc.xyz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	
public static WebDriver getDriver() {
	//setting up the properties for webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhava\\OneDrive\\Desktop\\DriversAndJars\\chromedriver.exe");
		
		//webdriver initialization
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		return driver;
}

public static void getUrl(String urlvalue) {
	//launching the application
		driver.get(urlvalue);
}

public static void uclick(WebElement element) {
	element.click();
}

public static void insertData(WebElement element, String value) {
	element.sendKeys(value);
}

public static void uquit() {
	driver.quit();
}

}