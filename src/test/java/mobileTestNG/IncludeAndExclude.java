package mobileTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IncludeAndExclude {

	@Test(dataProvider = "setData")
	public void mobileLogin(String n, String z) {

		System.out.println(n);
		System.out.println(z);

	}

	@Test(priority = 4)
	public void mobileLogOut() {
		System.out.println("mobileLogOut");
	}

	@Test(groups = { "regression" })
	public void mobileBrowse() {
		System.out.println("mobileBrowse");

	}

	@Test(dataProvider = "hello")
	public void mobilenum(int num) {

		System.out.println(num);
	}

	@Test(groups = { "regression" })
	public void webBrowse() {
		System.out.println("webBrowse");

	}

	@DataProvider(name = "setData")
	@Test
	public Object[][] getData() {

		Object[][] data = new Object[2][2];
		data[0][0] = "Murtuza";
		data[0][1] = "Asghar";
		data[1][0] = "Jabeen";
		data[1][1] = "Aiman";
		return data;

	}

	@DataProvider(name = "hello")
	@Test
	public Object[] age() {

		Object[] hey = new Object[5];

		hey[0] = 31;
		hey[1] = 39;
		hey[2] = 60;
		hey[3] = 70;
		hey[4] = 80;
		return hey;

	}
}
