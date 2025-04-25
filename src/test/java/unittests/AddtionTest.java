package unittests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import setup.AnnotationsConfigTest;

@Test(groups = "addition")
public class AddtionTest extends AnnotationsConfigTest {
	Calculator calc = new Calculator();
	SoftAssert sa = new SoftAssert();

	@Test(dataProvider = "suplyPositiveData", dataProviderClass = data.DataSupplier.class, 
			groups = {"positivetest", "smoke"})
	public void addPositiveNumbs(double a, double b) {
		double sum = calc.sum(a, b);
		sa.assertEquals(sum, (a + b));
	}

	@Test(dataProvider = "suplyNegativeData", dataProviderClass = data.DataSupplier.class, groups = {"negativetest", "sanity"})
	public void addNegativeNumbs(double a, double b) {
		double sum = calc.sum(a, b);
		sa.assertEquals(sum, (a + b));
	}
}
