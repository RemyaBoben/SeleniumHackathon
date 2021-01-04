package com.selenium.project.SFHackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.utility.UtilityClassDemo;

public class TC35 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC35 tc35Obj = new TC35();
		tc35Obj.launchBrowser();
		tc35Obj.navigateUrl();
		String s = tc35Obj.readPropertyFileSF();
		tc35Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc35Obj.wdObj.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
		Thread.sleep(5000);
		
		tc35Obj.wdObj.findElement(By.xpath("//input[@class='btnImportant']")).click();
		Select s2= new Select(tc35Obj.wdObj.findElement(By.xpath("//select[@id='duel_select_0']")));
		Thread.sleep(2000);
		s2.selectByVisibleText("Chatter");
		tc35Obj.wdObj.findElement(By.xpath("//img[@title='Add']")).click();
		Thread.sleep(2000);
		tc35Obj.wdObj.findElement(By.xpath("//input[@value=' Save ']")).click();
		Thread.sleep(2000);
		tc35Obj.wdObj.findElement(By.xpath("//input[@class='btnImportant']")).click();
		Select s1= new Select(tc35Obj.wdObj.findElement(By.xpath("//select[@id='duel_select_1']")));
		Thread.sleep(2000);
		s1.selectByVisibleText("Chatter");
		Thread.sleep(2000);
		tc35Obj.wdObj.findElement(By.xpath("//img[@title='Remove']")).click();
		Thread.sleep(2000);
		tc35Obj.wdObj.findElement(By.xpath("//input[@value=' Save ']")).click();
		Thread.sleep(2000);
		tc35Obj.wdObj.findElement(By.xpath("//div[@id='userNavButton']//span[@id='userNavLabel']")).click();
		Thread.sleep(2000);
		tc35Obj.wdObj.findElement(By.xpath("//a[@title='Logout']")).click();
		
		Thread.sleep(3000);
		tc35Obj.wdObj.findElement(By.id("username")).sendKeys("remyaboben@gmail.com");
		tc35Obj.wdObj.findElement(By.id("password")).sendKeys("chetayikochu3");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		tc35Obj.wdObj.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
		tc35Obj.wdObj.findElement(By.xpath("//input[@class='btnImportant']")).click();
		Thread.sleep(3000);
		tc35Obj.quit();
	}

}
