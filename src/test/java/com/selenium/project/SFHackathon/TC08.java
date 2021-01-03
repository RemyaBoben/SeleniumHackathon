package com.selenium.project.SFHackathon;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.utility.UtilityClassDemo;

public class TC08 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC08 tc08Obj = new TC08();
		tc08Obj.launchBrowser();
		tc08Obj.navigateUrl();
		String s = tc08Obj.readPropertyFileSF();
		tc08Obj.loginSF(s);
		Thread.sleep(3000);
		
		
		tc08Obj.wdObj.findElement(By.xpath("//div[@id='userNavButton']//span[@id='userNavLabel']")).click();
		tc08Obj.wdObj.findElement(By.xpath("//a[text()='Developer Console']")).click();
		Thread.sleep(3000);
		Boolean w1=new WebDriverWait(tc08Obj.wdObj,50).until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(w1);
		ArrayList<String> alObj1 = new ArrayList<String>(tc08Obj.wdObj.getWindowHandles());
		System.out.println(alObj1.size());
		tc08Obj.wdObj.switchTo().window(alObj1.get(1));
		tc08Obj.wdObj.close();
		tc08Obj.wdObj.switchTo().window(alObj1.get(0));
		tc08Obj.quit();
	}

}
