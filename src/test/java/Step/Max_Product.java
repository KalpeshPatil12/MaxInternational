//package Step;
//
//import java.time.Duration;
//import java.util.Iterator;
//import java.util.Set;
//
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import PageObjects.Max_ProductPage;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Max_Product {
//
//	WebDriver driver;
//	public Max_ProductPage lp;
//
//	@Given("user enter the url {string}")
//	public void user_enter_the_url (String url) {
//
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		lp = new Max_ProductPage(driver);
//		driver.navigate().to(url);
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//	}
//
//	@When("I select the location as Australia")
//	public void I_select_the_location_as_Australia() {
//		lp.clickAustraliaLocation();
//	}
//
//	@Then("I verify Product option is displayed")
//	public void i_verify_product_option_is_displayed() {
//		Assert.assertTrue(lp.verifyProductOption());
//	}
//
//	@When("I click on Product option")
//	public void i_click_on_product_option() {
//		lp.clickProductOption();
//	}
//
//	@Then("I verify Product page")
//	public void i_verify_product_page() {
//		Assert.assertTrue(lp.verifyProductPage());
//	}
//
//	@Then("I verify Opportunity option is displayed")
//	public void I_verify_Opportunity_option_is_displayed() {
//		Assert.assertTrue(lp.verifyOpportunityOption());
//	}
//
//	@When("I click on Opportunity option")
//	public void I_click_on_Opportunity_option() {
//		lp.clickOpportunityOption();
//		Set<String> str=driver.getWindowHandles();
//
//		Iterator<String> i=str.iterator();
//
//		String parent=i.next();
//
//		String child=i.next();
//
//		driver.switchTo().window(child);
//
//	}
//
//	@Then("I verify Opportunity page")
//	public void I_verify_Opportunity_page() {
//		Assert.assertTrue(lp.verifyOppportunityPage());
//	}
//
//	@Then("I verify Product with Purpose option")
//	public void I_verify_Product_with_Purpose_option() {
//		Assert.assertTrue(lp.verifyProductWithPurposeOption());
//	}
//
//	@When("I click on Product with Purpose option")
//	public void I_click_on_Product_with_Purpose_option() {
//		lp.clickProductWithPurposeOption();
//	}
//
//	@Then("I verify Product with Purpose page")
//	public void I_verify_Product_with_Purpose_page() {
//		Assert.assertTrue(lp.verifyProductWithPurposePage());
//	}
//
//	@Then("I verify Max Gives Back option is displayed")
//	public void I_verify_Max_Gives_Back_option_is_displayed() {
//		Assert.assertTrue(lp.verifyMaxGivesBackOption());
//	}
//
//	@When("I click on Max Gives Back option")
//	public void I_click_on_Max_Gives_Back_option() {
//		lp.clickMaxGivesBackOption();
//	}
//
//	@Then("I verify Max Gives Back page")
//	public void I_verify_Max_Gives_Back_page() {
//		Assert.assertTrue(lp.verifyMaxGivesBackPage());
//	}
//
//	@Then("I observe the product banner")
//	public void I_observe_the_product_banner() {
//		Assert.assertTrue(lp.verifyProductBanner());
//	}
//
//	@When("I select the country as Ecuador")
//	public void I_select_the_country_as_Ecuador() {
//		lp.selectCountry();
//	}
//
//	@When("I click on Shop option")
//	public void I_click_on_Shop_option() {
//		lp.clickShopOption();
//	}
//
//	@Then("I verify the product price")
//	public void I_verify_the_product_price() {
//		Assert.assertTrue(lp.verifyProductPrice());
//	}
//
//	@When("I select the country as Fiji")
//	public void I_select_the_country_as_Fiji() {
//		lp.selectFijiCountry();
//	}
//
//	@When("I mouse hover over on a Products option")
//	public void I_mouse_hover_over_on_a_Products_option() throws InterruptedException {
//		lp.mouseHoverOverOnProductsOption();
//		Thread.sleep(3000);
//	}
//
//	@Then("I verify MaxATP option is displayed")
//	public void I_verify_MaxATP_option_is_displayed() {
//		Assert.assertTrue(lp.verifyMaxATPOption());
//	}
//
//	@When("I click on MaxATP option")
//	public void I_click_on_MaxATP_option() {
//		lp.clickMaxATPOption();
//	}
//
//	@Then("I verify MaxATP page")
//	public void I_verify_MaxATP_page() {
//		Assert.assertTrue(lp.verifyMaxATPPage());
//	}
//
//	@Then("I verify Max n fuze is displayed")
//	public void I_verify_Max_n_fuze_is_displayed() {
//		Assert.assertTrue(lp.verifyMaxNFuzeOption());
//	}
//
//	@When("I click on Max n fuze option")
//	public void I_click_on_Max_n_fuze_option() {
//		lp.clickMaxNFuzeOption();
//	}
//
//	@Then("I verify Max n fuze page")
//	public void I_verify_Max_n_fuze_page() {
//		Assert.assertTrue(lp.verifyMaxNFuzePage());
//	}
//
//	@Then("I verify Max One option is displayed")
//	public void I_verify_Max_One_option_is_displayed() {
//		Assert.assertTrue(lp.verifyMaxOneOption());
//	}
//
//	@When("I click on Max One option")
//	public void I_click_on_Max_One_option() {
//		lp.clickMaxOneOption();
//	}
//
//	@Then("I verify Max One option page")
//	public void I_verify_Max_One_option_page() {
//		Assert.assertTrue(lp.verifyMaxOnePage());
//	}
//
//	@Then("I verify MaxGLX option is displayed")
//	public void I_verify_MaxGLX_option_is_displayed() {
//		Assert.assertTrue(lp.verifyMaxGLXOption());
//	}
//
//	@When("I click on MaxGLX option")
//	public void I_click_on_MaxGLX_option() {
//		lp.clickMaxGLXOption();
//	}
//
//	@Then("I verify MaxGLX page")
//	public void I_verify_MaxGLX_page() {
//		Assert.assertTrue(lp.verifyMaxGLXPage());
//	}
//
//	@Then("I verify Max357 option is displayed")
//	public void I_verify_Max357_option_is_displayed() {
//		Assert.assertTrue(lp.verifyMax357Option());
//	}
//
//	@When("I click on Max357 option")
//	public void I_click_on_Max357_option() {
//		lp.clickMax357Option();
//	}
//
//	@Then("I verify Max357 page")
//	public void I_verify_Max357_page() {
//		Assert.assertTrue(lp.verifyMax357Page());
//	}
//
//	@Then("I verify Help Center option is displayed")
//	public void I_verify_Help_Center_option_is_displayed() {
//		Assert.assertTrue(lp.verifyHelpCenterOption());
//	}
//
//	@When("I click on Help Center option")
//	public void I_click_on_Help_Center_option() {
//		lp.clickHelpCenterOption();
//	}
//
//	@Then("I verify Help Center page")
//	public void I_verify_Help_Center_page() {
//		Assert.assertTrue(lp.verifyHelpCenterPage());
//	}
//
//
//	@When("I select the location as United State from dropdown")
//	public void i_select_the_location_as_united_state_from_dropdown() {
//		lp.selectUnitedStateCountry();
//	}
//
//	@When("I click on MaxATP in the Nutritionals")
//	public void i_click_on_max_atp_in_the_nutritionals() {
//		lp.clickMaxATPInNutritionals();
//	}
//	@Then("I verify add to cart option is displayed")
//	public void i_verify_add_to_cart_option_is_displayed() {
//		Assert.assertTrue(lp.verifyAddToCartOption());
//	}
//	@When("I click on Add to cart option")
//	public void i_click_on_add_to_cart_option() {
//		lp.clickAddToCartOption();
//	}
//	@When("I click on - sign")
//	public void i_click_on_sign() {
//		lp.clickMinusSignOption();
//	}
//	@Then("I verify Remove Item option is displayed")
//	public void i_verify_remove_item_option_is_displayed() {
//		Assert.assertTrue(lp.verifyRemoveOption());
//	}
//
//	@Then("I verify Nutrionals option is displayed")
//	public void i_verify_nutrionals_option_is_displayed() {
//		Assert.assertTrue(lp.verifyNutritionalsOption());
//	}
//
//	@When("I click on Nutritionals option")
//	public void i_click_on_nutritionals_option() {
//		lp.clickNutritionalsOption();
//	}
//
//	@When("I select the language as French")
//	public void i_select_the_language_as_french() {
//		lp.selectFrenchLanguage();
//	}
//
//	@Then("I verify Nutritionals page change in French language")
//	public void i_verify_nutritionals_page_change_in_french_language() {
//		Assert.assertTrue(lp.verifyNutritionalsPageInFrenchLanguage());
//	}
//
//	@When("I select the language as Spanish")
//	public void i_select_the_language_as_spanish() {
//		lp.selectSpanishLanguage();
//	}
//
//	@Then("I verify Nutritionals page change in Spanish language")
//	public void i_verify_nutritionals_page_change_in_spanish_language() {
//		Assert.assertTrue(lp.verifyNutritionalsPageInSpanishLanguage());
//	}
//
//	@When("I select the Spanish language")
//	public void I_select_the_Spanish_language() {
//		lp.selectLanguageAsSpanish();
//	}
//
//	@Then("I verify the Product text on homepage")
//	public void I_verify_the_Product_text_on_homepage() {
//		Assert.assertTrue(lp.verifyProductText());
//	}
//
//	@Then("I verify Product Sheet option is displayed")
//	public void I_verify_Product_Sheet_option_is_displayed() {
//		Assert.assertTrue(lp.verifyProductSheetOption());
//	}
//
//	@When("I click on Product Sheet option")
//	public void I_click_on_Product_Sheet_option() throws InterruptedException {
//		lp.clickProductSheetOption();
//		Thread.sleep(4000);
//
//	}
//
//	@Then("I verify the Product Sheet")
//	public void I_verify_the_Product_Sheet() {
//		Assert.assertTrue(lp.verifyProductSheet());
//	}
//
//	@When("I select the country as Costa Rica from the dropdown")
//	public void I_select_the_country_as_Costa_Rica_from_the_dropdown() throws InterruptedException {
//		lp.selectCountryAsCostaRica();
//		Thread.sleep(3000);
//	}
//
//	@When("I click on Cellgevity option")
//	public void I_click_on_Cellgevity_option() {
//		lp.clickCellgevityOption();
//	}
//
//	@Then("I verify the Cellgevity Icon")
//	public void I_verify_the_Cellgevity_Icon() {
//		Assert.assertTrue(lp.verifyCellegevityIcon());
//	}
//
//	@Then("I verify learn more option is displayed")
//	public void I_verify_learn_more_option_is_displayed() {
//		Assert.assertTrue(lp.verifyLearMoreOption());
//	}
//
//	@When("I click on learn more option")
//	public void I_click_on_learn_more_option() {
//		lp.clickLearMoreOption();
//	}
//
//	@Then("I verify the Nutritionals page")
//	public void I_verify_the_Nutritionals_page() {
//		Assert.assertTrue(lp.verifyCellegevityPage());
//	}
//
//	@When("I select the New Zealand as country from the dropdown")
//	public void I_select_the_New_Zealand_as_country_from_the_dropdown() throws InterruptedException {
//		lp.selectCountryAsNewZealand();
//		Thread.sleep(2000);
//	}
//
//	@When("I click on Cellgevity option for New Zealand")
//	public void I_click_on_Cellgevity_option_for_New_Zealand() {
//		lp.clickCellegevityOptionForNewZealand();
//	}
//
//	@Then("I verify Cellevity page for New Zealand")
//	public void I_verify_Cellevity_page_for_New_Zealand() {
//		Assert.assertTrue(lp.verifyCellegevityPageForNewZealand());
//	}
//
//	@When("I click on Nutritionals Option")
//	public void I_click_on_Nutritionals_Option() {
//		lp.clickNutritionalsOptions();
//	}
//
//	@Then("I verify Cellgevity option is displayed in Our Nutritionals Products")
//	public void i_verify_cellgevity_option_is_displayed_in_our_nutritionals_products() {
//		Assert.assertTrue(lp.verifyCellgevityOptionInOurNutritionalsProducts());
//	}
//
//	@When("I click on Cellgevity option in Our Nutritionals Products")
//	public void i_click_on_cellgevity_option_in_our_nutritionals_products() throws InterruptedException {
//		lp.clickCellgevityOptionInOurNutritionalsProducts();
//		Thread.sleep(1000);
//	}
//
//	@Then("I verify the Cellgevity page")
//	public void i_verify_the_cellgevity_page() {
//		Assert.assertTrue(lp.verifyCellgevityPage());
//	}
//
//	@Then("I verify MaxATP option is displayed in Our Nutritionals Products")
//	public void I_verify_MaxATP_option_is_displayed_in_Our_Nutritionals_Products() {
//		Assert.assertTrue(lp.verifyMaxATPOptionInOurNutritionalsProducts());
//	}
//
//	@When("I click on MaxATP option in Our Nutritionals Products")
//	public void I_click_on_MaxATP_option_in_Our_Nutritionals_Products() {
//		lp.clickMaxATPOptionInOurNutritionalsProducts();
//	}
//
//	@Then("I verify Max N Fuze option is displayed in Our Nutritionals Products")
//	public void I_verify_Max_N_Fuze_option_is_displayed_in_Our_Nutritionals_Products() {
//		Assert.assertTrue(lp.verifyMaxNFuzeOptionInOurNutritionalsProducts());
//	}
//
//	@When("I click on Max N Fuze option in Our Nutritionals Products")
//	public void I_click_on_Max_N_Fuze_option_in_Our_Nutritionals_Products() throws InterruptedException {
//		lp.clickMaxNFuzeOptionInOurNutritionalsProducts();
//		Thread.sleep(1000);
//	}
//
//	@Then("I verify MaxOne option is displayed in Our Nutritionals Products")
//	public void I_verify_MaxOne_option_is_displayed_in_Our_Nutritionals_Products() {
//		Assert.assertTrue(lp.verifyMaxOneOptionInOurNutritionalsProducts());
//	}
//
//	@When("I click on MaxOne option in Our Nutritionals Products")
//	public void I_click_on_MaxOne_option_in_Our_Nutritionals_Products() {
//		lp.clickMaxOneOptionInOurNutritionalsProducts();
//	}
//
//	@Then("I verify MaxGLX option is displayed in Our Nutritionals Products")
//	public void I_verify_MaxGLX_option_is_displayed_in_Our_Nutritionals_Products() {
//		Assert.assertTrue(lp.verifyMaxGLXOptionInOurNutritionalsProducts());
//	}
//
//	@When("I click on MaxGLX option in Our Nutritionals Products")
//	public void I_click_on_MaxGLX_option_in_Our_Nutritionals_Products() {
//		lp.clickMaxGLXOptionInOurNutritionalsProducts();
//	}
//
//	@Then("I verify Max357 option is displayed in Our Nutritionals Products")
//	public void I_verify_Max357_option_is_displayed_in_Our_Nutritionals_Products() {
//		Assert.assertTrue(lp.verifyMax357OptionInOurNutritionalsProducts());
//	}
//
//	@When("I click on Max357 option in Our Nutritionals Products")
//	public void I_click_on_Max357_option_in_Our_Nutritionals_Products() {
//		lp.clickMax357OptionInOurNutritionalsProducts();
//	}
//	
//	@When("I click on Cellgevity option in the Nutritionals")
//	public void i_click_on_cellgevity_option_in_the_nutritionals() {
//		lp.clickCellgevityOptionInNutritionals();
//	}
//
//	@When("I click on Add to Cart option for Cellgevity one month supply")
//	public void i_click_on_add_to_cart_option_for_cellgevity_one_month_supply() {
//		lp.clickAddToCart();
//	}
//	
//	@Then("I verify Cellgevity one month supply added")
//	public void i_verify_cellgevity_one_month_supply_added() {
//		Assert.assertTrue(lp.verifyAddedCellgevity());
//	}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
