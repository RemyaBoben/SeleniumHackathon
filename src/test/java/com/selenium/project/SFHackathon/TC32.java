package com.selenium.project.SFHackathon;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.utility.UtilityClassDemo;

public class TC32 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC32 tc32Obj = new TC32();
		tc32Obj.launchBrowser();
		tc32Obj.navigateUrl();
		String s = tc32Obj.readPropertyFileSF();
		tc32Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc32Obj.waitExplicitely(5,tc32Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		tc32Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(5000);
		
		tc32Obj.wdObj.switchTo().activeElement();
		tc32Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		WebElement newButton = tc32Obj.wdObj.findElement(By.xpath("//input[@value=' New ']"));
		tc32Obj.waitExplicitely(5, newButton);
		newButton.click();
		
		WebElement fName = tc32Obj.wdObj.findElement(By.xpath("//input[@id='name_lastcon2']"));
		fName.sendKeys("AAA");
		tc32Obj.wdObj.findElement(By.xpath("//a[@id='con4_lkwgt']")).click();
		
		//Boolean w1=new WebDriverWait(tc32Obj.wdObj,20).until(ExpectedConditions.numberOfWindowsToBe(2));
		//System.out.println(w1);
		ArrayList<String> alObj1 = new ArrayList<String>(tc32Obj.wdObj.getWindowHandles());
		System.out.println(alObj1.size());
		tc32Obj.wdObj.switchTo().window(alObj1.get(1));
		
		Boolean b=tc32Obj.wdObj.findElement(By.id("searchFrame")).isDisplayed();
		//System.out.println(b);
		tc32Obj.wdObj.switchTo().frame(tc32Obj.wdObj.findElement(By.id("searchFrame")));
		tc32Obj.wdObj.findElement(By.xpath("//input[@id='lksrch']")).sendKeys("Automation11");
		tc32Obj.wdObj.switchTo().defaultContent();
		tc32Obj.wdObj.switchTo().frame(tc32Obj.wdObj.findElement(By.id("resultsFrame")));
		Boolean b1 = tc32Obj.wdObj.findElement(By.xpath("(//table[@class='list']//tr[3]//th)")).isDisplayed();
		//System.out.println(b1);
		if(b==true) {
			tc32Obj.wdObj.findElement(By.xpath("(//table[@class='list']//tr[3]//th)")).click();
		}
		Thread.sleep(500);
		
		tc32Obj.wdObj.switchTo().window(alObj1.get(0));
		
		
		
		WebElement saveTd1 = tc32Obj.wdObj.findElement(By.xpath("//td[@class='pbButtonb']"));
		WebElement saveButton1 = saveTd1.findElement(By.xpath("//input[@value='Save & New']"));
		Thread.sleep(5000);
		saveButton1.click();
		
		Thread.sleep(5000);
		tc32Obj.quit();
	}

}
