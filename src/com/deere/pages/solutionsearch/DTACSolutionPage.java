package com.deere.pages.solutionsearch;

	import java.util.List;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import com.deere.global.CommonFunctions;
import com.deere.pages.DTACNavigationclass;

	
		public class DTACSolutionPage {
			
			@FindBy(xpath="(//div[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing'])[1]")
			private WebElement NewDrafttxtvery;//Home Button
			
			@FindBy(xpath="//img[@data-test-id='20151130072517041540902']")
			private WebElement JohnDeereimg;
			
			@FindBy(xpath="//input[@data-test-id='2015100603215503417556']")
			private WebElement ProductInfoModelDD;
			
			@FindBy(xpath="//i[@data-test-id='201512210438090148308293']")
			private WebElement AddProdBtn;//addproductinfo
			
			@FindBy(xpath="//input[@data-test-id='2016041507482102291263']")
			private WebElement UsageTxtbox;
			
			@FindBy(name="PegaGadget0Ifr")
		    private WebElement iframe;
			
			@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")   
			private WebElement compliframe;
		    
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
			
		  @FindBy(xpath="//select[@data-test-id='2016041507482102301328']")
		   private WebElement UnitsDD ;
		  
		   @FindBy(xpath="(//input[@id='PinNumber'])[2]")
		   private WebElement ProductInfoPIN ;
		 
		
		 @FindBy(xpath="//button[@data-test-id='20140919030420037410647']")
		   private WebElement ProductInfosubmit ;
		 
		 
		 @FindBy(xpath="//input[@data-test-id='201605021128120388258']")
		   private WebElement funarea ;
		 
		 @FindBy(xpath="//input[@data-test-id='2016050211281203883185']")
		   private WebElement funcode ;
		 
		 @FindBy(xpath="//*[@id='CasePriority']")
		   private WebElement priorityDD ;
		 
		 @FindBy(xpath="//*[@id='Origin']")
		   private WebElement OriginDD ;
		 
		 @FindBy(xpath="//*[@id='RULE_KEY']/div/div/div/div/div/div/input")
		   private WebElement summ ;
		 
		 @FindBy(xpath="//textarea[@data-test-id='20160413133657003093999']")
		   private WebElement operatingcond ;
		 
		 
		 @FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")
		   private WebElement Compl ;
		
		 @FindBy(xpath="(//button[@data-test-id='20141218012517063013102'])[1]")
		   private WebElement accept ;
		 
		@FindBy(xpath="//table[@id='bodyTbl_right']/tbody//div[@class='oflowDiv']//span[@class='match-highlight']")
		private WebElement modelAutoOptions;
		
		
		  protected WebDriver driver;
			
			public DTACSolutionPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
				this.driver = driver;
			}
				
		
//		public boolean hasSolutionSearchHomePageDisplayed() {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			CommonFunctions.waitAndSwitchToFrame(driver, iframePegaGadget);
////			/return CommonFunctions.isElementExist(driver, searchtextbox);
//		}
		
		
		//Lahari: Verifying Home Button 
		  public boolean hasNewDraftTxtDisplayed() {
			return CommonFunctions.isElementExist(driver, NewDrafttxtvery);
		}
		  public boolean hasJohnDeereImgDisplayed() {
				return CommonFunctions.isElementExist(driver, JohnDeereimg);
			}
		  
		   //Lahari: Add customer info 
		  	public DTACSolutionPage SwitchtoFrameandclickonAddCustmer(String userid) throws InterruptedException {
		  		
				CommonFunctions.waitAndSwitchToFrame(driver, iframe);
				 CommonFunctions.waitForElement(driver, AddCustBtn).click();
				 Thread.sleep(3000);
				 CommonFunctions.waitForElement(driver, Userid).sendKeys(userid);
				CommonFunctions.waitForElement(driver, UserSearchBtn).click();
				Thread.sleep(3000);
				CommonFunctions.waitForElement(driver, UserSubmitBtn).click();
				Thread.sleep(2000);
				
				 return   new DTACSolutionPage(driver);
			}
		  
		  
		//Lahari: Model DropDown value selection
		    public DTACSolutionPage ProductInfoModel(String model) {
		   	CommonFunctions.waitForElement(driver, AddProdBtn).click();
				CommonFunctions.waitForElement(driver, ProductInfoModelDD).sendKeys(model);
				ProductInfoModelDD.sendKeys(Keys.ARROW_DOWN);
				CommonFunctions.waitForElement(driver, modelAutoOptions);
				try {
				if(modelAutoOptions.getText().contains(model))
					modelAutoOptions.click();
				
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				return new DTACSolutionPage(driver);
			}
		 
		   //Lahari:ProductInfoUsasge
	    public DTACSolutionPage ProductInfoUsasge(String usage) {
			CommonFunctions.waitForElement(driver, UsageTxtbox).sendKeys(usage);
			return new DTACSolutionPage(driver);
		}
	  //Lahari:ProductInfoUnits
	    public DTACSolutionPage ProductInfoUnits (String units) {
	    	CommonFunctions.selectFromDropdown(driver, units, UnitsDD);
			//CommonFunctions.waitForElement(driver, UnitsDD);
			return new DTACSolutionPage(driver);
		
	    }
	  //Lahari:ProductInfoPIN  and ProductInfo submit button
	    public DTACSolutionPage ProductInfoPIN(String PIN) {
			CommonFunctions.waitForElement(driver, ProductInfoPIN).sendKeys(PIN);
			
			return new DTACSolutionPage(driver);
		}
	    //Lahari :ProductInfo Submit
	    public DTACSolutionPage ProductInfoSubmit() throws InterruptedException {
	    	CommonFunctions.waitForElement(driver, ProductInfosubmit).click();
	    	Thread.sleep(3000);
	    	return new DTACSolutionPage(driver);
		}
	   
	  //Lahari: ProductInfoFunArea DropDown value selection
	    public DTACSolutionPage ProductInfoFunArea(String FunArea) throws InterruptedException {
	   	  CommonFunctions.waitForElement(driver, funarea).sendKeys(FunArea);
	   	  Thread.sleep(2000);
	   	  funarea.sendKeys(Keys.ARROW_DOWN);
			CommonFunctions.waitForElement(driver, modelAutoOptions);
			try {
			if(modelAutoOptions.getText().contains(FunArea))
				modelAutoOptions.click();
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return new DTACSolutionPage(driver);
		}
	  //Lahari: ProductInfoFunCode DropDown value selection
	    public DTACSolutionPage ProductInfoFunCode(String FunCode) throws InterruptedException {
	    	Thread.sleep(2000);
	   	   CommonFunctions.waitForElement(driver, funcode).sendKeys(FunCode);
	   	Thread.sleep(3000);
	   	   funcode.sendKeys(Keys.ARROW_DOWN);
			CommonFunctions.waitForElement(driver, modelAutoOptions);
			try {
			if(modelAutoOptions.getText().contains(FunCode))
				modelAutoOptions.click();
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return new DTACSolutionPage(driver);
		}
	    
	  //Lahari:Priority
	    public DTACSolutionPage Priority(String Priority) throws InterruptedException {
	    	Thread.sleep(2000);
	    	CommonFunctions.selectFromDropdown(driver, Priority, priorityDD);
	    	Thread.sleep(2000);
			return new DTACSolutionPage(driver);
		
	    }
	    
	  //Lahari:Origin
	    public DTACSolutionPage Origin(String Origin) throws InterruptedException {
	    	Thread.sleep(2000);
	    	CommonFunctions.selectFromDropdown(driver, Origin, OriginDD);
	    	Thread.sleep(2000);
			return new DTACSolutionPage(driver);
		
	    }
	    //Lahari:Summary
	    public DTACSolutionPage ProblemDetailsSummary(String summary) {
	    	CommonFunctions.waitForElement(driver,summ).sendKeys(summary);
		   	return new DTACSolutionPage(driver);
	}
	    
	  //Lahari:Summary
	    public DTACSolutionPage OperatingConditions(String condition) {
	    	CommonFunctions.waitForElement(driver,operatingcond).sendKeys(condition);
		   	return new DTACSolutionPage(driver);
	}
	    
	  //Lahari:ComplaintDetails
	  	public DTACSolutionPage SwitchtoFrameandenterdcompliance(String ComplaintDetails) throws InterruptedException {
	  		CommonFunctions.waitAndSwitchToFrame(driver, compliframe);
			 CommonFunctions.waitForElement(driver, Compl).sendKeys(ComplaintDetails);
			 driver.switchTo().parentFrame();
			 Thread.sleep(2000);
			  return   new DTACSolutionPage(driver);
		}
	  
	    
	  //Lahari :DTAc Case Accept
	    public DTACSolutionPage DTACAccept() throws InterruptedException {
	    	CommonFunctions.waitForElement(driver, accept).click();
	    	Thread.sleep(3000);
	    	return new DTACSolutionPage(driver);
		}
		}



