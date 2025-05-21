package base;



import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;




public class AnalytifyUrl {
	WebDriver driver = Instance.getInstance();
	
 Properties prop = PropertiesFile.readPropertyFile("AnalytifyUrl.properties");
	
	@Test(priority=1, enabled=true)
	public void Login() throws InterruptedException {
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get(prop.getProperty("baseURL"));
		System.out.println("LoggedIn successfully");
}
}