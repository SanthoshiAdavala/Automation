package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterUser {

	public static void main(String[] args) {
		WebDriver dr;
		String browserType ="Chrome";
		String countrySelected ="GERMANY";
		String conf=null;
		
		//Navigation to Registration page
		dr=Utilities.DriverLaunch.launch(browserType);
		System.out.println("Page Opened");
		dr.get("http://newtours.demoaut.com/");
		
		System.out.println("Page Opened 1");
		dr.findElement(By.linkText("SIGN-ON")).click();
		dr.findElement(By.linkText("registration form")).click();
		dr.manage().window().maximize();
		System.out.println("Page Opened 2");
		
		//WebElement Declarations
		WebDriverWait wt = new WebDriverWait(dr, 20);
		WebElement FName = wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));
		WebElement LName = dr.findElement(By.name("lastName"));
		WebElement Phone = dr.findElement(By.name("phone"));
		WebElement Email = dr.findElement(By.id("userName"));
		WebElement addr1 = dr.findElement(By.name("address1"));
		WebElement city = dr.findElement(By.name("city"));
		WebElement st = dr.findElement(By.name("state"));
		WebElement Postcd = dr.findElement(By.name("postalCode"));
		WebElement country = dr.findElement(By.name("country"));
		WebElement email  = dr.findElement(By.name("email"));
		WebElement password  = dr.findElement(By.name("password"));
		WebElement conPassword = dr.findElement(By.name("confirmPassword"));
		WebElement Submit = dr.findElement(By.name("register"));
		
		
		//Fill the form
		FName.sendKeys("TestSanF");
		LName.sendKeys("TestSanL");
		Phone.sendKeys("1234567");
		Email.sendKeys("test@test.com");
		addr1.sendKeys("address1");
		city.sendKeys("city1");
		st.sendKeys("state1");
		Postcd.sendKeys("G123");
		new Select(country).selectByVisibleText(countrySelected);
		email.sendKeys("testsan");
		password.sendKeys("testsan");
		conPassword.sendKeys("testsan");
		Submit.click();
		
		System.out.println("FormCompleted");
		
		//Get Confirmation and close the browser
		conf=dr.findElement(By.linkText("sign-in")).getText();
		System.out.println("confirmation:" + conf);
		dr.close();
		
		


	}

}
