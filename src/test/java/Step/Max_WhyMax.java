package Step;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Max_WhyMaxPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Max_WhyMax {
	
	WebDriver driver;
    public Max_WhyMaxPage lp;
    
    @Given("user enter the url {string}")
    public void user_enter_the_url (String url) {
		
	   WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lp = new Max_WhyMaxPage(driver);
		driver.navigate().to(url);
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  
	}
    
    @When("I select the location as Australia")
    public void I_select_the_location_as_Australia() {
    	lp.clickAustraliaLocation();
    }
    
    @Then("I verify user is able to see Why Max option")
    public void I_verify_user_is_able_to_see_Why_Max_option() {
    	Assert.assertTrue(lp.verifyWhyMaxOption());
    }
    
    @When("I click on Why Max option")
    public void I_click_on_Why_Max_option() {
    	lp.clickWhyMaxOption();
//    	JavascriptExecutor js=(JavascriptExecutor) driver;		
//		js.executeScript("window.scrollBy(0, 2000)", "");
    }
    
    @Then("I verify I am in on Why Max page")
    public void I_verify_I_am_in_on_Why_Max_page() {
    	Assert.assertTrue(lp.verifyWhyMaxPage());
    }
    
    @Then("I verify the max difference option is displayed")
    public void I_verify_the_max_difference_option_is_displayed() {
    	Assert.assertTrue(lp.verifyMaxDifferenceOption());
    }
    
    @When("I click on max difference option")
    public void I_click_on_max_difference_option() {
    	lp.clickMaxDifferenceOption();
    }
    
    @Then("I verify Max difference page is loaded")
    public void I_verify_Max_difference_page_is_loaded() {
    	Assert.assertTrue(lp.verifyMaxDifferencePage());
    }
    
    @Then("I verify Science option is displayed")
    public void I_verify_Science_option_is_displayed() {
    	Assert.assertTrue(lp.verifyScienceOption());
    }
    
    @When("I click on Science option")
    public void I_click_on_Science_option() {
    	lp.clickScienceOption();
    }
    
    @Then("I verify Science page is loaded")
    public void I_verify_Science_page_is_loaded() {
    	Assert.assertTrue(lp.verifySciencePage());
    }
    
    @Then("I verify Company option is displayed")
    public void I_verify_Company_option_is_displayed() {
    	Assert.assertTrue(lp.verifyCompanyOption());
    }
    
    @When("I click on Company option")
    public void I_click_on_Company_option() {
    	lp.clickCompanyOption();
    }
    
    @Then("I verify Company page is loaded")
    public void I_verify_Company_page_is_loaded() {
    	Assert.assertTrue(lp.verifyCompanyPage());
    }
 
    @Then("I verify Media option is displayed")
    public void I_verify_Media_option_is_displayed() {
    	Assert.assertTrue(lp.verifyMediaOption());
    }
    
    @When("I click on Media option")
    public void I_click_on_Media_option() {
    	lp.clickMediaOption();
    }
    
    @Then("I verify Media page is loaded")
    public void I_verify_Media_page_is_loaded() {
    	Assert.assertTrue(lp.verifyMediaPage());
    }
    
    @Then("I verify Puerto Rico2017 option is displayed")
    public void I_verify_Puerto_Rico2017_option_is_displayed() {
    	Assert.assertTrue(lp.verifyPuerto_Rico_2017Option());
    }
    
    @When("I click on Puerto Rico2017 option")
    public void I_click_on_Puerto_Rico2017_option() throws InterruptedException {
    	lp.clickPuerto_Rico_2017Option();
    	Thread.sleep(2000);
    	JavascriptExecutor js=(JavascriptExecutor) driver;		
    	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    
    @Then("I verify Puerto Rico2017 page is open")
    public void I_verify_Puerto_Rico2017_page_is_open() {
    	Assert.assertTrue(lp.verifyPuerto_Rico_2017Page());
    }
    
    @When("I click on close option")
    public void I_click_on_close_option() {
    	lp.clickCloseButton();
    }
    
    @When("I click on play button")
    public void I_click_on_play_button() {
    	lp.clickPlayButton();
    }
    
    @Then("I verify Phuket Thailand2015 option is displayed")
    public void I_verify_Phuket_Thailand2015_option_is_displayed() {
    	Assert.assertTrue(lp.verifyPhuketThailand2015Option());
    }
    
    @When("I click on Phuket Thailand2015 option")
    public void I_click_on_Phuket_Thailand2015_option() throws InterruptedException {
    	lp.clickPhuketThailand2015();
    	Thread.sleep(2000);
    	JavascriptExecutor js=(JavascriptExecutor) driver;		
    	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    
    @Then("I verify Phuket Thailand2015 page is open")
    public void I_verify_Phuket_Thailand2015_page_is_open() {
    	Assert.assertTrue(lp.verifyPhuketThailand2015Page());
    }
    
   @Then("I verify Punta Cana Dominican Republic2014 option is displayed")
   public void I_verify_Punta_Cana_Dominican_Republic2014_option_is_displayed() {
	   Assert.assertTrue(lp.verifyPuntaCanaDominicanRepublic2014Option());
   }
    
   @When("I click on Punta Cana Dominican Republic2014 option")
   public void I_click_on_Punta_Cana_Dominican_Republic2014_option() throws InterruptedException {
	   lp.clickPuntaCanaDominicanRepublic2014();
	   Thread.sleep(2000);
   }
   
   @Then("I verify Punta Cana Dominican Republic2014 page is open")
   public void I_verify_Punta_Cana_Dominican_Republic2014_page_is_open() {
	   Assert.assertTrue(lp.verifyPuntaCanaDominicanRepublic2014Page());
   }
    
   @Then("I verify Peru2018 option is displayed")
   public void I_verify_Peru2018_option_is_displayed() {
	   Assert.assertTrue(lp.verifyPeru2018Option());
	   
   }
    
   @When("I click on Peru2018 option")
   public void I_click_on_Peru2018_option() throws InterruptedException {
	   lp.clickPeru2018();
	   Thread.sleep(1000);
   }
   
   @Then("I verify Peru2018 page is open")
   public void I_verify_Peru2018_page_is_open() {
	   Assert.assertTrue(lp.verifyPeru2018Page());
	   
   }
   
   @Then("I verify South Afric2019 option is displayed")
   public void I_verify_South_Afric2019_option_is_displayed() {
	   Assert.assertTrue(lp.verifySouthAfric2019Option());
   }
   
   @When("I click on South Afric2019 option")
   public void I_click_on_South_Afric2019_option() throws InterruptedException {
	   lp.clickSouthAfric2019();
	   Thread.sleep(1000);
   }
   
   @Then("I verify South Afric2019 page is open")
   public void I_verify_South_Afric2019_page_is_open() {
	   Assert.assertTrue(lp.verifySouthAfric2019Page());
   }
    
   @When("I select the laguage as French")
   public void I_select_the_laguage_as_French() {
	  lp.selectLanguage();
   }
   
   @Then("I verify Company page")
   public void I_verify_Company_page() {
	   Assert.assertTrue(lp.verifyCompanyPageLanguage());
   }
   
   @Then("I verify Media page")
   public void I_verify_Media_page() {
	   Assert.assertTrue(lp.verifyMediaPageLanguage());
   }
    
   @Then("I verify the country dropdown list")
   public void I_verify_the_country_dropdown_list() {
	   lp.verifyCountryDropDownList();
   }
    
   @Then("I verify the language dropdown list")
   public void I_verify_the_language_dropdown_list() {
	   lp.verifyLanguageDropDownList();
   }
    
   @When("I mouse hover over the Why Max option")
   public void I_mouse_hover_over_the_Why_Max_option() {
	   lp.mouseHoverOverOnWhyMaxtOption();
   }
   
   @When("I click on Max Gives Back option")
   public void I_click_on_Max_Gives_Back_option() {
	   lp.clickMaxGivesBackOption();
   }
   
   @Then("I verify Max Gives Back page")
   public void I_verify_Max_Gives_Back_page() {
	   Assert.assertTrue(lp.verifyMaxGivesBackPage());
   }

   @When("I click on Science Option")
   public void I_click_on_Science_Option() {
	   lp.clickScienceoption();
   }
   
   @Then("I verify Scott Momii option is displayed")
   public void I_verify_Scott_Momii_option_is_displayed() {
	   Assert.assertTrue(lp.verifyScottMonmiiOption());
	   
   }
   
   @When("I click on Scott Momii option")
   public void I_click_on_Scott_Momii_option() throws InterruptedException {
	   lp.clickScottMonmiiOption();
	   Thread.sleep(1000);
   }
   
   @Then("I verify Scott Momii imformation page is displayed")
   public void I_verify_Scott_Momii_imformation_page_is_displayed() {
	   Assert.assertTrue(lp.verifyScottMonmiiPage());
   }
   
   @When("I click on Media Option")
   public void I_click_on_Media_Option() {
	   lp.clickMediaOptionInWhyMax();
   }
   
   @Then("I verify in Media page blog option is displayed")
   public void I_verify_in_Media_page_blog_option_is_displayed() {
	   Assert.assertTrue(lp.verifyBlogOption());
   }
   
   @Then("I verify Executive Team option is displayed")
   public void I_verify_Executive_Team_option_is_displayed() {
	   Assert.assertTrue(lp.verifyExecutiveTeamOption());
   }
    
   @When("I click on Executive Team option")
   public void I_click_on_Executive_Team_option() {
	   lp.clickExecutiveTeamOption();
   }
   
   @Then("I verify Paula Hernandez option is displayed")
   public void I_verify_Paula_Hernandez_option_is_displayed() {
	   Assert.assertTrue(lp.verifyPaulaHernandezOption());
	   
   }
   
   @Then("I verify banner image on Why Max page")
   public void I_verify_banner_image_on_Why_Max_page() {
	   Assert.assertTrue(lp.verifyWhyMaxBannerImage());
   }
   
   @Then("I verify Jennifer Arias option is displayed")
   public void I_verify_Jennifer_Arias_option_is_displayed() {
	   Assert.assertTrue(lp.verifyJenniferAriasOption());
   }
   
   @When("I click on Jennifer Arias")
   public void I_click_on_Jennifer_Arias() throws InterruptedException {
	   lp.verifyJenniferAriasOption();
	   Thread.sleep(1000);
   }
   
   @Then("I verify Jennifer Aris biography is displayed")
   public void I_verify_Jennifer_Aris_biography_is_displayed() {
	   Assert.assertTrue(lp.verifyJenniferAriasBio());
   }
    
    
    
}
