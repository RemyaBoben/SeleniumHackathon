package com.selenium.project.SFHackathon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.utility.UtilityClassDemo;

public class TC15 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC15 tc15Obj = new TC15();
		tc15Obj.launchBrowser();
		tc15Obj.navigateUrl();
		String s = tc15Obj.readPropertyFileSF();
		tc15Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc15Obj.waitExplicitely(5,tc15Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Opportunities')]")));
		tc15Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(5000);
		
		tc15Obj.wdObj.switchTo().activeElement();
		tc15Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		Select selectObj= new Select(tc15Obj.wdObj.findElement(By.id("fcf")));
		List<WebElement> l =selectObj.getOptions();
		for(WebElement ele:l) {
			System.out.println(ele.getText());
		}
		Thread.sleep(1000);
		tc15Obj.quit();
	}
}
