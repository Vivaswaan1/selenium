package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Handlingframes extends Base {
	
	public void verifyframes()
	{
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> frame=driver.findElements(By.tagName("iframe"));  //use list for findelements
		System.out.println(frame.size());
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		WebElement frameheading=driver.findElement(By.id("sampleHeading"));
		System.out.println(frameheading.getText());
		
		driver.switchTo().defaultContent();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Handlingframes HF=new Handlingframes();
		HF.initializeBrowser();
		HF.verifyframes();

	}

}
