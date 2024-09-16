package practiceTest;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ShadowRoot {

    @Test
    public void getShadowRoot()
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://books-pwakit.appspot.com/");
        driver.findElement(By.xpath("//book-app[@apptitle='BOOKS']")).getShadowRoot().findElement(By.cssSelector("input[id='input']")).sendKeys("hi");

       /* SearchContext sc=inputTxtField.;
        sc.findElement(By.cssSelector()).sendKeys("Hii");*/
    }
}
