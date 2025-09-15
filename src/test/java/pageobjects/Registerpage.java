package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends Basepage {
	
	public Registerpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id = 'input-firstname']") WebElement firstnamefield;
	@FindBy(xpath = "//input[@id = 'input-lastname']") WebElement lastnamefield;
	@FindBy(xpath = "//input[@id = 'input-email']") WebElement emailfield;
	@FindBy(xpath = "//input[@id = 'input-telephone']") WebElement Phonenumber;
	@FindBy(xpath = "//input[@id = 'input-password']") WebElement passwordfield;
	@FindBy(xpath = "//input[@id = 'input-confirm']") WebElement confirmpasswordfield;
	@FindBy(xpath = "//input[@type = 'checkbox']") WebElement policycheckbox;
	@FindBy(xpath = "//input[@type = 'submit'][@value = 'Continue']") WebElement submitbtn;
	@FindBy(xpath = "//a[text() =\"Continue\"]") WebElement finalcontinuebtn;
	@FindBy(xpath = "//h2[text() = 'My Account']") WebElement Myacctitledisplay;
	
	public String firstname(String Firstname) {
		firstnamefield.sendKeys(Firstname);
		return Firstname;
	}
	public String lastname(String Lastname) {
		lastnamefield.sendKeys(Lastname);
		return Lastname;
	}
	
	public String emailid(String emailid) {
		emailfield.sendKeys(emailid);
		return emailid;
	}
	
	public String Phonenumberfield(String Mobilenum) {
		Phonenumber.sendKeys(Mobilenum);
		return Mobilenum;
	}
	
	public String password(String password) {
		passwordfield.sendKeys(password);
		return password;
	}
	
	public String confirmpassword(String confirmpassword) {
		confirmpasswordfield.sendKeys(confirmpassword);
		return confirmpassword;
	}
	
	public void policybox() {
		policycheckbox.click();
	}
	
	public void Registersubmit() {
		submitbtn.click();
	}
	
	public void Finalcontinueclick() {
		finalcontinuebtn.click();
		
		if(Myacctitledisplay.isDisplayed()) {
			System.out.println("Registration is Successful");
		}
	}
	
	public boolean myacctitldisplay() {
		boolean display  = Myacctitledisplay.isDisplayed();
		System.out.println("My Account Title is: " + display);
		return display;
		
	}
	
	
	
	

}
