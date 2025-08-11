package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebelementCommands extends Base {
	
	public void handlingcommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php ");
		//sendkeys
	WebElement msgbx=driver.findElement(By.xpath("//input[@id='single-input-field']"));	
	msgbx.sendKeys("Jayashree ");
	
	//button click
	WebElement bttn=driver.findElement(By.xpath("//button[text()='Show Message']"));
	bttn.click();
	
	//gettext
	WebElement gettext=driver.findElement(By.id("message-one"));
	
	System.out.println(gettext.getText());
	
	//clear
	
msgbx.clear();

//css
WebElement getcss=driver.findElement(By.linkText("Radio Buttons Demo"));
System.out.println(getcss.getCssValue("background-color"));

//gettagname
WebElement gettagname=driver.findElement(By.xpath("//input[@id='value-a']"));
System.out.println(gettagname.getTagName());
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebelementCommands elmt=new WebelementCommands();
   elmt.initializeBrowser();
   elmt.handlingcommands();
	}

}
