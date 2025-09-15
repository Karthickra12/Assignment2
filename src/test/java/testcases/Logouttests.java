package testcases;

import org.testng.annotations.Test;

import pageobjects.Loginpage;
import pageobjects.Myaccpage;
import testbase.Baseclass;

public class Logouttests extends Baseclass {
	
	@Test (dependsOnMethods = {"testcases.logintests.logintest"} )
	public void logouttests() {
		
		Loginpage lp = new Loginpage(driver);
		lp.myaccbtnclick();
		lp.loginbtnclick();
		lp.logininputenter();
		lp.logininputenterpass(prop.getProperty("password"));
		lp.loginbtnclick1();
		
		Myaccpage mp = new Myaccpage(driver);
		mp.logoutbtnclick();
		mp.logoutcontinue();
		System.out.println("Logout was successful");

		
	}
}
