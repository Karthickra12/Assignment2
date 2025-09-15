package testcases;

import org.testng.annotations.Test;

import pageobjects.Myaccpage;
import testbase.Baseclass;

public class Logouttests extends Baseclass {
	
	@Test
	public void logouttests() {
		
		Myaccpage mp = new Myaccpage(driver);
		mp.logoutbtnclick();
		mp.logoutcontinue();
		
	}
}
