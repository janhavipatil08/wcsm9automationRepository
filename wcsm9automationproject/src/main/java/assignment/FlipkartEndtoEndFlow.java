package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartEndtoEndFlow {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//body[@class='fk-modal-visible']")).click();
		
		driver.findElement(By.xpath("//span[text()='X,]")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		
		driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).click();
	}

}
