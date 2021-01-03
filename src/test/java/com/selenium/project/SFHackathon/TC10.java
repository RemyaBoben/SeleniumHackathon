package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.utility.UtilityClassDemo;

public class TC10 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC10 tc10Obj= new TC10();
		
		tc10Obj.launchBrowser();
		tc10Obj.navigateUrl();
		String s = tc10Obj.readPropertyFileSF();
		tc10Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc10Obj.waitExplicitely(5,tc10Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Accounts')]")));
		tc10Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(5000);
		
		tc10Obj.wdObj.switchTo().activeElement();
		tc10Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		tc10Obj.wdObj.findElement(By.xpath("//input[@value=' New ']")).click();
		Thread.sleep(1000);
		tc10Obj.wdObj.findElement(By.xpath("//input[@id='acc2']")).sendKeys("Automation");
		
		Select selectObj= new Select(tc10Obj.wdObj.findElement(By.id("acc6")));
		Thread.sleep(1000);
		selectObj.selectByVisibleText("Installation Partner");
		
		Select selectObj1= new Select(tc10Obj.wdObj.findElement(By.id("00N4x00000DVxgc")));
		Thread.sleep(1000);
		selectObj1.selectByVisibleText("High");
		
		WebElement ele = tc10Obj.wdObj.findElement(By.xpath("//td[@id='topButtonRow']"));
		ele.findElement(By.xpath("//input[@title='Save']")).click();
		Thread.sleep(3000);
		
		tc10Obj.quit();
		
		
		
		

	}

}
