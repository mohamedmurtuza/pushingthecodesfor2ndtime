package testing;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fun {

	@BeforeTest
	public void launch() {
		System.out.println("Before Test launch");
	}

	@Test(groups = { "regression" })

	public void thisIsForFun() {

		System.out.println("I am from differnt Package & i am in smoke group");

	}

}
