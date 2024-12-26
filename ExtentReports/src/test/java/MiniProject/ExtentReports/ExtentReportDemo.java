package MiniProject.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	ExtentReports extent;
	
	@BeforeTest
	public void config() {
	//ExtentReports, ExtentSparkReporter	
	  String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);	
	     reporter.config().setReportName("WebAutomation Results");
	     reporter.config().setDocumentTitle("Test Results");
	    
	     this.extent = new ExtentReports();
	     extent.attachReporter(reporter);
	     extent.setSystemInfo("Tester", "Thasmiya");
	     
	}
	
	@Test
	public void initialDemo() {
		ExtentTest test = extent.createTest("Intial Demo");
		WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com");
	System.out.println(driver.getTitle());
	driver.close();
	//test.fail("Results do not match");
	
	extent.flush();
	}
}
