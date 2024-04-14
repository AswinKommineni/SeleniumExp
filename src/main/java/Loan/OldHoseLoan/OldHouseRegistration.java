package Loan.OldHoseLoan;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OldHouseRegistration {
	@AfterClass
	public void webRegistartion ()
	{
		System.out.println("Old House Web Registartion");
		
	}
	@Test
	public void mobileRegistartion ()
	{
		System.out.println("old House mobile Registartion");
		
	}

	@BeforeClass
	public void apiRegistartion ()
	{
		System.out.println("old house api Registartion");
		
	}

}
