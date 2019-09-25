package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demi33 {
	WebDriver driver=null;
	@When("^user enters \"([^\"]*)\" as a username and \"([^\"]*)\" as a password$")
	public void user_enters_as_a_username_and_as_a_password(String arg1, String arg2)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\browser drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   driver.manage().window().maximize();
	   driver.findElement(By.linkText("SignIn")).click();
	   driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.id("password")).sendKeys("Password123");
	  
	}

	@When("^user click on login Button$")
	public void user_click_on_login_Button() {
		driver.findElement(By.name("Login")).click();
		System.out.println("title of the page is"+driver.getTitle());
	   
	}

	@Then("^user will Finds a testmeapp homepage$")
	public void user_will_Finds_a_testmeapp_homepage() {
		System.out.println("title of the page is"+driver.getTitle());
	  
	}

}
