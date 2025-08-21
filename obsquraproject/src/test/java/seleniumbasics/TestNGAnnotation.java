package seleniumbasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	@Test
	public void testcase()
	{
		System.out.println("testcase");
	}
	@BeforeMethod
	public void before()
	{
		System.out.println("before");
	}
	@AfterMethod
	public void after()
	{
		System.out.println("after");
	}

}



//write method above that put @test, we will get options, run, debug, run all.then Import @test.. click on run and wait.

//before method, will comes first. usually will give initialize browser method for this

