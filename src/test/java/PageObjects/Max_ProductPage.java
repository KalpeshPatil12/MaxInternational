package PageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Max_ProductPage {

	public WebDriver ldriver;

	public Max_ProductPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//*[text()=\"United States\"]")
	@CacheLookup
	WebElement locationAustralia;

	@FindBy(xpath = "//div[@id=\"navbarSupportedContent\"]/child::*/child::*[2]/child::*[1]")
	@CacheLookup
	WebElement ProductOption;

	@FindBy(xpath = "//div[@id=\"products_page__banner_text_holder\"]")
	@CacheLookup
	WebElement ProductPage;

	@FindBy(xpath = "//*[text()=\"Opportunity\"]")
	@CacheLookup
	WebElement OpportunityOption;

	@FindBy(xpath = "//*[text()=\"MaxCompPlan_Interactive_EN.pdf\"]")
	@CacheLookup
	WebElement OpportunityPage;

	@FindBy(xpath = "//*[@class=\"col-lg-6 col-xs-12 image-box-sm p-0\"]/child::*[2]/child::*/child::*/child::*[1]")
	@CacheLookup
	WebElement ProductWithPurposeOption;

	@FindBy(xpath = "//*[@class=\"section section__common section__natural\"]/child::*/child::*/child::*[1]/child::*/child::*[1]")
	@CacheLookup
	WebElement ProductWithPurposePage;

	@FindBy(xpath = "//*[@Class=\"image-card-lg\"]/child::*/child::*/child::*[1]")
	@CacheLookup
	WebElement MaxGivesBackOption;

	@FindBy(xpath = "//*[@class=\"opportunityInfoSubtext2\"]")
	@CacheLookup
	WebElement MaxGivesBackPage;

	@FindBy(xpath = "//div[@id=\"products_page__banner_text_holder\"]/child::*/child::*")
	@CacheLookup
	WebElement ProductBanner;

	@FindBy(xpath = "//div[@id=\"navbarSupportedContent\"]/child::*/child::*[3]/child::*")
	@CacheLookup
	WebElement ShopOption;

	@FindBy(xpath = "//*[@class=\"row all-product-list pt-5\"]/child::*[1]/child::*/child::*[3]/child::*[4]/child::*")
	@CacheLookup
	WebElement ProductPrice;

	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/child::*/child::*[2]/child::*[2]/child::*[2]/child::*/child::*[1]/child::*/child::*/child::*[1]/child::*/child::*[2]/child::*[2]/child::*")
	@CacheLookup
	WebElement MaxATPOption;

	@FindBy(xpath = "//div[@class=\"page-banner--lg bg-color-blue-1\"]")
	@CacheLookup
	WebElement MaxATPPage;

	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/child::*/child::*[2]/child::*[2]/child::*[2]/child::*/child::*[1]/child::*/child::*/child::*[1]/child::*/child::*[2]/child::*[3]/child::*")
	@CacheLookup
	WebElement MaxNFuzeOption;

	@FindBy(xpath = "//div[@class=\"page-banner--lg bg-color-blue-1\"]")
	@CacheLookup
	WebElement MaxNFuzePage;

	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/child::*/child::*[2]/child::*[2]/child::*[2]/child::*/child::*[1]/child::*/child::*/child::*[1]/child::*/child::*[2]/child::*[4]/child::*")
	@CacheLookup
	WebElement MaxOneOption;

	@FindBy(xpath = "//div[@class=\"page-banner--lg bg-color-blue-1\"]")
	@CacheLookup
	WebElement MaxOnePage;

	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/child::*/child::*[2]/child::*[2]/child::*[2]/child::*/child::*[1]/child::*/child::*/child::*[1]/child::*/child::*[2]/child::*[5]/child::*")
	@CacheLookup
	WebElement MaxGLXOption;

	@FindBy(xpath = "//div[@class=\"page-banner--lg bg-color-blue-1\"]")
	@CacheLookup
	WebElement MaxGLXPage;

	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/child::*/child::*[2]/child::*[2]/child::*[2]/child::*/child::*[1]/child::*/child::*/child::*[1]/child::*/child::*[2]/child::*[6]/child::*")
	@CacheLookup
	WebElement Max357Option;

	@FindBy(xpath = "//div[@class=\"page-banner--lg bg-color-blue-1\"]")
	@CacheLookup
	WebElement Max357Page;

	@FindBy(xpath = "//*[text()=\"HELP CENTER\"]")
	@CacheLookup
	WebElement HelpCenterOption;

	@FindBy(xpath = "//*[text()=\"FAQs\"]")
	@CacheLookup
	WebElement HelpCenterPage;

	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/child::*/child::*[2]/child::*[2]/child::*[2]/child::*/child::*[1]/child::*/child::*/child::*[2]/child::*/child::*[2]/child::*[2]/child::*")
	@CacheLookup
	WebElement MaxATPInNutritionals;

	@FindBy(xpath = "//*[@id=\"recommended_products\"]/child::*/child::*[2]/child::*[2]/child::*/child::*[1]/child::*/child::*/child::*[16]/child::*")
	@CacheLookup
	WebElement AddToCartOption;

	@FindBy(xpath = "//*[@id=\"recommended_products\"]/child::*/child::*[2]/child::*[2]/child::*/child::*[1]/child::*/child::*/child::*[3]/child::*[1]")
	@CacheLookup
	WebElement MinusSign;

	@FindBy(xpath = "//*[text()=\"Remove item\"]")
	@CacheLookup
	WebElement RemoveOption;

	@FindBy(xpath = "//*[text()=\"Nutritionals\"]")
	@CacheLookup
	WebElement NutritionalsOption;

	@FindBy(xpath = "//*[text()=\"Maximisez les Forces Naturelles de Votre Corps\"]")
	@CacheLookup
	WebElement NutritionalsPageInFrenchLanguage;

	@FindBy(xpath = "//*[text()=\"Maximizar las fortalezas naturales de su cuerpo\"]")
	@CacheLookup
	WebElement NutritionalsPageInSpanishLanguage;

	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/child::*/child::*[2]/child::*[1]")
	@CacheLookup
	WebElement ProductText;

	@FindBy(xpath = "//*[text()=\"Product Sheet\"]")
	@CacheLookup
	WebElement ProductSheetOption;

	@FindBy(xpath = "//*[@id=\"sizer\"]/following::*[1]")
	@CacheLookup
	WebElement ProductSheet;

	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/child::*/child::*[2]/child::*[2]/child::*[2]/child::*/child::*[1]/child::*/child::*/child::*[1]/child::*/child::*[2]/child::*[1]/child::*")
	@CacheLookup
	WebElement CellgevityOption;

	@FindBy(xpath = "//*[@class=\"padding-x-md text-center\"]/following::*[2]")
	@CacheLookup
	WebElement CellegevityIcon;

	@FindBy(xpath = "//*[@class=\"text-uppercase f_26\"]/following::*[3]")
	@CacheLookup
	WebElement LearMoreOption;

	@FindBy(xpath = "//*[@class=\"page-banner\"]/child::*")
	@CacheLookup
	WebElement CellegevityPage;

	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/child::*/child::*[2]/child::*[2]/child::*[2]/child::*/child::*[1]/child::*/child::*/child::*[1]/child::*/child::*[2]/child::*[1]/child::*")
	@CacheLookup
	WebElement CellegevityOptionForNewZealand;

	@FindBy(xpath = "//*[@class=\"page-banner--lg\"]")
	@CacheLookup
	WebElement CellegevityPageForNewZealand;

	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/child::*/child::*[2]/child::*[2]/child::*[2]/child::*/child::*[1]/child::*/child::*/child::*[2]/child::*/child::*[1]/child::*")
	@CacheLookup
	WebElement NutritionalsOptions;

	@FindBy(xpath = "//*[@Class=\"bg-color--grey-1\"]/child::*/child::*/child::*[2]/child::*/child::*/child::*[2]")
	@CacheLookup
	WebElement CellgevityOptionInOurNutritionalsProducts;

	@FindBy(xpath = "//*[@class=\"page-banner--lg\"]")
	@CacheLookup
	WebElement CellgevityPage;

	@FindBy(xpath = "//*[@class=\"bg-color--grey-1\"]/child::*/child::*/child::*[3]/child::*/child::*/child::*[2]")
	@CacheLookup
	WebElement MaxATPOptionInOurNutritionalsProducts;

	@FindBy(xpath = "//*[@class=\"bg-color--grey-1\"]/child::*/child::*/child::*[4]/child::*/child::*/child::*[2]")
	@CacheLookup
	WebElement MaxNFuzeOptionInOurNutritionalsProducts;

	@FindBy(xpath = "//*[@class=\"bg-color--grey-1\"]/child::*/child::*/child::*[5]/child::*/child::*/child::*[2]")
	@CacheLookup
	WebElement MaxOneOptionInOurNutritionalsProducts;
	
	@FindBy(xpath = "//*[@class=\"bg-color--grey-1\"]/child::*/child::*/child::*[6]/child::*/child::*/child::*[2]")
	@CacheLookup
	WebElement MaxGLXOptionInOurNutritionalsProducts;
	
	@FindBy(xpath = "//*[@class=\"bg-color--grey-1\"]/child::*/child::*/child::*[7]/child::*/child::*/child::*[2]")
	@CacheLookup
	WebElement Max357OptionInOurNutritionalsProducts;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/child::*/child::*[2]/child::*[2]/child::*[2]/child::*/child::*[1]/child::*/child::*/child::*[2]/child::*/child::*[2]/child::*[1]/child::*")
	@CacheLookup
	WebElement CellgevityOptionInNutritionals;
	
	@FindBy(xpath = "//*[@class=\"addtocart-footer\"]/child::*[14]")
	@CacheLookup
	WebElement AddToCart;
	
	@FindBy(xpath = "//*[@class=\"cart-icon my-auto my_cart_div \"]/child::*[2]/child::*[1]")
	@CacheLookup
	WebElement AddedCellgevity;

	/*
	 *  Performed click operation on Australia location
	 */

	public void clickAustraliaLocation() {
		locationAustralia.click();
	}

	/*
	 *  Verify Products option
	 */

	public boolean verifyProductOption() {
		return ProductOption.isDisplayed();
	}

	/*
	 * Performed click operation on Products option
	 */

	public void clickProductOption() {
		ProductOption.click();
	}

	/*
	 *  Verify Products page
	 */

	public boolean verifyProductPage() {
		return ProductPage.isDisplayed();
	}

	/*
	 *  Verify Opportunity option
	 */

	public boolean verifyOpportunityOption() {
		return OpportunityOption.isDisplayed();
	}

	/*
	 *  Performed click operation on Opportunity option
	 */

	public void clickOpportunityOption() {
		OpportunityOption.click();

		//        Set<String> str=ldriver.getWindowHandles();
		//		
		//		Iterator<String> i=str.iterator();
		//		
		//		String parent=i.next();
		//		
		//		String child=i.next();
		//		
		//		ldriver.switchTo().window(child);

		//ldriver.findElement(By.xpath("//*[text()=\"Opportunity\"]"));
	}

	/*
	 *  Verify Opportunity option
	 */

	public boolean verifyOppportunityPage() {

		return OpportunityPage.isDisplayed();
	}

	/*
	 *  Verify Product with Purpose option
	 */

	public boolean verifyProductWithPurposeOption() {
		return ProductWithPurposeOption.isDisplayed();
	}

	/*
	 *  Performed click operation on Product with Purpose option
	 */

	public void clickProductWithPurposeOption() {
		ProductWithPurposeOption.click();
	}

	/*
	 *  Verify Products with purpose page
	 */

	public boolean verifyProductWithPurposePage() {
		return ProductWithPurposePage.isDisplayed();
	}

	/*
	 *  Verify Max Gives Back option
	 */

	public boolean verifyMaxGivesBackOption() {
		return MaxGivesBackOption.isDisplayed();
	}

	/*
	 *  Performed click operation on Max Gives Back option
	 */

	public void clickMaxGivesBackOption() {
		MaxGivesBackOption.click();
	}

	/*
	 *  Verify Max Gives page
	 */

	public boolean verifyMaxGivesBackPage() {
		return MaxGivesBackPage.isDisplayed();
	}

	/*
	 *  Verify product banner
	 */

	public boolean verifyProductBanner() {
		return ProductBanner.isDisplayed();
	}

	/*
	 *  Select country from the dropdown
	 */

	public void selectCountry() {

		WebElement dropCountryEle=ldriver.findElement(By.xpath("//*[@id=\"countries\"]"));

		Select dropCountry=new Select(dropCountryEle);

		dropCountry.selectByVisibleText("Ecuador");

	}

	/*
	 *  Performed click operation on SHop option
	 */

	public void clickShopOption() {
		ShopOption.click();
	}

	/*
	 *  Verify product price
	 */

	public boolean verifyProductPrice() {
		return ProductPrice.isDisplayed();
	}

	/*
	 *  Select Fiji country from the dropdown
	 */

	public void selectFijiCountry() {

		WebElement dropCountryEle=ldriver.findElement(By.xpath("//*[@id=\"countries\"]"));

		Select dropCountry=new Select(dropCountryEle);

		dropCountry.selectByVisibleText("Fiji");

	}

	/*
	 *  Mouse hover over on product option
	 */

	public void mouseHoverOverOnProductsOption() {
		Actions action = new Actions(ldriver);
		WebElement element=ldriver.findElement(By.xpath("//div[@id=\"navbarSupportedContent\"]/child::*/child::*[2]/child::*[1]"));
		action.moveToElement(element).perform();
	}

	/*
	 *  Verify MaxATP option
	 */

	public boolean verifyMaxATPOption() {
		return MaxATPOption.isDisplayed();
	}

	/*
	 *  Performed click operation on MaxATP option
	 */

	public void clickMaxATPOption() {
		MaxATPOption.click();
	}

	/*
	 *  Verify MaxATP page
	 */

	public boolean verifyMaxATPPage() {
		return MaxATPPage.isDisplayed();
	}

	/*
	 *  Verify Max N Fuze option
	 */

	public boolean verifyMaxNFuzeOption() {
		return MaxNFuzeOption.isDisplayed();
	}

	/*
	 *  Performed click operation on Max N Fuze option
	 */

	public void clickMaxNFuzeOption() {
		MaxNFuzeOption.click();
	}

	/*
	 *  Verify Max N Fuze page
	 */

	public boolean verifyMaxNFuzePage() {
		return MaxNFuzePage.isDisplayed();
	}

	/*
	 *  Verify Max One option
	 */

	public boolean verifyMaxOneOption() {
		return MaxOneOption.isDisplayed();
	}

	/*
	 *  Performed click operation on Max One option
	 */

	public void clickMaxOneOption() {
		MaxOneOption.click();
	}

	/*
	 *  Verify Max One page
	 */

	public boolean verifyMaxOnePage() {
		return MaxOnePage.isDisplayed();
	}

	/*
	 *  Verify Max GLX option
	 */

	public boolean verifyMaxGLXOption() {
		return MaxGLXOption.isDisplayed();
	}

	/*
	 *  Performed click operation on Max GLX option
	 */

	public void clickMaxGLXOption() {
		MaxGLXOption.click();
	}

	/*
	 *  Verify Max GLX page
	 */

	public boolean verifyMaxGLXPage() {
		return MaxGLXPage.isDisplayed();
	}

	/*
	 *  Verify Max 357 option
	 */

	public boolean verifyMax357Option() {
		return Max357Option.isDisplayed();
	}

	/*
	 *  Performed click operation on Max 357option
	 */

	public void clickMax357Option() {
		Max357Option.click();
	}

	/*
	 *  Verify Max 357 page
	 */

	public boolean verifyMax357Page() {
		return Max357Page.isDisplayed();
	}

	/*
	 *  Verify Help center option
	 */

	public boolean verifyHelpCenterOption() {
		return HelpCenterOption.isDisplayed();
	}

	/*
	 *  Performed click operation on Help Center option
	 */

	public void clickHelpCenterOption() {
		HelpCenterOption.click();
	}

	/*
	 *  Verify Help Center page
	 */

	public boolean verifyHelpCenterPage() {
		return HelpCenterPage.isDisplayed();
	}

	/*
	 *  Select US country from the dropdown
	 */

	public void selectUnitedStateCountry() {

		WebElement dropCountryEle=ldriver.findElement(By.xpath("//*[@id=\"countries\"]"));

		Select dropCountry=new Select(dropCountryEle);

		dropCountry.selectByVisibleText("United States");

	}

	/*
	 *  Performed click operational on MaxATP in Nutritional
	 */

	public void clickMaxATPInNutritionals() {
		MaxATPInNutritionals.click();
	}

	/*
	 *  Verify Add to cart option
	 */

	public boolean verifyAddToCartOption() {
		return AddToCartOption.isDisplayed();
	}

	/*
	 *  Performed click operation on Add to cart option
	 */

	public void clickAddToCartOption() {
		AddToCartOption.click();
	}

	/*
	 *  Performed click operation on minus sige
	 */

	public void clickMinusSignOption() {
		MinusSign.click();
	}

	/*
	 *  Verify remove option
	 */

	public boolean verifyRemoveOption() {
		return RemoveOption.isDisplayed();
	}

	/*
	 *  Verify Nutritional option
	 */

	public boolean verifyNutritionalsOption() {
		return NutritionalsOption.isDisplayed();
	}

	/*
	 *  Performed click operation on Nutritional option
	 */

	public void clickNutritionalsOption() {
		NutritionalsOption.click();
	}

	/*
	 *  Select French languagf from the dropdowm
	 */

	public void selectFrenchLanguage() {

		WebElement dropCountryEle=ldriver.findElement(By.xpath("//*[@id=\"languages\"]"));

		Select dropCountry=new Select(dropCountryEle);

		dropCountry.selectByVisibleText("French");

	}

	/*
	 *  Verify Nuatrional page in Freanch language 
	 */

	public boolean verifyNutritionalsPageInFrenchLanguage() {
		return NutritionalsPageInFrenchLanguage.isDisplayed();
	}

	/*
	 *  Select Spanish language from  the dropdown
	 */

	public void selectSpanishLanguage() {

		WebElement dropCountryEle=ldriver.findElement(By.xpath("//*[@id=\"languages\"]"));

		Select dropCountry=new Select(dropCountryEle);

		dropCountry.selectByVisibleText("Espagnol");

	}

	/*
	 *  Verify Nutritional page in Spanish language 
	 */

	public boolean verifyNutritionalsPageInSpanishLanguage() {
		return NutritionalsPageInSpanishLanguage.isDisplayed();
	}

	/*
	 *  Select Spanish language from the dropdown
	 */

	public void selectLanguageAsSpanish() {

		WebElement dropCountryEle=ldriver.findElement(By.xpath("//*[@id=\"languages\"]"));

		Select dropCountry=new Select(dropCountryEle);

		dropCountry.selectByVisibleText("Spanish");

	}

	/*
	 *  Verify product sheet text
	 */

	public boolean verifyProductText() {
		return ProductText.isDisplayed();
	}

	/*
	 *  Verify Product sheet option
	 */

	public boolean verifyProductSheetOption() {
		return ProductSheetOption.isDisplayed();

	}

	/*
	 *  Performed click operation on Product sheet option
	 */

	public void clickProductSheetOption() {
		ProductSheetOption.click();

		Set<String> str=ldriver.getWindowHandles();

		Iterator<String> i=str.iterator();

		String parent=i.next();

		String child=i.next();

		ldriver.switchTo().window(child);

	}

	/*
	 *  Verify the product sheet
	 */

	public boolean verifyProductSheet() {
		return ProductSheet.isDisplayed();
	}

	/*
	 *  Selcet Costa Rica country from the dropdown
	 */

	public void selectCountryAsCostaRica() {

		WebElement dropCountryEle=ldriver.findElement(By.xpath("//*[@id=\"countries\"]"));

		Select dropCountry=new Select(dropCountryEle);

		dropCountry.selectByVisibleText("Costa Rica");

	}

	/*
	 *  Performed click operation on Cellgevity option
	 */

	public void clickCellgevityOption() {
		CellgevityOption.click();
	}

	/*
	 *  Verify Cellgevity icon
	 */

	public boolean verifyCellegevityIcon() {
		return CellegevityIcon.isDisplayed();
	}

	/*
	 *  Verify Learn More option
	 */

	public boolean verifyLearMoreOption() {
		return LearMoreOption.isDisplayed();

	}

	/*
	 *  Performed click operation Learn More option
	 */

	public void clickLearMoreOption() {
		LearMoreOption.click();
	}

	/*
	 *  Verify Cellgevity page
	 */

	public boolean verifyCellegevityPage() {
		return CellegevityPage.isDisplayed();
	}

	/*
	 *  Select the New Zealand country from the dropdown
	 */

	public void selectCountryAsNewZealand() {

		WebElement dropCountryEle=ldriver.findElement(By.xpath("//*[@id=\"countries\"]"));

		Select dropCountry=new Select(dropCountryEle);

		dropCountry.selectByVisibleText("New Zealand");

	}

	/*
	 *  Performed click operation on Cellevevity option for New Zealand country
	 */

	public void clickCellegevityOptionForNewZealand() {
		CellegevityOptionForNewZealand.click();
	}

	/*
	 *  Verify Cellegevity page for New Zealand country
	 */

	public boolean verifyCellegevityPageForNewZealand() {
		return CellegevityPageForNewZealand.isDisplayed();
	}

	/*
	 *  Performed click operational on Nutritionals option
	 */

	public void clickNutritionalsOptions() {
		NutritionalsOptions.click();
	}

	/*
	 *  Verify Cellgevity option in our nutritionals products
	 */

	public boolean verifyCellgevityOptionInOurNutritionalsProducts() {
		return CellgevityOptionInOurNutritionalsProducts.isDisplayed();

	}

	/*
	 *  Performed click operation on Cellgevity option in our nutritionals products
	 */

	public void clickCellgevityOptionInOurNutritionalsProducts() {
		CellgevityOptionInOurNutritionalsProducts.click();
	}

	/*
	 *  Verify Cellegevity page
	 */

	public boolean verifyCellgevityPage() {
		return CellgevityPage.isDisplayed();
	}

	/*
	 *  Verify MaxATP option in our nutritionals products
	 */

	public boolean verifyMaxATPOptionInOurNutritionalsProducts() {
		return MaxATPOptionInOurNutritionalsProducts.isDisplayed();
	}


	/*
	 *  Performed click operation on MaxATP option in our nutritionals products
	 */

	public void clickMaxATPOptionInOurNutritionalsProducts() {
		MaxATPOptionInOurNutritionalsProducts.click();
	}

	/*
	 *  Verify MaxNFuze option in our nutritionals products
	 */

	public boolean verifyMaxNFuzeOptionInOurNutritionalsProducts() {
		return MaxNFuzeOptionInOurNutritionalsProducts.isDisplayed();

	}

	/*
	 *  Performed click operation on MaxNFuxze option in our nutritionals products
	 */

	public void clickMaxNFuzeOptionInOurNutritionalsProducts() {
		MaxNFuzeOptionInOurNutritionalsProducts.click();
	}

	/*
	 *  Verify MaxONE option in our nutritionals products
	 */

	public boolean verifyMaxOneOptionInOurNutritionalsProducts() {
		return MaxOneOptionInOurNutritionalsProducts.isDisplayed();
	}

	/*
	 *  Performed click operation on MaxONE option in our nutritionals products
	 */

	public void clickMaxOneOptionInOurNutritionalsProducts() {
		MaxOneOptionInOurNutritionalsProducts.click();

	}
	
	/*
	 * Verify MaxGLX option in our nutritionals products
	 */
	
	public boolean verifyMaxGLXOptionInOurNutritionalsProducts() {
		return MaxGLXOptionInOurNutritionalsProducts.isDisplayed();
		
	}
	
	/*
	 * Performed click operation on MaxGLX option in our nutritionals products
	 */
	
	public void clickMaxGLXOptionInOurNutritionalsProducts() {
		MaxGLXOptionInOurNutritionalsProducts.click();
	}
	
	/*
	 * Verify Max357 option in our nutritionals products
	 */

	public boolean verifyMax357OptionInOurNutritionalsProducts() {
		return Max357OptionInOurNutritionalsProducts.isDisplayed();
	}
	
	/*
	 * Performed click operation on Max357 option in our nutritionals products
	 */
	
	public void clickMax357OptionInOurNutritionalsProducts() {
		Max357OptionInOurNutritionalsProducts.click();
	}
	
	/*
	 * Performed click operation on Cellgevity option in nutritionals
	 */
	
	public void clickCellgevityOptionInNutritionals() {
		CellgevityOptionInNutritionals.click();
	}
	
	/*
	 * Performed click operation on Add to Cart option
	 */
	
	public void clickAddToCart() {
		AddToCart.click();
	}
	
	/*
	 * Verify Added Cellgevity in Add to cart
	 */
	
	public boolean verifyAddedCellgevity() {
		return AddedCellgevity.isDisplayed();
	}
	
	
	
	
	
	
}
