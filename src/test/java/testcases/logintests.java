package testcases;

import org.testng.annotations.Test;

import pageobjects.Loginpage;
import pageobjects.Registerpage;
import testbase.Baseclass;

public class logintests extends Baseclass{

	@Test(dependsOnMethods = {"testcases.Registertests.registertests"}, priority = 1)
	public void logintest() {
		
		Loginpage lp = new Loginpage(driver);
		lp.myaccbtnclick();
		lp.loginbtnclick();
		lp.logininputenter();
		lp.logininputenterpass(prop.getProperty("password"));
		lp.loginbtnclick1();
		
		Registerpage rts = new Registerpage(driver);
		rts.myacctitldisplay();
		
		
	}
}
