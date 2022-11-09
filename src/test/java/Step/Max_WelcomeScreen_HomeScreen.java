//package Step;
//
//import java.time.Duration;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import PageObjects.Max_WelcomeScreen_HomeScreenPage;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Max_WelcomeScreen_HomeScreen {
//	
//	     WebDriver driver;
//	     public Max_WelcomeScreen_HomeScreenPage lp;
//       
//	     
//	    @Given("user enter the url {string}")
//	    public void user_enter_the_url (String url) {
//			
//		   WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			lp = new Max_WelcomeScreen_HomeScreenPage(driver);
//			driver.navigate().to(url);
//			driver.navigate().back();
//			driver.navigate().forward();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//			  
//		}
//	    
//	    @Then("I verify Welcome to max appers in a screen")
//	    public void I_verify_Welcome_to_max_appers_in_a_screen() {
//	    	Assert.assertTrue(lp.verifyWelcomeToMaxText());
//	    }
//	    
//	    @When("I mouse hover over the language tab color change to blue")
//	    public void I_mouse_hover_over_the_language_tab_color_change_to_blue() {
//	    	lp.mouseHover();
//	    }
//	    
//	    @When("user click on Spanish tab")
//	    public void user_click_on_Spanish_tab() throws InterruptedException {
//	    	lp.clickSpanishTab();
//	    	Thread.sleep(2000);
//	    }
//	    
//	    @Then("I verify English language converted into Spanish")
//	    public void I_verify_English_language_converted_into_Spanish() {
//	    	Assert.assertTrue(lp.verifyLanguage());
//	    }
//	    @When("I click on English tab")
//	    public void I_click_on_English_tab() {
//	    	lp.clickEnglishTab();
//	    }
//	    
//	    @When("I select the location as Australia")
//	    public void I_select_the_location_as_Australia() {
//	    	lp.clickAustraliaLocation();
//	    }
//	    
//	    @Then("I verify in home page Australia location is displayed")
//	    public void I_verify_in_home_page_Australia_location_is_displayed() {
//	    	Assert.assertTrue(lp.verifyAustraliaLocationInHomePage());
//	    }
//	    
//	    @Then("I verify currency code apper as per the country")
//	    public void I_verify_currency_code_apper_as_per_the_country() {
//	    	Assert.assertTrue(lp.verifyCurrencyAsPerCountry());
//	    }
//	    
//	    @Then("I verify Why Max text appers in a home screen")
//	    public void I_verify_Why_Max_text_appers_in_a_home_screen() {
//	    	Assert.assertTrue(lp.verifyWhyMaxText());
//	    	
//	    }
//	    
//	    @When("I select the country from the dropdown")
//	    public void I_select_the_country_from_the_dropdown() {
//	    	lp.selectCountry();
//	    }
//	
//	    @When("I select the language from the dropdown")
//	    public void I_select_the_language_from_the_dropdown() {
//	    	lp.selectLanguage();
//	    	
//	    }
//	    
//	    @When("I click on MAX INTERNATIONAL logo")
//	    public void I_click_on_MAX_INTERNATIONAL_logo() {
//	    	lp.clickMaxInternationalLogo();
//	    }
//	    
//	    @Then("I verify cart symbol appers on the homepage")
//	    public void I_verify_cart_symbol_appers_on_the_homepage() {
//	    	Assert.assertTrue(lp.verifyCartSymbol());
//	    	
//	    }
//	    
//	    @When("I click on My cart icon on the homepage")
//	    public void I_click_on_My_cart_icon_on_the_homepage() {
//	    	lp.clickMyCartIcon();
//	    }
//	    
//	    @When("I click on weight management option on the home page")
//	    public void I_click_on_weight_management_option_on_the_home_page() {
//	    	lp.clickWeightManagementOption();
//	    	
//	    }
//	    
//	    @Then("I verify I am in on Weight Management page")
//	    public void I_verify_I_am_in_on_Weight_Management_page() {
//	    	Assert.assertTrue(lp.verifyWeightManagementPage());;
//	    	driver.navigate().back();
//	    }
//	    
//	    @When("I click on Nutritionals option on the home page")
//	    public void I_click_on_Nutritionals_option_on_the_home_page() {
//	    	lp.clickNutritionalsOption();
//	    }
//	    
//	    @Then("I verify I am in on Nutritionals page")
//	    public void I_verify_I_am_in_on_Nutritionals_page() {
//	    	Assert.assertTrue(lp.verifyNutritionalsPage());
//	    	driver.navigate().back();
//	    }
//	    
//	    @When("I click on Beauty option on a home page")
//	    public void I_click_on_Beauty_option_on_a_home_page() {
//	    	lp.clickBeautyOption();
//	    }
//	    
//	    @Then("I verify I am in on Beauty page")
//	    public void I_verify_I_am_in_on_Beauty_page() throws InterruptedException {
//	    	Assert.assertTrue(lp.verifyBeautyPage());
//	    	driver.navigate().back();
//	    	//JavascriptExecutor js=(JavascriptExecutor) driver;
//			//js.executeScript("window.scrollBy(0, 2000)", "");
//
//	    	
//	    }
//	    
//	    @When("I click on Why Max option on a home page")
//	    public void I_click_on_Why_Max_option_on_a_home_page() {
//	    	lp.clickWhyMaxOption();
//	    }
//	    
//	    @Then("I verify I am in on Why Max page")
//	    public void I_verify_I_am_in_on_Why_Max_page() {
//	    	Assert.assertTrue(lp.verifyWhyMaxPage());
//	    	driver.navigate().back();
//	    	JavascriptExecutor js=(JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0, 3000)", "");
//	    }
//	    
//	    @When("I click on Love the Product Share the Product on the home page")
//	    public void I_click_on_Love_the_Product_Share_the_Product_on_the_home_page() {
//	    	lp.clickLoveTheProductsShareTheProductsOption();
//	    }
//	    
//	    @Then("I verify I To learn more about Associate Opportunity option is displayed")
//	    public void I_verify_I_To_learn_more_about_Associate_Opportunity_option_is_displayed() {
//	    	Assert.assertTrue(lp.verifyPage());
//	    	driver.navigate().back();
//	    }
//	    
//	    @When("I click on Become a Preferred Customer option on home page")
//	    public void I_click_on_Become_a_Preferred_Customer_option_on_home_page() throws InterruptedException {
//	    	lp.clickBecomeAPreferredCustomerOption();
//	    	Thread.sleep(1000);
//	    	
//	    }
//	    
//	    @Then("I verify I To learn more about Associate Opportunity Option is displayed")
//	    public void I_verify_I_To_learn_more_about_Associate_Opportunity_Option_is_displayed() {
//	    	Assert.assertTrue(lp.verifyPage());
//	    	driver.navigate().back();
//	    }
//	    
//	    @When("I click on More Flexibility More Income More Opportunity option on home page")
//	    public void I_click_on_More_Flexibility_More_Income_More_Opportunity_option_on_home_page() {
//	    	lp.clickMoreFlexibilityMoreIncomeMoreOpportunityOption();
//	    }
//	    
//	    @Then("I verify I To Learn more about Associate Opportunity option is displayed")
//	    public void I_verify_I_To_Learn_more_about_Associate_Opportunity_option_is_displayed() {
//	    	Assert.assertTrue(lp.verifyPage());
//	    }
//	    
//	    @When("I click on login hyperlink")
//	    public void I_click_on_login_hyperlink() {
//	    	lp.clickLoginHyperLink();
//	    }
//	    
//	    @Then("I verify I am in Sign In To Max page")
//	    public void I_verify_I_am_in_Sign_In_To_Max_page() {
//	    	Assert.assertTrue(lp.verifySignInToMaxPage());
//	    	driver.navigate().back();
//	    }
//	    
//	    @When("I click on Shop option")
//	    public void I_click_on_Shop_option() {
//	    	lp.clickShopOption();
//	    }
//	    
//	    @When("I click on Add to Cart option for any product")
//	    public void I_click_on_Add_to_Cart_option_for_any_product() {
//	    	lp.clickAddToCartOption();
//	    }
//	    
//	    @When("I again click on My cart icon on the homepage")
//	    public void I_again_click_on_My_cart_icon_on_the_homepage() {
//	    	lp.clickMyCartSymbol();
//	    	
//	    }
//	    
//	    @When("I delete the product into the My Cart")
//	    public void I_delete_the_product_into_the_My_Cart() {
//	    	lp.deleteProductMyCart();
//	    }
//	    
//	    @Then("I verify Yor cart is empty text is dislayed")
//	    public void I_verify_Yor_cart_is_empty_text_is_dislayed() {
//	    	Assert.assertTrue(lp.verifyCart());
//	    }
//	    
//	    @Then("I verify in Weight Management Image weight management option is not displayed")
//	    public void I_verify_in_Weight_Management_Image_weight_management_option_is_not_displayed() {
//	    	Assert.assertTrue(lp.verifyWeightManagementOption());
//	    	
//	    }
//	    
//	    @When("I mouse hovwe on Product option")
//	    public void I_mouse_hovwe_on_Product_option() {
//	    	lp.mouseHoverOnProductOption();
//	    }
//	    
//	    @Then("I verify the Max International logo")
//	    public void I_verify_the_Max_International_logo() {
//	    	Assert.assertTrue(lp.verifyMaxInternationalLogo());
//	    }
//	    
//	    @Then("I also verify Max International logo in the footer")
//	    public void I_also_verify_Max_International_logo_in_the_footer() {
//	    	Assert.assertTrue(lp.verifyInternationalLogoInFooter());
//	    }
//	    
//	    @Then("I verify Member Login Option is displayed on the home page")
//	    public void I_verify_Member_Login_Option_is_displayed_on_the_home_page() {
//	    	Assert.assertTrue(lp.verifyMemberLoginOption());
//	    }
//	    
//	    @When("I click on Member Login option on the home page")
//	    public void I_click_on_Member_Login_option_on_the_home_page() {
//	    	lp.clickMemberLoginOption();
//	    }
//	    
//	    @Then("I verify Product option is displayed on the home page")
//	    public void I_verify_Product_option_is_displayed_on_the_home_page() {
//	    	Assert.assertTrue(lp.verifyProductOption());
//	    }
//	   
//	    @When("I click on the Product option on the home page")
//	    public void I_click_on_the_Product_option_on_the_home_page() {
//	    	lp.clickProductOption();
//	    }
//	    
//	    @Then("I verify Product page is displayed")
//	    public void I_verify_Product_page_is_displayed() {
//	    	Assert.assertTrue(lp.verifyProductPage());
//	    }
//	    
//	   @Then("I verify shop option is displayed on the home page")
//	   public void I_verify_shop_option_is_displayed_on_the_home_page() {
//		   Assert.assertTrue(lp.verifyShopOption());
//	   }
//	   
//	   @Then("I verify shop page is open")
//	   public void I_verify_shop_page_is_open() {
//		   Assert.assertTrue(lp.verifyShopPage());
//	   }
//	   
//	   @Then("I verify Join option is displayed on the homer page")
//	   public void I_verify_Join_option_is_displayed_on_the_homer_page() {
//		   Assert.assertTrue(lp.verifyJoinOption());
//	   }
//	   
//	   @When("I click on Join option on the home page")
//	   public void I_click_on_Join_option_on_the_home_page() {
//		   lp.clickJoinOption();
//	   }
//	   
//	   @When("I mouse hover over the Product option")
//	    public void I_mouse_hover_over_the_Product_option() {
//		   lp.mouseHoverOverOnProductOption();
//		   
//	   }
//	   
//	   @Then("I verify Beauty option is displayed")
//	   public void I_verify_Beauty_option_is_displayed() {
//		   Assert.assertTrue(lp.verifyBeatutyOptionInTheProduct());
//	   }
//	 
//	   
//
//}
