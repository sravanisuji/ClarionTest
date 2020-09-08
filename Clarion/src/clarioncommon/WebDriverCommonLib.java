package clarioncommon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib 
{
	
	public void selectItemFromList(WebElement wb,String itemname)
	{
		Select s= new Select(wb);
		s.selectByVisibleText(itemname);
	}

}
