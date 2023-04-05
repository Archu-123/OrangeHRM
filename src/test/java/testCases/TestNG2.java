package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG2 
{
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite of class2");

	}
	@BeforeTest
	public void beforeTest()
	{
		System.err.println("beforeTest of class2");

	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeclass of class2");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod of class2");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test2 of class2");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2 of class2");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod of class2");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass of class2");
	}
	@AfterTest
	public void afterTest()
	{
		System.err.println("afterTest of class2");

	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite of class2");

	}
}
