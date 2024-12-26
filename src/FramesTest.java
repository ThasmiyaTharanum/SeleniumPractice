import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FramesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("http://jqueryui.com/droppable/");
     //   driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));// switch to frame using webelement
         System.out.println(driver.findElements(By.tagName("iframe")).size());//frame starts with iframe tagname always, to switch to frame using index just to get the count of frames on webpage
       driver.switchTo().frame(0);//switching to frame using index
         Actions a = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        a.dragAndDrop(source, target).build().perform();
        driver.switchTo().defaultContent();// this step will tell the selenium to come out of frame
        
        
	}

}
