//package Step;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class EBank {
//	
//	WebDriver driver;
//	
//	@Given("^user is already on login page$")
//	public void user_is_already_on_login_page() {
//		
//		WebDriverManager.chromedriver().setup();
//		//System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("https://demo.guru99.com/v4/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	}
//	
//	@Then("^user enter \"(.*)\" and \"(.*)\"$")
//	public void user_enter_username_and_password(String username, String password) {
//		
//		driver.findElement(By.name("uid")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//		
//	}
//	
//	@Then("^user click on login button$")
//	public void user_click_on_login_button() {
//		
//		driver.findElement(By.name("btnLogin")).click();
//		
//	}
//	
//	@Then("^user_click_on_new_custome_btn$")
//	public void user_click_on_new_custome_btn() {
//		
//		driver.findElement(By.xpath("//*[@class=\"menusubnav\"]/child::*[2]/child::*")).click();
//		
//	}
//	
//	@Then("^user_enter_the_info$")
//	public void user_enter_the_info() {
//		
//		driver.findElement(By.name("name"));
//		
//	}
//
//}
