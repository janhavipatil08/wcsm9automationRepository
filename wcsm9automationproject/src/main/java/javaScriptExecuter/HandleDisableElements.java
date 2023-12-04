package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableElements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='Disabled Mode']"));
		
		//explicit type casting into javascriptexecuter
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//for username 
		jse.executeScript("document.getElementById('name').value='janhavi'");
		
		//for email
		
		jse.executeScript("document.getElementById('email').value='janhavi123@gmail.com'");
		
		//for password
		
		jse.executeScript("document.getElementById('password').value='janhavi1234'");
		
	}

}
