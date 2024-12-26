import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
    Select DropDown = new Select(StaticDropdown);
    DropDown.selectByIndex(3);
    System.out.println(DropDown.getFirstSelectedOption().getText());
    DropDown.selectByVisibleText("AED");
    System.out.println(DropDown.getFirstSelectedOption().getText());
    DropDown.selectByValue("INR");
    System.out.println(DropDown.getFirstSelectedOption().getText());
   
    
	}

}
