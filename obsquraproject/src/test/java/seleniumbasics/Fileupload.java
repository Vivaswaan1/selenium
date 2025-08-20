package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Fileupload extends Base {
	
	public void fileuploadusingsendkeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement choosefile=driver.findElement(By.id("uploadfile_0"));
		choosefile.sendKeys("C:\\Users\\venki\\git\\selenium\\obsquraproject\\src\\test\\resources");
		WebElement tc=driver.findElement(By.id("terms"));
		tc.click();
		WebElement submitbttn=driver.findElement(By.id("submitbutton"));
		submitbttn.click();
		

	}
	
	public void fileuploadusingrobot() throws AWTException
	{
		
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement bttn=driver.findElement(By.id("pickfiles"));
		bttn.click();
		StringSelection s=new StringSelection("C:\\Users\\venki\\git\\selenium\\obsquraproject\\src\\test\\resources");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot robot=new Robot();
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fileupload fu=new Fileupload();
		fu.initializeBrowser();
		//fu.fileuploadusingsendkeys();
		try {
			fu.fileuploadusingrobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
