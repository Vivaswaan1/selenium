package seleniumbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
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


@BeforeClass
public void beforeclass()
{
	System.out.println("before class");
}
@AfterClass
 public void afterclass()
 {
	 System.out.println("after class");
 }
@BeforeTest
public void beforetest()
{
	System.out.println("before test");
}
@AfterTest
 public void aftertest()
 {
	 System.out.println("after test");

}
@BeforeSuite
public void beforesuite()
{
	System.out.println("before suite");
}
@AfterSuite
 public void aftersuite()
 {
	 System.out.println("after suite");







}}

//write method above that put @test, we will get options, run, debug, run all.then Import @test.. click on run and wait.

//before method, will comes first. usually will give initialize browser method for this

/*before suite
before test
before class
before
testcase
after
after class
after test*/