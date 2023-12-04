package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
  @Test
  public void method3() {
	  
	  //System.out.println("Method3 from Sumo Class");
	  Reporter.log("Method3 from Sumo Class",true);
	  
  }
  
  @Test
  
  public void method4()
  {
	 // System.out.println("Method3 from sumo Class");
	  Reporter.log("Method4 from Sumo Class", false);
  }
  
}
