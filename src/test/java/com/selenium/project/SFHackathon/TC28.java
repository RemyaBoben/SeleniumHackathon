package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.selenium.utility.UtilityClassDemo;

public class TC28  extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC28 tc28Obj = new TC28();
		tc28Obj.launchBrowser();
		tc28Obj.navigateUrl();
		String s = tc28Obj.readPropertyFileSF();
		tc28Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc28Obj.waitExplicitely(5,tc28Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		tc28Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(5000);
		
		tc28Obj.wdObj.switchTo().activeElement();
		tc28Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		Select s1 = new Select(tc28Obj.wdObj.findElement(By.xpath("//select[@name='fcf']")));
		s1.selectByVisibleText("My Contacts");
		Thread.sleep(5000);
		tc28Obj.quit();

	}

}
