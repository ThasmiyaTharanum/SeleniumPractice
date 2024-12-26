package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {
 @Test
	public void carloan() {
		System.out.println("carloan1");
	}
 
 @Test(groups=("Smoke"))              // wherever we define a tag smoke it executes as a group of testcases
 public void carloanType() {
		System.out.println("carloan2");
	}
 @BeforeTest           // wherever it is defined it executes first
	public void waiting() {	
		
		
		System.out.println("I am beforetest in day3");	
	}
 @BeforeClass
 public void class1() {
		System.out.println("BeforeClass");
	}
 @AfterClass
 public void class2() {
		System.out.println("AfterClass");
	}
}


