package practiceTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonTest {
	
	public static void main(String[] args) throws InterruptedException, Exception {


		/*EdgeOptions options=new EdgeOptions();
		options.addArguments("--guest");//to mute browser notifications
		WebDriver driver=new EdgeDriver(options);
		driver.manage().window().maximize();*/
		String price="";
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	     driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement searchbar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbar.sendKeys("toys", Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> wbNames=driver.findElements(By.xpath("//span[@data-component-type='s-search-results']//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		WebElement wbPrices=driver.findElement(By.xpath("//span[.='Future Shop Pack of 4 Elegant Soft Toys Combo Set Appu Elephant (25 cm), Penguin(20 cm), White Rabbit(28 cm), Setting Dog Mini (25cm) for Kids']/../../../../descendant::span[@class='a-offscreen']"));


Map<String,String> namevalue=new HashMap();

for (WebElement w:wbNames)
{
	String productName=w.getText();
	try {
		 price = driver.findElement(By.xpath("//span[.='" + productName + "']/../../../../descendant::span[@class='a-price-whole']")).getText();
		namevalue.put(productName,price);
	} catch (Exception e) {
	}
		continue;

}
		int num=1;
for(Map.Entry e:namevalue.entrySet())
{

	System.out.println(num+"."+e.getKey()+"--->"+e.getValue());
	System.out.println();
	num++;
}


		System.out.println(namevalue.size());

	}

}
