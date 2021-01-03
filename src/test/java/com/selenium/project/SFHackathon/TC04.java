package com.selenium.project.SFHackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import com.selenium.utility.UtilityClassDemo;

public class TC04 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		TC04 tc04Obj = new TC04();
		tc04Obj.forgotPassword(tc04Obj);
	}
	public void forgotPassword(TC04 tc04Obj) throws Exception {
		tc04Obj.launchBrowser();
		tc04Obj.navigateUrl();
		tc04Obj.wdObj.findElement(By.partialLinkText("Login")).click();
		tc04Obj.wdObj.findElement(By.xpath("//a[text()='Forgot Your Password?']")).click();
		tc04Obj.wdObj.findElement(By.xpath("//input[@id='un']")).sendKeys("remyaboben@gmail.com");
		tc04Obj.wdObj.findElement(By.xpath("//input[@id='continue']")).click();
		
		Thread.sleep(5000);
		tc04Obj.quit();
	   }

}
