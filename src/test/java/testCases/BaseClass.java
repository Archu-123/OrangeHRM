package testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import testUtility.Screenshot;
import testUtility.StaticBrowser;

public class BaseClass 
{
	static WebDriver driver;
	public static ExtentReports Report;
	public static ExtentHtmlReporter extent;
	public static ExtentTest logger;
	@Parameters({"browser"})
	@BeforeTest
	public void beforeTest(String browser)
	{
		 Report = new ExtentReports();
		 extent = new ExtentHtmlReporter("test-output"+File.separator+"Report"+File.separator+"HrmThread"+System.currentTimeMillis()+".Html");
		Report.attachReporter(extent);
		
		WebDriver driver=StaticBrowser.openBrowser(browser, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	@AfterMethod
	public void afterMethod(ITestResult Result) throws IOException
	{
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			String path= Screenshot.capturePageScreenshot(driver);
			
			logger.fail("Test class fail", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		}
		Report.flush();
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.quit();
		
	}

}
