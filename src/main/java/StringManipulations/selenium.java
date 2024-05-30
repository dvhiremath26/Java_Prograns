package StringManipulations;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class selenium {

	public static void main(String[] args)  {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		 try {
	            // Navigate to the desired web page
	            driver.get("https://google.com");

	            // Cast driver to TakesScreenshot
	            TakesScreenshot screenshot = (TakesScreenshot) driver;

	            // Capture the screenshot and store it as a file
	            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

	            // Define the destination file path
	            String filePath = "screenshot.png";
	            File destFile = new File(filePath);

	            // Copy the source file to the destination file
	            FileUtils.copyFile(srcFile, destFile);

	            System.out.println("Screenshot saved successfully at " + destFile.getAbsolutePath());

	        } catch (IOException e) {
	            e.printStackTrace();
	            System.out.println("Failed to save screenshot due to IOException.");
	        } finally {
	            // Close the browser
	            driver.quit();
	        }

		

	}

}
