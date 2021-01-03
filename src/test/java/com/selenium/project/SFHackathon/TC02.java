package com.selenium.project.SFHackathon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import com.selenium.utility.UtilityClassDemo;

public class TC02 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC02 tc02Obj = new TC02();
		tc02Obj.login(tc02Obj);
	}
	
    public void login(TC02 tc02Obj) throws Exception {
	   tc02Obj.launchBrowser();
		tc02Obj.navigateUrl();
		tc02Obj.wdObj.findElement(By.partialLinkText("Login")).click();
		tc02Obj.wdObj.findElement(By.id("username")).sendKeys("remyaboben@gmail.com");
		tc02Obj.wdObj.findElement(By.id("password")).sendKeys("chetayikochu3");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//tc02Obj.quit();
   }
}
