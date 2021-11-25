package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class DashboardPage extends TestBase{
	WebDriver driver;
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//a[@class=\"firstLevelMenu\"])[8]")
	private WebElement dashboard;
	@FindBy(xpath = "(//span[@class=\"quickLinkText\"])[1]")
	private WebElement assignleave;
	@FindBy(xpath = "(//span[@class=\"quickLinkText\"])[2]")
	private WebElement leavelist;
	@FindBy(xpath = "(//span[@class=\"quickLinkText\"])[3]")
	private WebElement timesheet;
	@FindBy(xpath = "(//span[@class=\"quickLinkText\"])[4]")
	private WebElement applyleave;
	@FindBy(xpath = "(//span[@class=\"quickLinkText\"])[5]")
	private WebElement myleave;
	@FindBy(xpath = "(//span[@class=\"quickLinkText\"])[6]")
	private WebElement mytimesheet;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getDashboard() {
		return dashboard;
	}
	public WebElement getAssignleave() {
		return assignleave;
	}
	public WebElement getLeavelist() {
		return leavelist;
	}
	public WebElement getTimesheet() {
		return timesheet;
	}
	public WebElement getApplyleave() {
		return applyleave;
	}
	public WebElement getMyleave() {
		return myleave;
	}
	public WebElement getMytimesheet() {
		return mytimesheet;
	}




}
