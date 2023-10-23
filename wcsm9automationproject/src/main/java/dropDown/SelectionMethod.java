package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://demoapps.qspiders.com/");
		
		//identify the dropdown
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[contains(@class,'  ease-linear transition-all duration-150 w-5/12')]"));
		
		Select sel = new Select(dropdown);
		
		//select the option
		 sel.selectByIndex(2);
		Thread.sleep(2000);
		
		//identify the country dropdown
		
		 WebElement	dropdown1 = driver.findElement(By.xpath("//label[text()='Country']"));
		 
		 Select sel1 = new Select(dropdown1);
		 sel1.selectByValue("india");
		 
		 //identify the state
		 driver.findElement(By.xpath(null));
		 
		// for()
		 
		 //identify the dropdown
		 
		WebElement dropdown4 = driver.findElement(By.id("idddd"));
		Select sel4 = new Select(dropdown4);
		sel4.selectByIndex(5);
		
		//select multiple options from multiple dropdown
		
		for(int i=0; i<=5; i++)
		{
			
		}
	
			
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}
	

}
