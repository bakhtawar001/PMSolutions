package Scenarios;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Functions.HelpingFunctions;


public class ExecutionFile extends HelpingFunctions{


	@BeforeTest
			public void Startup() throws InterruptedException, AWTException, IOException{
		
				StartBrowser.StartupBrowser();
				
			} 
	

	@Test(priority=0)
	public  void Verify_CompanyRegistration() throws InterruptedException, AWTException, IOException
	{
		CompanyRegistration.CompanyRegistrations();	 
				 	
	}
	
	
	 @AfterTest
	 public void teardown(){
	  	
	 // 	driver.close();
	 }

}
