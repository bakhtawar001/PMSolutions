package FMSolutions;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



import TestData.TestData;
import Functions.HelpingFunctions;
import Locators.LocatorsFile;


public class Amazon_BuyBook extends ExecutionFile{
	
	public static LocatorsFile FMSolutions=PageFactory.initElements(driver, LocatorsFile.class);
	
	public static void Login() throws InterruptedException, AWTException, IOException
	{
		//test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
		//Provide Amazon URL in launched WebBrowser
		String path = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(path+"\\ExcelData\\ExcelData.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastRow = sheet.getLastRowNum();
		System.out.println("Last row- "+lastRow);
		for(int i=0; i<=lastRow; i++)
		{
			Row row = sheet.getRow(i);
			int lastCell = row.getLastCellNum();
			for(int j=0; j<lastCell; j++)
		{
				
				Cell cell = row.getCell(j);
				if(j==0)
				{
				String Environmenturl = cell.getStringCellValue();
				System.out.println(Environmenturl);
				driver.get(Environmenturl);
				
				}
				if(j==1)
				{
					//Click("Click Continue button",Amazon.Login);
					String email = cell.getStringCellValue();
					//Input("Provide Email",Amazon.Email,email);
				//	Click("Click Continue button",Amazon.Continue);
				}
				if(j==2)
				{
					String password = cell.getStringCellValue();
				//	Input("Provide Email",Amazon.Password,password);
				//	Click("Click Continue button",Amazon.Signin);
				}
				
		}
			//Click("Click Continue button",Amazon.menu);
			//Click("Click Continue button",Amazon.Signout);
		}
		 
	}
	
/*public static void SearchBook() throws InterruptedException, AWTException, IOException
	{
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
		//Provide Amazon URL in launched WebBrowser
		driver.get(envirnment);
		Thread.sleep(2000);
		//Search Book 
		Input("Provide Book Name",Amazon.SearchBook,TestData.BookName);
		Thread.sleep(3000);
		//Click Go to search book
		Click("Click Go button",Amazon.GOButton);
		Thread.sleep(5000);
		//Book displayed
		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'"+TestData.BookName+"')]")).isDisplayed());
		 
	}
	public static void Click_BookLink() throws InterruptedException, AWTException, IOException
	{
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
		//Click on Book Name
		Click("Access Book by click on it",Amazon.ClickBookName);
		Thread.sleep(2000);
		Assert.assertTrue(Amazon.PaperBackButton.isDisplayed());
		
	}
	public static void AddToCart_Book() throws InterruptedException, AWTException, IOException
	{
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
		//Click on PaperBack button
		Click("Click on PaperBackButton",Amazon.PaperBackButton);
		//Add book to Shopping cart
		Click("Click CartBook",Amazon.AddToCart);
		Thread.sleep(2000);
		Assert.assertTrue(Amazon.BookAddedToCart.isDisplayed());
		
		
	}
	public static void DeleteBookFromAddToCart() throws InterruptedException, AWTException, IOException
	{
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
		//Click Cart button
		Click("Click Cart Button",Amazon.CartButton);
		//Open Qty dropDown
		Click("Click QTY DropDown",Amazon.QTYDropDown);
		//Delete item from once select DeleteQty option
		Click("Click DeleteQty",Amazon.DeleteQty);
		Thread.sleep(2000);
		Assert.assertTrue(Amazon.DeleteBookFromShoppingCart.isDisplayed());
		
		
	}*/
	
}
