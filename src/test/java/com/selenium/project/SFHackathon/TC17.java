package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;

import com.selenium.utility.UtilityClassDemo;

public class TC17 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC17 tc17Obj = new TC17();
		tc17Obj.launchBrowser();
		tc17Obj.navigateUrl();
		String s = tc17Obj.readPropertyFileSF();
		tc17Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc17Obj.waitExplicitely(5,tc17Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Opportunities')]")));
		tc17Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(5000);
		
		tc17Obj.wdObj.switchTo().activeElement();
		tc17Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		Thread.sleep(1000);
		
		tc17Obj.wdObj.findElement(By.xpath("//a[text()='Opportunity Pipeline']")).click();
		tc17Obj.quit();
	}
	
}
