package demo.testingNg;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class DAY9 {
  @Test(dataProvider = "dp")
  public void add(int num1,int num2,int expected) {
	  int actual=num1+num2;
	  Assert.assertEquals(actual, expected);
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 2,3},
      new Object[] { 2, 3,5 }
    };
  }
}
