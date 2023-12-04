package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClick {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		driver.findElement(By.xpath(null));
	}

}
