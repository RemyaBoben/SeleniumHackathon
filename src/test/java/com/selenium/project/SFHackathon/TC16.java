package com.selenium.project.SFHackathon;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.utility.UtilityClassDemo;

public class TC16 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC16 tc16Obj = new TC16();
		tc16Obj.launchBrowser();
		tc16Obj.navigateUrl();
		String s = tc16Obj.readPropertyFileSF();
		tc16Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc16Obj.waitExplicitely(5,tc16Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Opportunities')]")));
		tc16Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(5000);
		
		tc16Obj.wdObj.switchTo().activeElement();
		tc16Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		tc16Obj.wdObj.findElement(By.xpath("//input[@value=' New ']")).click();
		Thread.sleep(1000);
		tc16Obj.wdObj.findElement(By.xpath("//input[@id='opp3']")).sendKeys("Opportunity1");
		tc16Obj.wdObj.findElement(By.xpath("//a[@id='opp4_lkwgt']")).click();
		
		
		Boolean w1=new WebDriverWait(tc16Obj.wdObj,50).until(ExpectedConditions.numberOfWindowsToBe(2));
		//System.out.println(w1);
		ArrayList<String> alObj1 = new ArrayList<String>(tc16Obj.wdObj.getWindowHandles());
		//System.out.println(alObj1.size());
		tc16Obj.wdObj.switchTo().window(alObj1.get(1));
		
		Boolean b=tc16Obj.wdObj.findElement(By.id("searchFrame")).isDisplayed();
		//System.out.println(b);
		tc16Obj.wdObj.switchTo().frame(tc16Obj.wdObj.findElement(By.id("searchFrame")));
		tc16Obj.wdObj.findElement(By.xpath("//input[@id='lksrch']")).sendKeys("Automation11");
		tc16Obj.wdObj.switchTo().defaultContent();
		tc16Obj.wdObj.switchTo().frame(tc16Obj.wdObj.findElement(By.id("resultsFrame")));
		Boolean b1 = tc16Obj.wdObj.findElement(By.xpath("(//table[@class='list']//tr[3]//th)")).isDisplayed();
		//System.out.println(b1);
		if(b==true) {
			tc16Obj.wdObj.findElement(By.xpath("(//table[@class='list']//tr[3]//th)")).click();
		}
		Thread.sleep(500);
		
		tc16Obj.wdObj.switchTo().window(alObj1.get(0));
		
		
		
		Select selectObj= new Select(tc16Obj.wdObj.findElement(By.id("opp11")));
		Thread.sleep(1000);
		selectObj.selectByVisibleText("Prospecting");
		
		Select selectObj1= new Select(tc16Obj.wdObj.findElement(By.id("opp6")));
		Thread.sleep(1000);
		selectObj1.selectByVisibleText("Web");
	
		
		tc16Obj.wdObj.findElement(By.xpath("//input[@id='opp9']")).click();
		tc16Obj.wdObj.findElement(By.xpath("//a[text()='1/3/2021']")).click();
		
		
		tc16Obj.wdObj.findElement(By.xpath("//input[@id='opp12']")).clear();
		tc16Obj.wdObj.findElement(By.xpath("//input[@id='opp12']")).sendKeys("10");
		
		//Boolean w3=new WebDriverWait(tc16Obj.wdObj,20).until(ExpectedConditions.numberOfWindowsToBe(2));
		//System.out.println(w3);
		////ArrayList<String> alObj3 = new ArrayList<String>(tc16Obj.wdObj.getWindowHandles());
		//System.out.println(alObj3.size());
		Boolean b2=tc16Obj.wdObj.findElement(By.xpath("//input[@name='oppo17']")).isDisplayed();
		System.out.println(b2);
	//	tc16Obj.wdObj.findElement(By.xpath("//input[@name='oppo17']")).sendKeys("New Campaign1");
		tc16Obj.wdObj.findElement(By.xpath("//a[@id='opp17_lkwgt']")).click();
	//	tc16Obj.wdObj.findElement(By.xpath("//a[@id='opp17_lkwgt']")).click();
		
		
		Boolean w2=new WebDriverWait(tc16Obj.wdObj,50).until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(w2);
		ArrayList<String> alObj2 = new ArrayList<String>(tc16Obj.wdObj.getWindowHandles());
		System.out.println(alObj2.size());
		Thread.sleep(1000);
		tc16Obj.wdObj.switchTo().window(alObj2.get(1));
		
		Boolean b3=tc16Obj.wdObj.findElement(By.id("searchFrame")).isDisplayed();
		System.out.println(b3);
		tc16Obj.wdObj.switchTo().frame(tc16Obj.wdObj.findElement(By.id("searchFrame")));
		tc16Obj.wdObj.findElement(By.xpath("//input[@id='lksrch']")).clear();
		
		Thread.sleep(5000);
		By by =By.xpath("//input[@value=' Go! ']");
		tc16Obj.retryingFindClick(tc16Obj,by);
		
		Thread.sleep(1000);
		tc16Obj.wdObj.switchTo().defaultContent();
		tc16Obj.wdObj.switchTo().frame(tc16Obj.wdObj.findElement(By.id("resultsFrame")));
		Boolean b4 = tc16Obj.wdObj.findElement(By.xpath("(//table[@class='list']//tr[3]//th)")).isDisplayed();
		System.out.println(b4);
		if(b==true) {
			tc16Obj.wdObj.findElement(By.xpath("(//table[@class='list']//tr[3]//th)")).click();
		}
		tc16Obj.wdObj.switchTo().defaultContent();
		
		WebElement ele2 = tc16Obj.wdObj.findElement(By.xpath("//div[@id='topButtonRow']"));
		ele2.findElement(By.xpath("//input[@title='Save']")).click();
		
		
	}
	public boolean retryingFindClick(TC16 tc16Obj,By by) {
	    boolean result = false;
	    int attempts = 0;
	    while(attempts < 2) {
	        try {
	        	tc16Obj.wdObj.findElement(by).click();
	            result = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts++;
	    }
	    return result;
	}
}
