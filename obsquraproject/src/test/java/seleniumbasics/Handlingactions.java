package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Handlingactions extends Base {
	
	public void verifyrightclick()  //for right click use context click
	{
		WebElement rightclick=driver.findElement(By.xpath("//a[text()='Home']"));
		Actions action=new Actions(driver);
		action.contextClick(rightclick).build().perform();
		
		
	}
	
	public void mousehover()    //for mouse hover-use moveTOElement
	{
		WebElement mouse=driver.findElement(By.id("others"));
		Actions action=new Actions(driver);
		action.moveToElement(mouse).build().perform();
		
	}
	
	public void verifydraganddrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
	}
	
	public void verifykeyboardaction() throws AWTException
	{
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handlingactions HA=new Handlingactions();
		HA.initializeBrowser();
		//HA.verifyrightclick();
		//HA.mousehover();
		//HA.verifydraganddrop();
		
		try {
			HA.verifykeyboardaction();
		}
		catch(AWTException e)
		{
			e.printStackTrace();
			
			
		}
	}
		
		
	}
	
	


