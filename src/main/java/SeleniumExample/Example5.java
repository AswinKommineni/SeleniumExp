package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flexiquiz.com");
        driver.findElement(By.id("fq-main-menu-access")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"signupEmail\"]")).sendKeys("aswin.kommineni03@gmail.com");
        driver.findElement(By.id("signupPassword")).sendKeys("A12345s@");
        driver.findElement(By.xpath("//*[@id=\"signupNow\"]")).click();
        
        
        
        
		

        //driver.quit();
    }
}
