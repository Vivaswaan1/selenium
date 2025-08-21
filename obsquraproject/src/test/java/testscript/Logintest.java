package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationcore.Testngbase;

public class Logintest extends Testngbase {

	@Test
	public void verifyuserloginwithvalidcredential()
	{
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginbutton=driver.findElement(By.xpath("//input[@type='submit']"));
		loginbutton.click();
		
	}
	@Test
	public void verifyuserloginwithinvalidpassword() throws InterruptedException 
	{
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("performance_glitch_user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("password");
		WebElement loginbutton=driver.findElement(By.xpath("//input[@type='submit']"));
		loginbutton.click();
		driver.wait(2500000);
		
	}
	@Test
	public void verifyuserloginwithinvalidusername() throws InterruptedException 
	{
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("Jayashree");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginbutton=driver.findElement(By.xpath("//input[@type='submit']"));
		loginbutton.click();
		driver.wait(2500000);
	}
	@Test
	public void verifyuserloginwithinvalidcreds() throws InterruptedException 
	{
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("Jayashree");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("password");
		WebElement loginbutton=driver.findElement(By.xpath("//input[@type='submit']"));
		loginbutton.click();
		driver.wait(2500000);
		
	}
	
	
}
