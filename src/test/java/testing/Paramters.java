package testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramters {

	@Parameters({ "url" })
	@Test
	public void paramter(String urlname) {
		System.out.println("Before Test launch");
		System.out.println(urlname);
	}

	@Parameters({ "age", "url" })
	@Test
	public void dataTesting(String num, String url) {

		System.out.println("I am from differnt Package & i am in smoke group");
		System.out.println(num);
		System.out.println(url);

	}

}
