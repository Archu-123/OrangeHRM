package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pomUtility.ElementWait;

public class LoginPage 
{
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		//wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void sendUsername(String uName) throws InterruptedException
	{
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		//ElementWait.waitForElement("//input[@name='username']", 20, driver);
		Thread.sleep(3000);
		username.sendKeys(uName);
	}
	
	
	public void sendPassword(String pwd) 
	{

		password.sendKeys(pwd);
	}
	
	public void ClickOnLoginButton()
	{
		loginButton.click();
	}

	public static boolean CheckVisiblityofAdminTab()
	{
		return false;
	}

}
