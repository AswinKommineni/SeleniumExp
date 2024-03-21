package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Example7
{
	static WebDriver driver;
	public static void validate(String error_message,String message) 
	{
		if(error_message.equals(message))
		{
		System.out.println("pass");
		
		}
		else
		{
			System.out.println("fail");
		}
			
	}
	public static void LoginWithEmptyField()
	{
		driver.findElement(By.xpath("//*[@id=\"loginNow\"]")).click();
	
		String error_message="The Email / Username field is required.";
		String message= driver.findElement(By.xpath("//*[@id=\"userNameValidationMessage\"]")).getText();
		System.out.println("Login with Empty Fields");
		validate(error_message,message);
		
	}
	public static void LoginWithEmailandWithoutPassword()
	{
		String error_message="The Password field is required.";
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys(MyApplicationConstants.USERNAME_EMAIL);
		driver.findElement(By.xpath("//*[@id=\"loginNow\"]")).click();
		String message= driver.findElement(By.xpath("//*[@id=\"passwordValidationMessage\"]")).getText();
		System.out.println("Login with email and without password");
		validate(error_message,message);
	}
	public static void LoginWithoutEmailandWithPassword()
	{
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).clear();
		String error_message="The Email / Username field is required.";
		
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(MyApplicationConstants.USER_PASSWORD);
		driver.findElement(By.xpath("//*[@id=\"loginNow\"]")).click();
		String message= driver.findElement(By.xpath("//*[@id=\"userNameValidationMessage\"]")).getText();
		System.out.println("Login without email and with password");
		validate(error_message,message);
	}
	public static void LoginWithInvalidDetails()
	{String error_message="The user name or password provided is incorrect.";
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys(Example8.USERNAME_EMAIL);
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(Example8.USER_PASSWORD);
		driver.findElement(By.xpath("//*[@id=\"loginNow\"]")).click();
		String message= driver.findElement(By.xpath("//*[@id=\"loginControls\"]/form/div[1]/ul/li")).getText();
		System.out.println("Login with Invalid details");
		validate(error_message,message);
	}
	public static void LoginWitvalidEmailandInvalidPassword()
	{driver.findElement(By.xpath("//*[@id=\"UserName\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"Password\"]")).clear();
	String error_message="The user name or password provided is incorrect.";
	driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys(MyApplicationConstants.USERNAME_EMAIL);
	driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(Example8.USER_PASSWORD);
	driver.findElement(By.xpath("//*[@id=\"loginNow\"]")).click();
	String message= driver.findElement(By.xpath("//*[@id=\"loginControls\"]/form/div[1]/ul/li")).getText();
	System.out.println("Login with valid Email and Invalid password ");
	validate(error_message,message);
	}
	public static void LoginWitInvalidEmailandvalidPassword()
	{driver.findElement(By.xpath("//*[@id=\"UserName\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"Password\"]")).clear();
	String error_message="The user name or password provided is incorrect.";
	driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys(Example8.USERNAME_EMAIL);
	driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(MyApplicationConstants.USER_PASSWORD);
	driver.findElement(By.xpath("//*[@id=\"loginNow\"]")).click();
	String message= driver.findElement(By.xpath("//*[@id=\"loginControls\"]/form/div[1]/ul/li")).getText();
	System.out.println("Login with Invalid Email and valid password ");
	validate(error_message,message);
	}
	public static void LoginWitvalidDetails()
	{
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys(MyApplicationConstants.USERNAME_EMAIL);
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(MyApplicationConstants.USER_PASSWORD);
		driver.findElement(By.xpath("//*[@id=\"loginNow\"]")).click();
		try
		{
			driver.findElement(By.xpath("//*[@id=\"userLogOut\"]"));
			System.out.println("Login Successfull ");
		}
		catch(Exception e)
		{
			System.out.println("Invalid user");
		}
    }
	
	




public static void main(String[] args) throws InterruptedException 
{
	driver=new Example6().openBrowser();
	driver.findElement(By.xpath("//*[@id=\"fq-main-menu-auth\"]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
	LoginWithEmptyField();
	LoginWithEmailandWithoutPassword();
	LoginWithoutEmailandWithPassword();
	LoginWithInvalidDetails();
	LoginWitvalidEmailandInvalidPassword();
	LoginWitInvalidEmailandvalidPassword();
	LoginWitvalidDetails();
}
}
