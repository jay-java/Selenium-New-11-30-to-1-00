package basic;

import org.testng.annotations.Test;

public class P002Priority {
	@Test(priority = 1)
	public void createAccount() {
		System.out.println("create accounot");
	}
	@Test(priority = 2,expectedExceptions = ArithmeticException.class)
	public void login() {
		int i = 10/0;
		System.out.println("login : "+i);
	}
	@Test(priority = 3)
	public void searchProduct() {
		System.out.println("search product");
	}
	@Test(priority = 4,enabled = false)
	public void addtoCart() {
		System.out.println("add to cart");
	}
	@Test(priority = 5)
	public void payment() {
		System.out.println("payment");
	}
}
