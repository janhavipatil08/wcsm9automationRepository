package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
	       driver.manage().window().maximize();
	       
	       driver.get("http://omayo.blogspot.com/");
	       Thread.sleep(2000);
	       
	       //to take the address of current window as well as child window
	       String ParentHandle = driver.getWindowHandle();
	       
	       System.out.println(ParentHandle);
	       
	       driver.findElement(By.partialLinkText("Open a popup window"));
	       
	       Set<String> allHandles = driver.getWindowHandles();
	       
	       for(String wh:allHandles)
	       {
	    	   
	    	   if (!ParentHandle.equals(wh))
	    	   {
	             System.out.println("address of child window:"+wh);
	    	   }
	    	   else
	    	   {
	    		   System.out.println("address of parent window"+wh);
	    	   }
	    	   
	    	   
	}

}}
