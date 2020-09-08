package clarion;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import clarioncommon.Base;
import junit.framework.Assert;

public class LoginUser extends Base
{
	@Test
   public void loginUser()
   {
		LoginPom lp=PageFactory.initElements(driver,LoginPom.class);
		HomePom hp=PageFactory.initElements(driver,HomePom.class);
		lp.getUn().sendKeys("sanjeetk@clariontechnologies.co.in");
		lp.getPwd().sendKeys("clarion");
		lp.getButton().click();
		String msg=hp.getText().getText();
		boolean cond=msg.contains("Logged");
		Assert.assertTrue(msg,cond);
		Reporter.log("user able to login successfully",true);
   }
}
