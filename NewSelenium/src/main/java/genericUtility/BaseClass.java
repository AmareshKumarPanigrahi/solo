package genericUtility;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;


public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver listenerdriver;
	
	
	@org.testng.annotations.BeforeClass
	public void BeforeClass()
	{

		String browser=System.getProperty("browser");
		String env=System.getProperty("env");

		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
			listenerdriver = driver;

		}
		else if(browser.equals("edge"))
		{
			driver = new EdgeDriver();
			listenerdriver = driver;

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public  void close()
	{
		driver.close();
	}

}
