package demo.testingNg;
import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test(priority=2)
  public void TC_001() {
//	  System.out.println("Method 1");
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
      //getting the title
	  String title=driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals(title,"Guest Registration Form-User Registration");
  }
  
  
//  @Test
//  public void TC_002() {
//	  System.out.println("Method 2");
//  }
//  
  
}
