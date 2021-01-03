package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;

import com.selenium.utility.UtilityClassDemo;

public class TC18 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC18 tc18Obj = new TC18();
		tc18Obj.launchBrowser();
		tc18Obj.navigateUrl();
		String s = tc18Obj.readPropertyFileSF();
		tc18Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc18Obj.waitExplicitely(5,tc18Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Opportunities')]")));
		tc18Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(5000);
		
		tc18Obj.wdObj.switchTo().activeElement();
		tc18Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		Thread.sleep(1000);
		
		tc18Obj.wdObj.findElement(By.xpath("//a[text()='Stuck Opportunities']")).click();
		tc18Obj.quit();
	}

}
