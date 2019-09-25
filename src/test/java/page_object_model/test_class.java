package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_class {

	public static  void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\browser drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 page_class Pobject=new page_class(driver);
		 driver.get("http://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 Pobject.cli9cklink();
		 String username=null;
		 Pobject.typeuname(username);
		 String password=null;
		 Pobject.typepass(password);
		 Pobject.clickonlogin();
		 System.out.println("title of the page"+driver.getTitle());
		 Pobject.clickonlogout();
		 
	}
}
