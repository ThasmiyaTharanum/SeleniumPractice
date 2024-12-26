import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment6 {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://qaclickacademy.com/practice.php");
		 driver.findElement(By.id("checkBoxOption3")).click();
		String text = driver.findElement(By.cssSelector("label[for='honda']")).getText();
		//System.out.println(text);
		  WebElement Dropdown = driver.findElement(By.id("dropdown-class-example"));
		  Select textDropdown = new Select(Dropdown);
		  textDropdown.selectByVisibleText(text);
		  driver.findElement(By.id("name")).sendKeys(text);
		  driver.findElement(By.id("alertbtn")).click();
		String alertmsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		//System.out.println(alertmsg);
	   if(alertmsg.contains(text)) {
		    System.out.println("The grabbed text of checkbox is present in alertmsg and the grabbed text is "+ text);
	   }else {
		   System.out.println("The grabbed text of checkbox is not present in alertmsg");
	   }
		
		  
				  

	}

}
