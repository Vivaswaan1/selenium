package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Multilewindowhandling extends Base {
	
	public void multiplewindowhandling()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firsthandleid=driver.getWindowHandle();
		System.out.println(firsthandleid);
		WebElement clickhere=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhere.click();
		Set<String> handleids=driver.getWindowHandles();
	System.out.println(handleids);
	Iterator<String> iterator=handleids.iterator();
	while(iterator.hasNext())
	{
		String Currentid=iterator.next();
		if(!Currentid.equals(firsthandleid))
		{
			driver.switchTo().window(Currentid);
			WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
			email.sendKeys("jayashree19900122@gmail.com");
			WebElement btnclick=driver.findElement(By.xpath("//input[@name='btnLogin']"));
			btnclick.click();
		}
		
		
		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilewindowhandling mwh=new Multilewindowhandling();
		mwh.initializeBrowser();
		mwh.multiplewindowhandling();
	}

}