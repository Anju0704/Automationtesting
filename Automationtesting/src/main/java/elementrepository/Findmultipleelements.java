package elementrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Findmultipleelements extends Base{
	public void multipleelements()
	{
		WebElement element1=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		element1.click();
		List<WebElement> element2=  driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement element3:element2)
		{
			element3.sendKeys("Test 1");
		} 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Findmultipleelements obj=new Findmultipleelements();
		obj.initialisebrowser();
		obj.multipleelements();

	}

}
