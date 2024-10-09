package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Isenabled1 extends Base1{
	
		public void enable1()
		{
			
//WebElement txt=driver.findElement(By.xpath("//input[@value='option-3']"));
	//System.out.println(txt.isEnabled());
 
	WebElement txt=driver.findElement(By.xpath("//input[@value='option-5']"));
System.out.println(txt.isEnabled());
		}
		public void isselected()
		{
			WebElement selected=driver.findElement(By.xpath("//input[@value='option-1']"));
			selected.click();
			System.out.println(selected.isSelected());
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Isenabled1 obj=new Isenabled1();
obj.initialisebrowser1();
//obj.enable1();
obj.isselected();
	}

}
