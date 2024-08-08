package practiceTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class DataProviderTest extends BaseClass{
	
	@Test(dataProvider="dataSupplier")
	public  void testingamazonSearchTest(String items) throws InterruptedException
	
	{
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement searchbar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbo']"));
		
		searchbar.sendKeys(items,Keys.ENTER);
		Thread.sleep(3000);
		System.out.println("ass");
		
		
		
	}
	
	
	
	
	
	
	
	@DataProvider
	public Object[] dataSupplier()
	{
		Object[] obj=new Object[4];
		obj[0]="toys";
		obj[1]="iphone";
		obj[2]="tshirt";
		obj[3]="vivo";
		
		return obj;
	}

}
