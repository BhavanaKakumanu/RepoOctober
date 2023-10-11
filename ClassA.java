package org.abc.xyz;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClassA extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = getDriver();
		getUrl("https://www.facebook.com/");
		
		LoginPage l = new LoginPage();
	
		insertData(l.getUsername(), "hello");
		insertData(l.getPassword(), "hi");
		uclick(l.getUsername());
		Thread.sleep(5000);
		uquit();
		
		
	}
}
