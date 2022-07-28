package Step;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Login {

	
WebDriver driver;
	
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@When("^title of login page is Facebook$")
	public void title_of_login_page_is_Facebook() {
		
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	
	@Then("^user enter \"(.*)\" and \"(.*)\"$")
	public void user_enter_username_and_password(String username, String password) {
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
	}
	
	
	@Then("^user click on login button$")
	public void user_click_on_login_button() {
		
		driver.findElement(By.id("loginbutton")).click();
		
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		
		boolean ele=driver.findElement(By.xpath("//*[@class=\"a8c37x1j ms05siws l3qrxjdp b7h9ocf4\"]")).isDisplayed();
		
		System.out.println(ele);
		
	}
	
	@Then("^user close the browser$")
	public void user_close_the_browser() {
		
		driver.quit();
	}
}
