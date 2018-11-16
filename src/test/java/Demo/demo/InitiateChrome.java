package Demo.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InitiateChrome {
	
	@Test
	public void initiateDriver() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhishekpalsingh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();

		  driver.get("https://www.google.com");
		  
		  driver.close();

	}

}
