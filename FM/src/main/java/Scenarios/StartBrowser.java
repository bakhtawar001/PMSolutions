package Scenarios;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Functions.HelpingFunctions;
import TestData.TestData;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StartBrowser extends HelpingFunctions {
	
	public static void StartupBrowser() throws InterruptedException, AWTException, IOException
	
	
	{

        WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-incognito");
	  	options.addArguments("--disable-popup-blocking");
	  	options.addArguments("--disable-extensions");
	  	options.addArguments("--disable-dev-shm-usage");
	 	options.addArguments("--start-maximized");
	 	driver=new ChromeDriver(options);	
		/*ExtentHtmlReporter htmlReporter;
		
			htmlReporter = new ExtentHtmlReporter("./Report/"+Suite);
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			extent.setSystemInfo("URL", envirnment);
			htmlReporter.config().setDocumentTitle("Amazon");
			htmlReporter.config().setReportName("Amazon Execution Reports");
			htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
			htmlReporter.config().setTheme(Theme.DARK);
			htmlReporter.getStartTime();
			htmlReporter.getEndTime();*/
		driver.get(TestData.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		
		}
}
