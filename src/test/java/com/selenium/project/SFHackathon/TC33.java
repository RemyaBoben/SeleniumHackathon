package com.selenium.project.SFHackathon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.utility.UtilityClassDemo;

public class TC33 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC33 tc33Obj = new TC33();
		tc33Obj.launchBrowser();
		tc33Obj.navigateUrl();
		String s = tc33Obj.readPropertyFileSF();
		tc33Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc33Obj.waitExplicitely(5,tc33Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Home')]")));
		tc33Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(5000);
		
		tc33Obj.wdObj.switchTo().activeElement();
		tc33Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		tc33Obj.wdObj.findElement(By.xpath("//a[@class='userMru']"));
		System.out.println(tc33Obj.wdObj.findElement(By.xpath("//a[@class='userMru']")).getText());
		
		Thread.sleep(5000);
		
		Boolean b=tc33Obj.wdObj.findElement(By.xpath("//div[@id='userNavButton']//span[@id='userNavLabel']")).isEnabled();
		System.out.println(b);
		tc33Obj.wdObj.findElement(By.xpath("//div[@id='userNavButton']//span[@id='userNavLabel']")).click();
		tc33Obj.wdObj.findElement(By.xpath("//a[text()='My Profile']")).click();
		Thread.sleep(5000);
		tc33Obj.quit();
	}

}
