package com.deere.testCases;


	import static com.deere.global.CommonFunctions.assertTrue;
	

	import org.testng.annotations.Test;


	import com.deere.global.CoreTestCase;
	import com.deere.global.FunctionalMethods;
	import com.deere.global.GlobalDataProvider;
	import com.deere.global.InputEnvironmentDetails;
	import com.deere.global.InputTestDetails;
	import com.deere.pages.NavigationClass;
import com.deere.pages.DTACNavigationclass;
import com.deere.pages.PegaLoginPage;
	import com.deere.pages.SiteMinderLoginPage;
import com.deere.pages.homepage.HomePage;
import com.deere.pages.NavigationClass;
import com.deere.pages.solutionsearch.DTACSolutionPage;
import com.deere.pages.solutionsearch.SolutionSearchHomePage;

	public class TC6399_CreateDTACCaseService extends CoreTestCase {
		/**
		 * Author : Lahari Pasupuleti
		 * Description : Cross mapping of machine information for Solution search DA user
		 * @param testData
		 * @param environmentDetails
		 * @param inputBrowserDetails
		 * @param driver
		 * @return
		 * @throws InterruptedException 
		 * @throws Throwable
		 */
		
		@Test(dataProvider =  GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
		public static void test_TC6399_CreateDTACCaseService(InputEnvironmentDetails inputEnvironmentDetails, InputTestDetails testData) throws InterruptedException {
			SiteMinderLoginPage siteMinderLoginPage;
			PegaLoginPage pegaLoginPage;
			DTACNavigationclass DTACnavigationclass ;
			DTACSolutionPage DTACsolutionpage ;
			FunctionalMethods functionalMethods = new FunctionalMethods();
			
			//Login to Site Minder
			siteMinderLoginPage = functionalMethods.openPortal(getDriver(), inputEnvironmentDetails.getUrl());
										
			//Verify that Site Minder Page is opened
			assertTrue(siteMinderLoginPage.hasPortalOpened(), "Site Minder Portal is not opened");
											
			//Login to Site Minder Site
			pegaLoginPage = functionalMethods.loginToSiteMinder(siteMinderLoginPage, testData.getTestdata()[0], testData.getTestdata()[1]);
											
			//Verify that Logged in to Site Minder Site
			assertTrue(pegaLoginPage.hasPegaLoginPageDisplayed(), "Login to Site Minder Site is Unsuccessful");
											
			//Login to PEGA site
			DTACnavigationclass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2], testData.getTestdata()[3],DTACNavigationclass.class);
									
			//Verify that Landing Page is displayed
			assertTrue(DTACnavigationclass.isLandingPageDisplayed(),"Landing page is not displayed");
			
			//click on Home
			DTACsolutionpage = DTACnavigationclass.ClickonHomebutton();
			
			//Verify that navigated to Home page
			assertTrue(DTACsolutionpage.hasJohnDeereImgDisplayed(), "JoheDeere Image is not showing");
			
			//Click on DTAC Case Service 
			DTACsolutionpage = DTACnavigationclass.ClickonDTACbutton();	
			
			//Click on Add CustomerInfo
		    DTACsolutionpage = functionalMethods.SwitchtoFrameandclickonAddCustmer(DTACsolutionpage,testData.getTestdata()[4]); 
		   
		    //Choose  model DD Value
		    DTACsolutionpage = functionalMethods.ProductInfoModel(DTACsolutionpage,testData.getTestdata()[5]);
			 
		    //Entered the ProductInfo Usage TxtBox Details
	        DTACsolutionpage = functionalMethods.ProductInfoUsasge(DTACsolutionpage,testData.getTestdata()[6]);
	      
	        //Selecting the ProductInfo Units DD Value
	        DTACsolutionpage = functionalMethods.ProductInfoUnits(DTACsolutionpage,testData.getTestdata()[7]);
	      
	        //Entered the ProductInfo PIN TxtBox Details
	        DTACsolutionpage = functionalMethods.ProductInfoPIN(DTACsolutionpage,testData.getTestdata()[8]);
	        
	        DTACsolutionpage =DTACsolutionpage.ProductInfoSubmit();
	        
	        //Selected the ProductInfoFunArea
	        DTACsolutionpage = functionalMethods.ProductInfoFunArea(DTACsolutionpage,testData.getTestdata()[9]);
	        
	        //Selected the ProductInfoFunCode
	        DTACsolutionpage = functionalMethods.ProductInfoFunCode(DTACsolutionpage,testData.getTestdata()[10]);
	        
	       //Selected the Priority
	        DTACsolutionpage = functionalMethods.Priority(DTACsolutionpage,testData.getTestdata()[11]);
	        
	        //Selected the Origin
	        DTACsolutionpage = functionalMethods.Origin(DTACsolutionpage,testData.getTestdata()[12]);
	        
	        //Entering the ProblemDetailsSummary
	        DTACsolutionpage = functionalMethods.ProblemDetailsSummary(DTACsolutionpage,testData.getTestdata()[13]);
	        
	      //Complaint    
	        DTACsolutionpage = functionalMethods.SwitchtoFrameandenterdcompliance(DTACsolutionpage,testData.getTestdata()[15]);
 
	      //Entering the ProblemDetailsSummary
	        DTACsolutionpage = functionalMethods.OperatingConditions(DTACsolutionpage,testData.getTestdata()[14]);
	       
	        

	        //Accept
	        DTACsolutionpage =DTACsolutionpage.DTACAccept();
	        
	        
	}
	}


