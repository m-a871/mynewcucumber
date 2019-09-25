package pom_pagefactory;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class testclass_pf {
	
	@Test
	public void f()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\browser drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 page_class_pf locateElements=PageFactory.initElements(driver, page_class_pf.class);
		 locateElements.loginMethod("aravind.guggilla57@gmail.com", "aravind");
		 
	}

}
