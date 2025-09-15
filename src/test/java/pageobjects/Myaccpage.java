package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Myaccpage extends Basepage {

	public static Actions act;
	public Myaccpage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//a[text() = 'Logout']") WebElement logoutbtn;
	@FindBy(xpath = "//a[text() = 'Continue']") WebElement logoutcontinuebtn;
	@FindBy(xpath = "//input[@name = \"search\"]") WebElement searchfield;
	@FindBy(xpath = "//div[contains(@id ,'search')]/descendant::span") WebElement SearchButton;

	
	
	public void logoutbtnclick() {
		wait.until(ExpectedConditions.visibilityOf(logoutbtn));
		act.moveToElement(logoutbtn).perform();
		logoutbtn.click();
	}
	
	public void logoutcontinue() {
		logoutcontinuebtn.click();
	}
	
	public String searchinput(String searchvalue) {
		searchfield.sendKeys(searchvalue);
		return searchvalue;
	}
	
	public void searchbtnclick() {
		SearchButton.click();
	}
}
