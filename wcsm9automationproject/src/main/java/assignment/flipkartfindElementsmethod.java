package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartfindElementsmethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		//handle the Pop up
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		
		//search  for lapTops 
		driver.findElement(By.name("q")).sendKeys("laptops");
		Thread.sleep(2000);
		
		//click on search icon
		driver.findElement(By.xpath("//button[contains(@title,'Search')]")).click();
		
		//click on brand and select the hp
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(2000);
		//click on hp brand
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text() ='HP')]")).click();
		
		//click on core i7 processor
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text() ='Core i7')]")).click();
		
		//click on windows 11
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text() ='Windows 11')]")).click();
		

		
		//identify all the suggestions of laptop
		driver.findElements(By.xpath("//div[@class='_4rR01T'][1]"));
		
		 List<WebElement> allLaptops = driver.findElements(By.xpath("//div[@class='_4rR01T'][1]"));
		 
		 List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='_4rR01T'][1]"));
		
		
		//read all the suggestions of Laptops
		for(int i=0; i<allLaptops.size(); i++)
		{ 
			
			String laptops = allLaptops.get(i).getText();
			Thread.sleep(2000);
			
			for(int j=i; j<=i; j++)
			{
				String price = allPrice.get(j).getText();
				Thread.sleep(2000);
				System.out.println(laptops+" : "+price);
			}
			
		}
		
		
		
		
	}

}
