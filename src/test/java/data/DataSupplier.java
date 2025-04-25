package data;

import org.testng.annotations.DataProvider;

public class DataSupplier {

	@DataProvider(name = "suplyPositiveData")
	public Object[][] suplyPositiveData() {
		return new Object[][] { { 2, 5 }, { 12, 78 }, { 4, 1 } };
	}

	@DataProvider(name = "suplyNegativeData")
	public Object[][] suplyNegativeData() {
		return new Object[][] { { -2, -5 }, { -12, 78 }, { 4, -1 } };
	}
}
