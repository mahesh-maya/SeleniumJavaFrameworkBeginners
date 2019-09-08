package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("******Test Started : "+result.getName());
		
	}
	
public void onTestSuccess(ITestResult result) {
	System.out.println("******Test is Successful : "+result.getName());
	}

public void onTestFailure(ITestResult result) {
	System.out.println("******Test Failed : "+result.getName());
}

public void onTestSkipped(ITestResult result) {
	System.out.println("******Test Skipeed : "+result.getName());
}

public void onTestFailureButWithinSuccessPercentage(ITestResult result) {
	
}
public void onStart(ITestContext context) {
	
}

public void onTestFinish(ITestContext context) {
	System.out.println("******Test Completed : "+context .getName());
}

}
 