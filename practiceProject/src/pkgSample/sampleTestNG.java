package pkgSample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class sampleTestNG 
{
	SoftAssert softAssert = new SoftAssert();
  @Test
  public void TestA() 
  {
	  Assert.assertEquals("a", "a");
  }
  @Test
  public void TestB()
  {
	  //Assert.assertEquals("b", "c","Values do not match");
	  Assert.assertNull(softAssert);
  }
  @Test
  public void TestC()
  {
	  Assert.assertEquals("a", "a");
  }
  @Test
  public void TestD()
  {
	softAssert.assertEquals("h", "h");
	softAssert.assertNotEquals("1", "1");
	softAssert.assertTrue(false);
	softAssert.assertAll();
  }
}
