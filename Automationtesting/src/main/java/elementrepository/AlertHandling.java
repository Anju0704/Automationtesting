package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
	public void alert1()
	{
		WebElement element1=driver.findElement(By.xpath("//a[@href='bootstrap-alert.php']"));
		element1.click();
		WebElement element2=driver.findElement(By.xpath("//a[@href='javascript-alert.php']"));
		element2.click();
		WebElement element3=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		element3.click();
		driver.switchTo().alert().accept();		
		
		
	}
	public void alert2() {
		WebElement element1=driver.findElement(By.xpath("//a[@href='bootstrap-alert.php']"));
		element1.click();
		WebElement element2=driver.findElement(By.xpath("//a[@href='javascript-alert.php']"));
		element2.click();
		WebElement element3=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		element3.click();
		driver.switchTo().alert().dismiss();	
	}
	public void alert3() {
		WebElement element1=driver.findElement(By.xpath("//a[@href='bootstrap-alert.php']"));
		element1.click();
		WebElement element2=driver.findElement(By.xpath("//a[@href='javascript-alert.php']"));
		element2.click();
		WebElement element3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		element3.click();
		driver.switchTo().alert().sendKeys("Test alert");
		driver.switchTo().alert().accept();
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling obj=new AlertHandling();
		obj.initialisebrowser();
		//obj.alert1();
		//obj.alert2();
		obj.alert3();
	}
	

}
