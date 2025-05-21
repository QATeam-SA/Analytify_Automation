package testcase;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.Instance;
import base.PropertiesFile;

public class Login_Existinguser {
	WebDriver driver = Instance.getInstance();
	 Properties prop = PropertiesFile.readPropertyFile("Login_Existinguser.properties");
	 Logger logger = LogManager.getLogger(Login_Existinguser.class);

	@Test(priority=2, enabled=true)
	public void Login() throws InterruptedException {
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get(prop.getProperty("baseURL"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty("Email"))).sendKeys(prop.getProperty("Email_id"));
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("pw"));
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("LogIn"))).click();
		System.out.println("Login Sucessfully with existingUser");
		logger.info("***** Log in successfully *******");
}
}
