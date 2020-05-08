import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookPGM {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7378665402");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9926428461");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.switchTo().alert().dismiss();
		
		Thread.sleep(5000);
		
		driver.get("https://www.facebook.com/amitendra.sonu/friends?lst=100001394424759%3A100001394424759%3A1586103347&source_ref=pb_friends_tl");
		
		/*WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Amitendra']"))));
		driver.findElement(By.xpath("//span[text()='Amitendra']")).click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@data-tab-key='friends']"))));
		driver.findElement(By.xpath("//a[@data-tab-key='friends']")).click();*/
		
		//driver.switchTo().alert().dismiss();
		 while(true){
			   try {
			    ((JavascriptExecutor) driver).executeScript("scroll (0,1000000)");
			    Thread.sleep(5000);
			    System.out.println("Expanded Everything ");
			    break;
			   }catch(Throwable T){
			   System.out.println("Could not Expand ");
			   }
			 }
		 WebElement Box = driver.findElement(By.xpath(".//*[@id='pagelet_timeline_medley_friends']/div[2]"));
		  
		  List<WebElement> names= Box.findElements(By.tagName("a"));
		  System.out.println("Total Friends -- " + names.size());
		 
		  for(int j=0;j<names.size();j++){
		  String frnd = names.get(j).getText();
		  if(!frnd.trim().equals(""))
		  System.out.println(frnd);
		

	}

}
}
