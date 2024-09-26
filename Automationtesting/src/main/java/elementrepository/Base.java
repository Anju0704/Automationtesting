package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public void initialisebrowser()
	{
	driver= new ChromeDriver();
	driver.get("https://selenium.qabible.in/index.php");
	driver.manage().window().maximize();
	
	}
	public void closequit()
	{
		driver.close();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base a=new Base();
		a.initialisebrowser();
		a.closequit();

	}

}
