package com.selenium.project.SFHackathon;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.utility.UtilityClassDemo;

public class TC36 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC36 tc36Obj = new TC36();
		tc36Obj.launchBrowser();
		tc36Obj.navigateUrl();
		String s = tc36Obj.readPropertyFileSF();
		tc36Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc36Obj.waitExplicitely(5,tc36Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Home')]")));
		tc36Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(5000);
		
		tc36Obj.wdObj.switchTo().activeElement();
		tc36Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		tc36Obj.wdObj.findElement(By.xpath("//span[@class='pageDescription']//a")).click();
		Thread.sleep(2000);
		JavascriptExecutor je = (JavascriptExecutor) tc36Obj.wdObj;
		WebElement ele4 = tc36Obj.wdObj.findElement(By.partialLinkText("8:00 PM"));
		je.executeScript("arguments[0].scrollIntoView(true);", ele4);
		ele4.click();
		WebElement ele5 = tc36Obj.wdObj.findElement(By.xpath("//a[@title='Combo (New Window)']"));
		Thread.sleep(2000);
		ele5.click();
		Boolean w=new WebDriverWait(tc36Obj.wdObj,30).until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(w);
		ArrayList<String> alObj = new ArrayList<String>(tc36Obj.wdObj.getWindowHandles());
		System.out.println(alObj.size());
		tc36Obj.wdObj.switchTo().window(alObj.get(1));
		Thread.sleep(2000);
		tc36Obj.wdObj.findElement(By.xpath("//a[text()='Other']")).click();
		tc36Obj.wdObj.switchTo().window(alObj.get(0));
		Thread.sleep(2000);
		tc36Obj.wdObj.findElement(By.xpath("//input[@id='EndDateTime_time'] ")).click();
		Thread.sleep(2000);
		tc36Obj.wdObj.findElement(By.xpath("//div[text()='9:00 PM']")).click();
		Thread.sleep(2000);
		WebElement ele6 = tc36Obj.wdObj.findElement(By.xpath("//td[@id='topButtonRow']"));
		ele6.findElement(By.xpath("//input[@title='Save']")).click();
		Thread.sleep(5000);

		tc36Obj.quit();
	}

}
