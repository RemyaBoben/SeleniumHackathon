package com.selenium.project.SFHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.selenium.utility.UtilityClassDemo;

public class TC06 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC06 tc06Obj = new TC06();
		tc06Obj.launchBrowser();
		tc06Obj.navigateUrl();
		String s = tc06Obj.readPropertyFileSF();
		tc06Obj.loginSF(s);
		Thread.sleep(3000);
		tc06Obj.wdObj.findElement(By.xpath("//div[@id='userNavButton']//span[@id='userNavLabel']")).click();
		tc06Obj.wdObj.findElement(By.xpath("//a[text()='My Profile']")).click();
		Thread.sleep(3000);
		tc06Obj.wdObj.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']")).click();
		tc06Obj.wdObj.switchTo().frame(tc06Obj.wdObj.findElement(By.xpath("//iframe[@id='contactInfoContentId']")));
		tc06Obj.waitExplicitely(5, tc06Obj.wdObj.findElement(By.xpath("//a[contains(text(),'About')]")));
		tc06Obj.wdObj.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		
		tc06Obj.wdObj.findElement(By.xpath("//input[@id='lastName']")).clear();;
		tc06Obj.wdObj.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Abcd");
		tc06Obj.wdObj.findElement(By.xpath("//input[@value='Save All']")).click();
		
		
		tc06Obj.wdObj.findElement(By.xpath("//a[@title='Post']")).click();
		WebElement ele = tc06Obj.wdObj.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		tc06Obj.wdObj.switchTo().frame(ele);
		tc06Obj.wdObj.findElement(By.xpath("//body")).sendKeys("Nice Work");
		tc06Obj.wdObj.switchTo().defaultContent();
		tc06Obj.wdObj.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		
		
		tc06Obj.wdObj.findElement(By.xpath("//a[@title='File']")).click();
		tc06Obj.wdObj.findElement(By.partialLinkText("Upload a file from your computer")).click();
		Thread.sleep(3000);
		tc06Obj.wdObj.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\remya\\Desktop\\a.jpg");
		Thread.sleep(3000);
		tc06Obj.wdObj.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		
		Actions a = new Actions(tc06Obj.wdObj);
		a.moveToElement(tc06Obj.wdObj.findElement(By.xpath("//span[@id='displayBadge']"))).perform();
		Thread.sleep(2000);
		tc06Obj.waitExplicitely(5, tc06Obj.wdObj.findElement(By.partialLinkText("Add Photo")));
		tc06Obj.wdObj.findElement(By.partialLinkText("Add Photo")).click();
		Thread.sleep(3000);
		WebElement ele7 = tc06Obj.wdObj.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']"));
		tc06Obj.wdObj.switchTo().frame(ele7);
		tc06Obj.wdObj.findElement(By.xpath("//input[@class='fileInput']")).sendKeys("C:\\Users\\remya\\eclipse-workspace\\SFHackathon\\seleniumImage.png");
		Thread.sleep(3000);
		WebElement uploadButton = tc06Obj.wdObj.findElement(By.xpath("//div[@class='uploadButtonPanel']"));
		uploadButton.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']")).click();
		
		
		tc06Obj.waitExplicitely(5, tc06Obj.wdObj.findElement(By.xpath("//input[@ id='j_id0:j_id7:save']")));
		tc06Obj.wdObj.findElement(By.xpath("//input[@ id='j_id0:j_id7:save']")).click();
		
		Thread.sleep(3000);
		tc06Obj.wdObj.switchTo().defaultContent();
		tc06Obj.quit();
	}

}
