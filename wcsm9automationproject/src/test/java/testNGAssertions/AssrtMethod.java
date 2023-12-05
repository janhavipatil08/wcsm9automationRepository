package testNGAssertions;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssrtMethod {
  @Test
  public void assertMethod() {
	  
	  Reporter.log("launch the browser", true);
	  Reporter.log("launch the application by using URL", true);
  }
  
  public void softassert() {
	 SoftAssert sa = new SoftAssert();
	 sa.assertEquals(true, true);
	 Reporter.log("login performed", true);
	 Assert.assertEquals(true, false);
	 Reporter.log("home page", true);
	  
  }
  
  
  
  
}
