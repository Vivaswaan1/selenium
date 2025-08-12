package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Handlingtables extends Base {
	
	public void verifytable()
	{   //to print all datas printed in console
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table=driver.findElement(By.id("dataTable"));
		System.out.println(table.getText());
		WebElement tablerow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
		System.out.println(tablerow.getText());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handlingtables ht=new Handlingtables();
		ht.initializeBrowser();
		ht.verifytable();

	}

}
