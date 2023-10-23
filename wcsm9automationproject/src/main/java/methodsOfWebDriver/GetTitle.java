package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String LoginPageTitle = driver.getTitle();
		
		System.out.println(LoginPageTitle);
		
		driver.close();		
		
	

	}
}
