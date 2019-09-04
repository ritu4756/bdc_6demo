package ritucucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class drivers {
	public static WebDriver configureDriver(String browserName)
	{
		WebDriver driver=null;
		if(browserName.equals("explorer"))
		{
			  System.setProperty("webdriver.ie.driver", 
					  "C:\\Users\\ritu.bn\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			  driver= new InternetExplorerDriver();
		}
		else if(browserName.equals("chrome"))
		{
			  System.setProperty("webdriver.chrome.driver",
					  "C:\\Users\\ritu.bn\\Downloads\\chromedriver.exe");
	 driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			 System.setProperty("webdriver.gecko.driver",
					  "C:\\Users\\ritu.bn\\Downloads\\geckodriver.exe");
			  driver=new FirefoxDriver();
		  
		}
		
		
		return driver;
	}

}
