package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Messageshow_Automationex1 extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Messageshow_Automationex1 obj=new Messageshow_Automationex1();
		obj.initialisebrowser();
		obj.showMessage();
		obj.showMessage1();
	}
	public void showMessage()
	//driver.navigate().to("");
	{
		WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		WebElement txt=driver.findElement(By.xpath("//input[@id='single-input-field']"));
txt.sendKeys("Hai");
WebElement enteredtxt=driver.findElement(By.xpath("//button[@id='button-one']"));
enteredtxt.click();
	}
	public void showMessage1()
	
	{
		//WebElement inputform1=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		//inputform1.click();
		WebElement txtA=driver.findElement(By.xpath("//input[@id='value-a']"));
txtA.sendKeys("10");
WebElement txtB=driver.findElement(By.xpath("//input[@id='value-b']"));
txtB.sendKeys("20");
WebElement getTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
getTotal.click();
	}
	
}
