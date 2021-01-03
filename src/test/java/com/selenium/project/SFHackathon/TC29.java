package com.selenium.project.SFHackathon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.utility.UtilityClassDemo;

public class TC29 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC29 tc29Obj = new TC29();
		tc29Obj.launchBrowser();
		tc29Obj.navigateUrl();
		String s = tc29Obj.readPropertyFileSF();
		tc29Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc29Obj.waitExplicitely(5,tc29Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		tc29Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(5000);
		
		tc29Obj.wdObj.switchTo().activeElement();
		tc29Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		tc29Obj.retryingFindClick(tc29Obj,By.xpath("//tr[2]//th//a"));
		Thread.sleep(5000);
		
		
		tc29Obj.quit();
	}
	public boolean retryingFindClick(TC29 tc29Obj,By by) {
	    boolean result = false;
	    int attempts = 0;
	    while(attempts < 2) {
	        try {
	        	tc29Obj.wdObj.findElement(by).click();
	            result = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts++;
	    }
	    return result;
	}
}
