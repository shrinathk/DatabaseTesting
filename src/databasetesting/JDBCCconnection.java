package databasetesting;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDBCCconnection {

	public static void main(String[] args) throws SQLException {

		String host = "localhost";
		String port = "3306";

		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/selenium", "root",
				"Selenium");

		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from credentials where scenario='zerobalancecard'");
		while(rs.next()) {
			
			String user = rs.getString("username");
			String pwd = rs.getString("password");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neetu\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			PageFactory1 pf = new PageFactory1(driver);
			pf.username.sendKeys(user);
			pf.password.sendKeys(pwd);
			pf.Login.click();
			
			
			
		}
		
		
		
		
	}

}
