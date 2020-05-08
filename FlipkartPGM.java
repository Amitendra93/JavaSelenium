import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPGM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='container']/div/div[2]/div/ul/li/span")).click();
		driver.findElement(By.xpath("//a[@title='Smart Watches']")).click();
		driver.findElement(By.xpath("//span[text()='1973 MORE']")).click();
		ArrayList<WebElement> totalcheck=new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='GEQwJk']")));
		System.out.println("total no. of checkboxes are   " +totalcheck.size());

	}

}
