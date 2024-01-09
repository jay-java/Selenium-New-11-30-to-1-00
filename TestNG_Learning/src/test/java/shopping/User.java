package shopping;

import org.testng.annotations.Test;

public class User {
	@Test
	public void CA() {
		System.out.println("create acount");
	}
	@Test(groups = "purchase")
	public void login() {
		System.out.println("login");
	}
	@Test(groups = "smoke")
	public void forgotPasswortd() {
		System.out.println("forgot pass");
	}
	@Test
	public void logout() {
		System.out.println("logout");
	}
}
