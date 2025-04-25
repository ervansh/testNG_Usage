package listenerImplementation;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListen implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Starting test: " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed: " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed: " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped: " + result.getMethod().getMethodName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Beginning Test Execution: " + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Finished Test Execution: " + context.getName());
	}
}
