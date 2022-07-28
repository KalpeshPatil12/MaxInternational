//package Step;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Amazon {
//
//WebDriver driver;
//	
//	@Given("^user is already on login page$")
//	public void user_is_already_on_login_page() {
//		
//		WebDriverManager.chromedriver().setup();
//		//System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
//	}
//	
//	@Then("^user click on electronic$")
//	public void user_click_on_electronic() throws InterruptedException {
//		driver.findElement(By.xpath("//*[text()=\" Electronics \"]")).click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,800)"," ");
//		Thread.sleep(5000);
//	}
//	
//	@Then("^user click on one plus icon$")
//	public void user_click_on_one_plus_icon() throws InterruptedException {
//		driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/child::*[5]/child::*[2]/child::*[2]/child::*/child::*")).click();
//		Thread.sleep(5000);
//	}
//	
//	@Then("^user_select_the_right_product$")
//	public void user_select_the_right_product() {
//		driver.findElement(By.xpath("//*[@class=\"s-main-slot s-result-list s-search-results sg-row\"]/child::*[2]/child::*/child::*/child::*/child::*/child::*[3]/child::*[1]/child::*/child::*")).click();
//	}
//}
//
