package testNGExecutionPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SQLTest {
  @Test
  
	  public void SQL_method1() throws InterruptedException {
		  
		  WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://www.google.co.in/");
		  Thread.sleep(2000);
		  driver.switchTo().activeElement().sendKeys("selenium", Keys.ENTER);
		  Thread.sleep(2000);
		  
		  driver.close();
  }
}
