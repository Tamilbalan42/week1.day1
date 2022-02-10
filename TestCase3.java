package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
	    driver.findElement(By.partialLinkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tamil");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balan");
	    WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select dd = new Select(source);
	    dd.selectByVisibleText("Employee");
	    WebElement campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    Select dd1 = new Select(campaign);
	    dd1.selectByVisibleText("Car and Driver");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Balan");
	    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Tamil");
	    driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Testleaf");
	    driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("25/05/1973");
	    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Bussines");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Civil");
	    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("15L");
	    WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	    Select dd2 = new Select(industry);
	    dd2.selectByVisibleText("Computer Software");
	    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1000");
	    WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    Select dd3 = new Select(ownership);
	    dd3.selectByVisibleText("Partnership");
	    driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("tam555");
	    driver.findElement(By.className("inputBox")).sendKeys("$");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Hello");
	    driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Note");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("123");
	    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("2478879546");
	    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("Ext");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Help");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("balan@gmail.com");
	    driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("facebook");
	    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Testleaf");
	    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Testleaf");
	    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("gengappa street");
	    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("vadapalani");
	    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
	    WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select dd4 = new Select(state);
	    dd4.selectByVisibleText("TAMILNADU");
	    WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	    Select dd5 = new Select(country);
	    dd5.selectByVisibleText("India");
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    
	    
	    
	}
	

}
