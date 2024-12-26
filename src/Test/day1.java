package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
   @AfterTest    //scope is in respective folder where it is defined  in xml file and will execute at last of folder
   public void waiting1() {
	System.out.println("I am Aftertest");	
}
	@Test(groups=("Smoke")) 
	public void Personalloan(){
	 	
	System.out.println("personal1");
	}
	@Test
	public void HomeLoan() {
		System.out.println("personal2");	
		
	}
//	@BeforeTest           // wherever it is defined it executes first
	public void waiting() {	
		
		
		System.out.println("I am beforetestday1");	
	}
	@Parameters({"URL","Key"})   //can also define multiple attributes
	@Test
	public void HomeLoan1(String urlname, String UserKey) {
		System.out.println("personal3");
		System.out.println(urlname);
		System.out.println(UserKey);
	}
	@Test
	public void HomeLoan2() {
		System.out.println("personal4");	
		
	}
}
