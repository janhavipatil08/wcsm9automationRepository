package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Shree/Desktop/wcsm9webapplication/link.html");
		
		driver.findElement(By.linkText("selenium link" )).click();
		
		driver.close();
	}

}
