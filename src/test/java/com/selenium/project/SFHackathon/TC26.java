package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.utility.UtilityClassDemo;

public class TC26  extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC26 tc26Obj = new TC26();
		tc26Obj.launchBrowser();
		tc26Obj.navigateUrl();
		String s = tc26Obj.readPropertyFileSF();
		tc26Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc26Obj.waitExplicitely(5,tc26Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		tc26Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(5000);
		
		tc26Obj.wdObj.switchTo().activeElement();
		tc26Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		WebElement createNewButton = tc26Obj.wdObj.findElement(By.xpath("//a[text()='Create New View']"));
		createNewButton.click();
		WebElement fName = tc26Obj.wdObj.findElement(By.xpath("//input[@id='fname']"));
		fName.sendKeys("AAA");
		tc26Obj.wdObj.findElement(By.xpath("//input[@id='devname']")).click();
		Thread.sleep(5000);
		
		WebElement saveTd1 = tc26Obj.wdObj.findElement(By.xpath("//td[@class='pbButtonb']"));
		WebElement saveButton1 = saveTd1.findElement(By.xpath("//input[@value=' Save ']"));
		saveButton1.click();
		Thread.sleep(5000);
		
		tc26Obj.quit();
		
	}

}
