package com.selenium.project.SFHackathon;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.utility.UtilityClassDemo;

public class TC14 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC14 tc14Obj = new TC14();
		tc14Obj.launchBrowser();
		tc14Obj.navigateUrl();
		String s = tc14Obj.readPropertyFileSF();
		tc14Obj.loginSF(s);
		Thread.sleep(3000);

		tc14Obj.waitExplicitely(5,tc14Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Accounts')]")));
		tc14Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(5000);
		
		tc14Obj.wdObj.switchTo().activeElement();
		tc14Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		tc14Obj.wdObj.findElement(By.xpath("//a[contains(text(),'30 days')]")).click();
		tc14Obj.wdObj.findElement(By.xpath("//input[@name='dateColumn']")).click();
		WebElement ele = tc14Obj.wdObj.findElement(By.xpath("//div[contains(text(),'Created Date')] "));
		ele.click();
		tc14Obj.wdObj.findElement(By.xpath("//input[@name='startDate']")).click();
		DateFormat dateFormat = new SimpleDateFormat("MM/d/yyyy");
		Date date = new Date();
		String date1= dateFormat.format(date);
		tc14Obj.wdObj.findElement(By.xpath("//input[@name='startDate']")).sendKeys(date1);
		tc14Obj.wdObj.findElement(By.xpath("//input[@name='endDate']")).click();
		tc14Obj.wdObj.findElement(By.xpath("//input[@name='endDate']")).clear();
		tc14Obj.wdObj.findElement(By.xpath("//input[@name='endDate']")).sendKeys(date1);
		Thread.sleep(1000);
		tc14Obj.wdObj.findElement(By.xpath("//button[@id='ext-gen49']")).click();
		
		tc14Obj.wdObj.switchTo().activeElement();
		tc14Obj.wdObj.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")).sendKeys("Report24");
		tc14Obj.wdObj.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']")).click();
		Thread.sleep(1000);
		Boolean b = tc14Obj.wdObj.findElement(By.xpath("(//button[text()='Save'])[2]")).isEnabled();
		System.out.println(b);
		tc14Obj.wdObj.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		tc14Obj.wdObj.switchTo().defaultContent();
		
		By by =By.xpath("//table[@id='runReportBtn']/tbody[1]/tr[2]/td[2]/em/button");
		tc14Obj.retryingFindClick(tc14Obj,by);
		tc14Obj.quit();
		
		
	}
	public boolean retryingFindClick(TC14 tc14Obj,By by) {
	    boolean result = false;
	    int attempts = 0;
	    while(attempts < 2) {
	        try {
	        	tc14Obj.wdObj.findElement(by).click();
	            result = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts++;
	    }
	    return result;
	}
}
