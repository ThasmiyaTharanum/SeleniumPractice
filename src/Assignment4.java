import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     WebDriver driver = new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/windows");
     driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
     Set<String> windows = driver.getWindowHandles();
     Iterator<String> it = windows.iterator();
     String ParentID = it.next();
     String childID = it.next();
     driver.switchTo().window(childID);
     System.out.println(driver.findElement(By.tagName("h3")).getText());
     driver.switchTo().window(ParentID);
     System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
	}

}
