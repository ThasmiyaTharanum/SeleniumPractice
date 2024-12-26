package Test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ItestListener Interface which implements Testing Listeners
public class Listeners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("Succesfully executed"+ result.getName()); // with the help of result object we can make use of different methods 
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// response if test case is failed
		//screenshot code
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
	

}
