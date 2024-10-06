package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Automation extends Base{
	public void drpdownlist() {
		WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		WebElement selectinput=driver.findElement(By.xpath("//a[@ href='select-input.php']"));
		selectinput.click();
		WebElement droplist=driver.findElement(By.id("single-input-field"));
		Select select=new Select(droplist);
		//select.selectByVisibleText("Yellow");
		//select.selectByIndex(1);
		select.selectByValue("Green");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dropdown_Automation obj=new Dropdown_Automation();
		obj.initialisebrowser();
		obj.drpdownlist();

	}

}
