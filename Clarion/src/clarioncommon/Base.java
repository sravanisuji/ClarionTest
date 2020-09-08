package clarioncommon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import clarion.ListPOM;
import clarion.LoginPom;

public class Base
{
	public static WebDriver driver=null;
	public WebDriverCommonLib lib= new WebDriverCommonLib();
	@BeforeClass
	public void beforeClass()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void beforeMethod()
	{
		driver.get("http://182.74.238.221/clarion_promise_qa/index.php#");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		LoginPom lp=PageFactory.initElements(driver,LoginPom.class);
		lp.getUn().sendKeys("sanjeetk@clariontechnologies.co.in");
		lp.getPwd().sendKeys("clarion");
		lp.getButton().click();
	}
	@AfterMethod
	public void afterMethod()
	{
		ListPOM lp=PageFactory.initElements(driver,ListPOM.class);
		lp.getLogout().click();
	}
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}  
	

}
