package genericUtility;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.TestNG;
import org.testng.annotations.*;


public class BaseClass {
	
	public WebDriver driver;
	public WebDriver listenerdriver;

	static String browser="chrome";
	@org.testng.annotations.BeforeClass
	public void BeforeClass()
	{

//		String browser=System.getProperty("browser");
//		String env=System.getProperty("env");




		if(browser.equals("chrome")) {
			driver = new ChromeDriver();


		}
		else if(browser.equals("edge"))
		{
			driver = new EdgeDriver();


		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ListenerImplememntation listener = new ListenerImplememntation(driver);
		TestNG testng = new TestNG();
		testng.addListener(listener);
	}
	
	@AfterClass
	public  void close()
	{
		driver.close();
	}

}
