package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.selenium.utility.UtilityClassDemo;

public class TC27 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC27 tc27Obj = new TC27();
		tc27Obj.launchBrowser();
		tc27Obj.navigateUrl();
		String s = tc27Obj.readPropertyFileSF();
		tc27Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc27Obj.waitExplicitely(5,tc27Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		tc27Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(5000);
		
		tc27Obj.wdObj.switchTo().activeElement();
		tc27Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		

		Select s1= new Select(tc27Obj.wdObj.findElement(By.id("hotlist_mode")));
		Thread.sleep(3000);
		s1.selectByVisibleText("Recently Created");
		Thread.sleep(3000);
		tc27Obj.quit();
	}

}
