package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;

import com.selenium.utility.UtilityClassDemo;

public class TC09 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC09 tc09Obj=new TC09();
		tc09Obj.launchBrowser();
		tc09Obj.navigateUrl();
		String s = tc09Obj.readPropertyFileSF();
		tc09Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc09Obj.wdObj.findElement(By.xpath("//div[@id='userNavButton']//span[@id='userNavLabel']")).click();
		Thread.sleep(1000);
		tc09Obj.wdObj.findElement(By.xpath("//a[@title='Logout']")).click();
		tc09Obj.quit();
	}

}
