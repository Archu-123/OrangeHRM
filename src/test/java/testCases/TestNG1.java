package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testUtility.StaticBrowser;

public class TestNG1 
{
	@BeforeClass
	public void beforeClass()
	{
		WebDriver driver=StaticBrowser.openBrowser("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println("beforeclass of class1");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod of class1");
	}
	
	
	
	@Test
	public void Test1()
	{
		System.out.println("test1 of class1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("test2 of class1");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod of class1");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass of class1");
	}
	


}
