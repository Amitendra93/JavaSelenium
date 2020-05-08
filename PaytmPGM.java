import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaytmPGM {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		//driver.manage().window().maximize();
		/*WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement clk =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Log In/Sign Up']")));
		clk.click();*/
		//driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div[3]/div[4]/div")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']")));
		driver.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("7378665402");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Amitendra012#");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		

	}

}
