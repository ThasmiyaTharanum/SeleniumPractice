import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopeOfDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://qaclickacademy.com/practice.php");
		 System.out.println(driver.findElements(By.tagName("a")).size());//to get the count of links present on webpage
		
		//limiting the scope just to get the count of links present in footer part
		 WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		 System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		 //limiting the scope of driver to first column just to get to know the count of links in column1 of footer
		 WebElement Columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    System.out.println(Columndriver.findElements(By.tagName("a")).size());
		 
	    //click on each link in the column and test that links are opening
	    for(int i =1;i<Columndriver.findElements(By.tagName("a")).size();i++) {
	    	
	    	    String ClickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
	    	
	    	Columndriver.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLink);
	    	Thread.sleep(5000);
	    	
	    }//opens all tabs
	    
	    Set<String> abc = driver.getWindowHandles(); //get all the windows IDs
	    Iterator<String> it = abc.iterator();     //stores all the window IDs
	    
	    while(it.hasNext()) {
	    	
	    	driver.switchTo().window(it.next());  //switch to each window and get title
	    	System.out.println(driver.getTitle());
	    }
	    
	    

	}

}
