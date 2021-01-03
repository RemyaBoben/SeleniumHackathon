package com.selenium.project.SFHackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import com.selenium.utility.UtilityClassDemo;

public class TC03 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		TC03 tc03Obj = new TC03();
		tc03Obj.rememberUN(tc03Obj);
	}
	public void rememberUN(TC03 tc03Obj) throws Exception {
		tc03Obj.launchBrowser();
		tc03Obj.navigateUrl();
		tc03Obj.wdObj.findElement(By.partialLinkText("Login")).click();
		tc03Obj.wdObj.findElement(By.id("username")).sendKeys("remyaboben@gmail.com");
		tc03Obj.wdObj.findElement(By.id("password")).sendKeys("chetayikochu3");
		tc03Obj.wdObj.findElement(By.xpath("//input[@id='rememberUn']")).click();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		tc03Obj.wdObj.findElement(By.xpath("//div[@id='userNavButton']//span[@id='userNavLabel']")).click();
		tc03Obj.wdObj.findElement(By.xpath("//a[@title='Logout']")).click();
		Thread.sleep(5000);
		tc03Obj.quit();
	   }

}
