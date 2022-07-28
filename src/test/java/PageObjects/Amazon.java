//package PageObjects;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class Amazon {
//
//public WebDriver ldriver;
//	
//	public Amazon(WebDriver rdriver)
//	{
//		ldriver=rdriver;
//		PageFactory.initElements(rdriver, this);
//	}
//	
//	@FindBy(xpath="//*[text()=\" Electronics \"]")
//	@CacheLookup
//	WebElement click;
//	
//	@FindBy(xpath="//*[@id=\\\"s-refinements\\\"]/child::*[5]/child::*[2]/child::*[2]/child::*/child::*")
//	@CacheLookup
//	WebElement bclick;
//	
//	@FindBy(xpath="//*[@class=\"s-main-slot s-result-list s-search-results sg-row\"]/child::*[2]/child::*/child::*/child::*/child::*/child::*[3]/child::*[1]/child::*/child::*")
//	@CacheLookup
//	WebElement pclick;
//	
//	public void btn() {
//		click.click();
//	}
//	
//	public void oplus() {
//		bclick.click();
//	}
//	
//	public void product() {
//		pclick.click();
//	}
//}
//
