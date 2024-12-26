package Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {
 @Test
	public void MobileLogin() {
		System.out.println("Mobile");
	}
 @BeforeSuite
 public void suite1() {
		System.out.println("BeforeSuite");
	}
@BeforeMethod
public void Method1() {
	System.out.println("Beforemethod");
}
 @Test(timeOut = 40000)  // execution will wait for 40 seconds at this testcase
	public void Mobilelogout1() {
		System.out.println("Web1");
	}
 @Test(enabled = false)      // to skip the testcase if already known bug of this testcase
	public void Mobilelogout2() {
		System.out.println("Web2");
	}
 @Test(dependsOnMethods = {"MobileLogin"})  // first mobileLogin testcase executes and then mobilelogout3
	public void Mobilelogout3() {
		System.out.println("Web3");
	}
 @AfterMethod
 public void Method2() {
 	System.out.println("Aftermethod");
 }
 @Test(groups=("Smoke")) 
	public void UIAPILogin() {
		System.out.println("UIAPI");
	}
 @AfterSuite
 public void suite2() {
		System.out.println("AfterSuite");
	}

}

