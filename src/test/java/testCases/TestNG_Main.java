package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestNG_Main 
{
	@Parameters({"browserName"})
	@BeforeTest
	public void beforeTest(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.out.println("Opening the Chrome browser");
			
		}
		else if(browserName.equals("firefox"))
		{
			System.out.println("Opening the firefox browser");
		}	
		else if(browserName.equals("edge"))
		{
			System.out.println("Opening the edge browser");
		}	
		
	}
	

}
