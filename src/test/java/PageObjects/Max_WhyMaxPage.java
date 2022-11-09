package PageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Max_WhyMaxPage {
	
public WebDriver ldriver;
	
	public Max_WhyMaxPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//*[text()=\"Australia\"]")
	@CacheLookup
	WebElement locationAustralia;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/child::*/child::*[1]/child::*[1]")
	@CacheLookup
	WebElement WhyMaxOption;
	
	@FindBy(xpath = "//*[text()=\"WHY MAX?\"]")
	@CacheLookup
	WebElement WhyMaxPage;
	
	@FindBy(xpath = "//a[@id=\"max-difference\"]")
	@CacheLookup
	WebElement MaxDifferenceOption;

	@FindBy(xpath = "//h1[text()=\"HOW ARE WE DIFFERENT?\"]")
	@CacheLookup
	WebElement MaxDifferencePage;
	
	@FindBy(xpath = "//a[@id=\"science\"]")
	@CacheLookup
	WebElement ScienceOption;
	
	@FindBy(xpath = "//h1[text()=\"Our Science\"]")
	@CacheLookup
	WebElement SciencePage;
	
	@FindBy(xpath = "//a[@id=\"company\"]")
	@CacheLookup
	WebElement CompanyOption;
	
	@FindBy(xpath = "//h2[text()=\"Our Mission\"]")
	@CacheLookup
	WebElement CompanyPage;
	
	@FindBy(xpath = "//a[@id=\"media\"]")
	@CacheLookup
	WebElement MediaOption;
	
	@FindBy(xpath = "//h2[text()=\"Media\"]")
	@CacheLookup
	WebElement MediaPage;
	
	@FindBy(xpath = "//*[text()=\"Puerto Rico 2017\"]")
	@CacheLookup
	WebElement Puerto_Rico_2017;
	
	@FindBy(xpath = "//*[text()=\"MAX GIVES BACK - Puerto Rico 2017\"]")
	@CacheLookup
	WebElement Puerto_Rico_2017Page;
	
	@FindBy(xpath = "//*[@id=\"MGB_2017_modal\"]/child::*/child::*/child::*[3]/child::*")
	@CacheLookup
	WebElement CloseButton;
	
	@FindBy(xpath = "//*[@id=\"movie_player\"]/div[4]/button")
	@CacheLookup
	WebElement PlayButton;
	
	@FindBy(xpath = "//*[text()=\"Phuket, Thailand 2015\"]")
	@CacheLookup
	WebElement PhuketThailand2015;
	
	@FindBy(xpath = "//*[text()=\"MAX GIVES BACK - Phuket, Thailand 2015\"]")
	@CacheLookup
	WebElement PhuketThailand2015Page;
	
	@FindBy(xpath = "//*[text()=\"Punta Cana, Dominican Republic 2014\"]")
	@CacheLookup
	WebElement PuntaCanaDominicanRepublic2014;
	
	@FindBy(xpath = "//*[text()=\"MAX GIVES BACK - Punta Cana, Dominican Republic 2014\"]")
	@CacheLookup
	WebElement PuntaCanaDominicanRepublic2014Page;
	
	@FindBy(xpath = "//*[text()=\"Peru 2018\"]")
	@CacheLookup
	WebElement Peru2018;
	
	@FindBy(xpath = "//*[text()=\"MAX GIVES BACK - Peru 2018\"]")
	@CacheLookup
	WebElement Peru2018Page;
	
	@FindBy(xpath = "//*[text()=\"South Africa 2019\"]")
	@CacheLookup
	WebElement SouthAfric2019;
	
	@FindBy(xpath = "//*[text()=\"MAX GIVES BACK - South Africa 2019\"]")
	@CacheLookup
	WebElement SouthAfric2019Page;
	
	@FindBy(xpath = "//*[text()=\"Notre Mission \"]")
	@CacheLookup
	WebElement Companypage;
	
	@FindBy(xpath = "//*[text()=\"Vous voulez en apprendre davantage sur les produits, la science et l'occasion d'affaires Max? Explorez nos pages audio et vidéo et vous verrez des vidéos exclusives et des fichiers audio à propos de Max International. Après que vous les ayez visionnés et écoutés, partagez-les avec les autres afin qu'ils puissent découvrir la différence Max par eux-mêmes.\"]")
	@CacheLookup
	WebElement Mediapage;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/child::*/child::*[1]/child::*[2]/child::*[2]/child::*/child::*[1]/child::*/child::*/child::*[1]/child::*/child::*[2]/child::*/child::*")
	@CacheLookup
	WebElement MaxGivesBack;
	
	@FindBy(xpath = "//*[@id=\"max_difference\"]/following::*[1]/child::*/child::*/child::*[1]/child::*[1]")
	@CacheLookup
	WebElement MaxGivesBackPage;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/child::*/child::*[1]/child::*[2]/child::*[2]/child::*/child::*[1]/child::*/child::*/child::*[3]/child::*/child::*[1]/child::*")
	@CacheLookup
	WebElement Scienceoption;
	
	@FindBy(xpath = "//*[@id=\"research_team_section\"]/child::*/child::*/child::*[4]/child::*/child::*/child::*[2]/child::*[1]/child::*")
	@CacheLookup
	WebElement ScottMonmii;
	
	@FindBy(xpath = "//*[text()=\"Scott graduated with a B.A. degree from San Jose State University, received an M.B.A. from Boston University, and completed a summer business program at Sophia University, Tokyo, Japan. Scott has served as both General Manager of a research, development and manufacturing company for specialty chemicals, and as Director of Operations for a biotechnology company that developed vaccines and cancer therapeutics. His responsibilities included manufacturing and quality control, overseeing and implementation of sales and marketing programs, as well as customer service and accounting.\"]")
	@CacheLookup
	WebElement ScottMonmiiPage;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/child::*/child::*[1]/child::*[2]/child::*[2]/child::*/child::*[1]/child::*/child::*/child::*[4]/child::*/child::*[1]/child::*")
	@CacheLookup
	WebElement MediaOptionInWhyMax;
	
	@FindBy(xpath = "//*[@id=\"why-max\"]/child::*[5]/child::*/child::*[1]/child::*/child::*[1]/child::*/child::*[3]/child::*")
	@CacheLookup
	WebElement BlogOption;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/child::*/child::*[1]/child::*[2]/child::*[2]/child::*/child::*[1]/child::*/child::*/child::*[2]/child::*/child::*[2]/child::*/child::*")
	@CacheLookup
	WebElement ExecutiveTeam;
	
	@FindBy(xpath = "//*[@id=\"executives_section\"]/child::*/child::*/child::*[11]/child::*/child::*/child::*[2]/child::*[1]/child::*")
	@CacheLookup
	WebElement PaulaHernandezOption;
	
	@FindBy(xpath = "//*[@class=\"wm-center-it center-it\"]")
	@CacheLookup
	WebElement WhyMaxBannerImage;
	
	@FindBy(xpath = "//*[@id=\"executives_section\"]/child::*/child::*/child::*[9]/child::*/child::*/child::*[2]/child::*[1]/child::*")
	@CacheLookup
	WebElement JenniferArias;
	
	@FindBy(xpath = "//*[text()=\"Jennifer’s diversity, specialized skills, patience, and diligence helped her achieve a prestigious law degree. Add in her team-player approach and focus on customer satisfaction and success to see what an asset she is to Max. She is ideal for making Max even greater than it already is. Her dedication to her work is exceeded only by her love for her friends and family, spending time with them, and her devotion to her faith.\"]")
	@CacheLookup
	WebElement JenniferAriasBio;
	
	/*
	 * Performed click operation on Australia location
	 */
	
	public void clickAustraliaLocation() {
		locationAustralia.click();
	}
	
	/*
	 * Verify Why Max option
	 */
	
	public boolean verifyWhyMaxOption() {
		return WhyMaxOption.isDisplayed();
	}
	
	/*
	 * Performed click operation on Why Max option
	 */
	
	public void clickWhyMaxOption() {
		WhyMaxOption.click();
	}
	
	/*
	 * Verify Why Max page
	 */
	
	public boolean verifyWhyMaxPage() {
		return WhyMaxPage.isDisplayed();
	}
	
	/*
	 * Verify Max Difference option
	 */
	
	public boolean verifyMaxDifferenceOption() {
		return MaxDifferenceOption.isDisplayed();
		
	}
	
	/*
	 * Performed click operation on Max Difference option
	 */
	
	public void clickMaxDifferenceOption() {
		MaxDifferenceOption.click();
		
	}
	
	/*
	 * Verify Max Difference page
	 */
	
	public boolean verifyMaxDifferencePage() {
		return MaxDifferencePage.isDisplayed();
		
	}
	
	/*
	 * Verify Science option
	 */
	
	public boolean verifyScienceOption() {
		return ScienceOption.isDisplayed();
		
	}
	
	/*
	 * Performed click operation on Science option
	 */
	
	public void clickScienceOption() {
		ScienceOption.click();
		
	}
	
	/*
	 * Verify Science page
	 */
	
	public boolean verifySciencePage() {
		return SciencePage.isDisplayed();
	}
	
	/*
	 * Verify Company option
	 */
	
	public boolean verifyCompanyOption() {
		return CompanyOption.isDisplayed();
		
	}
	
	/*
	 * Performed click operation on Company option
	 */
	
	public void clickCompanyOption() {
		CompanyOption.click();
		
	}
	
	/*
	 * Verify Company page
	 */
	
	public boolean verifyCompanyPage() {
		return CompanyPage.isDisplayed();
		
	}
	
	/*
	 * Verify Media option
	 */
	
	public boolean verifyMediaOption() {
		return MediaOption.isDisplayed();
	}
	
	/*
	 * Performed click operation on Media option
	 */
	
	public void clickMediaOption() {
		MediaOption.click();
		
	}
	
	/*
	 * Verify Media page
	 */
	
	public boolean verifyMediaPage() {
		return MediaPage.isDisplayed();
		
	}
	
	/*
	 * Verify Puerto_Rico_2017 option
	 */
	
	public boolean verifyPuerto_Rico_2017Option() {
		return Puerto_Rico_2017.isDisplayed();
	}
	
	/*
	 * Performed click operation on Puerto_Rico_2017 option
	 */
	
	public void clickPuerto_Rico_2017Option() {
			
			WebElement ele = ldriver.findElement(By.xpath("//*[text()=\"Puerto Rico 2017\"]"));
			JavascriptExecutor js = (JavascriptExecutor)ldriver;
			js.executeScript("arguments[0].click()", ele);
			
		}
	
	/*
	 * verify Puerto_Rico_2017 page
	 */
	
	public boolean verifyPuerto_Rico_2017Page() {
		return Puerto_Rico_2017Page.isDisplayed();
	}
	
	/*
	 * Performed click operation on close button
	 */
	
	public void clickCloseButton() {
		CloseButton.click();
	}
	
	/*
	 * Performed click operation on Play bitton
	 */
	
	public void clickPlayButton() {
		PlayButton.click();
	}
	
	/*
	 * Verify PhuketThailand2015 option 
	 */
	
	public boolean verifyPhuketThailand2015Option() {
		return PhuketThailand2015.isDisplayed();
	}
	
	/*
	 * Performed click operation on PhuketThailand2015 option
	 */
	
	public void clickPhuketThailand2015() {
			
			WebElement ele = ldriver.findElement(By.xpath("//*[text()=\"Phuket, Thailand 2015\"]"));
			JavascriptExecutor js = (JavascriptExecutor)ldriver;
			js.executeScript("arguments[0].click()", ele);
			
		}
	
	/*
	 * Verify PhuketThailand2015 page
	 */
	
	public boolean verifyPhuketThailand2015Page() {
		return PhuketThailand2015Page.isDisplayed();
	}
	
	/*
	 * Verify PuntaCanaDominicanRepublic2014 option
	 */
	
	public boolean verifyPuntaCanaDominicanRepublic2014Option() {
		return PuntaCanaDominicanRepublic2014.isDisplayed();
		
	}
	
	/*
	 * Performed click operation on PuntaCanaDominicanRepublic2014
	 */
	
	public void clickPuntaCanaDominicanRepublic2014() {
			
			WebElement ele = ldriver.findElement(By.xpath("//*[text()=\"Punta Cana, Dominican Republic 2014\"]"));
			JavascriptExecutor js = (JavascriptExecutor)ldriver;
			js.executeScript("arguments[0].click()", ele);
			
		}
	
	/*
	 * Verify PuntaCanaDominicanRepublic2014 page
	 */
	
	
	public boolean verifyPuntaCanaDominicanRepublic2014Page() {
		return PuntaCanaDominicanRepublic2014Page.isDisplayed();
	}
	
	/*
	 * Verify Peru2018 option
	 */
	
	public boolean verifyPeru2018Option() {
		return Peru2018.isDisplayed();
		
	}
	
	/*
	 * Performed click operation on Peru2018
	 */
	
	public void clickPeru2018() {
			
			WebElement ele = ldriver.findElement(By.xpath("//*[text()=\"Peru 2018\"]"));
			JavascriptExecutor js = (JavascriptExecutor)ldriver;
			js.executeScript("arguments[0].click()", ele);
			
		}
	
	/*
	 * Verify Peru2018 page
	 */
	
	public boolean verifyPeru2018Page() {
		return Peru2018Page.isDisplayed();
		
	}
	
	/*
	 * Verify SouthAfric2019 option
	 */
	
	public boolean verifySouthAfric2019Option() {
		return SouthAfric2019.isDisplayed();
		
	}
	
	/*
	 * Performed click operation on SouthAfric2019
	 */
	
	public void clickSouthAfric2019() {
			
			WebElement ele = ldriver.findElement(By.xpath("//*[text()=\"South Africa 2019\"]"));
			JavascriptExecutor js = (JavascriptExecutor)ldriver;
			js.executeScript("arguments[0].click()", ele);
			
		}
	
	/*
	 * Verify SouthAfric2019 page
	 */
	
	public boolean verifySouthAfric2019Page() {
		return SouthAfric2019Page.isDisplayed();
		
	}
	
	/*
	 * Select language from the dropdown
	 */
	
	public void selectLanguage() {
		
        WebElement dropLanguageEle = ldriver.findElement(By.xpath("//*[@id=\"languages\"]"));
		
		Select dropLanguage = new Select(dropLanguageEle);
		
		dropLanguage.selectByVisibleText("French");
		
	}
	
	/*
	 * Verify company page language
	 */
	
	public boolean verifyCompanyPageLanguage() {
		return Companypage.isDisplayed();
	}
	
	/*
	 * Verify media page language
	 */
	
	public boolean verifyMediaPageLanguage() {
		return Mediapage.isDisplayed();
	}
	
	/*
	 * Verify country dropdown list
	 */
	
	public void verifyCountryDropDownList() {
		
		Select dropCountry = new Select(ldriver.findElement(By.id("countries")));
		
		List actualList =  new ArrayList();
		
		List<WebElement> country = dropCountry.getOptions();
		
		for(WebElement ele : country)
		{
			String data = ele.getText();
			actualList.add(data);
		}
		
		List temp = new ArrayList();
		
		temp.addAll(actualList);
		
		//Ascending 
		
		Collections.sort(temp);
		
		Assert.assertTrue(actualList.equals(temp));
	}
	
	/*
	 * Verify language dropdown list
	 */

        public void verifyLanguageDropDownList() {
		
		Select dropCountry = new Select(ldriver.findElement(By.id("languages")));
		
		List actualList =  new ArrayList();
		
		List<WebElement> country = dropCountry.getOptions();
		
		for(WebElement ele : country)
		{
			String data = ele.getText();
			actualList.add(data);
		}
		
		List temp = new ArrayList();
		
		temp.addAll(actualList);
		
		//Ascending 
		
		Collections.sort(temp);
		
		Assert.assertTrue(actualList.equals(temp));
	}
        
        /*
    	 * Mouse hover over on why max option
    	 */
        
        public void mouseHoverOverOnWhyMaxtOption() {
    		Actions action = new Actions(ldriver);
    		WebElement element=ldriver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/child::*/child::*[1]/child::*[1]"));
    		action.moveToElement(element).perform();
    	}
        
        /*
    	 * Performed click operation on MaxGivesBack option
    	 */
        
        public void clickMaxGivesBackOption() {
        	MaxGivesBack.click();
        	
        }
        
        /*
    	 * verify MaxGivesBack page
    	 */
        
        public boolean verifyMaxGivesBackPage() {
        	return MaxGivesBackPage.isDisplayed();
        	
        }
        
        /*
    	 * Performed click operation on Science option
    	 */
        
        public void clickScienceoption() {
        	Scienceoption.click();
        }
        
        /*
    	 * Verify ScottMonmii option
    	 */
        
        public boolean verifyScottMonmiiOption() {
        	return ScottMonmii.isDisplayed();
        	
        }
        
        /*
    	 * Performed click operation on ScottMonmii option
    	 */
        
        public void clickScottMonmiiOption() {
        	ScottMonmii.click();
        }
        
        /*
    	 * Verify ScottMonmii page
    	 */
        
        public boolean verifyScottMonmiiPage() {
			return ScottMonmiiPage.isDisplayed();
        	
        }
        
        /*
    	 * Performed click operation on Media option in WhyMax
    	 */
        
        public void clickMediaOptionInWhyMax() {
        	MediaOptionInWhyMax.click();
        }
        
        /*
    	 * Verify Blog option
    	 */
        
        public boolean verifyBlogOption() {
        	return BlogOption.isDisplayed();
        }
        
        /*
    	 * Verify Executive Team option
    	 */
        
        public boolean verifyExecutiveTeamOption() {
        	return ExecutiveTeam.isDisplayed();
        }
        
        /*
    	 * Performed click operation on Executive Team option
    	 */
        
        public void clickExecutiveTeamOption() {
        	ExecutiveTeam.click();
        }
        
        /*
    	 * Verify Paula Hernandez option
    	 */
        
        public boolean verifyPaulaHernandezOption() {
        	return PaulaHernandezOption.isDisplayed();
        }
        
        /*
    	 * verify Why Max Banner Image
    	 */
        
        public boolean verifyWhyMaxBannerImage() {
        	return WhyMaxBannerImage.isDisplayed();
        }
        
        /*
    	 * Verify Jennifer Arias option
    	 */
        
        public boolean verifyJenniferAriasOption() {
        	return JenniferArias.isDisplayed();
        
        }
        
        /*
    	 * Performed click operation on Jennifer Arias option
    	 */
        
        public void clickJenniferAriasOption() {
        	JenniferArias.click();
        	
        }
        
        /*
    	 * Verify Jennifer Arias bio
    	 */
        
        public boolean verifyJenniferAriasBio() {
        	return JenniferAriasBio.isDisplayed();
        	
        }
	
}
