package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.switchTo().activeElement().sendKeys("chandler bing");
		
		driver.findElement(By.className("lNPNe")).click();
		
		driver.close();
		
	}

}
