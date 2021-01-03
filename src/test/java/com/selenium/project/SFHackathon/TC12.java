package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.utility.UtilityClassDemo;

public class TC12  extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC12 tc12Obj = new TC12();
		tc12Obj.launchBrowser();
		tc12Obj.navigateUrl();
		String s = tc12Obj.readPropertyFileSF();
		tc12Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc12Obj.waitExplicitely(5,tc12Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Accounts')]")));
		tc12Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(5000);
		
		tc12Obj.wdObj.switchTo().activeElement();
		tc12Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		Select selectObj= new Select(tc12Obj.wdObj.findElement(By.id("fcf")));
		Thread.sleep(1000);
		selectObj.selectByVisibleText("Automation123");
		tc12Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		
		tc12Obj.wdObj.findElement(By.xpath("//input[@id='fname']")).clear();
		Thread.sleep(1000);
		tc12Obj.wdObj.findElement(By.xpath("//input[@id='fname']")).sendKeys("New Automation123");
		tc12Obj.wdObj.findElement(By.xpath("//input[@id='devname']")).click();
		Thread.sleep(1000);
		
		
		Select selectObj1= new Select(tc12Obj.wdObj.findElement(By.xpath("//select[@title='Search By 1']")));
		Thread.sleep(1000);
		selectObj1.selectByVisibleText("Account Name");
		Select selectObj2= new Select(tc12Obj.wdObj.findElement(By.xpath("//select[@title='Operator 1']")));
		Thread.sleep(1000);
		selectObj2.selectByVisibleText("contains");
		tc12Obj.wdObj.findElement(By.xpath("//input[@title='Value 1']")).sendKeys("a");;
		Thread.sleep(1000);
		WebElement saveDiv = tc12Obj.wdObj.findElement(By.xpath("//td[@class='pbButtonb']"));
		saveDiv.findElement(By.xpath("//input[@title='Save']")).click();
		Thread.sleep(3000);
		
		tc12Obj.quit();
		
	}

}
