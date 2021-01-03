package com.selenium.project.SFHackathon;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.utility.UtilityClassDemo;

public class TC07 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC07 tc07Obj = new TC07();
		tc07Obj.launchBrowser();
		tc07Obj.navigateUrl();
		String s = tc07Obj.readPropertyFileSF();
		tc07Obj.loginSF(s);
		Thread.sleep(3000);
		tc07Obj.wdObj.findElement(By.xpath("//div[@id='userNavButton']//span[@id='userNavLabel']")).click();
		tc07Obj.wdObj.findElement(By.xpath("//a[text()='My Settings']")).click();
		Thread.sleep(3000);
		
		//PersonalInfo
		tc07Obj.wdObj.findElement(By.xpath("//span[@id='PersonalInfo_font']")).click();
		tc07Obj.wdObj.findElement(By.partialLinkText("Login History")).click();
		tc07Obj.wdObj.findElement(By.partialLinkText("Download login")).click();
		tc07Obj.wdObj.findElement(By.xpath("//span[@id='PersonalInfo_font']")).click();
		
		//DisplayAndLayout
		tc07Obj.wdObj.findElement(By.id("DisplayAndLayout_font")).click();
		tc07Obj.wdObj.findElement(By.id("CustomizeTabs_font")).click();
		Select selectObj= new Select(tc07Obj.wdObj.findElement(By.id("p4")));
		selectObj.selectByVisibleText("Salesforce Chatter");
		Select selectObj1= new Select(tc07Obj.wdObj.findElement(By.id("duel_select_0")));
		selectObj1.selectByVisibleText("Reports");
		tc07Obj.wdObj.findElement(By.xpath("//img[@title='Add']")).click();
		tc07Obj.wdObj.findElement(By.id("DisplayAndLayout_font")).click();
		
		//EmailSetup
		tc07Obj.wdObj.findElement(By.xpath("//span[@id='EmailSetup_font']")).click();
		tc07Obj.wdObj.findElement(By.xpath("//span[@id='EmailSettings_font']")).click();
		tc07Obj.wdObj.findElement(By.xpath("//span[@id='EmailSettings_font']")).click();
		tc07Obj.wdObj.findElement(By.xpath("//input[@id='sender_name']")).clear();
		Thread.sleep(1000);
		tc07Obj.wdObj.findElement(By.xpath("//input[@id='sender_name']")).sendKeys("remya boben Abcd");
		Thread.sleep(1000);
		tc07Obj.wdObj.findElement(By.xpath("//input[@id='sender_email']")).clear();
		Thread.sleep(1000);
		tc07Obj.wdObj.findElement(By.xpath("//input[@id='sender_email']")).sendKeys("remyaboben@gmail.com");
		tc07Obj.wdObj.findElement(By.xpath("//input[@id='auto_bcc1']")).click();
		tc07Obj.wdObj.findElement(By.xpath("	//input[@value=' Save ']")).click();
		tc07Obj.wdObj.findElement(By.xpath("//span[@id='EmailSetup_font']")).click();
		
		//CalendarAndReminders
		tc07Obj.wdObj.findElement(By.xpath("//span[@id='CalendarAndReminders_font']")).click();
		tc07Obj.wdObj.findElement(By.xpath("//span[@id='Reminders_font']")).click();
		tc07Obj.wdObj.findElement(By.xpath("//input[@id='testbtn']")).click();
		Boolean w1=new WebDriverWait(tc07Obj.wdObj,50).until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(w1);
		ArrayList<String> alObj1 = new ArrayList<String>( tc07Obj.wdObj.getWindowHandles());
		System.out.println(alObj1.size());
		tc07Obj.wdObj.switchTo().window(alObj1.get(1));
		tc07Obj.wdObj.findElement(By.xpath("//input[@id='dismiss_all']")).click();
		tc07Obj.wdObj.close();
		tc07Obj.wdObj.switchTo().window(alObj1.get(0));
		tc07Obj.wdObj.findElement(By.xpath("//span[@id='CalendarAndReminders_font']")).click();
	
		
		
		
		tc07Obj.quit();
				
		
		
		
	}

}
