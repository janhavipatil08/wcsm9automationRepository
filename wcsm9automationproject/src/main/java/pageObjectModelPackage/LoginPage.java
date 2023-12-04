package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name= "username") private WebElement usnTB;
	@FindBy(name = "pwd") private WebElement passTB;
	@FindBy(id = "loginButton") private WebElement loginButton;
	@FindBy(name = "remember") private WebElement keepMeLoggedInChecked;
	@FindBy(partialLinkText ="Actimin") private WebElement actiMindLinl;
	

	//initialization
	public LoginPage(WebDriver driver)
	{
	
	PageFactory.initElements(driver,this);

}
    //utilization

	
	public WebElement getUsnTB() {
		return usnTB;
	}


	public WebElement getPassTB() {
		return passTB;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getKeepMeLoggedInChecked() {
		return keepMeLoggedInChecked;
	}


	public WebElement getActiMindLinl() {
		return actiMindLinl;
	}


	//operational methods
	public void validLogin(String validusn, String validpass)
	
	{
		usnTB.sendKeys(validusn);
		passTB.sendKeys(validpass);
		loginButton.click();
	}
	
	
	public void invalidlogin(String invalidusn , String invalidpass)
	{
		usnTB.sendKeys(invalidusn);
		passTB.sendKeys(invalidpass);
		loginButton.click();
		usnTB.clear();
	}
	
	
	
		
}
