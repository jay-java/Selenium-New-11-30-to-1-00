package basic;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class P004_depency {
	@Test
	public void createAccount() {
		System.out.println("create account");
		assertFalse(false);
	}

	@Test(dependsOnMethods = "createAccount")
	public void login() {
		System.out.println("login");
	}

	@Test(dependsOnMethods = "login")
	public void addtoCart() {
		System.out.println("addto cart");
	}

	@Test(dependsOnMethods = "addtoCart")
	public void paymnet() {
		System.out.println("payment");
	}
}
