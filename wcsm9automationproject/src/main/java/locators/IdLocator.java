package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Shree/Desktop/wcsm9webapplication/simplelogin.html");
		Thread.sleep(2000);
		
		driver.findElement(By.id("i1")).sendKeys("admin");
		
		driver.findElement(By.id("i2")).sendKeys("manager");
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
