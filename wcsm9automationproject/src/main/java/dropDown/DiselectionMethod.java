package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiselectionMethod {
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		//perform deselection on multiple dropdown
		driver.findElement(By.partialLinkText("Multi Select")).click();
	}

}
