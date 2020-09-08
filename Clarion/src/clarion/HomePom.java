package clarion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePom 
{
	@FindBy(xpath="//b[text()='Logged as: ']")
	private WebElement text;
	@FindBy(linkText="Log Promise")
	private WebElement logpromiselink;

	public WebElement getLogpromiselink() {
		return logpromiselink;
	}

	public WebElement getText() {
		return text;
	}

}
