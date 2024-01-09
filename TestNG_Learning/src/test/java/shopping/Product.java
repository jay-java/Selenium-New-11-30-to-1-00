package shopping;

import org.testng.annotations.Test;

public class Product {
	@Test(groups = "purchase")
	public void searchProdcut() {
		System.out.println("search product");
	}
	@Test(groups = {"purchase","smoke"})
	public void addTOCart() {
		System.out.println("add to cart");
	}
	@Test(groups = "smoke")
	public void compare() {
		System.out.println("compare");
	}
	@Test
	public void wishList() {
		System.out.println("wiushlist");
	}
}

