import org.testng.Assert;
import org.testng.annotations.Test;
public class AssertionPGM {
	
	
	@Test
	public void tc1() {
	
	int a=10;
	int b=20;
	String actual="Google";
	String Expected="Gooogle";
	try
	{
	Assert.assertEquals(actual,Expected,"This should print as both do not match");
	}
	catch(AssertionError e)
	{
		e.printStackTrace();
	}
	Assert.assertTrue(a<b, "This should not be printed");
	try
	{
	Assert.assertFalse(a<b, "This should be printed, failed as the condition is true");
	}
	catch(AssertionError e)
	{
		e.printStackTrace();
	}
	
	System.out.println("We are here!");
	}

}
