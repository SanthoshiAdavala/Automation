package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverLaunch {
	
	public static WebDriver launch(String browserType){
		if (browserType.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\JavaPractice\\Software\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\JavaPractice\\Software\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.ie.driver", "D:\\JavaPractice\\Software\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
			
	}

}
