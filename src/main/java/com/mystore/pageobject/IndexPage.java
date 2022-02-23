package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass{
	
	
	@FindBy(linkText = "Sign in")
	 public WebElement SigninBtn;
	
	@FindBy(css = "div[id='header_logo'] > a")
	public WebElement StoreLogo;
	
	@FindBy(id = "search_query_top")
	public WebElement SearchProductBox;
	
	@FindBy(name = "submit_search")
	public WebElement SubmitSearch;
	
	public IndexPage() {
		PageFactory.initElements(getDriver(), this);
	}
	 
	 public LoginPage clickSignin() {
	     SigninBtn.click();
		return new LoginPage();
	 }
	
	 public boolean VerifyStoreLogo() {
		 return StoreLogo.isDisplayed();
	 }
	 
	 public String getMyStoreTitle() {
			String myStoreTitle=getDriver().getTitle();
			return myStoreTitle;
		}
	 
	 public SearchResultPage searchProduct(String productName) throws Throwable {
			//SearchProductBox.getAttribute(productName);
			SearchProductBox.sendKeys(productName);
			SubmitSearch.click();
			Thread.sleep(3000);
			return new SearchResultPage();
		}
	 
	  

}
