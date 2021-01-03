package com.selenium.project.SFHackathon;


import org.openqa.selenium.By;

import com.selenium.utility.UtilityClassDemo;

public class TC05 extends UtilityClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TC05 tc05Obj = new TC05();
		tc05Obj.launchBrowser();
		tc05Obj.navigateUrl();
		String s = tc05Obj.readPropertyFileSF();
		tc05Obj.loginSF(s);
		Thread.sleep(3000);
		Boolean b=tc05Obj.wdObj.findElement(By.xpath("//div[@id='userNavButton']//span[@id='userNavLabel']")).isEnabled();
		if(b==true) {
			System.out.println("Usermenu is present");
		}
		tc05Obj.wdObj.findElement(By.xpath("//div[@id='userNavButton']//span[@id='userNavLabel']")).click();
		b=tc05Obj.wdObj.findElement(By.xpath("//div[@id='userNav-menuItems']")).isEnabled();
		if(b==true) {
			System.out.println("Usermenu Dropdown is present");
		}
		Boolean flag = true;
		if(!tc05Obj.wdObj.findElement(By.xpath("//a[text()='My Profile']")).isEnabled()) {flag=false;}
		if(!tc05Obj.wdObj.findElement(By.xpath("//a[text()='My Settings']")).isEnabled()) {flag=false;}
		if(!tc05Obj.wdObj.findElement(By.xpath("//a[text()='Developer Console']")).isEnabled()) {flag=false;}
		if(!tc05Obj.wdObj.findElement(By.xpath("//a[text()='Switch to Lightning Experience']")).isEnabled()) {flag=false;}
		if(!tc05Obj.wdObj.findElement(By.xpath("//a[text()='Logout']")).isEnabled()) {flag=false;}
		if(flag==true) {
			System.out.println("All dropdown values are present");
		}
		else {System.out.println("Some dropdown values are not present");}
		tc05Obj.quit();
	}

}
