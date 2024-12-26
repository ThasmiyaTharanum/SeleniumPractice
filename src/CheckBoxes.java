import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		    driver.get("https://rahulshettyacademy.com/dropdownsPractise//");
		 //  System.out.println( driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		   Assert.assertFalse( driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		  
		   driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		  // System.out.println( driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		   Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		   
		//System.out.println( driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);

	}

}
