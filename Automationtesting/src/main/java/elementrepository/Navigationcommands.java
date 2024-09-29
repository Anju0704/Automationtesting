package elementrepository;

public class Navigationcommands extends Base{
	public void navigates()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Navigationcommands a=new Navigationcommands();
		a.initialisebrowser();
		a.navigates();
	}

}
