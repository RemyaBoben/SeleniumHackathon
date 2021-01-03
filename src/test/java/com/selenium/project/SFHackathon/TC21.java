package com.selenium.project.SFHackathon;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.utility.UtilityClassDemo;

public class TC21 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC21 tc21Obj = new TC21();
		tc21Obj.launchBrowser();
		tc21Obj.navigateUrl();
		String s = tc21Obj.readPropertyFileSF();
		tc21Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc21Obj.waitExplicitely(5,tc21Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Leads')]")));
		tc21Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(5000);
		
		tc21Obj.wdObj.switchTo().activeElement();
		tc21Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		Select s1= new Select(tc21Obj.wdObj.findElement(By.id("fcf")));
		int i=0;
		List<WebElement> l= s1.getOptions();
		for(WebElement ele:l) {
		if(ele.getText().equals("All Open Leads")) {i++;}
		if(ele.getText().equals("My Unread Leads")) {i++;}
		if(ele.getText().equals("Recently Viewed Leads")) {i++;}
		if(ele.getText().equals("Today's Leads")) {i++;}
		}
		if(i==4) {System.out.println("All values are present");}
		else {System.out.println("All values are not present");}
		Thread.sleep(1000);
		tc21Obj.quit();
		
		
	}

}
