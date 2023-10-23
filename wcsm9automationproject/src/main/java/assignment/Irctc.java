package assignment;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.switchTo().activeElement().sendKeys("pune");
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("goa");
		Thread.sleep(2000);
		
	}
}