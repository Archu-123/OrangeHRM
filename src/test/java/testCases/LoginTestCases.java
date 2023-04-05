package testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackage.LoginPage;
import testUtility.ReadFileData;

public class LoginTestCases extends BaseClass
{
	//WebDriver driver;
	LoginPage login;
	ReadFileData r;
//	@BeforeClass
//	public void beforeClass()
//	{
//		//System.setProperty("webdriver.chrome.driver","src\\test\\resources\\driver\\chromedriver.exe");
//		//driver=new ChromeDriver();
//		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		//login = new LoginPage(driver);
//	}
//	
	@BeforeMethod
	public void beforeMethod()
	{
		 login = new LoginPage(driver);

		System.out.println("beforeMethod");
	}
	
	@Test
	public void VerifyLoginFunctinalityWithCorrectData() throws InterruptedException, EncryptedDocumentException, IOException
	{

		logger = Report.createTest("Verify Login FUnctionality With Correct Data ");
		
		SoftAssert s = new SoftAssert();
		//login.sendUsername("Admin");
		//login.sendPassword("admin123");
		
		login.sendUsername(r.fetchDataFromExcel(1,0));
		login.sendPassword(r.fetchDataFromExcel(1,1));
		login.ClickOnLoginButton();
		String ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Thread.sleep(2000);
		String CurrentURL=driver.getCurrentUrl();
		boolean result = LoginPage.CheckVisiblityofAdminTab();
		
		Thread.sleep(3000);
		
		
		
		WebElement ele = driver.findElement(By.xpath("//img[@alt=\"client brand logo\"]/ancestor::a"));
		File source = ele.getScreenshotAs(OutputType.FILE);
		//File source=ele.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\anvi\\eclipse-workspace1\\OrangeHRM1\\test-output\\screenshot\\temp.png");
		FileHandler.copy(source, dest);
		
		
		
		
		s.assertEquals(CurrentURL, ExpectedURL);
		System.out.println("soft assert executed");
		Assert.assertFalse(result);
		//Assert.assertTrue(result);
		
		System.out.println("Test case ended");
		s.assertAll();
		
		
		//System.out.println("gvhgvbnvh");
		
		
	}
	
	@Test
	public void VerifyLoginFunctinalityWithInCorrectData() throws InterruptedException
	{
		logger = Report.createTest("Verify Login FUnctionality With InCorrect Data ");


		SoftAssert s = new SoftAssert();

		login.sendUsername("admin");
		login.sendPassword("admin1234");
		login.ClickOnLoginButton();
		String ExpectedURL="";
		Thread.sleep(2000);
		String CurrentURL=driver.getCurrentUrl();
		boolean result1 = login.CheckVisiblityofAdminTab();
		s.assertEquals(CurrentURL, ExpectedURL);
		System.out.println("soft assert executed");
		
		Assert.assertFalse(result1);
		
		System.out.println("Test case ended");
		//s.assertAll();
		
		//System.out.println("VerifyLoginFunctinalityWithInCorrectData");
		//Assert.fail();
		
	}
//	
//	@Test
//	public void VerifyAdmin()
//	{
//		System.out.println("VerifyAdmin");
//	}
	
	
//	@AfterMethod
//	public void afterMethod()
//	{
//		System.out.println("AfterMethod");
//	}
//	
//	@AfterClass
//	public void afterClass()
//	{
//		System.out.println("AfterClass");
//
//	}
//	
	

}
