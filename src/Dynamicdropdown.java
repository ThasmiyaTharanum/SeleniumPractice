import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		    driver.get("https://rahulshettyacademy.com/dropdownsPractise//");
		    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		    driver.findElement(By.xpath("//a[@value='BLR']")).click();
		    Thread.sleep(2000);
// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();// below step is alternate step for this step,if your lead asked not to use indexes then you can use parent child relationship 
 driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
 
  driver.findElement(By.className("ui-state-highlight")).click();
		                                
    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	 
	 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
		 System.out.println("is Enabled");
		 Assert.assertTrue(true);
		 
	 }else
	 {
		 Assert.assertFalse(true);
	 }
	    
	}

}
