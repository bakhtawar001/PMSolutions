package Scenarios;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import TestData.TestData;
import Locators.LocatorsFile;

public class CompanyRegistration extends ExecutionFile {
	public static LocatorsFile FM=PageFactory.initElements(driver, LocatorsFile.class);
	
	@SuppressWarnings("resource")
	public static void CompanyRegistrations() throws InterruptedException, AWTException, IOException
	{
	 try {
		String path = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(path+"\\ExcelFile\\CompanyRegistrations.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastRow = sheet.getLastRowNum();
		System.out.println("Last row- "+lastRow);
		
		
		for(int i=1; i<=lastRow; i++)
		{
			Row row = sheet.getRow(i);
		
				String OrganizationName =row.getCell(0).getStringCellValue();
				Input("Provide Organization Name",FM.OrganizationName,OrganizationName);
				
				Input("Provide UserId",FM.Userid ,TestData.userid);
				
				String password =row.getCell(1).getStringCellValue();
				Input("Provide Password",FM.Password ,password );
				
				String Confirmpassword =row.getCell(2).getStringCellValue();
				Input("Provide ConfirmPassword",FM.ConfirmPassword ,Confirmpassword);
				
				String Firstname =row.getCell(3).getStringCellValue();
				Input("Provide Firstname",FM.Firstname ,Firstname );
				
				String Lastname =row.getCell(4).getStringCellValue();
				Input("Provide Lastname",FM.Lastname,Lastname  );
				
				String Email =row.getCell(5).getStringCellValue();
				Input("Provide EmailAddress",FM.Email ,Email );
				
				String Address = row.getCell(6).getStringCellValue();
				Input("Provide Address",FM.Address ,Address );
				
				String City = row.getCell(7).getStringCellValue();
				Input("Provide City",FM.City ,City );
				
				String StateValue = row.getCell(8).getStringCellValue();
				Select State = new Select(driver.findElement(By.id("state")));
				State.selectByVisibleText(StateValue);
				
				int zip=(int) row.getCell(9).getNumericCellValue();
				System.out.println(zip);
				String zipcode=Integer.toString(zip);
				Input("Provide ZipCode",FM.Zip ,zipcode );
	
				String CountryValue = row.getCell(10).getStringCellValue();
				Select Country = new Select(driver.findElement(By.id("country")));
				Country.selectByVisibleText(CountryValue);
				
				
				int Phone=(int) row.getCell(11).getNumericCellValue();
				System.out.println(Phone);
				String Phoneno=Integer.toString(Phone);
				Input("Provide Phoneno",FM.Phone ,Phoneno);
				
				Input("Provide SecretCode",FM.SecretCode ,TestData.SecretCode);
				
				Click("Click Continue button",FM.CreateNewOrganizationUser);
				Thread.sleep(2000);
				
				 List<WebElement> Locatorvisibility=driver.findElements(By.xpath("//font[contains(text(),'Success')]"));
				 int Locatorcount=Locatorvisibility.size();
				 System.out.println(Locatorcount);
				 if(Locatorcount==1)
				 {
					 Assert.assertTrue(true);
				 }
				 else
				 {
					 driver.get(TestData.URL);
				 }
			
				
				
			
		}
	 }
		catch(NoSuchElementException e)
		{
		   e.getMessage();
		 
		}
		
		 
	}
	

}
