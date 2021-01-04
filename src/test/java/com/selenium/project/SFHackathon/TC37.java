package com.selenium.project.SFHackathon;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.utility.UtilityClassDemo;

public class TC37 extends UtilityClassDemo {
    public static Boolean flag;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC37 tc37Obj = new TC37();
		tc37Obj.launchBrowser();
		tc37Obj.navigateUrl();
		String s = tc37Obj.readPropertyFileSF();
		tc37Obj.loginSF(s);
		Thread.sleep(3000);
		
		tc37Obj.waitExplicitely(5,tc37Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Home')]")));
		tc37Obj.wdObj.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(5000);
		
		tc37Obj.wdObj.switchTo().activeElement();
		tc37Obj.wdObj.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		tc37Obj.wdObj.findElement(By.xpath("//span[@class='pageDescription']//a")).click();
		Thread.sleep(2000);
		JavascriptExecutor je = (JavascriptExecutor) tc37Obj.wdObj;
		WebElement ele4 = tc37Obj.wdObj.findElement(By.partialLinkText("4:00 PM"));
		je.executeScript("arguments[0].scrollIntoView(true);", ele4);
		ele4.click();
		WebElement ele5 = tc37Obj.wdObj.findElement(By.xpath("//a[@title='Combo (New Window)']"));
		Thread.sleep(2000);
		ele5.click();
		Boolean w=new WebDriverWait(tc37Obj.wdObj,30).until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(w);
		ArrayList<String> alObj = new ArrayList<String>(tc37Obj.wdObj.getWindowHandles());
		System.out.println(alObj.size());
		tc37Obj.wdObj.switchTo().window(alObj.get(1));
		Thread.sleep(2000);
		tc37Obj.wdObj.findElement(By.xpath("//a[text()='Other']")).click();
		tc37Obj.wdObj.switchTo().window(alObj.get(0));
		Thread.sleep(2000);
		tc37Obj.wdObj.findElement(By.xpath("//input[@id='EndDateTime_time'] ")).click();
		Thread.sleep(2000);
		tc37Obj.wdObj.findElement(By.xpath("//div[text()='7:00 PM']")).click();
		Thread.sleep(2000);
		tc37Obj.wdObj.findElement(By.xpath("//input[@id='IsRecurrence']")).click();
		Thread.sleep(2000);
		tc37Obj.wdObj.findElement(By.xpath("//input[@value='ftw']")).click();
		Thread.sleep(2000);
		tc37Obj.wdObj.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']")).click();
		Thread.sleep(2000);
		
		WebElement datepickerContainer = tc37Obj.wdObj.findElement(By.xpath("//div[@class='datePicker']//div[@class='calBody']//table[@class='calDays']"));
		flag = false;
		List<WebElement> l1 = datepickerContainer.findElements(By.xpath("//tr[@id='calRow1']//td"))	;
		if(flag==false) {eleClick(l1);}
		List<WebElement> l2 = datepickerContainer.findElements(By.xpath("//tr[@id='calRow2']//td"))	;
		if(flag==false) {eleClick(l2);}
		List<WebElement> l3 = datepickerContainer.findElements(By.xpath("//tr[@id='calRow3']//td"))	;
		if(flag==false) {eleClick(l3);}
		List<WebElement> l4 = datepickerContainer.findElements(By.xpath("//tr[@id='calRow4']//td"))	;
		if(flag==false) {eleClick(l4);}
		List<WebElement> l5 = datepickerContainer.findElements(By.xpath("//tr[@id='calRow5']//td"))	;
		if(flag==false) {eleClick(l5);}
		List<WebElement> l6 = datepickerContainer.findElements(By.xpath("//tr[@id='calRow6']//td"))	;
		if(flag==false) {eleClick(l6);}
		
		
		//tc37Obj.wdObj.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']")).sendKeys("1/12/2021");
		Thread.sleep(2000);
		
		WebElement ele6 = tc37Obj.wdObj.findElement(By.xpath("//td[@id='topButtonRow']"));
		ele6.findElement(By.xpath("//input[@title='Save']")).click();
		Thread.sleep(5000);
		tc37Obj.wdObj.findElement(By.xpath("//img[@class='monthViewIcon']")).click();
		Thread.sleep(2000);


		tc37Obj.quit();
	}

	public static void eleClick(List<WebElement> lObj) throws Exception {
		
		int noOfDays = 14; //i.e two weeks
		Date dateOfOrder = new Date(); 
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateOfOrder);            
		calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
		@SuppressWarnings("deprecation")
		int date = calendar.getTime().getDate();
		Integer dateInt = Integer.valueOf(date);
		
		
		for(WebElement ele: lObj) {
			String text = ele.getText();
			if((Integer.parseInt(text))==dateInt) {
				Thread.sleep(2000);
				ele.click();
				flag= true;
				break;
			}
		}
	}

}
