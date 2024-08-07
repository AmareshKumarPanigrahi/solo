package genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver listenerdriver;
	
	
	@org.testng.annotations.BeforeClass
	public void BeforeClass()
	{
		
		driver=new ChromeDriver();
		listenerdriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.close();
	}

}
