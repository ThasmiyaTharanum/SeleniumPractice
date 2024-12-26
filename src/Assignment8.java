import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));

		for(WebElement country:suggestions) {
			
			if(country.getText().equalsIgnoreCase("India")) {
				
			country.click();
			break;
			}
		}
		
	}

}
//Lecturer code
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class Assignment {
//
//public static void main(String[] args) throws InterruptedException {
//    WebDriver driver = new ChromeDriver();
//
//    driver.get("http://qaclickacademy.com/practice.php");
//
//    driver.findElement(By.id("autocomplete")).sendKeys("ind");
//
//    Thread.sleep(2000);
//
//    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//
//    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//
//   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
//
//}
//
//}
