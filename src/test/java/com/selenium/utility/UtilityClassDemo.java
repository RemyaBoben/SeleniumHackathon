package com.selenium.utility;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.project.SFHackathon.TC02;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClassDemo {
	public WebDriver wdObj;
	//public String url ="https://qa-tekarch.firebaseapp.com/";
	//public String url ="https://www.amazon.com//";
	public String url ="https://www.salesforce.com/";
	//public String url ="http://the-internet.herokuapp.com/iframe";
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

	}
	
	/*
	 * Name of the method: launchBrowser
	 * Brief Description: To Launch Chrome browser 
	 * Arguments: 
	 * Created by: Automation team
	 * Creation Date: 01/01/2021
	 * Last Modified: 01/01/2021
	 * */
	
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		wdObj = new ChromeDriver();
	}
	public void lauchFireFox() {
		WebDriverManager.firefoxdriver().setup();
		wdObj = new FirefoxDriver();
	}
	
	public void lauchIE() {
		WebDriverManager.iedriver().setup();
		wdObj = new InternetExplorerDriver();
	}
	public void navigateUrl() {
		wdObj.get(url);
		wdObj.manage().window().maximize();
		
	}
	public String readPropertyFile() throws Exception {
		String sPath = System.getProperty("user.dir")+"\\environment.properties";
		FileInputStream fiObj = new FileInputStream(sPath);
		Properties pObj=new Properties();
		pObj.load(fiObj);
		System.getProperties().putAll(pObj);
		String output = "";
		output = System.getProperty("userName")+" "+System.getProperty("password");
		return output;
	}
	public void logIn(String output) throws Exception {
		String[] credential = output.split(" ");
		String userName = credential[0];
		String password = credential[1];
		
		wdObj.findElement(By.id("email_field")).sendKeys(userName);
		wdObj.findElement(By.id("password_field")).sendKeys(password);
		//Thread.sleep(3000);
		//wdObj.findElement(By.id("password_field")).clear();
		
		//Thread.sleep(3000);
		//wdObj.findElement(By.id("password_field")).sendKeys(password);
		Thread.sleep(3000);
		wdObj.findElement(By.xpath("//div[@id='login_div']//button")).click();
	}
	public void waitExplicitely(int iSeconds,WebElement ele) {
		WebDriverWait wait = new WebDriverWait(wdObj,iSeconds);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public void waitExplicitely1(WebDriver driver,WebElement ele) {
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public void quit() {
		wdObj.quit();
	}
	// hachkathon
	public String readPropertyFileSF() throws Exception {
		String sPath = System.getProperty("user.dir")+"\\environment.properties";
		FileInputStream fiObj = new FileInputStream(sPath);
		Properties pObj=new Properties();
		pObj.load(fiObj);
		System.getProperties().putAll(pObj);
		String output = "";
		output = System.getProperty("userNameSF")+" "+System.getProperty("passwordSF");
		return output;
	}
	public void loginSF(String output) throws Exception {	
		String[] credential = output.split(" ");
		String userName = credential[0];
		String password = credential[1];
		
			wdObj.findElement(By.partialLinkText("Login")).click();
			wdObj.findElement(By.id("username")).sendKeys(userName);
			wdObj.findElement(By.id("password")).sendKeys(password);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			//tc02Obj.quit();
	   }
	
}
