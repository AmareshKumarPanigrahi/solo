package practiceTest;

import genericUtility.BaseClass;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class FlipkartSearchTest extends BaseClass {


    @Test(dataProvider="flipkartData")
    public void searchTest(String items) throws InterruptedException {
        driver.get("https://www.flipkart.com/");

        try {
            driver.findElement(By.xpath("//span[.='✕']")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }



        driver.findElement(By.name("q")).sendKeys(items,Keys.ENTER);
        Thread.sleep(2000);
    }


    @DataProvider
    public Object[] flipkartData()
    {
        Object[] obj=new Object[4];
        obj[0]="toys";
        obj[1]="iphone";
        obj[2]="tshirt";
        obj[3]="vivo";

        return obj;
    }

}
