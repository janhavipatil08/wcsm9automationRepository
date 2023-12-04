package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
  @Test(description ="login performed")
  public void LoginMethod() {
	  Reporter.log("Method1 from login page", true);
  }
  @Test(description = "user has been created", dependsOnMethods = "LoginMethod")
  public void createUser()
  {
	  Reporter.log("Method2 for user Creation", true);
  }
  @Test(description = "logout performed", dependsOnMethods ="createUser", enabled = false)
  public void logoutMethod()
  {
	  Reporter.log("Method3 from logout method", true);
  }
}
