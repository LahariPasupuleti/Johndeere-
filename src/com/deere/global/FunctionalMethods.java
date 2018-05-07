package com.deere.global;

import org.openqa.selenium.WebDriver;

import com.deere.pages.DTACNavigationclass;
import com.deere.pages.NavigationClass;
import com.deere.pages.PegaLoginPage;
import com.deere.pages.SiteMinderLoginPage;
import com.deere.pages.solutionsearch.DTACSolutionPage;
import com.deere.pages.solutionsearch.SolutionSearchHomePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


/**
 * 
 * @author kw75188
 * Description : This Class contains Functional Methods that are used in Test Scripts
 *
 */

public class FunctionalMethods {

	private ExtentTest logger = ExtentReportManager.getLogger();
	private PegaLoginPage pegaLoginPage;
	private SolutionSearchHomePage solutionSearchHomePage;
	private DTACSolutionPage DTACsolutionpage ;
	private DTACNavigationclass DTACnavigationclass ;
	
	//Open the Site Minder Portal
	public SiteMinderLoginPage openPortal(WebDriver driver, String url) {
		driver.get(url);
		logger.log(LogStatus.PASS, "Opening Site Minder Portal");
		return new SiteMinderLoginPage(driver);
	}
	
	//Login to Site Minder Portal
	public PegaLoginPage loginToSiteMinder(SiteMinderLoginPage siteMinderLoginPag, String username, String password) {
		pegaLoginPage = siteMinderLoginPag.enterUserName(username).enterPassword(password).clickSignInBtn();
		logger.log(LogStatus.PASS, "Logging in to Site Minder");
		return pegaLoginPage;
	}
	
	//Login to Pega Site
	public <T> T loginToPega(PegaLoginPage loginPage, String username, String password, Class<T> landingPage) {
		Object obj = loginPage.enterUserId(username).enterPassword(password).clickLogInBtn(landingPage);
		logger.log(LogStatus.PASS, "Logging in to Pega Site");
		return (T) obj;
	}
		
	
	//Navigate to Solution search page
	public SolutionSearchHomePage navigateToSolutionSearchHome(NavigationClass navigationPag) {
		solutionSearchHomePage = navigationPag.clickSolutionSearchHomeLink();
		logger.log(LogStatus.PASS, "Navigating to Case Search home page");
		return solutionSearchHomePage;
	}
	

	//Enter the decal model for TSS user
	public SolutionSearchHomePage enterDecalModelDetails(SolutionSearchHomePage solutionSearchHomePage,String decalModel) {
		solutionSearchHomePage =  solutionSearchHomePage.switchToIFrame().enterDecalModel(decalModel);
		logger.log(LogStatus.PASS, "Entering the decal model");
		return solutionSearchHomePage;
	}

	//Enter the  model for TSS/DT user for solution search
			public SolutionSearchHomePage SSenterModelDetails(SolutionSearchHomePage solutionSearchHomePage,String model) {
			solutionSearchHomePage =  solutionSearchHomePage.switchToIFrame().SSenterModel(model);
			logger.log(LogStatus.PASS, "Entering the model");
			return solutionSearchHomePage;
			}
	//Enter the  Category for TSS/DT user for solution search
			public SolutionSearchHomePage SSenterCategoryName(SolutionSearchHomePage solutionSearchHomePage,String category) {
			solutionSearchHomePage =  solutionSearchHomePage.SSenterCategory(category);
			logger.log(LogStatus.PASS, "Entering the Category field");
			return solutionSearchHomePage;
			}
			
	//Kiran : enter model details for Solution search DA user
	 public SolutionSearchHomePage SSenterModel(SolutionSearchHomePage solutionSearchHomePag, String model) {
		solutionSearchHomePage = solutionSearchHomePag.SSenterModel(model);
		logger.log(LogStatus.PASS, "Entering the model");
		return solutionSearchHomePage;
	}  
	    //Lahari : Enter Add customer info by TSS user
			public DTACSolutionPage SwitchtoFrameandclickonAddCustmer(DTACSolutionPage DTACsolutionpage, String userid) throws InterruptedException {
				Thread.sleep(3000);
				DTACsolutionpage = DTACsolutionpage.SwitchtoFrameandclickonAddCustmer(userid);
				logger.log(LogStatus.PASS, "Entering the Add Customer Info Details");
				return DTACsolutionpage;
			}
	 
	  //Lahari : Enter model details for Product Info TSS user
		public DTACSolutionPage ProductInfoModel(DTACSolutionPage DTACsolutionpage, String model) {
			DTACsolutionpage = DTACsolutionpage.ProductInfoModel(model);
			logger.log(LogStatus.PASS, "Selecting the product Information model");
			return DTACsolutionpage;
		}
		//Lahari : Enter usageTxtBox details for Product Info TSS user
		public DTACSolutionPage ProductInfoUsasge(DTACSolutionPage DTACsolutionpage, String model) {
					DTACsolutionpage = DTACsolutionpage.ProductInfoUsasge(model);
					logger.log(LogStatus.PASS, "Entering the product Information Usage Details");
					return DTACsolutionpage;
				}

     //Lahari : Enter usageTxtBox details for Product Info TSS user
		public DTACSolutionPage ProductInfoUnits(DTACSolutionPage DTACsolutionpage, String units) {
					DTACsolutionpage = DTACsolutionpage.ProductInfoUnits(units);
					logger.log(LogStatus.PASS, "Selecting  the product Information Units DD");
					return DTACsolutionpage;
				}
		  //Lahari : Enter PIN details for Product Info TSS user
			public DTACSolutionPage ProductInfoPIN(DTACSolutionPage DTACsolutionpage, String PIN) {
							DTACsolutionpage = DTACsolutionpage.ProductInfoPIN(PIN);
							logger.log(LogStatus.PASS, "Entering the product Information PIN Details");
							return DTACsolutionpage;
						}
			
			//Lahari : Enter functional Area of  Product Info by TSS user
			public DTACSolutionPage ProductInfoFunArea(DTACSolutionPage DTACsolutionpage, String FunArea) throws InterruptedException {
				DTACsolutionpage = DTACsolutionpage.ProductInfoFunArea(FunArea);
				logger.log(LogStatus.PASS, "Selecting the product Information model");
				return DTACsolutionpage;
			}
			
			//Lahari : Enter functional Code of  Product Info by TSS user
			public DTACSolutionPage ProductInfoFunCode(DTACSolutionPage DTACsolutionpage, String FunCode) throws InterruptedException {
				DTACsolutionpage = DTACsolutionpage.ProductInfoFunCode(FunCode);
				logger.log(LogStatus.PASS, "Selecting the product Information model");
				return DTACsolutionpage;
			}
			
			//Lahari : Priority 
			public DTACSolutionPage Priority(DTACSolutionPage DTACsolutionpage, String Priority) throws InterruptedException {
				DTACsolutionpage = DTACsolutionpage.Priority(Priority);
				logger.log(LogStatus.PASS, "Selecting the Priority  DD Value");
				return DTACsolutionpage;
			}
			
			//Lahari : Origin
			public DTACSolutionPage Origin(DTACSolutionPage DTACsolutionpage, String Origin) throws InterruptedException {
				DTACsolutionpage = DTACsolutionpage.Origin(Origin);
				logger.log(LogStatus.PASS, "Selecting the Origin DD Value");
				return DTACsolutionpage;
			}
			//Lahari : ProblemDetailsSummary
			public DTACSolutionPage ProblemDetailsSummary(DTACSolutionPage DTACsolutionpage, String summary) {
				DTACsolutionpage = DTACsolutionpage.ProblemDetailsSummary(summary);
				logger.log(LogStatus.PASS, "Entering  the summary details");
				return DTACsolutionpage;
			}
//			
			//Lahari : Operating Conditions
			public DTACSolutionPage OperatingConditions(DTACSolutionPage DTACsolutionpage, String condition) {
				DTACsolutionpage = DTACsolutionpage.OperatingConditions(condition);
				logger.log(LogStatus.PASS, "Entering  the Operating Conditions details");
				return DTACsolutionpage;
			}

			
			//Lahari:Complaint Details
			public DTACSolutionPage SwitchtoFrameandenterdcompliance(DTACSolutionPage DTACsolutionpage, String ComplaintDetails) throws InterruptedException {
				DTACsolutionpage = DTACsolutionpage.SwitchtoFrameandenterdcompliance(ComplaintDetails);
				logger.log(LogStatus.PASS, "Entering the compliance Details");
				return DTACsolutionpage;
			}

}

