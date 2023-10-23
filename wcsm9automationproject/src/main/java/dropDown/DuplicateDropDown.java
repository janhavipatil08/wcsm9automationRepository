package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateDropDown {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Shree/Desktop/wcsm9webapplication/multiselect%20dropdown.html");
		
		
		//identify the dropdown and store it in referance variable
		
		WebElement menudropdown = driver.findElement(By.id("idddd"));
		
		//get all the options of menuDRopdowwn handle dropdown
		Select sel1 = new Select(menudropdown);
		List<WebElement> allops = sel1.getOptions();
		
		//to eliminate duplicate we use HashSet
		
	
		
		//read the list by using for loop and eliminate the dupliacte
		
		
		
		
		
	
		
	}

}
