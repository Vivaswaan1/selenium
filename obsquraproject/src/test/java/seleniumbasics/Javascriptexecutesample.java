package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Javascriptexecutesample extends Base {
	
	public void javascriptexecutor()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",showmessagebutton);
		js.executeScript("window.scrollBy(0,350)", "");
		js.executeScript("window.scrollBy(0,-350)", "");
				
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javascriptexecutesample jse=new Javascriptexecutesample();
		jse.initializeBrowser();
		jse.javascriptexecutor();
	}

}
