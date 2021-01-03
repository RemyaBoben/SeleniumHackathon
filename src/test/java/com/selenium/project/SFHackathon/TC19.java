package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.selenium.utility.UtilityClassDemo;

public class TC19 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC19 tc19Obj = new TC19();
		tc19Obj.launchBrowser();
		tc19Obj.navigateUrl();
		String s = tc19Obj.readPropertyFileSF();
		tc19Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc19Obj.waitExplicitely(5,tc19Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Opportunities')]")));
		tc19Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(5000);
		
		tc19Obj.wdObj.switchTo().activeElement();
		tc19Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		
		Select selectObj1= new Select(tc19Obj.wdObj.findElement(By.id("quarter_q")));
		Thread.sleep(1000);
		selectObj1.selectByVisibleText("Current FQ");
		Select selectObj2= new Select(tc19Obj.wdObj.findElement(By.id("open")));
		Thread.sleep(1000);
		selectObj2.selectByVisibleText("All Opportunities");
		Thread.sleep(1000);
		tc19Obj.wdObj.findElement(By.xpath("//input[@value='Run Report']")).click();
		Thread.sleep(2000);
		tc19Obj.wdObj.navigate().back();
		
		Select selectObj3= new Select(tc19Obj.wdObj.findElement(By.id("quarter_q")));
		Thread.sleep(1000);
		selectObj3.selectByVisibleText("Current FQ");
		Select selectObj4= new Select(tc19Obj.wdObj.findElement(By.id("open")));
		Thread.sleep(1000);
		selectObj4.selectByVisibleText("Open Opportunities");
		Thread.sleep(1000);
		tc19Obj.wdObj.findElement(By.xpath("//input[@value='Run Report']")).click();
		Thread.sleep(2000);
		tc19Obj.wdObj.navigate().back();
		
		Select selectObj5= new Select(tc19Obj.wdObj.findElement(By.id("quarter_q")));
		Thread.sleep(1000);
		selectObj5.selectByVisibleText("Current FQ");
		Select selectObj6= new Select(tc19Obj.wdObj.findElement(By.id("open")));
		Thread.sleep(1000);
		selectObj6.selectByVisibleText("Closed Opportunities");
		Thread.sleep(1000);
		tc19Obj.wdObj.findElement(By.xpath("//input[@value='Run Report']")).click();
		Thread.sleep(2000);
		tc19Obj.wdObj.navigate().back();
		
		Select selectObj7= new Select(tc19Obj.wdObj.findElement(By.id("quarter_q")));
		Thread.sleep(1000);
		selectObj7.selectByVisibleText("Next FQ");
		Thread.sleep(1000);
		Select selectObj8= new Select(tc19Obj.wdObj.findElement(By.id("open")));
		Thread.sleep(1000);
		selectObj8.selectByVisibleText("All Opportunities");
		Thread.sleep(1000);
		tc19Obj.wdObj.findElement(By.xpath("//input[@value='Run Report']")).click();
		Thread.sleep(2000);
		tc19Obj.wdObj.navigate().back();
		
		
		Select selectObj9= new Select(tc19Obj.wdObj.findElement(By.id("quarter_q")));
		Thread.sleep(1000);
		selectObj9.selectByVisibleText("Next FQ");
		Thread.sleep(1000);
		Select selectObj10= new Select(tc19Obj.wdObj.findElement(By.id("open")));
		Thread.sleep(1000);
		selectObj10.selectByVisibleText("Open Opportunities");
		Thread.sleep(1000);
		tc19Obj.wdObj.findElement(By.xpath("//input[@value='Run Report']")).click();
		Thread.sleep(2000);
		tc19Obj.wdObj.navigate().back();
		
		Select selectObj11= new Select(tc19Obj.wdObj.findElement(By.id("quarter_q")));
		Thread.sleep(1000);
		selectObj11.selectByVisibleText("Next FQ");
		Thread.sleep(1000);
		Select selectObj12= new Select(tc19Obj.wdObj.findElement(By.id("open")));
		Thread.sleep(1000);
		selectObj12.selectByVisibleText("Closed Opportunities");
		Thread.sleep(1000);
		tc19Obj.wdObj.findElement(By.xpath("//input[@value='Run Report']")).click();
		Thread.sleep(2000);
		tc19Obj.wdObj.navigate().back();
		tc19Obj.quit();
	}

}
