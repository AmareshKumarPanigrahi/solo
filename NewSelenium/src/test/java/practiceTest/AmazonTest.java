package practiceTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	     driver.get("https://www.amazon.in/");
         List<WebElement> wbs=driver.findElements(By.xpath("//*[a]"));
         
         FileInputStream fis=new FileInputStream("./src/test/resources/SeleniumDemo.xlsx");
         
         Workbook book=WorkbookFactory.create(fis);
         Sheet sh=book.getSheet("Sheet1");
         
         for(int i=0;i<=wbs.size()-1;i++)
         {
        	 sh.createRow(i).createCell(1).setCellValue(wbs.get(i).getText());
        	 System.out.println(wbs.get(i).getText());
         }
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/SeleniumDemo.xlsx");
		book.write(fos);
		fos.flush();
		book.close();
		
		
		
		
		
		
		
	}

}
