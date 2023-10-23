package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstgramLogin {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(2000);
		
		//identify Username and pass inputs
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("manager");
		
		driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
