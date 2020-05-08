import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YahooPGM {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/account/create?.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com&src=fpctx&specId=yidReg");
		WebElement wb = driver.findElement(By.xpath("//select[@id='usernamereg-month']"));
		Select s = new Select(wb);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("4");
		Thread.sleep(2000);
		s.selectByVisibleText("March");
	}

}
