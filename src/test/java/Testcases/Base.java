package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Base {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void startBrower() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

//		driver.navigate().forward();
//		driver.navigate().refresh();
//		driver.navigate().to("https://app.seg-social.pt/ptss/fraw/mensagens/ver/252077897?dswid=-1");
//		driver.navigate().back();
	}

}
