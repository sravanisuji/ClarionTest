package clarion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogPromisePOM 
{
	@FindBy(name="cboEmp")
	private WebElement selectfrm;
	@FindBy(name="txtPromise")
	private WebElement promisetextarea;
	@FindBy(name="btnSubmit")
	private WebElement logpromisebutton;

	public WebElement getLogpromisebutton() {
		return logpromisebutton;
	}

	public WebElement getPromisetextarea() {
		return promisetextarea;
	}

	public WebElement getSelectfrm() {
		return selectfrm;
	}

}
