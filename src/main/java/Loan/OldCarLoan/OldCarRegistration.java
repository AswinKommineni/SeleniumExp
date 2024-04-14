package Loan.OldCarLoan;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OldCarRegistration {
	@AfterTest
	public void webRegistartion ()
	{
		System.out.println("Old car Web Registartion");
		
	}
	@Test
	public void mobileRegistartion ()
	{
		System.out.println("Old car mobile Registartion");
		
	}

	@BeforeTest
	public void apiRegistartion ()
	{
		System.out.println("Old Car api Registartion");
		
	}

}
