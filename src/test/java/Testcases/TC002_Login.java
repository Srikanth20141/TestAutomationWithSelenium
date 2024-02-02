package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class TC002_Login extends Base{

	@Test
	public void login() {
		super.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		super.driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		super.driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		super.driver.findElement(By.xpath("//Button[@type='submit']")).click();
		WebElement elementToRightClick = driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main orangehrm-attendance-card-action']"));
		Actions action = new Actions(driver);
		action.contextClick(elementToRightClick).perform();
		
	}

}
