package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsClass {
  @Test
  public void annotation_Test_Method() {
	  
	  Reporter.log("test annotations", true);
  }
  
  @BeforeMethod
  public void annotation_BeforeMethod()
  {
	  Reporter.log("before method annotations", true);
  }
  @BeforeClass
  public void annotation_BeforeClass()
  {
	  Reporter.log("before class annotations", true);
  }
  @AfterMethod
  public void annotation_AfterMethod()
  {
	  Reporter.log("after method annotations", true);
  }
  @AfterClass
  public void annotation_AfterClass()
  {
	  Reporter.log("after class annotations", true);
  }
  @BeforeTest
  public void annotation_BeforeTest()
  {
	  Reporter.log("before test annotations", true);
  }
  @AfterTest
  public void annotation_AfterTest()
  {
	  Reporter.log("after test annotations", true);
  }
  @BeforeSuite
  public void annotation_Beforesuite()
  {
	  Reporter.log("before suite annotations", true);
  }
  
  @AfterSuite
  public void annotation_AfterSuite()
  {
	  Reporter.log("after suite annotations", true);
  }
  @Test
  public void test2()
  {
	  Reporter.log("test2 anootations", true);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

  
  
}
