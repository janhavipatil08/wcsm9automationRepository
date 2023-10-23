package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		//to identify the search textbox
		
		driver.findElement(By.xpath("//input[@name ='q']")).sendKeys("mobiles");
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
	String 	price= driver.findElement(By.xpath("//div[@class='4eR']")).getText();//mobile name then parent code and then price code.
	System.out.println(price);
	}

}
