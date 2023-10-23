package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize_GetRect_Methods {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		driver.get("http://demoapps.qspiders.com/");
		
		//identify the email textbox
		WebElement emailTextBox = driver.findElement(By.cssSelector("input#email"));
		Thread.sleep(2000);
		
		//get the location of email text box
		 Point loc = emailTextBox.getLocation();
		 Thread.sleep(2000);
		 int xaxis = loc.getX();
		int yaxis = loc.getY();
		System.out.println("location of email textbox:"+xaxis+" : "+yaxis);
		
		//get the size of email textbox  
		Dimension size = emailTextBox.getSize();
		Thread.sleep(2000);
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("size of the email textbox:"+height+" :"+width);
		
		//get the location and size of email text box
		Rectangle rect = emailTextBox.getRect();
		Thread.sleep(2000);
		System.out.println(rect.getX()+" :"+rect.getY());
		System.out.println(rect.getHeight()+" : "+rect.getWidth());
		
		
	}

}
