package demo.testingNg;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Calculator {
	int a=20,b=20,c;
//	c->result
  public void add() {
	  c=a+b;
	  Assert.assertEquals(c, 10);
  }
  public void sub() {
	  c=a-b;
	  Assert.assertEquals(c, 10);
  }
  public void mul() {
	  c=a*b;
	  Assert.assertEquals(c, 10);
	  
  }
  public void div() {
	  c=a-b;
	  Assert.assertEquals(c, 10);
  }
}
