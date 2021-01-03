package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.utility.UtilityClassDemo;

public class TC22 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC22 tc22Obj = new TC22();
		tc22Obj.launchBrowser();
		tc22Obj.navigateUrl();
		String s = tc22Obj.readPropertyFileSF();
		tc22Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc22Obj.waitExplicitely(5,tc22Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Leads')]")));
		tc22Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(5000);
		
		tc22Obj.wdObj.switchTo().activeElement();
		tc22Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		WebElement goInput = tc22Obj.wdObj.findElement(By.xpath("//input[@value=' Go! ']"));
		tc22Obj.waitExplicitely(5, goInput);
		goInput.click();
		Thread.sleep(1000);
		tc22Obj.quit();
	}

}
