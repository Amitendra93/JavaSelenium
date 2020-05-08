import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_PGM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
		ArrayList<WebElement>total = new ArrayList<WebElement>(driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")));
		System.out.println("Total Items "+total.size());
		
		List<WebElement>name=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement>price=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		for(int i=0;i<=name.size();i++)
			
		{
			if(name.get(i).getText().equalsIgnoreCase("Birla Cable"))
			{
				System.out.println("Current prize of Birla Cable is- " +price.get(i).getText());
				break;
			}
				
		}
		
		

	}

}
