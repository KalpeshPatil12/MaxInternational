package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Max_WelcomeScreen_HomeScreenPage {
	
public WebDriver ldriver;
	
	public Max_WelcomeScreen_HomeScreenPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[text()=\"WELCOME TO MAX\"]")
	@CacheLookup
	WebElement WelcomeToMax;
	
	@FindBy(xpath = "//*[@id=\"es\"]")
	@CacheLookup
	WebElement SpanishTab;
	
	@FindBy(xpath = "//*[text()=\"Inglés\"]")
	@CacheLookup
	WebElement language;
	
	@FindBy(xpath = "//*[text()=\"Australia\"]")
	@CacheLookup
	WebElement locationAustralia;
	
	@FindBy(xpath = "//*[text()=\"Australia\"]")
	@CacheLookup
	WebElement verifyAustraliaLocation;
	
	@FindBy(xpath = "//*[text()=\" NZD / \"]")
	@CacheLookup
	WebElement verifyCurrency;
	
	@FindBy(xpath = "//*[@class=\"nav navbar-nav\"]/child::*[1]/child::*[1]")
	@CacheLookup
	WebElement verifyWhyMax;
	
	@FindBy(xpath = "//*[@class=\"header--logo-container reloader-alert\"]/child::*/child::*/child::*")
	@CacheLookup
	WebElement maxLogo;
	
	@FindBy(xpath = "//*[@class=\"cart-icon my-auto my_cart_div \"]/child::*[1]")
	@CacheLookup
	WebElement cartSymbol;
	
	@FindBy(xpath = "//*[@id=\"products\"]/child::*/child::*/child::*[1]/child::*")
	@CacheLookup
	WebElement weightManagementOption;
	
	@FindBy(xpath = "//*[@class=\"mb-4\"]")
	@CacheLookup
	WebElement WeightManagementPage;
	
	@FindBy(xpath = "//*[@id=\"products\"]/child::*/child::*/child::*[2]/child::*")
	@CacheLookup
	WebElement NutritionalsOption;
	
	@FindBy(xpath = "//*[text()=\"Maximize Your Body's Natural Strengths\"]")
	@CacheLookup
	WebElement NutritionalsPage;
	
	@FindBy(xpath = "//*[@id=\"products\"]/child::*/child::*/child::*[3]/child::*")
	@CacheLookup
	WebElement BeautyOption;
	
	@FindBy(xpath = "//*[text()=\"GET THE LOOK\"]")
	@CacheLookup
	WebElement BeautyPage;
	
	@FindBy(xpath = "//*[@class=\"whymax__text\"]")
	@CacheLookup
	WebElement WhyMaxOption;
	
	@FindBy(xpath = "//*[text()=\"WHY MAX?\"]")
	@CacheLookup
	WebElement WhyMaxPage;
	
//	@FindBy(xpath = "//*[@id=\"opportunity\"]/child::*/child::*/child::*[1]/child::*/child::*[1]")
//	@CacheLookup
//	WebElement LoveTheProductsShareTheProductsOption;
	
	@FindBy(xpath = "//*[text()=\"To learn more about Associate Opportunity. Click here\"]")
	@CacheLookup
	WebElement nextPage;
	
	@FindBy(xpath = "//*[@id=\"today-order-cart-head\"]/div/div[1]/p/a[1]/u")
	@CacheLookup
	WebElement loginHyperlink;
	
	@FindBy(xpath = "//*[text()=\"Sign In To Max\"]")
	@CacheLookup
	WebElement SignInToMaxPage;
	
	@FindBy(xpath = "//*[@class=\"nav navbar-nav\"]/child::*[3]/child::*")
	@CacheLookup
	WebElement ShopOption;
	
	@FindBy(xpath = "//*[@class=\"row all-product-list pt-5\"]/child::*[1]/child::*/child::*[6]/child::*")
	@CacheLookup
	WebElement AddToCartOption;
	
	@FindBy(xpath = "//*[@class=\"fa fa-times-circle\"]")
	@CacheLookup
	WebElement DeleteProduct;
	
	@FindBy(xpath = "//*[@id=\"today-order-cart-tab\"]/child::*/child::*/child::*/child::*/child::*[3]/child::*/child::*/child::*[1]")
	@CacheLookup
	WebElement verifyCartProduct;
	
	@FindBy(xpath = "//*[@class=\"header--logo-container reloader-alert\"]/child::*/child::*/child::*")
	@CacheLookup
	WebElement verifyMaxInternationalLogo;
	
	@FindBy(xpath = "//*[@class=\"foo__logo\"]/child::*")
	@CacheLookup
	WebElement verifyMaxInternationalLogoInFooter;
	
	@FindBy(xpath = "//*[@class=\"text-white head-login reloader-alert\"]")
	@CacheLookup
	WebElement MemberLoginLink;
	
	@FindBy(xpath = "//*[@class=\"nav navbar-nav\"]/child::*[2]/child::*[1]")
	@CacheLookup
	WebElement ProductOption;
	
	@FindBy(xpath = "//*[@class=\"font-2 banner-title text-uppercase text--outer-glow\"]")
	@CacheLookup
	WebElement ProductPage;
	
	@FindBy(xpath = "//*[text()=\" Save More With AutoShip \"]")
	@CacheLookup
	WebElement ShopPage;
	
	@FindBy(xpath = "//*[@class=\"nav navbar-nav\"]/child::*[4]/child::*[1]")
	@CacheLookup
	WebElement JoinOption;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/child::*/child::*[2]/child::*[2]/child::*[2]/child::*/child::*[1]/child::*/child::*/child::*[1]/child::*/child::*[1]/child::*")
    @CacheLookup
    WebElement Beauty;
	
	
	/*
	 * Verify Welcome To Max text
	 */
	
	public boolean verifyWelcomeToMaxText() {
		return WelcomeToMax.isDisplayed();
	}
	
	/*
	 * 
	 */
	
	public void mouseHover() {
		Actions action = new Actions(ldriver);
		WebElement element=ldriver.findElement(By.xpath("//*[@id=\"es\"]"));
		action.moveToElement(element).perform();
	}
	
	/*
	 * Performed click operation on Spanish tab
	 */
	
	
	public void clickSpanishTab() {
		SpanishTab.click();
		
	}
	
	/*
	 * Verify selected language is displayed
	 */
	
	public boolean verifyLanguage() {
		return language.isDisplayed();
	}
	
	/*
	 * Performed click operation on English tab
	 */
	
	public void clickEnglishTab() {
		language.click();
	}
	
	/*
	 * Select Australia from the location dropdown
	 */
	
	public void clickAustraliaLocation() {
		locationAustralia.click();
	}
	
	/*
	 * Verify Australia location is displayed on Home Page
	 */
	
	public boolean verifyAustraliaLocationInHomePage() {
		return verifyAustraliaLocation.isDisplayed();
		
	}
	
	/*
	 * Verify currency is displayed as per selected country
	 */
	
	public boolean verifyCurrencyAsPerCountry() {
		return verifyCurrency.isDisplayed();
	}
	
	/*
	 * Verify Max Text is displayed on Home Page
	 */
	
	public boolean verifyWhyMaxText() {
		return verifyWhyMax.isDisplayed();
		
	}
	
	/*
	 * Select country fron the home page dropdown
	 */
	
	public void selectCountry() {
		
		WebElement dropCountryEle=ldriver.findElement(By.xpath("//*[@id=\"countries\"]"));
		
		Select dropCountry=new Select(dropCountryEle);
		
      dropCountry.selectByVisibleText("Dominican Republic");
       
	//	dropCountry.selectByValue("14");  //Aus
	//	dropCountry.selectByIndex(13); //Aus
	}
	
	/*
	 * Select language from the home page dropdown
	 */
	
	public void selectLanguage() {
		
		WebElement dropLanguageEle = ldriver.findElement(By.xpath("//*[@id=\"languages\"]"));
		
		Select dropLanguage = new Select(dropLanguageEle);
		
		dropLanguage.selectByVisibleText("Spanish");
	}
	
	/*
	 * Performed click operation on Max International logo
	 */
	
	public void clickMaxInternationalLogo() {
		maxLogo.click();
		
	}
	
	/*
	 * Verify cart symbols id displayed
	 */
	
	public boolean verifyCartSymbol() {
		return cartSymbol.isDisplayed();
		
	}
	
	/*
	 * Performed click operation on My cart icon
	 */
	
	public void clickMyCartIcon() {
		cartSymbol.click();
		
	}
	
	/*
	 * Performed click operation on Weight management option
	 */
	
	public void clickWeightManagementOption() {
		weightManagementOption.click();
		
	}
	
	/*
	 * Verify weight management page is open after clicking weight management option
	 */
	
	public boolean verifyWeightManagementPage() {
		return WeightManagementPage.isDisplayed();
	}
	
	/*
	 * Performed click operation on Nutritionals option
	 */
	
	public void clickNutritionalsOption() {
		NutritionalsOption.click();
	}
	
	/*
	 * Verify Nutritionals page open after clicking nutritionals option
	 */
	
	public boolean verifyNutritionalsPage() {
		return NutritionalsPage.isDisplayed();
		
	}
	
	/*
	 * Performed click operation on Beauty option
	 */
	
	public void clickBeautyOption() {
		BeautyOption.click();
		
	}
	
	/*
	 * Verify beauty page open after clicking buity option
	 */
	
	public boolean verifyBeautyPage() {
		return BeautyPage.isDisplayed();
		
	}
	
	/*
	 * Performed click operation on Why Max option
	 */
	
	public void clickWhyMaxOption() {
		WhyMaxOption.click();
	}
	
	/*
	 * Verify Why max page open after clicking Why max option
	 */
	
	
	public boolean verifyWhyMaxPage() {
		return WhyMaxPage.isDisplayed();
	}
	
	/*
	 * Performed click operation on Love The Products Share the Products option
	 */
	
	public void clickLoveTheProductsShareTheProductsOption() {
		//LoveTheProductsShareTheProductsOption.click();
		
		WebElement ele = ldriver.findElement(By.xpath("//*[@id=\"opportunity\"]/child::*/child::*/child::*[1]/child::*/child::*[1]"));
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", ele);
		
	}
	
	/*
	 * Verify Love The Products Share the Products page open after clicking Love The Products Share the Products option
	 */
	
	public boolean verifyPage() {
		return nextPage.isDisplayed();
		
	}
	
	/*
	 * Performed click operation on Become a Preferred Customer option
	 */
	
	public void clickBecomeAPreferredCustomerOption() {
		
		WebElement ele = ldriver.findElement(By.xpath("//*[@id=\"opportunity\"]/child::*/child::*/child::*[2]/child::*/child::*[1]"));
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", ele);
		
	}
	
	/*
	 * Performed click operation on More Flexibility More Income More Opportunity option
	 */
	
	public void clickMoreFlexibilityMoreIncomeMoreOpportunityOption() {
		
		WebElement ele = ldriver.findElement(By.xpath("//*[@id=\"opportunity\"]/child::*/child::*/child::*[3]/child::*/child::*[1]"));
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", ele);
		
	}
	
	/*
	 * Performed click operation on login hyperlink from the dropdown
	 */
	
	public void clickLoginHyperLink() {
	//	loginHyperlink.click();
		
		WebElement ele = ldriver.findElement(By.xpath("//*[@id=\"today-order-cart-head\"]/div/div[1]/p/a[1]/u"));
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", ele);
		
	}
	
	/*
	 * Verify Sign In To Max page after clicking login link from the dropdown
	 */
	
	public boolean verifySignInToMaxPage() {
		return SignInToMaxPage.isDisplayed();
		
	}
	
	/*
	 * Performed click operation on Shop option
	 */
	
	public void clickShopOption() {
		ShopOption.click();
	}
	
	public boolean verifyShopOption() {
		return ShopOption.isDisplayed();
		
	}
	
	/*
	 * Performed click operation on Add To Cart option
	 */
	
	public void clickAddToCartOption() {
		AddToCartOption.click();
	}
	
	/*
	 * Performed click operation on My cart Symbol
	 */
	
	public void clickMyCartSymbol() {
		
		WebElement ele = ldriver.findElement(By.xpath("//*[@class=\"cart-icon my-auto my_cart_div \"]/child::*[1]"));
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", ele);
		
	}
	
	/*
	 * Delete the product from My cart
	 */
	
	public void deleteProductMyCart() {
		DeleteProduct.click();
	}
	
	/*
	 * Verify the cart after delete the product
	 */
	
	public boolean verifyCart() {
		return verifyCartProduct.isDisplayed();
	}
	
	/*
	 * Verify Weight Management option
	 */
	
	public boolean verifyWeightManagementOption() {
		return weightManagementOption.isEnabled();
	}
	
	/*
	 * Mouse Hover on product option
	 */
	
	public void mouseHoverOnProductOption() {
		Actions action = new Actions(ldriver);
		WebElement element=ldriver.findElement(By.xpath("//*[@class=\"nav navbar-nav\"]/child::*[2]/child::*[1]"));
		action.moveToElement(element).perform();
	}
	
	/*
	 * Verify Max International logo
	 */
	
	public boolean verifyMaxInternationalLogo() {
		return verifyMaxInternationalLogo.isDisplayed();
		
	}
	
	/*
	 * Verify Max International logo in the footer section
	 */
	
	public boolean verifyInternationalLogoInFooter() {
		return verifyMaxInternationalLogoInFooter.isDisplayed();
	}
	
	/*
	 * Verify Member login option
	 */
	
	public boolean verifyMemberLoginOption() {
		return MemberLoginLink.isDisplayed();
	}
	
	/*
	 * Performed click operation on Member Login option
	 */
	
	public void clickMemberLoginOption() {
		MemberLoginLink.click();
		
	}
	
	/*
	 * Verify Product option
	 */
	
	public boolean verifyProductOption() {
		return ProductOption.isDisplayed();
	}
	
	/*
	 * Performed click operation on Product option
	 */
	
	public void clickProductOption() {
		ProductOption.click();
	}
	
	/*
	 * Verify product page
	 */
	
	public boolean verifyProductPage() {
		return ProductPage.isDisplayed();
	}
	
	/*
	 * Verify Shop page
	 */
	
	public boolean verifyShopPage() {
		return ShopPage.isDisplayed();
	}
	
	/*
	 * Verify Join option
	 */
	
	public boolean verifyJoinOption() {
		return JoinOption.isDisplayed();
	}
	
	/*
	 * Performed click operation on join option
	 */
	
	public void clickJoinOption() {
		JoinOption.click();
	}
	
	/*
	 * Mouse hover over on Product option
	 */
	
	public void mouseHoverOverOnProductOption() {
		Actions action = new Actions(ldriver);
		WebElement element=ldriver.findElement(By.xpath("//*[@class=\"nav navbar-nav\"]/child::*[2]/child::*[1]"));
		action.moveToElement(element).perform();
	}
	
	/*
	 * Verify Beauty option in the product
	 */
	
	public boolean verifyBeatutyOptionInTheProduct() {
		return Beauty.isDisplayed();
	}
	
	
	
	
	
}
