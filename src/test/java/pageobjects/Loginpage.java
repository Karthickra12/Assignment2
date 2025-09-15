package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testcases.TestDataStore;

public class Loginpage extends Basepage {

	
	public Loginpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[contains(@title, \"My Account\")]") WebElement Myaccbtn;
	@FindBy(xpath = "//a[text() = 'Register']") WebElement registerbtn;	
	@FindBy(xpath = "//a[text() = 'Login']") WebElement Loginbtn;
	@FindBy(xpath = "//input[@id = \"input-email\"]") WebElement loginmailinputfield;
	@FindBy(xpath = "//input[@id = \"input-password\"]") WebElement loginpassinpuitfield;
	@FindBy(xpath = "//input[@type = \"submit\"]") WebElement Loginbutton;
	@FindBy(xpath = "//ul[@class = \"list-inline\"]//ul//li[5]/a") WebElement homelogoutbtn;
	@FindBy(xpath = "//div[@class = \"buttons\"]//a") WebElement logoutcontinueclick;
	
	public void myaccbtnclick() {
		Myaccbtn.click();
	}
	
	public void loginbtnclick() {
		Loginbtn.click();
	}
	
	public void registerbtnclick() {
		registerbtn.click();
	}

	public void logininputenter() {
		loginmailinputfield.sendKeys(TestDataStore.registerdemailid);
	}
	
	public void logininputenterpass(String password) {
		loginpassinpuitfield.sendKeys(password);
	}
	
	public void loginbtnclick1() {
		Loginbutton.click();
	}
	
	public void logoutbtnclick1() {
		homelogoutbtn.click();
		logoutcontinueclick.click();
		System.out.println("Logout Was Successful");
	}
	
	
	
}
