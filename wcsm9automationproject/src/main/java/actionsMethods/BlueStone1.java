package actionsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone1 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		
		Thread.sleep(2000);
		
		//sObject watchJewellery = driver.findElement(By.xpath("//a[@title='Watch Jewellery']")).click();
		
		Actions act = new Actions(driver);
		//act.moveToElement(watchJewellery).perform();
		Thread.sleep(2000);
		
		//perform mouseover on watch jewellery
		
		driver.findElement(By.xpath("//a[@title='Band']")).click();
		boolean status = driver.findElement(By.xpath("//a[@title='Home']")).isDisplayed();

		
		
		
	}

}
