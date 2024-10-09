package elementrepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop extends Base{
	public void draganddrop() {
	WebElement others=driver.findElement(By.xpath("//a[@id='others']"));
	others.click();
	WebElement dragicon=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	Actions actions=new Actions(driver);
	
	actions.moveToElement(dragicon).click();
	actions.doubleClick(dragicon).perform();
	WebElement dropbox=driver.findElement(By.xpath("//div[@id='mydropzone']"));
	actions.dragAndDrop(dragicon, dropbox).build().perform();
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draganddrop obj=new Draganddrop();
		obj.initialisebrowser();
		obj.draganddrop();
	}

}
