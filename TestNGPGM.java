import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestNGPGM {
	
	public WebDriver driver;
	public String baseurl = "https://www.google.com";
	
	
	@BeforeTest(groups="Regression")
	public void tc1() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		driver.get(baseurl);
		Thread.sleep(5000);
	}
	
	@Test(groups="Regression")
	public void tc2()
	{
		//System.out.println(driver.getTitle());
		assertEquals("Facebook – log in or sign up",driver.getTitle());
		//Assert.assertEquals(driver.getTitle(),"Google");
	}
	
	@Test(groups="Regression")

	public void tc4() throws InterruptedException
	
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);
		//throw new SkipException("Skipped");
	}
	
	@AfterTest(dependsOnMethods= {"tc2"})
	public void tc3()
	{
		driver.quit();
	}

}
