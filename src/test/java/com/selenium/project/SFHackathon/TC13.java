package com.selenium.project.SFHackathon;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.utility.UtilityClassDemo;

public class TC13 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC13 tc13Obj = new TC13();
		tc13Obj.launchBrowser();
		tc13Obj.navigateUrl();
		String s = tc13Obj.readPropertyFileSF();
		tc13Obj.loginSF(s);
		Thread.sleep(3000);

		tc13Obj.waitExplicitely(5,tc13Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Accounts')]")));
		tc13Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(5000);
		
		tc13Obj.wdObj.switchTo().activeElement();
		tc13Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		//creating two accounts with same name to merge
	
	/*	tc13Obj.wdObj.findElement(By.xpath("//input[@value=' New ']")).click();
		Thread.sleep(1000);
		tc13Obj.wdObj.findElement(By.xpath("//input[@id='acc2']")).sendKeys("Automation11");
		Thread.sleep(1000);
		WebElement ele = tc13Obj.wdObj.findElement(By.xpath("//td[@id='topButtonRow']"));
		ele.findElement(By.xpath("//input[@title='Save']")).click();
		tc13Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(1000);
		tc13Obj.wdObj.findElement(By.xpath("//input[@value=' New ']")).click();
		Thread.sleep(1000);
		tc13Obj.wdObj.findElement(By.xpath("//input[@id='acc2']")).sendKeys("Automation11");
		Thread.sleep(1000);
		WebElement ele1 = tc13Obj.wdObj.findElement(By.xpath("//td[@id='topButtonRow']"));
		ele1.findElement(By.xpath("//input[@title='Save']")).click();
		Thread.sleep(3000);	  */
		// end of creating 2accounts
		
		//clicking accounts tab again 
		
		tc13Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		
		
		Thread.sleep(1000);
		tc13Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
		tc13Obj.wdObj.findElement(By.xpath("//input[@id='srch']")).sendKeys("Automation11");
		tc13Obj.wdObj.findElement(By.xpath("//input[@name='srchbutton']")).click();
		Thread.sleep(1000);
		Boolean b = tc13Obj.wdObj.findElement(By.xpath("(//table[@class='list']//tr[2]//th)")).isSelected();
		System.out.println(b);
		if(b==false) {
			tc13Obj.wdObj.findElement(By.xpath("(//table[@class='list']//tr[2]//th)")).click();
		}
		Boolean b1 = tc13Obj.wdObj.findElement(By.xpath("(//table[@class='list']//tr[3]//th)")).isSelected();
		System.out.println(b);
		if(b==false) {
			tc13Obj.wdObj.findElement(By.xpath("(//table[@class='list']//tr[3]//th)")).click();
		}
		
		
		WebElement ele2 = tc13Obj.wdObj.findElement(By.xpath("//div[@class='pbBottomButtons']"));
		ele2.findElement(By.xpath("//input[@title='Next']")).click();
		
		
		WebElement ele3 = tc13Obj.wdObj.findElement(By.xpath("//div[@class='pbTopButtons']"));
		ele3.findElement(By.xpath("//input[@title='Merge']")).click();
		
		Alert al = tc13Obj.wdObj.switchTo().alert();
		al.accept();
		
		
		tc13Obj.quit();
		
		
		
	}

}
