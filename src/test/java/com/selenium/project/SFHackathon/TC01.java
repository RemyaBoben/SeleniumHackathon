package com.selenium.project.SFHackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import com.selenium.utility.UtilityClassDemo;

public class TC01  extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC01 tc01Obj = new TC01();
		tc01Obj.clearPassword(tc01Obj);
		
	}
	public void clearPassword(TC01 tc01Obj)  throws Exception {
		tc01Obj.launchBrowser();
		tc01Obj.navigateUrl();
		tc01Obj.wdObj.findElement(By.partialLinkText("Login")).click();
		tc01Obj.wdObj.findElement(By.id("username")).sendKeys("remyaboben@gmail.com");
		tc01Obj.wdObj.findElement(By.id("password")).clear();;
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		tc01Obj.quit();
	}

}
