package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.utility.UtilityClassDemo;

public class TC24 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC24 tc24Obj = new TC24();
		tc24Obj.launchBrowser();
		tc24Obj.navigateUrl();
		String s = tc24Obj.readPropertyFileSF();
		tc24Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc24Obj.waitExplicitely(5,tc24Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Leads')]")));
		tc24Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(5000);
		
		tc24Obj.wdObj.switchTo().activeElement();
		tc24Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		WebElement newInput = tc24Obj.wdObj.findElement(By.xpath("//input[@value=' New ']"));
		tc24Obj.waitExplicitely(5, newInput);
		newInput.click();
		
		WebElement lastNameInput = tc24Obj.wdObj.findElement(By.xpath("//input[@id='name_lastlea2']"));
		tc24Obj.waitExplicitely(5, lastNameInput);
		lastNameInput.sendKeys("ABCD");
		tc24Obj.wdObj.findElement(By.xpath("//input[@id='lea3']")).sendKeys("ABCD");
		Thread.sleep(5000);
		
		WebElement saveTd = tc24Obj.wdObj.findElement(By.xpath("(//td[@id='topButtonRow'])"));
		WebElement saveButton = saveTd.findElement(By.xpath("//input[@value=' Save ']"));
		saveButton.click();
		Thread.sleep(5000);
		
		
		tc24Obj.quit();
	}

}
