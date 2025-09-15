package testcases;

import org.testng.annotations.Test;

import pageobjects.Loginpage;
import pageobjects.Myaccpage;
import pageobjects.Registerpage;
import pageobjects.Searchpage;
import testbase.Baseclass;

public class Searchtests extends Baseclass {

	@Test(priority =1)
	public void searchinput() throws InterruptedException {
		
		Loginpage lp = new Loginpage(driver);
		lp.myaccbtnclick();
		lp.loginbtnclick();
		lp.logininputenter();
		lp.logininputenterpass(prop.getProperty("password"));
		lp.loginbtnclick1();
		
		Registerpage rts = new Registerpage(driver);
		rts.myacctitldisplay();		
		
		Myaccpage mpe = new Myaccpage(driver);
		mpe.searchinput(prop.getProperty("searchinput"));
		mpe.searchbtnclick();
		
		Searchpage sp = new Searchpage(driver);
		sp.productclick();
		sp.quantity();
		sp.macprice();
		sp.addtocartclick();
		sp.successmsgdisplay();
		sp.carttotalclick();
		sp.checxkouttopclick();
		Thread.sleep(10);
		sp.totalprice();
		System.out.println("Total Price displayed");
		sp.finalcheckoutclick();
		System.out.println("Total Checkout page opened");
		lp.myaccbtnclick();
		lp.logoutbtnclick1();
		
	}
	
	@Test(priority = 2,dependsOnMethods = "searchinput")
	public void logout() {
		Loginpage lp = new Loginpage(driver);
		lp.myaccbtnclick();
		lp.logoutbtnclick1();
	}
	
	
}
