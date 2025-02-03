package genericLibraies;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot takesscreenShot = (TakesScreenshot)BaseClass.driver;
		File src = takesscreenShot.getScreenshotAs(OutputType.FILE);
		File dest = new File(AutoConstant.photoPath+"failed"+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
