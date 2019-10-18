package databasetesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactory1 {

			public PageFactory1(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
			
			WebDriver driver;
			
			@FindBy(id="username")
			WebElement username;
			
			@FindBy(name="pw")
			WebElement password;
			
			@FindBy(name="Login")
			WebElement Login;

}
