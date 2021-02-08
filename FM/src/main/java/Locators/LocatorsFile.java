package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorsFile {
	
	
	
	@FindBy(xpath="//input[contains(@id,'organizationName')]") public WebElement OrganizationName;
	@FindBy(xpath="//input[contains(@id,'userid')]") public WebElement Userid;
	@FindBy(xpath="//input[contains(@id,'password')]") public WebElement Password;
	@FindBy(xpath="//input[contains(@id,'confirmPassword')]") public WebElement ConfirmPassword;
	@FindBy(xpath="//input[contains(@id,'firstname')]") public WebElement 	Firstname;
	@FindBy(xpath="//input[contains(@id,'lastname')]") public WebElement 	Lastname;
	@FindBy(xpath="//input[contains(@id,'email')]") public WebElement Email;
	@FindBy(xpath="//input[contains(@id,'address')]") public WebElement Address;
	@FindBy(xpath="//input[contains(@id,'city')]") public WebElement City;
	@FindBy(xpath="//input[contains(@id,'zip')]") public WebElement Zip;
	@FindBy(xpath="//input[contains(@id,'phone')]") public WebElement Phone;
	@FindBy(xpath="//input[contains(@id,'secretCode')]") public WebElement 	SecretCode;
	@FindBy(xpath="//select[contains(@id,'state')]") public WebElement 	State;
	@FindBy(xpath="//select[contains(@id,'country')]") public WebElement 	Country;
	@FindBy(xpath="//input[contains(@value,'Create new organization user')]") public WebElement CreateNewOrganizationUser;
	@FindBy(xpath="//font[contains(text(),'Success')]") public WebElement RecordSubmitted;
	
	
}
