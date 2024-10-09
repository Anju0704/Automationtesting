package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {
	public WebDriver driver;
	public void initialisebrowser1()
	{
	driver= new ChromeDriver();
	driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	driver.manage().window().maximize();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base1 a=new Base1();
		a.initialisebrowser1();
	}

}
