//package Step;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import PageObjects.LoginPage;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;
//
//public class Steps {
//	
//	public WebDriver driver;
//	public LoginPage lp;
//	
//	@Given("User Launch Chrome browser")
//	public void User_Launch_Chrome_browser() {
//		WebDriverManager.chromedriver().setup();
//		driver=new  ChromeDriver();
//		lp=new LoginPage(driver);
//	}
//	
//	@When("User open url \"(.*)\"")
//	public void user_open_url(String url) {
//		driver.get(url);
//	}
//	
//	@When("User enter Email as \"(.*)\" and Password as \"(.*)\"")
//	public void User_enter_Email_as_and_Password_as(String email, String password) {
//		lp.setUserName(email);
//		lp.setPassword(password);
//	    
//	}
//
//	@When("Click on Login")
//	public void Click_on_Login() {
//		lp.clickLogin();
//	    
//	}
//
//	@Then("Page Title Should be \"(.*)\"")
//	public void Page_Title_Should_be(String title) throws InterruptedException {
//		
//		if (driver.getPageSource().contains("Login was successful")) {
//			driver.close();
//			Assert.assertTrue(false);
//		}
//		else {
//			Assert.assertEquals(title, driver.getTitle());
//		}
//		
//	    
//	}
//
//	@When("User click on Log out link")
//	public void User_click_on_Log_out_link() {
//		lp.clickLogOut();
//	    
//	}
//
//	@Then("^close browser$")
//	public void close_browser() throws Throwable {
//		driver.quit();
//	   
//	}
//	
//	
//}
