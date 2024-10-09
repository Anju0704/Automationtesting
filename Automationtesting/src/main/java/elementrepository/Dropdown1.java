package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 extends Base1{
	public void drpdownlist() {
		
		
		WebElement droplist=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(droplist);
		//select.selectByVisibleText("Python");
		//select.selectByIndex(1);
		select.selectByValue("sql");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dropdown1 obj=new Dropdown1();
		obj.initialisebrowser1();
		obj.drpdownlist();
	}
}

