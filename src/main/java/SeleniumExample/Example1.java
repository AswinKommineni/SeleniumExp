package SeleniumExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flexiquiz.com/home/features");
        
		String Exp=driver.getTitle();
		System.out.println(Exp);
		

        //driver.quit();
    }
}
