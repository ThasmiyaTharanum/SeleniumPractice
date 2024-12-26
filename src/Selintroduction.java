import org.openqa.selenium.WebDriver;
//simport org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//package get imported automatically ,if clicked on 
//chromedriver object creation

public class Selintroduction{

	public static void main(String[] args) {
		// first goal is invoking browser
		//ChromeDriver driver1 = new ChromeDriver();
		//by creating object for this chrome driver class,this object have capability of accessing Webdriver 
		//implemented methods as well as personalchrome driver class methods also. 
//System.setProperty("webdriver.chrome.driver","C:\\Users\\thasm\\Downloads\\chromedriver-win64\\chromedriver-win64.exe" );
	//the above step provide your own step by downloading the file of that compatible chrome driver and making the chrome driver run.	
//  WebDriver driver = new ChromeDriver();
//then this driver will have knowledge of the methods only 
  //which webdriver implementation of chrome driver.
//System.setProperty("webdriver.geko.driver","C:\\Users\\thasm\\Downloads\\gekodriver-win64\\gekodriver-win64.exe" );
		WebDriver driver = new FirefoxDriver();
       driver.get("https://rahulshettyacademy.com/");
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
       driver.close();
       driver.quit();
       
       
  
      
	}

}
