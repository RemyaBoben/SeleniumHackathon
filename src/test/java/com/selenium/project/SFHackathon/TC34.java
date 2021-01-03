package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;

import com.selenium.utility.UtilityClassDemo;

public class TC34 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC34 tc34Obj = new TC34();
		tc34Obj.launchBrowser();
		tc34Obj.navigateUrl();
		String s = tc34Obj.readPropertyFileSF();
		tc34Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc34Obj.waitExplicitely(5,tc34Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Home')]")));
		tc34Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(5000);
		
		tc34Obj.wdObj.switchTo().activeElement();
		tc34Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		tc34Obj.wdObj.findElement(By.xpath("//a[@class='userMru']")).click();
		tc34Obj.wdObj.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']")).click();
		tc34Obj.wdObj.switchTo().frame(tc34Obj.wdObj.findElement(By.xpath("//iframe[@id='contactInfoContentId']")));
		tc34Obj.waitExplicitely(5, tc34Obj.wdObj.findElement(By.xpath("//a[contains(text(),'About')]")));
		tc34Obj.wdObj.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		
		tc34Obj.wdObj.findElement(By.xpath("//input[@id='lastName']")).clear();;
		tc34Obj.wdObj.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Abcd");
		Thread.sleep(5000);
		tc34Obj.wdObj.findElement(By.xpath("//input[@value='Save All']")).click();
		
		
		tc34Obj.quit();
	}

}
