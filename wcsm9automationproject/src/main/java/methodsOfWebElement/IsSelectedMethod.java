package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch omayoblogpost
		driver.get("https://omayo.blogspot.com/");
		
		//verify if checkbox is selected or not
		WebElement checkbox = driver.findElement(By.id("checkbox2"));
		boolean status = checkbox.isSelected();
		System.out.println(status);
		

}
}
