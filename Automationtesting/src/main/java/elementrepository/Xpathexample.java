package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Xpathexample extends Base{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
public void absoluteXpath()
{
	WebElement message=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
	WebElement message1=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/button"));
	WebElement message2=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/button"));
}
public void relativeXpath()
{
	WebElement relativexpath=driver.findElement(By.xpath("//input[@placeholder='Message']"));
	WebElement relativexpath1=driver.findElement(By.xpath("//input[@value='Select All'"));
	WebElement relativexpath2=driver.findElement(By.xpath("// input[@placeholder='First name']"));
	WebElement relativexpath3=driver.findElement(By.xpath("// input[@placeholder='Last name']"));
	}

public void dynamicXpath()
{
	WebElement dynamicxpath=driver.findElement(By.xpath("//input[contains(@id,'single-input-field']"));
	WebElement dynamicxpath1=driver.findElement(By.xpath("//input[contains(@placeholder,'Message']"));
	WebElement dynamicxpath2=driver.findElement(By.xpath("//input[contains(@placeholder,'First name']"));
	WebElement dynamicxpath3=driver.findElement(By.xpath("//input[contains(@placeholder,'Last name']"));
	}
public void dynamic_xpath_text()
{
	WebElement xpath=driver.findElement(By.xpath("//button[text()='Show Message']"));
	WebElement xpath1=driver.findElement(By.xpath("//button[text()='submit']"));
	WebElement xpath2=driver.findElement(By.xpath("//button[text()='Get Total']"));
	WebElement xpath3=driver.findElement(By.xpath("//button[text()='Select All']"));
}
public void axes_method()
{
	WebElement xpath=driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img[@alt='logo']"));
	WebElement childxpath=driver.findElement(By.xpath("//div[@class='form-group']//child::label[@for='inputEmail4']"));
	WebElement parentxpath=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	WebElement followingxpath=driver.findElement(By.xpath("//input[@type='text']//following::input"));
}

}

