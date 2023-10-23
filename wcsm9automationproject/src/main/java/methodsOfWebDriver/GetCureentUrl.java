package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCureentUrl {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://www.flipkart.com//");
		
	   String a= driver.getCurrentUrl();
	   
	   System.out.println(a);
	   
	   driver.quit();	
	}
}

