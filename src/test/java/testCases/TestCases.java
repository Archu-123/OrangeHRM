package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCases 
{
	
	@Parameters({"broweserName"})
	@BeforeTest
	public void beforeTest(String broweserName)
	{
		if(broweserName.equals("chrome"))
		{
			System.out.println("Opening the Chrome browser");
			
		}
		else if(broweserName.equals("firefox"))
		{
			System.out.println("Opening the firefox browser");
		}

		else if(broweserName.equals("safari"))
		{
			System.out.println("Opening the safari browser");
		}

	
	}
	
	
//	@BeforeSuite
//	public void beforeSuite()
//	{
//		System.out.println("beforeSuite");
//
//	}
//	@BeforeTest
//	public void beforeTest()
//	{
//		System.err.println("beforeTest");

	//}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	
	@Test
	public void test1()
	{
		System.out.println("VerifyLoginPage");
	}
	
	@Test
	public void test2()
	{
		System.out.println("VerifyHomePage");
	}
	
//	@Test
//	public void VerifyAdmin()
//	{
//		System.out.println("VerifyAdmin");
//	}
//	
//	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass");
	}
	@AfterTest
	public void afterTest()
	{
		System.err.println("afterTest");

	}
//	@AfterSuite
//	public void afterSuite()
//	{
//		System.out.println("afterSuite");
//
//	}

}
