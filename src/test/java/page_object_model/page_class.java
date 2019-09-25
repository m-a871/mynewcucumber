package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page_class {
	WebDriver driver;
	By lnc=By.linkText("Log in");
	By uname=By.name("Email");
	By pwd=By.name("Password");
	By lin=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	By logo=By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	public page_class(WebDriver driver)
	{
		this.driver=driver;
	}
	public void cli9cklink()
	{
		driver.findElement(lnc).click();
	}
    public void typeuname(String username)
    {
    	driver.findElement(uname).sendKeys("aravind.guggilla57@gmail.com");
    }
    public void typepass(String password)
    {
    	driver.findElement(pwd).sendKeys("aravind");
    }
    public void clickonlogin()
    {
    	driver.findElement(lin).click();
    }
    public void clickonlogout()
    {
    	driver.findElement(logo).click();
    }
    
}
