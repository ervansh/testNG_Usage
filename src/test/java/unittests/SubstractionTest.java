package unittests;

import org.testng.Assert;
import org.testng.annotations.Test;

import customcode.Calculator;
import setup.AnnotationsConfigTest;

@Test(groups = "substraction")
public class SubstractionTest extends AnnotationsConfigTest {

	Calculator calc = new Calculator();

	@Test(dataProvider = "suplyPositiveData", dataProviderClass = data.DataSupplier.class, groups = {"positivetest", "smoke"})
	public void subPositiveNumbs(double a, double b) {
		System.out.println("smoke from substraction class");
		double sub = calc.sub(a, b);
		Assert.assertEquals(sub, (a - b));
	}

	@Test(dataProvider = "suplyNegativeData", dataProviderClass = data.DataSupplier.class, groups = {"negativetest", "sanity"})
	public void subNegativeNumbs(double a, double b) {
		System.out.println("sanity from substraction class");
		double sub = calc.sub(a, b);
		Assert.assertEquals(sub, (a - b));
	}
}
