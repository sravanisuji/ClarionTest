package clarion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListPOM 
{
	@FindBy(id="cboEmp")
	private WebElement listboxsearch;
	@FindBy(name="btnSearch")
	private WebElement searchfinalbutton;
	@FindBy(xpath="//font[text()='Promise added successfully']")
	private WebElement successmsg;
	@FindBy(xpath="//b[text()='LOGOUT']")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getSuccessmsg() {
		return successmsg;
	}
	public WebElement getListboxsearch() {
		return listboxsearch;
	}
	public WebElement getSearchfinalbutton() {
		return searchfinalbutton;
	}

}
