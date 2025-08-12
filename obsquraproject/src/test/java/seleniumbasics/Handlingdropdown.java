package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Handlingdropdown extends Base {
	
	public void handlingdropdown()
	{  
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement dropdown=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(dropdown);
		select.selectByIndex(2);
		select.selectByValue("sql");
		select.selectByVisibleText("JAVA");
		
		
		
	}
	public void handlingcheckbox()
	{    driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement chkbx=driver.findElement(By.xpath("//input[@value='option-1']"));
		
		chkbx.click();
		System.out.println(chkbx.isSelected());//---before click will be false
	}
	
	public void handlingradiobutton()
	{
		 driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		 WebElement radiobutton=driver.findElement(By.xpath("//input[@value='green'] "));
		 radiobutton.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Handlingdropdown drop=new Handlingdropdown();
		drop.initializeBrowser();
		//drop.handlingdropdown();
		drop.handlingcheckbox();
		drop.handlingradiobutton();
		
		

	}

}
