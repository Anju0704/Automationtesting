package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 
public class Locators extends Base{
	public void locatingbyID()
	{
	WebElement message =driver.findElement(By.id("single-input-field"));
	WebElement message1 =driver.findElement(By.id("gridCheck"));
	WebElement message2 =driver.findElement(By.id("validationCustomUsername"));
	WebElement message3 =driver.findElement(By.id("is_checked"));
	WebElement message4 =driver.findElement(By.id("button-two"));
	}
	public void locatingbyClass()
	{
		WebElement elementname= driver.findElement(By.className("form-check-input"));
		WebElement elementname1= driver.findElement(By.className("form-control datepicker"));
		WebElement elementname2= driver.findElement(By.className("form-control filter"));
		WebElement elementname3 = driver.findElement(By.className("btn btn-primary"));
		WebElement elementname4 = driver.findElement(By.className("form-control"));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators obj=new Locators ();
		obj.initialisebrowser();
		obj.locatingbyID();
		obj.locatingbyClass();
	}

}
