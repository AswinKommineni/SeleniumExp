package Loan.NewCarLoan;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class NewCarRegistartion {
	@AfterMethod
	public void webRegistartion ()
	{
		System.out.println("New car Web Registartion");
		
	}
	@Test
	public void mobileRegistartion ()
	{
		System.out.println("New Car mobile Registartion");
		
	}

	@BeforeMethod
	public void apiRegistartion ()
	{
		System.out.println("New car api Registartion");
		
	}
	@Test
	public void  millageCar ()
	{
		System.out.println("Car Millage");
		
	}

}
