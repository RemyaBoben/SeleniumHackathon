package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.utility.UtilityClassDemo;

public class TC25 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC25 tc25Obj = new TC25();
		tc25Obj.launchBrowser();
		tc25Obj.navigateUrl();
		String s = tc25Obj.readPropertyFileSF();
		tc25Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc25Obj.waitExplicitely(5,tc25Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		tc25Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(5000);
		
		tc25Obj.wdObj.switchTo().activeElement();
		tc25Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		WebElement newButton = tc25Obj.wdObj.findElement(By.xpath("//input[@value=' New ']"));
		tc25Obj.waitExplicitely(5, newButton);
		newButton.click();	
		
		
		WebElement lastNameInput = tc25Obj.wdObj.findElement(By.xpath("//input[@id='name_lastcon2']"));
		lastNameInput.sendKeys("AAA");
		WebElement accountName = tc25Obj.wdObj.findElement(By.xpath("//input[@id='con4']"));
		accountName.sendKeys("sForce");
		Thread.sleep(5000);
		WebElement saveTd = tc25Obj.wdObj.findElement(By.xpath("//td[@id='topButtonRow']"));
		WebElement saveButton = saveTd.findElement(By.xpath("//input[@value=' Save ']"));
		saveButton.click();
		Thread.sleep(5000);
		
		tc25Obj.quit();
	}

}
