package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Base {
	
	WebDriver ldriver = null;
	
	@BeforeTest
	public void startBrower() {
		ldriver = new ChromeDriver();
		ldriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
