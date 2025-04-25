package unittests;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = "multiplication")
public class MultiplicationTest {
	Calculator calc = new Calculator();

	@Test(dataProvider = "suplyPositiveData", dataProviderClass = data.DataSupplier.class, groups = "positivetest")
	public void multiPositiveNumbs(double a, double b) {
		double mult = calc.mult(a, b);
		Assert.assertEquals(mult, (a * b));
	}

	@Test(dataProvider = "suplyNegativeData", dataProviderClass = data.DataSupplier.class, groups = "negativetest")
	public void multiNegativeNumbs(double a, double b) {
		double mult = calc.mult(a, b);
		Assert.assertEquals(mult, (a * b));
	}
}
