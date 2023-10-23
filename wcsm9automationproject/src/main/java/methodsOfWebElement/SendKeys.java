package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("admin12");
	
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("manager123");
	
	driver.close();
}
}
