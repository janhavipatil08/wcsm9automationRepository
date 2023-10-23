package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		//verify login btn is enabled or not
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		boolean status = loginbtn.isEnabled();
		System.out.println(status);
		
		//by passing arguments check it's enabled or not
        driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("manager");
		
		driver.findElement(By.xpath("////button[@class='_acan _acap _acas _aj1-']")).click();
	
		System.out.println(status);
		
		

}
}