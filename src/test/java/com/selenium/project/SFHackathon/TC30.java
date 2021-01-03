package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.utility.UtilityClassDemo;

public class TC30 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC30 tc30Obj = new TC30();
		tc30Obj.launchBrowser();
		tc30Obj.navigateUrl();
		String s = tc30Obj.readPropertyFileSF();
		tc30Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc30Obj.waitExplicitely(5,tc30Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		tc30Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(5000);
		
		tc30Obj.wdObj.switchTo().activeElement();
		tc30Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		WebElement createNewButton = tc30Obj.wdObj.findElement(By.xpath("//a[text()='Create New View']"));
		createNewButton.click();
		
		tc30Obj.wdObj.findElement(By.xpath("//input[@id='devname']")).sendKeys("EFGH");
		WebElement saveTd1 = tc30Obj.wdObj.findElement(By.xpath("//td[@class='pbButtonb']"));
		WebElement saveButton1 = saveTd1.findElement(By.xpath("//input[@value=' Save ']"));
		saveButton1.click();
		
		Thread.sleep(5000);
		tc30Obj.quit();

	}

}
