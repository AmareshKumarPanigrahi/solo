package genericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplememntation implements ITestListener {
	
	

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String methodname=result.getMethod().getMethodName();
		System.out.println(methodname+" -"+" Test Execution started ");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String methodname=result.getMethod().getMethodName();
		TakesScreenshot ts=(TakesScreenshot)BaseClass.listenerdriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./src/test/java/"+methodname+".png");
		try {
			FileUtils.copyFile(src, trg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
