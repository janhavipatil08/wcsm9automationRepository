package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.airvistara.com/in/en");
		Thread.sleep(2000);
		
		driver.findElement(By.id("cookieModalCloseBtn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("pune");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Select Arrival City']")).sendKeys("mumbai");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-date='23'')")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-date'26']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='passengers']")).click();
		driver.close();
		
		
	}

}
