package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.selenium.utility.UtilityClassDemo;

public class TC23  extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC23 tc23Obj = new TC23();
		tc23Obj.launchBrowser();
		tc23Obj.navigateUrl();
		String s = tc23Obj.readPropertyFileSF();
		tc23Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc23Obj.waitExplicitely(5,tc23Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Leads')]")));
		tc23Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(5000);
		
		tc23Obj.wdObj.switchTo().activeElement();
		tc23Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		Select s1= new Select(tc23Obj.wdObj.findElement(By.id("fcf")));
		s1.selectByVisibleText("Today's Leads");
		Thread.sleep(1000);
		tc23Obj.quit();
	}

}
