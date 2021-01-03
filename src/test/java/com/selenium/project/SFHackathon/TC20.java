package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;

import com.selenium.utility.UtilityClassDemo;

public class TC20 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC20 tc20Obj = new TC20();
		tc20Obj.launchBrowser();
		tc20Obj.navigateUrl();
		String s = tc20Obj.readPropertyFileSF();
		tc20Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc20Obj.waitExplicitely(5,tc20Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Leads')]")));
		tc20Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(5000);
		
		tc20Obj.wdObj.switchTo().activeElement();
		tc20Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		Thread.sleep(1000);
		tc20Obj.quit();

	}

}
