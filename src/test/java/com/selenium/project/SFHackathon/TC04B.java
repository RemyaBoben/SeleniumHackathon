package com.selenium.project.SFHackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import com.selenium.utility.UtilityClassDemo;

public class TC04B extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		TC04B tc04BObj = new TC04B();
		tc04BObj.validateCredentials(tc04BObj);
	}
	public void validateCredentials(TC04B tc04BObj) throws Exception {
		tc04BObj.launchBrowser();
		tc04BObj.navigateUrl();
		tc04BObj.wdObj.findElement(By.partialLinkText("Login")).click();
		tc04BObj.wdObj.findElement(By.id("username")).sendKeys("123");
		tc04BObj.wdObj.findElement(By.id("password")).sendKeys("22131");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		tc04BObj.quit();
		
	   }
}
