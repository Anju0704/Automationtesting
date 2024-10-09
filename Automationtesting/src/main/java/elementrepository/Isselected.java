package elementrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {
	
	
	//}
	public WebDriver driver;
	public void site() {
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
	}
	/*
	
	public void elements() {
	List<WebElement> element2=driver.findElements(By.cssSelector("input[type='checkbox']"));

	for(WebElement element3:element2)
	{
		element3.click();

	
	}
	}
*/
	public void isselected()
	{
		WebElement selected=driver.findElement(By.xpath("//input[@value='option-1']"));
		selected.click();
		System.out.println(selected.isSelected());
		WebElement selected2=driver.findElement(By.xpath("//input[@value='option-2']"));
		selected2.click();
		System.out.println(selected2.isSelected());
		WebElement selected3=driver.findElement(By.xpath("//input[@value='option-3']"));
		System.out.println(selected3.isSelected());
		WebElement selected4=driver.findElement(By.xpath("//input[@value='option-4']"));
		selected4.click();
		System.out.println(selected4.isSelected());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Isselected obj=new Isselected();
obj.site();
//obj.checkboxSelect(); 
obj.isselected();
	}
	

}
