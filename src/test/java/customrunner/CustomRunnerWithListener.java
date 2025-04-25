package customrunner;

import java.util.ArrayList;

import org.testng.TestNG;

import listenerImplementation.CustomListen;

public class CustomRunnerWithListener {

	public static void main(String[] args) {
		TestNG testng = new TestNG();
		ArrayList<String> xmllist = new ArrayList<>();
		xmllist.add("src/test/resources/xmlrunners/run_positive_test.xml");
		testng.setTestSuites(xmllist);
		testng.addListener(new CustomListen());
		testng.run();
	}
}
