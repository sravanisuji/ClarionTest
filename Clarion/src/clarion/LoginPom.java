package clarion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPom 
{
	@FindBy(name="txtUsername")
	private  WebElement un;
	@FindBy(name="txtPassword")
	private  WebElement pwd;
	@FindBy(className="button_white")
	private  WebElement button;
	@FindBy(xpath="//font[text()='Invalid Username/password']")
	private WebElement errormsg;
	
	public WebElement getErrormsg() {
		return errormsg;
	}
	public WebElement getUn() {
		return un;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getButton() {
		return button;
	}
	

}
