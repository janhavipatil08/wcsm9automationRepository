package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVistara {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable notifications");
		
		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.airvistara.com/");
		
		driver.findElement(By.id("cookieModalCloseBtn")).click();
		
		driver.findElement(By.xpath("//input[@name='flightSearchfrom']")).sendKeys("PNQ");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Select Arrival City']")).sendKeys("goa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name ='depart']")).click();
		
		driver.findElement(By.xpath("//a[@data-date='26']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-date='29']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='passengers']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='buisness']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'col-xs-12 done_btn ')]")).click();
		driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();
		
		
		
		
		
	}

}
