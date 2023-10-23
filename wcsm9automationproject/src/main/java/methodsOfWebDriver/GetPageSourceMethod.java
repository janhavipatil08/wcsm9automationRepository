package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/clothing-and-accessories");
		
		//to take a source code of current page
	     String PageSourceCode = driver.getPageSource();
	     
	     System.out.println(PageSourceCode);
	                   
	     Thread.sleep(2000);
	     
	     driver.quit();
		
	} 

}

