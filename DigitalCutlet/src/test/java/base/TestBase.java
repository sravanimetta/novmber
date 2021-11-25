package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.DashboardPage;
import pages.LoginPage;
import properties.ReadingProperties;

public class TestBase {
	public WebDriver driver;
	public LoginPage loginobj;
	public DashboardPage dashboardobj;
	public Properties prop;
	public FileInputStream fis;
	 
	@BeforeClass
	public void beforeclass() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srava\\eclipse-workspace\\August-born\\drivers\\chrome\\chromedriver_win32\\chromedriver.exe");
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginobj = new LoginPage(driver);
		dashboardobj = new DashboardPage(driver);
		prop = new Properties();
		fis = new FileInputStream("C:\\\\Users\\\\srava\\\\eclipse-workspace\\\\DigitalCutlet\\\\src\\\\test\\\\java\\\\properties");
		prop.load(fis);
	}
	@BeforeMethod
	public void beforemethod() {
    driver.get("url");
}
	@AfterClass
	public void afterclass() {
		driver.quit();
	}
}