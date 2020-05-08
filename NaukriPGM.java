import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriPGM {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		Set<String> allwindow= driver.getWindowHandles();
		Iterator<String> itr = allwindow.iterator();
		String parent =itr.next();
		String childwindow =itr.next();
		
		
		System.out.println(driver.switchTo().window(childwindow).getTitle());
		driver.close();

	}

}
