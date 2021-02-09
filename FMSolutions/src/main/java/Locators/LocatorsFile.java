package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorsFile {
	
	
	@FindBy(xpath="//div[contains(@id,'nav-tools')]/descendant::a[contains(@id,'nav-link-accountList')]") public WebElement Login;
	@FindBy(xpath="//input[contains(@name,'email')]") public WebElement Email;
	@FindBy(xpath="//input[contains(@id,'continue')]") public WebElement Continue;
	@FindBy(xpath="//input[contains(@name,'password')]") public WebElement Password;
	@FindBy(xpath="//input[contains(@id,'signInSubmit')]") public WebElement Signin;
	@FindBy(xpath="//div[contains(@class,'nav-left')]/descendant::a[contains(@id,'nav-hamburger-menu')]") public WebElement menu;
	@FindBy(xpath="//div[contains(@id,'hmenu-content')]/descendant::li/a[contains(text(),'Sign Out')]") public WebElement Signout;
	
	
	
	@FindBy(xpath="//input[contains(@id,'twotabsearchtextbox')]") public WebElement SearchBook;
	@FindBy(xpath="//input[contains(@value,'Go')]") public WebElement GOButton;
	@FindBy(xpath="//img[contains(@alt,'A Friendly Introduction to Software Testing')]") public WebElement ClickBookName;
	@FindBy(xpath="//span[contains(@class,'a-button-inner')]//a[contains(@id,'a-autoid-5-announce')]") public WebElement PaperBackButton;
	@FindBy(xpath="//input[contains(@id,'add-to-cart-button-ubb')]") public WebElement AddToCart;
	@FindBy(xpath="	//h1[contains(text(),'Added to Cart')]") public WebElement BookAddedToCart;
	@FindBy(xpath="//a[contains(@id,'hlb-view-cart-announce')]") public WebElement CartButton;
	@FindBy(xpath="//span[contains(@id,'a-autoid-0-announce')]") public WebElement QTYDropDown;
	@FindBy(xpath="//ul[contains(@role,'listbox')]/li/a[contains(@id,'dropdown1_0')]") public WebElement DeleteQty;
	@FindBy(xpath="	//h1[contains(text(),'Your Shopping Cart is empty.')]") public WebElement DeleteBookFromShoppingCart;

}
