package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.utility.UtilityClassDemo;

public class TC31 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC31 tc31Obj = new TC31();
		tc31Obj.launchBrowser();
		tc31Obj.navigateUrl();
		String s = tc31Obj.readPropertyFileSF();
		tc31Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc31Obj.waitExplicitely(5,tc31Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		tc31Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(5000);
		
		tc31Obj.wdObj.switchTo().activeElement();
		tc31Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		WebElement createNewButton = tc31Obj.wdObj.findElement(By.xpath("//a[text()='Create New View']"));
		createNewButton.click();
		
		
		WebElement fName = tc31Obj.wdObj.findElement(By.xpath("//input[@id='fname']"));
		fName.sendKeys("AAA");
		tc31Obj.wdObj.findElement(By.xpath("//input[@id='devname']")).click();
		WebElement saveTd1 = tc31Obj.wdObj.findElement(By.xpath("//td[@class='pbButtonb']"));
		WebElement saveButton1 = saveTd1.findElement(By.xpath("//input[@value='Cancel']"));
		Thread.sleep(5000);
		saveButton1.click();
		
		Thread.sleep(5000);
		tc31Obj.quit();
	}

}
