package setup;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

/**
 * Implement all your requirement in the respective methods. These are just
 * dummy.
 */
public class AnnotationsConfigTest{

	@BeforeSuite
	public void setupSuite() {
		System.out.println("Before suite execution...");
	}

	@BeforeTest
	public void setupTest() {
		System.out.println("Before Test execution...");
	}

	@BeforeClass
	public void setupClass() {
		System.out.println("Before class execution...");
	}

	@BeforeMethod
	public void setupM() {
		System.out.println("Before method execution...");
	}

	@AfterMethod
	public void tearDownM() {
		System.out.println("After method execution...");
	}

	@AfterClass
	public void tearDownClass() {
		System.out.println("After class execution...");
	}

	@AfterTest
	public void tearDownTest() {
		System.out.println("After test execution...");
	}

	@AfterSuite
	public void tearDownSuite() {
		System.out.println("After suite execution...");
	}
	SoftAssert sa = new SoftAssert();
	Assertion a = new Assertion();
}
