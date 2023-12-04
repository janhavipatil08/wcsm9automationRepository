package testNGExecutionPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
  @Test
  public void method2() throws InterruptedException {
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.google.co.in/");
	  Thread.sleep(2000);
	  driver.switchTo().activeElement().sendKeys("selenium", Keys.ENTER);
	  Thread.sleep(2000);
	  
	  driver.close();
  }


  }

