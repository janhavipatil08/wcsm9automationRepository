package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		//verify usertextbox is displayed or not
		WebElement username = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		boolean status = username.isDisplayed();
	    System.out.println(status);
	}

}
