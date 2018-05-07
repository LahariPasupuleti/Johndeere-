package com.deere.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.deere.global.CommonFunctions;
import com.deere.pages.solutionsearch.DTACSolutionPage;
import com.deere.pages.solutionsearch.SolutionSearchHomePage;


public class DTACNavigationclass {

	@FindBy(xpath="//a[@class='JD_Header_Secondary']")
	private WebElement header;
	
    @FindBy(xpath="//table[@id='RULE_KEY'][@aria-label='Home']")
	private WebElement Homebtn;//Home Button
    
    @FindBy(xpath="//*[@id=\"RULE_KEY\"]/div[2]/div/div/div[3]/div/div/div/div/div/div/div/span/button")
	private WebElement createDTACCase;//click on create DATC Case
    
    @FindBy(name="PegaGadget0Ifr")
    private WebElement iframe;
    
    @FindBy(xpath="//*[@data-test-id='2018042008174902341739']")
	private WebElement AddCustBtn;//add customer info button
	
	@FindBy(xpath="//iframe[@id='PegaWebGadget0']")
	private WebElement iframePegaGadget;//switching of frame for add customer info
	
    @FindBy(xpath="//input[@id='ContactSearchUserID']")
	private WebElement Userid;//userid input textbox filed
	
	@FindBy(xpath="(//img[@data-test-id='20151105105237095115103'])[1]")
	private WebElement UserSearchBtn;//searchbutton
	
	@FindBy(xpath="//button[@data-test-id='20140919030420037410647']")
	private WebElement UserSubmitBtn;//submit button
	
	
	@FindBy(xpath="//h2[@id='headerlabel9945']")
	private WebElement VfycustmerInfo;//after submit verify customer info details
	
	@FindBy(xpath="//i[@data-test-id='201512210438090148308293']")
	private WebElement AddProdBtn;//addproductinfo
	
	@FindBy(xpath="//input[@data-test-id='2015100603215503417556']")
	private WebElement ProductInfoModelDD;
	
	@FindBy(xpath="//input[@data-test-id='2016041507482102291263']")
	private WebElement UsageTxtbox;
	
   @FindBy(xpath="//input[@id='ModelString'][@title='Select Decal Model']")
	private WebElement modelTxtbox;
	
	@FindBy(xpath="//table[@id='bodyTbl_right']/tbody//div[@class='oflowDiv']//span[@class='match-highlight']")
	private WebElement modelAutoOptions;
	
	@FindBy(xpath="//input[@data-test-id='2015100603215503417556']")
	private WebElement ModelSearch;
	
	@FindBy(xpath="//input[@data-test-id='2016041507482102291263']")
	private WebElement ModelUsage;
	
	@FindBy(xpath="//select[@data-test-id='2016041507482102301328']")
	private List <WebElement> ModelUnits;
	
	@FindBy(xpath="//input[@data-test-id='2018011910223709195337']")
	private WebElement ModelPin;
	
	@FindBy(xpath="//button[@data-test-id='20140919030420037410647']")
	private WebElement ModelSubmitBtn;
	
	@FindBy(xpath="//input[@data-test-id='201605021128120388258']")
	private WebElement FuncArea;
	
	@FindBy(xpath="(//span[text()='CCE'])[2]")
	private WebElement FunAreaSelect;
	
	@FindBy(xpath="//input[@id='FUNC_CODE_NM']")
	private WebElement FunCode;
	
	@FindBy(xpath="//span[text()='1602']")
	private WebElement FunCodeSelect;
	
	@FindBy(xpath="(//select[@data-test-id='20160208091722005978870'])[1]")
	private List<WebElement> CasePriority;
	
	@FindBy(xpath="(//select[@data-test-id='20160208091722005978870'])[3]")
	private List<WebElement> CaseOrigin;
	
	@FindBy(xpath="//input[@name='$PpyWorkPage$pCaseSummary']")
	private WebElement DTACSummary;
	
	@FindBy(xpath="//*[@id='cke_1_contents']/iframe")
	private WebElement DTACComplaint;
	
	@FindBy(xpath="//textarea[@data-test-id='20160413133657003093999']")
	private WebElement DTACOperatingConditions;
	
	@FindBy(xpath="(//button[@data-test-id='20141218012517063013102'])[3]")
	private WebElement DTACAcceptClose;
	
	
    protected WebDriver driver;
    public  DTACNavigationclass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
    //Welcome text verification
  	public boolean isLandingPageDisplayed() {
  		return CommonFunctions.isElementExist(driver, header);
  	}
    
    //Click on Home Button
  	public  DTACSolutionPage ClickonHomebutton() {
  		CommonFunctions.waitForElement(driver,Homebtn).click();
  		return new DTACSolutionPage(driver);
  	}
    //Click on DTAC Button
  	public  DTACSolutionPage  ClickonDTACbutton() {
  		CommonFunctions.waitForElement(driver, createDTACCase).click();
      return new DTACSolutionPage(driver);
  	}
  

}
    

   
	

	

	



