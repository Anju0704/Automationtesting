package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Isenabled extends Base{
	public void enable()
	{
		WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		WebElement txt=driver.findElement(By.xpath("//input[@id='single-input-field']"));
System.out.println(txt.isEnabled());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Isenabled obj=new Isenabled();
		obj.initialisebrowser();
		obj.enable();

	}

}