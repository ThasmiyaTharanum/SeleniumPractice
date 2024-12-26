//import java.util.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//public class Assignment7 {
//
//	public static void main(String[] args) {
//	
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//	
//		 
//		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr"));
//		List<WebElement> tableColumns = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/th"));           
//		
//		int rowsCount = tableRows.size();
//		int columnsCount = tableColumns.size();
//		String rowtext = tableRows.get(2).getText();
//
//			
//		System.out.println("Number of Rows : "+rowsCount+"\n"+"Number of columns : "+columnsCount+"\n"+"The text is: "+rowtext);
//		}
//		 
//
//	}
//Lecturer code
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

public static void main(String[] args) {

//System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("http://qaclickacademy.com/practice.php");
WebElement table=driver.findElement(By.id("product"));

System.out.println(table.findElements(By.tagName("tr")).size());

System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



System.out.println(secondrow.get(0).getText());
System.out.println(secondrow.get(1).getText());
System.out.println(secondrow.get(2).getText());

}

}
