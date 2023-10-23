package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver ();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//to launch the web application
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		//to open the pop up window
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		
		Thread.sleep(2000);
		
		driver.close();	}




	}


