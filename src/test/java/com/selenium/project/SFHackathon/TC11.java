package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.utility.UtilityClassDemo;

public class TC11 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC11 tc11Obj = new TC11();
		
		tc11Obj.launchBrowser();
		tc11Obj.navigateUrl();
		String s = tc11Obj.readPropertyFileSF();
		tc11Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc11Obj.waitExplicitely(5,tc11Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Accounts')]")));
		tc11Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(5000);
		
		tc11Obj.wdObj.switchTo().activeElement();
		tc11Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		WebElement createNewButton = tc11Obj.wdObj.findElement(By.xpath("//a[text()='Create New View']"));
		createNewButton.click();
		tc11Obj.wdObj.findElement(By.xpath("//input[@id='fname']")).sendKeys("Automation123");
		tc11Obj.wdObj.findElement(By.xpath("//input[@id='devname']")).click();
		WebElement ele = tc11Obj.wdObj.findElement(By.xpath("//td[@class='pbButtonb']"));
		ele.findElement(By.xpath("//input[@title='Save']")).click();
		Thread.sleep(3000);
		tc11Obj.quit();
		
	}

}
