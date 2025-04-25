package unittests;

import org.testng.Assert;
import org.testng.annotations.Test;

import setup.AnnotationsConfigTest;

@Test(groups = "division")
public class DivisionTest extends AnnotationsConfigTest {

	Calculator calc = new Calculator();

	@Test(dataProvider = "suplyPositiveData", dataProviderClass = data.DataSupplier.class, groups = "positivetest")
	public void divPositiveNumbs(double a, double b) {
		double div = calc.div(a, b);
		Assert.assertEquals(div, (a / b));
	}

	@Test(dataProvider = "suplyNegativeData", dataProviderClass = data.DataSupplier.class, groups = "negativetest")
	public void divNegativeNumbs(double a, double b) {
		double div = calc.div(a, b);
		Assert.assertEquals(div, (a / b));
	}

	@Test(expectedExceptions = NumberFormatException.class)
	public void divbyzero1() {
		double div = calc.div(1, 0);
	}

	@Test
	public void divbyzero2() {
		double div = calc.div(1, 0);
	}
}
