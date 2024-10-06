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
	public void locating_by_name()
	{
		WebElement message=driver.findElement(By.className("viewport"));
		WebElement message1=driver.findElement(By.className("author"));
		WebElement message2=driver.findElement(By.className("keywords"));
		WebElement message3=driver.findElement(By.className("description"));
	}
	public void locating_by_linktext()
	{
		WebElement message=driver.findElement(By.linkText("check-box-demo.php"));
		WebElement message1=driver.findElement(By.linkText("ajax-form-submit.php"));
		WebElement message2=driver.findElement(By.linkText("select-input.php"));
		WebElement message3=driver.findElement(By.linkText("form-submit.php"));
	}
	public void locating_by_partiallinktext()
	{
		WebElement message=driver.findElement(By.partialLinkText("simple-form"));
		WebElement message1=driver.findElement(By.partialLinkText("ajax-form"));
		WebElement message2=driver.findElement(By.partialLinkText("radio-button"));
		WebElement message3=driver.findElement(By.partialLinkText("check-box"));
	}
//CSS SELECTOR
	public void tag_id()//tagid synatax tag#id
	{
		WebElement message=driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement message1=driver.findElement(By.cssSelector("input#value-b"));
		WebElement message2=driver.findElement(By.cssSelector("input#value-a"));
		WebElement message3=driver.findElement(By.cssSelector("input#inlineRadio1"));
		
		
	}
	public void tag_class()//tagclass synatax tag.class
	{
		WebElement message=driver.findElement(By.cssSelector("input.form-check-input"));
		WebElement message1=driver.findElement(By.cssSelector("input.btn btn-primary"));
		WebElement message2=driver.findElement(By.cssSelector("input.form-control datepicker"));
		WebElement message3=driver.findElement(By.cssSelector("input.form-check-input"));
		
		
	}
	public void tag_attribute()//tagattribute synatax tag[attribute=value]

	{
		WebElement message=driver.findElement(By.cssSelector("input[placeholder=state]"));
		WebElement message1=driver.findElement(By.cssSelector("input[placeholder=Message]"));
		WebElement message2=driver.findElement(By.cssSelector("input[name=daterange]"));
		WebElement message3=driver.findElement(By.cssSelector("input[value=false]"));
		
	}
	public void tag_class_attribute()//tagclassattribute synatax tag.classname[attribute=value]

	{
		WebElement message=driver.findElement(By.cssSelector("input.form-control[placeholder=state]"));
		WebElement message1=driver.findElement(By.cssSelector("input.form-control[placeholder=Message]"));
		WebElement message2=driver.findElement(By.cssSelector("input.form-check-input[type=checkbox]"));
		WebElement message3=driver.findElement(By.cssSelector("input.form-control[name=daterange]"));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
