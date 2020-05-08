
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ReadPropertyfile {

	@Test
	public void main() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		FileInputStream ip = new FileInputStream("C:\\Users\\Amitendra\\Java and Automation\\My Practice\\src\\ObjectRepo.properties");
		Properties prop=new Properties();
		prop.load(ip);
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(0);
		
		//source
	WebElement source=driver.findElement(By.xpath(prop.getProperty("dragable_box")));
	
	//destination
	WebElement destination=driver.findElement(By.xpath(prop.getProperty("dropable_box")));
	
	Actions act = new Actions(driver);
	
	//drag and drop
	act.dragAndDrop(source, destination).build().perform();

	}

}
