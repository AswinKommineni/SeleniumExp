package Loan.HouseLoan;

import org.testng.annotations.Test;

public class Example2 {
	@Test
	public void m1() {
		System.out.println("Iam M1");
	}
	@Test(dependsOnMethods= {"m4"})
	public void m2() {
		System.out.println("Iam M2");
	}
	@Test
	public void m3() {
		System.out.println("Iam M3");
	}
	@Test
	public void m4() {
		System.out.println("Iam M4");
	}
	@Test
	public void m5() {
		System.out.println("Iam M5");
	}
}