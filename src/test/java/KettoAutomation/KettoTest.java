package KettoAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KettoTest {
	
	
	
	WebDriver driver ; 
	By fundRaiserButton = By.xpath("//div/a/span[contains(text(),'Start a Fundraiser') and @class='mat-button-wrapper']");
	By nameF = By.xpath("//input[@placeholder='Name']");
	By mobilenum = By.xpath("//input[@type='tel']");
	By countryList = By.id("country-listbox");
	By emailAddress = By.xpath("//input[@placeholder='Email Address']");
	By password = By.xpath("//input[@placeholder='Create a Password']");
	By nextButton = By.xpath("//button/span/div[contains(text(),'Next')]");
	By ngoCharity = By.xpath("//*/span[contains(text(),' NGO / Charity ')]");
	By medicalTreatment = By.xpath("//*/span[contains(text(),' Medical Treatment ')");
	
	@BeforeMethod
	public void setUpBrowser() {
	driver = new ChromeDriver();
	driver.get("https://www.ketto.org");
	//driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void createFundRaiserNGO() {
	driver.findElement(fundRaiserButton).click();
	driver.findElement(nameF).sendKeys("Rajesh1");
	WebElement purposeDropDown = driver.findElement(By.xpath("//div/mat-select"));
	purposeDropDown.click();
	driver.findElement(ngoCharity).click();
	WebElement countryListOption = driver.findElement(countryList);
	WebElement countryContainer = driver.findElement(By.xpath("//div[@class='flag-container']"));
	countryContainer.click();
	WebElement countryJapan = driver.findElement(By.xpath("//span[contains(text(),'Japan')]"));
	countryJapan.click();
	countryContainer.click();
	WebElement countryIndia = driver.findElement(By.xpath("//span[contains(text(),'India')]"));
	countryIndia.click();
	driver.findElement(mobilenum).sendKeys("2134567890");
	driver.findElement(emailAddress).sendKeys("Test2@test2.com");
	driver.findElement(password).sendKeys("Test@12345");
	driver.findElement(nextButton).click();
	}
	@Test
	public void createFundRaiserMedicalTreatment() {
	driver.findElement(fundRaiserButton).click();
	/**WebElement purposeDropDown = driver.findElement(By.xpath("//div/mat-select"));
	purposeDropDown.click();
	driver.findElement(medicalTreatment).click(); **/
	driver.findElement(nameF).sendKeys("WeCare1");
	WebElement countryListOption = driver.findElement(countryList);
	WebElement countryContainer = driver.findElement(By.xpath("//div[@class='flag-container']"));
	countryContainer.click();
	WebElement countryJapan = driver.findElement(By.xpath("//span[contains(text(),'Japan')]"));
	countryJapan.click();
	countryContainer.click();
	WebElement countryIndia = driver.findElement(By.xpath("//span[contains(text(),'India')]"));
	countryIndia.click();
	driver.findElement(mobilenum).sendKeys("1234568990");
	driver.findElement(emailAddress).sendKeys("Test1@test1.com");
	driver.findElement(password).sendKeys("Test@12345");
	driver.findElement(nextButton).click();
	}
	@AfterMethod
	public void tearDown() {
	//driver.quit();

	
	
	
	
	
	
	
	
	
	
	}
	
	

}
