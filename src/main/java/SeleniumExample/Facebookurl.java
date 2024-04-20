package SeleniumExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookurl 
{
	public WebDriver openBrowser()
	{
		WebDriver driver = new ChromeDriver();
        
        driver.get("");
        
        return driver;
	}
}