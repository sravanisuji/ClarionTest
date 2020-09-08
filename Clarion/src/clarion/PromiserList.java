package clarion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import clarioncommon.Base;

public class PromiserList extends Base
{
	@Test
	public void list()
	{
		ListPOM lpm=PageFactory.initElements(driver,ListPOM.class);
		HomePom hp=PageFactory.initElements(driver,HomePom.class);
		LogPromisePOM lpp=PageFactory.initElements(driver,LogPromisePOM.class);
		hp.getLogpromiselink().click();
		lib.selectItemFromList(lpp.getSelectfrm(),"Sonali test");
		lpp.getPromisetextarea().sendKeys("Finally Added Sonali Successfully");
		lpp.getLogpromisebutton().click();
		String succssmsg=lpm.getSuccessmsg().getText();
		Assert.assertEquals(succssmsg,"Finally Added Sonali Successfully");
		lib.selectItemFromList(lpm.getListboxsearch(),"Sonali test");
		lpm.getSearchfinalbutton().click();
		
	}
  
}
