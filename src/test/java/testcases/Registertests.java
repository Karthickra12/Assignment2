package testcases;

import org.testng.annotations.Test;

import pageobjects.Loginpage;
import pageobjects.Registerpage;
import testbase.Baseclass;

public class Registertests extends Baseclass{

	@Test(groups = "register", priority = 1)
	public void registertests() {
		
		Loginpage lp = new Loginpage(driver);
		lp.myaccbtnclick();
		lp.registerbtnclick();
		
		Registerpage rp = new Registerpage(driver);
		
		String firstname =  Randomfirstname();
		String lastname = Randomlastname();
		String emailid = Randomemail();
		rp.firstname(firstname);
		rp.lastname(lastname);
		rp.emailid(emailid);
		
		TestDataStore.registerdemailid = emailid;
		System.out.println("Registeremailid is:" + emailid);
		
		rp.Phonenumberfield(prop.getProperty("mobilenum"));
		rp.password(prop.getProperty("password"));
		rp.confirmpassword(prop.getProperty("password"));
		

		rp.policybox();
		rp.Registersubmit();
		rp.Finalcontinueclick();
		
	}
	
}

