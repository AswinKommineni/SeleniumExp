package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.co.uk/");
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        driver.findElement(By.id("APjFqb")).sendKeys("Facebok.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"u_0_j_0m\"]")).click();
       
        
        
        
		

        //driver.quit();
    }
}