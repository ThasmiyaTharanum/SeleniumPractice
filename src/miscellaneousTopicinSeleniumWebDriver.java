import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class miscellaneousTopicinSeleniumWebDriver {

	public static void main(String[] args) throws IOException {
		 WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://google.com");
   driver.manage().deleteAllCookies(); //delete all cookies
   driver.manage().deleteCookieNamed("SessionKey"); //can delete single cookie with its name
           
   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   Files.copy(src,new File("D:\\screenshot.png")); //Files is used to copy the screenshot to local machine
	//FileUtils.copyFile(src,new File("D:\\screenshot.png")); for this Fileutils download jars from website 
	}

}
