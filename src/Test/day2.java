package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day2 {
	
 @Test(dataProvider ="getdata")
	public void Homeloan(String username, String password) { // passing two arguments
		System.out.println(username);
		System.out.println(password);
	}
 @DataProvider
 public Object[][] getdata() {
		
		Object[][] data = new Object[3][2];  //multi dimensional array 3 rows and 2 columns
		//1st set
		data[0][0]="first username";
		data[0][1]="first password";
		//2nd set
		data[1][0]="second username";
		data[1][1]="second password";
		//3rd set
		data[2][0]="third username";
		data[2][1]="third password";
		return data;
	}
}
