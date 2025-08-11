package seleniumbasics;

import org.openqa.selenium.By;

public class locators extends Base {
	
	public void handlinglocators()
	{
		driver.findElement(By.id("button-one"));
		driver.findElement(By.className("btn btn-primary"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("viewport" ));  //scroll up and maximize the head
		driver.findElement(By.linkText("Simple Form Demo"));  //hover over any link
		driver.findElement(By.partialLinkText("Simple"));    //hover over any link
		driver.findElement(By.cssSelector("button[id='button-one']"));
		driver.findElement(By.xpath("//input[@class='form-control']"));
	//	/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button    -absolute xpath
		driver.findElement(By.xpath("//input[@class='form-control']"));
		driver.findElement(By.xpath("//button[@text()='Show Message']"));
		driver.findElement(By.xpath("//button[starts-with(text(),'show']"));
		driver.findElement(By.xpath("//button[@type='button'and @class='btn btn-primary']"));
		driver.findElement(By.xpath("//button[@class='btn btn-primary'or @type='button']"));
		driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one'] "));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card'] "));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card'] "));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div\" "));
		driver.findElement(By.xpath("//div[@class='card']//descendant::div "));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
