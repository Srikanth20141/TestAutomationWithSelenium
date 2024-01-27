package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class TC002_Login extends Base{

	@Test
	public void login() {
		log.info("TEST bY LAK884");
		super.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		super.driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		super.driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		super.driver.findElement(By.xpath("//Button[@type='submit']")).click();
	}

}
