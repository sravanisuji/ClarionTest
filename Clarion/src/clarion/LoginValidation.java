package clarion;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import clarioncommon.Base;
import junit.framework.Assert;

public class LoginValidation extends Base
{
	@Test
	public void login()
	{
		LoginPom lp=PageFactory.initElements(driver,LoginPom.class);
		lp.getButton().click();
		String text=lp.getErrormsg().getText();
		Assert.assertEquals(text, "Invalid Username/password");
		Reporter.log("Error message displaying",true);
	}

}
