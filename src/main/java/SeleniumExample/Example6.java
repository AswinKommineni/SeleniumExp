package SeleniumExample;


	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Example6 
	{
		public WebDriver openBrowser()
		{
			WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://www.flexiquiz.com/");
	        
	        return driver;
		}
	}
