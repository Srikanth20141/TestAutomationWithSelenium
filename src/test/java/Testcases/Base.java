package Testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Base {
	
	WebDriver driver = null;
	Logger log = Logger.getLogger("OrgangeHRM");
	
	
	@BeforeTest
	public void startBrower() {
		PropertyConfigurator.configure("log4j.properties");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		log.info("Broweser started+");
	}

}
