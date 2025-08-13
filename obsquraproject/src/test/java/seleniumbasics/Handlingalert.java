package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Handlingalert extends Base {
	
	public void verifysimplealert()    //simple alert
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealert=driver.findElement(By.id("alertButton"));
		simplealert.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		
	}
	
	public void verifyconfirmalert()     //confirm alert
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmalert=driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handlingalert al=new Handlingalert();
		al.initializeBrowser();
		al.verifysimplealert();
		al.verifyconfirmalert();

	}

}
