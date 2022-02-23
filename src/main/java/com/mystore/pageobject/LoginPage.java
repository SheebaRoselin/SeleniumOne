package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass {
	
	
	@FindBy(id ="email_create")
	public WebElement CreateAcctnEmail;
	
	@FindBy(id ="SubmitCreate")
	public WebElement CreateAccountBtn;
	
	@FindBy(id ="email")
	public WebElement Emailaddress;
	
	@FindBy(id ="passwd")
	public WebElement Password;
	
	@FindBy(id = "SubmitLogin" )
    public WebElement LoginBtn;
	
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public AccountCreationPage createNewAccount(String newEmail) throws Throwable {
		CreateAcctnEmail.sendKeys(newEmail);
		CreateAccountBtn.click();
		return new AccountCreationPage();
	}
	
	public HomePage login(String uname, String pswd) throws Throwable {
		Emailaddress.sendKeys(uname);
		Password.sendKeys(pswd);
		LoginBtn.click();
		return new HomePage();
	}
	
	 /* Emailaddress
	 * ***************************************************************
	 */
	 public void setCreateEmailaddress(String value) {
		 CreateAcctnEmail.sendKeys(value);
	 }
	 
	 
	 /*
	  * SubmitCreate
	  * ***************************************************************
	  */

	 
	  public void clickSubmitCreate() {
		  CreateAccountBtn.click();
	  }
	  
	  
	  /*
	   * Emailaddress2
	   * ***************************************************************
	   */
	   public void setEmailaddress(String value) {
		   Emailaddress.sendKeys(value);
	   }

	  /*
	   * Password
	   * ***************************************************************
	   */
	   public void setPassword(String value) {
		   Password.sendKeys(value);
	   }

	   /*
	    * SubmitLogin
	    * ***************************************************************
	    */
	    public void clickSubmitLogin() {
	    	LoginBtn.click();
	    }

}
