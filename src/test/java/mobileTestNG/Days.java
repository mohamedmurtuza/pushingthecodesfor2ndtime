package mobileTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Days {
	@BeforeTest
	public void iam() {
		System.out.println("Before Test");
	}

	@BeforeSuite
	public void sute() {
		System.out.println("Before Suite");
	}

	/*
	 * @Parameters({ "gender" })
	 * 
	 * @BeforeMethod public void Month(String Gender) {
	 * System.out.println("Welcom to the New World"); System.out.println("Male"); }
	 */

	@AfterClass
	public void last() {
		System.out.println("I will be the last Class");
	}

	@AfterTest
	public void no() {
		System.out.println("After Test");
	}

	@Test(groups = { "regression" })
	public void firstDay() {
		System.out.println("Sunday");
	}

	@Test(dependsOnMethods = { "firstDay" })
	public void secondDay() {
		System.out.println("Monday");
	}

	@Test
	public void ThirdDay() {
		System.out.println("Tuesday");
	}

	@Test
	public void fourtDay() {
		System.out.println("Wednesday");
	}

	@BeforeClass
	public void clas() {
		System.out.println("Before Class");
	}

	@Test(dataProvider = "Hello")
	public void fifthDay(int num, int no) {
		System.out.println("Thursday");
		System.out.println(num);
		System.out.println(no);
	}

	@Test
	public void sixthDay() {
		System.out.println("Friday");
	}

	@Test
	public void LastDay() {
		System.out.println("Saturday");
	}

	@AfterMethod
	public void GoodDay() {
		System.out.println("GoodBye");
	}

	@AfterSuite
	public void lastSuite() {
		System.out.println("After Suite");
	}

	@DataProvider(name = "Hello")
	@Test
	public Object[][] giveData() {
		Object[][] o = new Object[2][2];
		o[0][0] = 1;
		o[0][1] = 2;
		o[1][0] = 3;
		o[1][1] = 4;
		return o;
	}

}
