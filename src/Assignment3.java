import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String[]  ItemsNeeded = {"iphone X", "Blackberry", "Samsung Note 8", "Nokia Edge"};
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.xpath("//select[@class='form-control']/option[3]")).click();
		  // or can use below syntax for dropdown
		 //WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
         //Select dropdown = new Select(options);
         // dropdown.selectByValue("consult");
		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4[class='card-title']")));
		additems(driver,ItemsNeeded);
        driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
		
		
		
	}



public static void additems(WebDriver driver, String[] ItemsNeeded) {
	List<WebElement> AvailableProductsOnSite = driver.findElements(By.xpath("//h4[@class='card-title']"));
         int j=0;	
	for(int i=0;i<AvailableProductsOnSite.size();i++) {
		String AvailableProductNamesOnSite = AvailableProductsOnSite.get(i).getText();
		 List AddToCartProducts = Arrays.asList(ItemsNeeded);
		 
		if(AddToCartProducts.contains(AvailableProductNamesOnSite)) {
			 j++;
	     	driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
			 
			     if(j==ItemsNeeded.length) {
			    	 break;			    	 
		     }
		 }
			
	}
}
	
}
// code by instructor
//import java.time.Duration;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class Assignment2 {
//
//public static void main(String[] args) throws InterruptedException {
//

//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");//
//WebDriver driver=new ChromeDriver();
//driver.get("https://rahulshettyacademy.com/loginpagePractise/
//driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
//driver.findElement(By.id("password")).sendKeys("learning");
//driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
////Thread.sleep(3000);
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
//driver.findElement(By.id("okayBtn")).click();
//WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
//Select dropdown = new Select(options);
//dropdown.selectByValue("consult");
//driver.findElement(By.id("signInBtn")).click();
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
//
//List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
//
//for(int i =0;i<products.size();i++)
//{
//products.get(i).click();
//
//}
//
//driver.findElement(By.partialLinkText("Checkout")).click();}
//
//
//
//
//
//
//
//}