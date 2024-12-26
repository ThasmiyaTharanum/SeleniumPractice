import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Thasmiya Tharanum");
		driver.findElement(By.name("email")).sendKeys("thasmiyatharanum@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Tharanum@123");
		driver.findElement(By.id("exampleCheck1")).click();
//		driver.findElement(By.id("exampleFormControlSelect1")).click();
		WebElement GenderDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select Dropdown = new Select(GenderDropdown);
		Dropdown.selectByIndex(1);
		driver.findElement(By.cssSelector("#inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("14/05/2000");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		

	}

}
