package testscript;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test
public void createCustomer() {
//		Reporter.log("customer has been created",true);
		//Download and set the path of driver executable explicitly in sel 3
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		System.setProperty("webdriver.msedge.driver", "./driver/msedgedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.fb.com");
		Reporter.log(driver.getTitle(),true);
		driver.quit();
		//Sel 3 uses JSON wire protocol to communicate with the browsers
		//Sel 4 uses W3C protocol to communicate with the browsers
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		WebDriverWait wait=new WebDriverWait(driver, 5);
//		Actions a=new Actions(driver);
//		a.scrollByAmount(0, 0).perform();//Has been added in the latest version(selenium 4)
//		a.scrollToElement(null).perform();
//		driver.manage().window().minimize();
//		driver.quit();
}
}
