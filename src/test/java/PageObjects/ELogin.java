//package PageObjects;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class ELogin {
//	
//public WebDriver ldriver;
//	
//	public ELogin(WebDriver rdriver)
//	{
//		ldriver=rdriver;
//		PageFactory.initElements(rdriver, this);
//	}
//	
//	@FindBy(name="uid")
//	@CacheLookup
//	WebElement txtEmail;
//	
//	@FindBy(name="password")
//	@CacheLookup
//	WebElement txtPassword;
//	
//	@FindBy(name="btnLogin")
//	@CacheLookup
//	WebElement btnLogin;
//	
//	@FindBy(xpath="//*[@class=\"menusubnav\"]/child::*[2]/child::*")
//	@CacheLookup
//	WebElement btnAddCust;
//	
//	@FindBy(name="name")
//	@CacheLookup
//	WebElement cname;
//	
//	public void setUserName(String uname) {
//		txtEmail.sendKeys(uname);
//	}
//	
//	public void setPassword(String pwd) {
//		//txtPassword.clear();
//		txtPassword.sendKeys(pwd);
//	}
//	
//	public void clickLogin() {
//		btnLogin.click();
//	}
//	
//	public void clickAddCust() {
//		btnAddCust.click();
//		
//	}
//	
//	public void cname() {
//		cname.sendKeys("Ram");
//	}
//
//}
