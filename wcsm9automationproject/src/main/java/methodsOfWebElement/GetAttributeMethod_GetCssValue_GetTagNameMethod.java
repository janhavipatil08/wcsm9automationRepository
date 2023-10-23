package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod_GetCssValue_GetTagNameMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		
		//get the attribute value of login btn i.e name attribute
		 WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		 String attributevalue = loginbtn.getAttribute("class");
		 System.out.println(attributevalue);
		 Thread.sleep(2000);
		 
		 
		 //get the cssvalue of of login btn
		 
		 String cssvalue = loginbtn.getCssValue("colour");
		 System.out.println(cssvalue);
		 Thread.sleep(2000);
		 
		 
		 //get the tag name of login btn
		String tagname = loginbtn.getTagName();
		System.out.println(tagname);
		 
		 
		
		
	}
	
	
	

}
