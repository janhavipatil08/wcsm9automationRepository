package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLoginTagLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("input")).sendKeys("india");
		Thread.sleep(2000);
		
		driver.close();
	}




	

	}


