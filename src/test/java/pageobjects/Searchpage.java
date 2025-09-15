package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Searchpage extends Basepage{
	
	public static Actions act;
	public Searchpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[text() = 'MacBook Air']") WebElement macbookairtitle;
	@FindBy(xpath = "//input[@name = \"quantity\"]") WebElement quantity;
	@FindBy(xpath = "//button[@id= \"button-cart\"]") WebElement Addtocartbtn;
	@FindBy(xpath = "//div[@id = \"content\"]/descendant::h2[2]") WebElement priceofMAC;
	@FindBy(xpath = "//div[contains(@class,'alert-success') and contains(text(),'Success: You have added')]")
	WebElement Addtocartsuccessmsg;
	@FindBy(xpath = "//div[@id = 'cart']//button[@type = 'button']") WebElement carttotalboxsymbol;
	@FindBy(xpath = "//div[@id='cart']/button[@type='button' and @data-toggle='dropdown']") WebElement carttotalbox;
	@FindBy(xpath = "//table[@class='table table-bordered']//td[text()='$2,404.00']") WebElement shoppingcarttableprice;
	@FindBy(xpath = "//div[@id = \"cart\"]/descendant::p/descendant::a[2]") WebElement homewizardcheckout ;
	@FindBy(xpath = "//a[contains(@title , 'Checkout')]") WebElement Topmenucheckout;
	@FindBy(xpath = "//a[text() = \"Checkout\"]") WebElement checkoutfinalbtn;
	
	public void productclick() {
		macbookairtitle.click();
	}
	
	public void quantity() {
		quantity.clear();
		quantity.sendKeys("2");
	}
	
	public void addtocartclick() {
		Addtocartbtn.click();
	}
	
	public void macprice() {
		String price = priceofMAC.getText();
		System.out.println("Price of MACbook air: " + price);
	}
	
	public void successmsgdisplay() {
		/*if(wait.until(ExpectedConditions.presenceOfElementLocated((By) Addtocartsuccessmsg)).isDisplayed()) {
			System.out.println("Product Successfully added to cart");
		}*/
		if(Addtocartsuccessmsg.isDisplayed()) {
			System.out.println("Product Successfully added to cart");
		}
	}
	
	public void carttotalclick() {
		wait.until(ExpectedConditions.elementToBeClickable(carttotalboxsymbol));
		act.moveToElement(carttotalboxsymbol).click().perform();
		//carttotalboxsymbol.click();
	}
	
	public String totalprice() {
		String totalpriceafterquantity = shoppingcarttableprice.getText();
		System.out.println("Total Price of After Quantity increased: "+ totalpriceafterquantity);
		return totalpriceafterquantity;
	
		
	};
	
	public void checxkouttopclick() {
		wait.until(ExpectedConditions.visibilityOf(Topmenucheckout));
		wait.until(ExpectedConditions.elementToBeClickable(Topmenucheckout));
		act.moveToElement(Topmenucheckout);
		act.doubleClick(Topmenucheckout);
		//Topmenucheckout.click();
	}
	
	public void checkbtnclick() {
		homewizardcheckout.click();
	}
	
	public void finalcheckoutclick() {
		checkoutfinalbtn.click();
	}
	
	
}
